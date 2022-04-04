package DAL.DataAcessObject;

import DAL.DataModels.ChiTietHoaDon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CTHoaDonDAO extends AbtractDatabseAccess implements IAccessDetail<ChiTietHoaDon,Integer,Integer> {

    @Override
    public List<ChiTietHoaDon> findType1(Integer maHoaDon) {
            final String sql = "SELECT * FROM CTHOADON WHERE MAHD = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maHoaDon);
            ResultSet rs = ps.executeQuery();
            List<ChiTietHoaDon> list = new ArrayList<>();
            if (rs.next()) {
                int maHD = rs.getInt("MAHD");
                int maSP = rs.getInt("MASP");
                int soLuong = rs.getInt("SOLUONG");
                long giaTien = rs.getLong("GIATIEN");
                list.add(new ChiTietHoaDon(maHD, maSP, soLuong, giaTien));
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
    public List<ChiTietHoaDon> findType2(Integer maSanPham) {
        final String sql = "SELECT * FROM CTHOADON WHERE MASP = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maSanPham);
            ResultSet rs = ps.executeQuery();
            List<ChiTietHoaDon> list = new ArrayList<>();
            if (rs.next()) {
                int maHD = rs.getInt("MAHD");
                int maSP = rs.getInt("MASP");
                int soLuong = rs.getInt("SOLUONG");
                long giaTien = rs.getLong("GIATIEN");
                list.add(new ChiTietHoaDon(maHD, maSP, soLuong, giaTien));
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
    public ChiTietHoaDon save(ChiTietHoaDon entity) {
        final String sql = "INSERT INTO CTHOADON(MAHD,MASP,SOLUONG,GIATIEN) VALUES(?,?,?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, entity.getMaHD());
            ps.setInt(2, entity.getMaSP());
            ps.setInt(3, entity.getSoLuong());
            ps.setLong(4, entity.getGiaBan());
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
    public ChiTietHoaDon update(ChiTietHoaDon entity) {
        final String sql = "UPDATE CTHOADON SET SOLUONG = ?, GIATIEN = ? WHERE MAHD = ? AND MASP = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, entity.getSoLuong());
            ps.setLong(2, entity.getGiaBan());
            ps.setInt(3, entity.getMaHD());
            ps.setInt(4, entity.getMaSP());
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
    public void delete(Integer maHoaDon, Integer maSP) {
        final String sql = "DELETE FROM CTHOADON WHERE MAHD = ? AND MASP = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maHoaDon);
            ps.setInt(2, maSP);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }

}
