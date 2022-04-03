package DAL.DataAcessObject;

import DAL.DataModels.ChiTietHoaDon;
import DAL.DataModels.HoaDon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CTHoaDonDAO extends AbtractDatabseAccess implements IAccessInterface<ChiTietHoaDon,Integer> {

    @Override
    public ChiTietHoaDon find(Integer maHoaDon) {
        final String sql = "SELECT * FROM CTHOADON WHERE MAHD = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maHoaDon);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int maHD = rs.getInt("MAHD");
                int maSP = rs.getInt("MASP");
                int soLuong = rs.getInt("SOLUONG");
                long giaTien = rs.getLong("GIATIEN");
                return new ChiTietHoaDon(maHD, maSP, soLuong, giaTien);
            }
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
        final String sql = "UPDATE CTHOADON SET MASP = ?, SOLUONG = ?, GIATIEN = ? WHERE MAHD = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, entity.getMaSP());
            ps.setInt(2, entity.getSoLuong());
            ps.setLong(3, entity.getGiaBan());
            ps.setInt(4, entity.getMaHD());
            ps.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Integer integer) {
        final String sql = "DELETE FROM CTHOADON WHERE MAHD = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, integer);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }

    @Override
    public List<ChiTietHoaDon> findAll() {
        final String sql = "SELECT * FROM CTHOADON";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietHoaDon> list = new java.util.ArrayList<>();
            while (rs.next()) {
                int maHD = rs.getInt("MAHD");
                int maSP = rs.getInt("MASP");
                int soLuong = rs.getInt("SOLUONG");
                long giaTien = rs.getLong("GIATIEN");
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(maHD, maSP, soLuong, giaTien);
                list.add(chiTietHoaDon);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }
}
