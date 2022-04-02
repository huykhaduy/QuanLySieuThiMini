package DAL.DataAcessObject;

import DAL.DataModels.TaiKhoan;
import DAL.DatabaseConnector.ConnectManager;

import java.sql.*;
import java.util.List;

public class TaiKhoanDao implements IAccessInterface<TaiKhoan,String>{
    private ConnectManager connectManager = new ConnectManager();
    private Connection connect = connectManager.getConnection();

    @Override
    public TaiKhoan find(String s) {
        final String sql = "SELECT * FROM TaiKhoan WHERE tenTK = ?";
        try (PreparedStatement ps = connect.prepareStatement(sql)) {
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String tenTK = rs.getString("TENTK");
                String matKhau = rs.getString("MATKHAU");
                Integer soLanSai = rs.getInt("SOLANSAI");
                Timestamp time = rs.getTimestamp("NGAYTAO");
                boolean isActive = rs.getBoolean("IS_ACTIVE");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                return new TaiKhoan(tenTK, matKhau, soLanSai, time, isDeleted, isActive);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public TaiKhoan save(TaiKhoan entity) {
        final String sql = "INSERT INTO TaiKhoan(TENTK, MATKHAU, SOLANSAI, NGAYTAO, IS_ACTIVE, IS_DELETED) VALUES(?,?,?,?,?,?)";
        try (PreparedStatement ps = connect.prepareStatement(sql)) {
            ps.setString(1, entity.getTenTK());
            ps.setString(2, entity.getMatKhau());
            ps.setInt(3, entity.getSoLanSai());
            ps.setTimestamp(4, entity.getNgayTao());
            ps.setBoolean(5, entity.getIsActive());
            ps.setBoolean(6, entity.getIsDeleted());
            ps.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public TaiKhoan update(TaiKhoan entity) {
        return null;
    }

    @Override
    public void delete(TaiKhoan entity) {

    }

    @Override
    public List<TaiKhoan> findAll() {
        return null;
    }
}
