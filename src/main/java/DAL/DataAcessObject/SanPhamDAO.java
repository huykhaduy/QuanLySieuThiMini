package DAL.DataAcessObject;

import DAL.DataModels.SanPham;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDAO extends AbtractDatabseAccess implements IAccessInterface<SanPham,Integer> {

    @Override
    public SanPham find(Integer maSanPham) {
        final String sql = "SELECT * FROM sanpham WHERE id = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, maSanPham);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                Integer maSP = rs.getInt("MASP");
                String tenSP = rs.getString("TENSP");
                String moTa = rs.getString("MOTA");
                Integer soLuong = rs.getInt("SOLUONG");
                String hinhAnh = rs.getString("HINHANH");
                long giaTien = rs.getLong("GIATIEN");
                Integer maLoaiSP = rs.getInt("MALOAI");
                String maNCC = rs.getString("MANCC");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                return new SanPham(maSP,tenSP,moTa,hinhAnh,giaTien,soLuong,maLoaiSP,maNCC,isDeleted);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public SanPham save(SanPham entity) {
        final String sql = "INSERT INTO sanpham(TENSP,MOTA,SOLUONG,HINHANH,GIATIEN,MALOAI,MANCC) VALUES(?,?,?,?,?,?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1,entity.getTenSP());
            ps.setString(2,entity.getMoTa());
            ps.setInt(3,entity.getSoLuong());
            ps.setString(4,entity.getHinhAnh());
            ps.setLong(5,entity.getGiaTien());
            ps.setInt(6,entity.getMaLoai());
            ps.setString(7,entity.getMaNCC());
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
    public SanPham update(SanPham entity) {
        final String sql = "UPDATE sanpham SET TENSP = ?, MOTA = ?, SOLUONG = ?, HINHANH = ?, GIATIEN = ?, MALOAI = ?, MANCC = ? WHERE MASP = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1,entity.getTenSP());
            ps.setString(2,entity.getMoTa());
            ps.setInt(3,entity.getSoLuong());
            ps.setString(4,entity.getHinhAnh());
            ps.setLong(5,entity.getGiaTien());
            ps.setInt(6,entity.getMaLoai());
            ps.setString(7,entity.getMaNCC());
            ps.setInt(8,entity.getMaSP());
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
        final String sql = "UPDATE sanpham SET IS_DELETED = 1 WHERE MASP = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1,integer);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }

    @Override
    public List<SanPham> findAll() {
        final String sql = "SELECT * FROM sanpham WHERE IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            List<SanPham> sanPhamList = new ArrayList<>();
            while (rs.next()){
                Integer maSP = rs.getInt("MASP");
                String tenSP = rs.getString("TENSP");
                String moTa = rs.getString("MOTA");
                Integer soLuong = rs.getInt("SOLUONG");
                String hinhAnh = rs.getString("HINHANH");
                long giaTien = rs.getLong("GIATIEN");
                Integer maLoaiSP = rs.getInt("MALOAI");
                String maNCC = rs.getString("MANCC");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                sanPhamList.add(new SanPham(maSP,tenSP,moTa,hinhAnh,giaTien,soLuong,maLoaiSP,maNCC,isDeleted));
            }
            return sanPhamList;
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }
}
