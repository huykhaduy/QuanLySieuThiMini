package DAL.DataAcessObject;

import DAL.DataModels.ChiTietPhieuHuy;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CTPhieuHuyDAO extends AbtractDatabseAccess implements IAccessDetail<ChiTietPhieuHuy,Integer,Integer> {

    @Override
    public List<ChiTietPhieuHuy> findType1(Integer maPhieuHuy) {
        final String sql = "SELECT * FROM CTPHIEUHUY WHERE MAPHIEU = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maPhieuHuy);
            ResultSet rs = ps.executeQuery();
            List<ChiTietPhieuHuy> list = new ArrayList<>();
            if (rs.next()) {
                int maPhieu = rs.getInt("MAPHIEU");
                int maSP = rs.getInt("MAPHIEU");
                int soLuong = rs.getInt("SOLUONG");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                ChiTietPhieuHuy chiTietPhieuHuy = new ChiTietPhieuHuy(maPhieu, maSP, soLuong, isDeleted);
                list.add(chiTietPhieuHuy);
            }
            return list;
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public List<ChiTietPhieuHuy> findType2(Integer maSanPham) {
        final String sql = "SELECT * FROM CTPHIEUHUY WHERE MASP = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maSanPham);
            ResultSet rs = ps.executeQuery();
            List<ChiTietPhieuHuy> list = new ArrayList<>();
            if (rs.next()) {
                int maPhieu = rs.getInt("MAPHIEU");
                int maSP = rs.getInt("MAPHIEU");
                int soLuong = rs.getInt("SOLUONG");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                ChiTietPhieuHuy chiTietPhieuHuy = new ChiTietPhieuHuy(maPhieu, maSP, soLuong, isDeleted);
                list.add(chiTietPhieuHuy);
            }
            return list;
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public ChiTietPhieuHuy save(ChiTietPhieuHuy entity) {
        final String sql = "INSERT INTO CTPHIEUHUY(MAPHIEU, MaSP, SOLUONG, IS_DELETED) VALUES (?,?,?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, entity.getMaPhieu());
            ps.setInt(2, entity.getMaSP());
            ps.setInt(3, entity.getSoLuong());
            ps.setBoolean(4, entity.getIsDeleted());
            ps.executeUpdate();
            return entity;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public ChiTietPhieuHuy update(ChiTietPhieuHuy entity) {
        final String sql = "UPDATE CTPHIEUHUY SET MAPHIEU = ?, MASP = ?, SOLUONG = ?, IS_DELETED = ? WHERE MAPHIEU = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, entity.getMaPhieu());
            ps.setInt(2, entity.getMaSP());
            ps.setInt(3, entity.getSoLuong());
            ps.setBoolean(4, entity.getIsDeleted());
            ps.setInt(5, entity.getMaPhieu());
            ps.executeUpdate();
            return entity;
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public void delete(Integer maPhieuHuy, Integer maSanPham) {
        final String sql = "UPDATE CTPHIEUHUY SET IS_DELETED = 1 WHERE MAPHIEU = ? AND MASP = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maPhieuHuy);
            ps.setInt(1, maSanPham);
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }
}
