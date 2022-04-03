package DAL.DataAcessObject;

import DAL.DataModels.ChiTietPhieuHuy;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CTPhieuHuyDAO extends AbtractDatabseAccess implements IAccessInterface<ChiTietPhieuHuy,Integer> {

    @Override
    public ChiTietPhieuHuy find(Integer maPhieuHuy) {
        final String sql = "SELECT * FROM CTPHIEUHUY WHERE MAPHIEU = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maPhieuHuy);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int maPhieu = rs.getInt("MAPHIEU");
                int maSP = rs.getInt("MAPHIEU");
                int soLuong = rs.getInt("SOLUONG");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                ChiTietPhieuHuy chiTietPhieuHuy = new ChiTietPhieuHuy(maPhieu, maSP, soLuong, isDeleted);
                return chiTietPhieuHuy;
            }
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
    public void delete(Integer integer) {
        final String sql = "UPDATE CTPHIEUHUY SET IS_DELETED = 1 WHERE MAPHIEU = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, integer);
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }

    @Override
    public List<ChiTietPhieuHuy> findAll() {
        final String sql = "SELECT * FROM CTPHIEUHUY WHERE IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietPhieuHuy> chiTietPhieuHuys = new ArrayList<>();
            while (rs.next()) {
                int maPhieu = rs.getInt("MAPHIEU");
                int maSP = rs.getInt("MASP");
                int soLuong = rs.getInt("SOLUONG");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                ChiTietPhieuHuy chiTietPhieuHuy = new ChiTietPhieuHuy(maPhieu, maSP, soLuong, isDeleted);
                chiTietPhieuHuys.add(chiTietPhieuHuy);
            }
            return chiTietPhieuHuys;
        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            connectManager.closeConnection();
        }
        return null;
    }
}
