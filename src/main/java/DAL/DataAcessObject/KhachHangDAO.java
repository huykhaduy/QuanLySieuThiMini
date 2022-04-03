package DAL.DataAcessObject;

import DAL.DataModels.KhachHang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO extends AbtractDatabseAccess implements IAccessInterface<KhachHang, Integer> {

    @Override
    public KhachHang find(Integer maKhachHang) {
        final String sql = "SELECT * FROM KHACHHANG WHERE MAKH = ? AND IS_DELETE = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, maKhachHang);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                String tenKhachHang = rs.getString("TENKH");
                String diaChi = rs.getString("DIACHI");
                String sdt = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                boolean gioiTinh = rs.getBoolean("GIOITINH");
                int maKH = rs.getInt("MAKH");
                long diemThuong = rs.getLong("DIEMTHUONG");
                return new KhachHang(tenKhachHang, gioiTinh, diaChi, email, sdt, maKH, diemThuong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public KhachHang save(KhachHang entity) {
        final String sql = "INSERT INTO KHACHHANG(TENKH, GIOITINH, DIACHI, EMAIL, SODIENTHOAI, DIEMTHUONG, IS_DELETED) VALUES(?, ?, ?, ?, ?, ?, ?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, entity.getHoTen());
            ps.setBoolean(2, entity.getGioiTinh());
            ps.setString(3, entity.getDiaChi());
            ps.setString(4, entity.getEmail());
            ps.setString(5, entity.getSdt());
            ps.setLong(6, entity.getDiemThuong());
            ps.setBoolean(7, false);
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
    public KhachHang update(KhachHang entity) {
        final String sql = "UPDATE KHACHHANG SET TENKH = ?, GIOITINH = ?, DIACHI = ?, EMAIL = ?, SODIENTHOAI = ?, DIEMTHUONG = ?, IS_DELETED = ? WHERE MAKH = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, entity.getHoTen());
            ps.setBoolean(2, entity.getGioiTinh());
            ps.setString(3, entity.getDiaChi());
            ps.setString(4, entity.getEmail());
            ps.setString(5, entity.getSdt());
            ps.setLong(6, entity.getDiemThuong());
            ps.setBoolean(7, false);
            ps.setInt(8, entity.getMaKH());
            ps.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Integer integer) {
        final String sql = "UPDATE KHACHHANG SET IS_DELETED = 1 WHERE MAKH = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, integer);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connectManager.closeConnection();
        }
    }

    @Override
    public List<KhachHang> findAll() {
        final String sql = "SELECT * FROM KHACHHANG WHERE IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            List<KhachHang> list = new ArrayList<>();
            while (rs.next()){
                String tenKhachHang = rs.getString("TENKH");
                String diaChi = rs.getString("DIACHI");
                String sdt = rs.getString("SODIENTHOAI");
                String email = rs.getString("EMAIL");
                boolean gioiTinh = rs.getBoolean("GIOITINH");
                int maKH = rs.getInt("MAKH");
                long diemThuong = rs.getLong("DIEMTHUONG");
                list.add(new KhachHang(tenKhachHang, gioiTinh, diaChi, email, sdt, maKH, diemThuong));
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
