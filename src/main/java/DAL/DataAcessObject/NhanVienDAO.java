package DAL.DataAcessObject;

import DAL.DataModels.ChucVu;
import DAL.DataModels.NhanVien;
import DAL.DataModels.NhanVienBanHang;
import DAL.DataModels.NhanVienQuanLy;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends AbtractDatabseAccess implements IAccess<NhanVien, Integer> {

    @Override
    public NhanVien find(Integer maNhanVien) {
        final String sql = "SELECT * FROM nhanvien WHERE MANV = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maNhanVien);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                NhanVien nhanVien = null;
                Integer maNV = rs.getInt("MANV");
                String tenNV = rs.getString("TENNV");
                String cmnd = rs.getString("CMND");
                Date ngaySinh = rs.getDate("NGAYSINH");
                String sdt = rs.getString("SODIENTHOAI");
                boolean gioiTinh = rs.getBoolean("GIOITINH");
                String diaChi = rs.getString("DIACHI");
                String email = rs.getString("EMAIL");
                Date ngayThamGia = rs.getDate("NGAYTHAMGIA");
                Integer maChucVu = rs.getInt("MACHUCVU");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                if (maChucVu == ChucVu.NHANVIENQUANLY) {
                    nhanVien = new NhanVienQuanLy(tenNV, gioiTinh, diaChi, email, sdt, maNV, cmnd, ngaySinh, ngayThamGia, isDeleted);
                }
                else if (maChucVu == ChucVu.NHANVIENBANHANG) {
                    nhanVien = new NhanVienBanHang(tenNV, gioiTinh, diaChi, email, sdt, maNV, cmnd, ngaySinh, ngayThamGia, isDeleted);
                }
                return nhanVien;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public NhanVien save(NhanVien entity) {
        final String sql = "INSERT INTO nhanvien(MANV, TENNV, CMND, NGAYSINH, SODIENTHOAI, GIOITINH, DIACHI, EMAIL, NGAYTHAMGIA, MACHUCVU, IS_DELETED) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, entity.getMaNV());
            ps.setString(2, entity.getHoTen());
            ps.setString(3, entity.getCmnd());
            ps.setDate(4, entity.getNgaySinh());
            ps.setString(5, entity.getSdt());
            ps.setBoolean(6, entity.getGioiTinh());
            ps.setString(7, entity.getDiaChi());
            ps.setString(8, entity.getEmail());
            ps.setDate(9, entity.getNgayThamGia());
            ps.setInt(10, entity.getMaChucVu());
            ps.setBoolean(11, entity.isDeleted());
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
    public NhanVien update(NhanVien entity) {
        final String sql = "UPDATE nhanvien SET TENNV = ?, CMND = ?, NGAYSINH = ?, SODIENTHOAI = ?, GIOITINH = ?, DIACHI = ?, EMAIL = ?, NGAYTHAMGIA = ?, MACHUCVU = ?, IS_DELETED = ? WHERE MANV = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getHoTen());
            ps.setString(2, entity.getCmnd());
            ps.setDate(3, entity.getNgaySinh());
            ps.setString(4, entity.getSdt());
            ps.setBoolean(5, entity.getGioiTinh());
            ps.setString(6, entity.getDiaChi());
            ps.setString(7, entity.getEmail());
            ps.setDate(8, entity.getNgayThamGia());
            ps.setInt(9, entity.getMaChucVu());
            ps.setBoolean(10, entity.isDeleted());
            ps.setInt(11, entity.getMaNV());
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
    public void delete(Integer integer) {
        final String sql = "UPDATE nhanvien SET IS_DELETED = 1 WHERE MANV = ?";
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
    public List<NhanVien> findAll() {
        final String sql = "SELECT * FROM nhanvien WHERE IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<NhanVien> nhanViens = new ArrayList<>();
            while (rs.next()) {
                int maNV = rs.getInt("MANV");
                String tenNV = rs.getString("TENNV");
                String cmnd = rs.getString("CMND");
                Date ngaySinh = rs.getDate("NGAYSINH");
                String sdt = rs.getString("SODIENTHOAI");
                boolean gioiTinh = rs.getBoolean("GIOITINH");
                String diaChi = rs.getString("DIACHI");
                String email = rs.getString("EMAIL");
                Date ngayThamGia = rs.getDate("NGAYTHAMGIA");
                int maChucVu = rs.getInt("MACHUCVU");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                if (maChucVu == ChucVu.NHANVIENQUANLY) {
                    nhanViens.add(new NhanVienQuanLy(tenNV, gioiTinh, diaChi, email, sdt, maNV, cmnd, ngaySinh, ngayThamGia, isDeleted));
                }
                else if (maChucVu == ChucVu.NHANVIENBANHANG) {
                    nhanViens.add(new NhanVienBanHang(tenNV, gioiTinh, diaChi, email, sdt, maNV, cmnd, ngaySinh, ngayThamGia, isDeleted));
                }
            }
            return nhanViens;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }
}
