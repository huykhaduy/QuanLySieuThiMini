package DAL.DataAcessObject;

import DAL.DataModels.LoaiSanPham;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoaiSanPhamDAO extends AbtractDatabseAccess implements IAccess<LoaiSanPham,Integer>{

    @Override
    public LoaiSanPham find(Integer integer) {
        final String sql = "SELECT * FROM loaisanpham WHERE MALOAI = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, integer);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer maLoai = rs.getInt("MALOAI");
                String tenLoai = rs.getString("TENLOAI");
                String moTa = rs.getString("MOTA");
                return new LoaiSanPham(maLoai, tenLoai, moTa);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public LoaiSanPham save(LoaiSanPham entity) {
        final String sql = "INSERT INTO loaisanpham(TENLOAI, MOTA) VALUES(?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getTenLoai());
            ps.setString(2, entity.getMoTa());
            ps.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        } return null;
    }

    @Override
    public LoaiSanPham update(LoaiSanPham entity) {
        final String sql = "UPDATE loaisanpham SET TENLOAI = ?, MOTA = ? WHERE MALOAI = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getTenLoai());
            ps.setString(2, entity.getMoTa());
            ps.setInt(3, entity.getMaLoai());
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
        final String sql = "DELETE FROM loaisanpham WHERE MALOAI = ?";
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
    public List<LoaiSanPham> findAll() {
        final String sql = "SELECT * FROM loaisanpham";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<LoaiSanPham> list = new ArrayList<>();
            while (rs.next()) {
                Integer maLoai = rs.getInt("MALOAI");
                String tenLoai = rs.getString("TENLOAI");
                String moTa = rs.getString("MOTA");
                LoaiSanPham loaiSanPham = new LoaiSanPham(maLoai, tenLoai, moTa);
                list.add(loaiSanPham);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        } return null;
    }
}
