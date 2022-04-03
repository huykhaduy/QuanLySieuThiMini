package DAL.DataAcessObject;

import DAL.DataModels.ChiTietPhieuNhap;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CTPhieuNhapDAO extends AbtractDatabseAccess
        implements IAccessDetail<ChiTietPhieuNhap, Integer, Integer> {

    @Override
    public List<ChiTietPhieuNhap> findType1(Integer maPhieuNhap) {
        final String sql = "SELECT * FROM CTPhieuNhap WHERE MAPHIEU = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maPhieuNhap);
            ResultSet rs = ps.executeQuery();
            List<ChiTietPhieuNhap> list = new ArrayList<>();
            if (rs.next()) {
                int maPhieu = rs.getInt("MAPHIEU");
                int maSP = rs.getInt("MAPHIEU");
                int soLuong = rs.getInt("SOLUONG");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                ChiTietPhieuNhap chiTietPhieuNhap = new ChiTietPhieuNhap(maPhieu, maSP, soLuong, isDeleted);
                list.add(chiTietPhieuNhap);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public List<ChiTietPhieuNhap> findType2(Integer maSanPham) {
        final String sql = "SELECT * FROM CTPhieuNhap WHERE MASP = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maSanPham);
            ResultSet rs = ps.executeQuery();
            List<ChiTietPhieuNhap> list = new ArrayList<>();
            if (rs.next()) {
                int maPhieu = rs.getInt("MAPHIEU");
                int maSP = rs.getInt("MAPHIEU");
                int soLuong = rs.getInt("SOLUONG");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                ChiTietPhieuNhap chiTietPhieuNhap = new ChiTietPhieuNhap(maPhieu, maSP, soLuong, isDeleted);
                list.add(chiTietPhieuNhap);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public ChiTietPhieuNhap save(ChiTietPhieuNhap entity) {
        final String sql = "INSERT INTO CTPhieuNhap(MAPHIEU, MaSP, SOLUONG, IS_DELETED) VALUES (?,?,?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, entity.getMaPhieu());
            ps.setInt(2, entity.getMaSP());
            ps.setInt(3, entity.getSoLuong());
            ps.setBoolean(4, entity.getIsDeleted());
            ps.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public ChiTietPhieuNhap update(ChiTietPhieuNhap entity) {
        final String sql = "UPDATE CTPhieuNhap SET MAPHIEU = ?, MASP = ?, SOLUONG = ?, IS_DELETED = ? WHERE MAPHIEU = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, entity.getMaPhieu());
            ps.setInt(2, entity.getMaSP());
            ps.setInt(3, entity.getSoLuong());
            ps.setBoolean(4, entity.getIsDeleted());
            ps.setInt(5, entity.getMaPhieu());
            ps.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public void delete(Integer maPhieuNhap, Integer maSanPham) {
        final String sql = "UPDATE CTPhieuNhap SET IS_DELETED = 1 WHERE MAPHIEU = ? AND MASP = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maPhieuNhap);
            ps.setInt(1, maSanPham);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }
}
