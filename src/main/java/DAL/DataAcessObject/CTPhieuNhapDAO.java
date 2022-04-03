package DAL.DataAcessObject;

import DAL.DataModels.ChiTietPhieuNhap;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CTPhieuNhapDAO extends AbtractDatabseAccess implements IAccessInterface<ChiTietPhieuNhap,Integer> {

    @Override
    public ChiTietPhieuNhap find(Integer maPhieuNhap) {
        final String sql = "SELECT * FROM CTPHIEUNHAP WHERE MAPHIEU = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maPhieuNhap);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int maPhieu = rs.getInt("MAPHIEU");
                int maSP = rs.getInt("MAPHIEU");
                int soLuong = rs.getInt("SOLUONG");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                ChiTietPhieuNhap chiTietPhieuNhap = new ChiTietPhieuNhap(maPhieu, maSP, soLuong, isDeleted);
                return chiTietPhieuNhap;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public ChiTietPhieuNhap save(ChiTietPhieuNhap entity) {
        final String sql = "INSERT INTO CTPHIEUNHAP(MAPHIEU, MaSP, SOLUONG, IS_DELETED) VALUES (?,?,?,?)";
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
    public ChiTietPhieuNhap update(ChiTietPhieuNhap entity) {
        final String sql = "UPDATE CTPHIEUNHAP SET MAPHIEU = ?, MASP = ?, SOLUONG = ?, IS_DELETED = ? WHERE MAPHIEU = ?";
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
        final String sql = "UPDATE CTPHIEUNHAP SET IS_DELETED = 1 WHERE MAPHIEU = ?";
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
    public List<ChiTietPhieuNhap> findAll() {
        final String sql = "SELECT * FROM CTPHIEUNHAP WHERE IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietPhieuNhap> chiTietPhieuNhaps = new ArrayList<>();
            while (rs.next()) {
                int maPhieu = rs.getInt("MAPHIEU");
                int maSP = rs.getInt("MASP");
                int soLuong = rs.getInt("SOLUONG");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                ChiTietPhieuNhap chiTietPhieuNhap = new ChiTietPhieuNhap(maPhieu, maSP, soLuong, isDeleted);
                chiTietPhieuNhaps.add(chiTietPhieuNhap);
            }
            return chiTietPhieuNhaps;
        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            connectManager.closeConnection();
        }
        return null;
    }
}
