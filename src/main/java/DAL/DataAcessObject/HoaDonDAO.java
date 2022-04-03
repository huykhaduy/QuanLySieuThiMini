package DAL.DataAcessObject;

import DAL.DataModels.HoaDon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO extends AbtractDatabseAccess implements IAccessInterface<HoaDon, Integer> {

    @Override
    public HoaDon find(Integer maHoaDon) {
        final String sql = "SELECT * FROM hoadon WHERE id = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, maHoaDon);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                int maHD = rs.getInt("MAHD");
                int maKH = rs.getInt("MAKH");
                int maNV = rs.getInt("MANV");
                Timestamp ngayHD = rs.getTimestamp("NGAYHD");
                String hinhThuc = rs.getString("HINHTHUC");
                String maKM = rs.getString("MAKM");
                return new HoaDon(maHD, ngayHD, hinhThuc,maKH,maNV,maKM);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public HoaDon save(HoaDon entity) {
        final String sql = "INSERT INTO hoadon(MAHD, NGAYHD, HINHTHUC, MAKH, MANV, MAKM) VALUES (?,?,?,?,?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, entity.getMaHD());
            ps.setTimestamp(2, entity.getNgayHD());
            ps.setString(3, entity.getHinhThuc());
            ps.setInt(4, entity.getMaKH());
            ps.setInt(5, entity.getMaNV());
            ps.setString(6, entity.getMaKM());
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
    public HoaDon update(HoaDon entity) {
        final String sql = "UPDATE hoadon SET MAHD = ?, NGAYHD = ?, HINHTHUC = ?, MAKH = ?, MANV = ?, MAKM = ? WHERE MAHD = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, entity.getMaHD());
            ps.setTimestamp(2, entity.getNgayHD());
            ps.setString(3, entity.getHinhThuc());
            ps.setInt(4, entity.getMaKH());
            ps.setInt(5, entity.getMaNV());
            ps.setString(6, entity.getMaKM());
            ps.setInt(7, entity.getMaHD());
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public void delete(Integer integer) {
        final String sql = "DELETE FROM hoadon WHERE MAHD = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, integer);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }

    @Override
    public List<HoaDon> findAll() {
        final String sql = "SELECT * FROM hoadon";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            List<HoaDon> list = new ArrayList<HoaDon>();
            while (rs.next()){
                int maHD = rs.getInt("MAHD");
                int maKH = rs.getInt("MAKH");
                int maNV = rs.getInt("MANV");
                Timestamp ngayHD = rs.getTimestamp("NGAYHD");
                String hinhThuc = rs.getString("HINHTHUC");
                String maKM = rs.getString("MAKM");
                HoaDon hoaDon = new HoaDon(maHD, ngayHD, hinhThuc,maKH,maNV,maKM);
                list.add(hoaDon);
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
