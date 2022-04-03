package DAL.DataAcessObject;

import DAL.DataModels.TaiKhoan;

import java.sql.*;
import java.util.List;

public class TaiKhoanDAO extends AbtractDatabseAccess implements IAccessInterface<TaiKhoan,String>{
    public TaiKhoanDAO() {
        super();
    }

    @Override
    public TaiKhoan find(String s) {
        final String sql = "SELECT * FROM TaiKhoan WHERE tenTK = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String tenTK = rs.getString("TENTK");
                String matKhau = rs.getString("MATKHAU");
                Integer soLanSai = rs.getInt("SOLANSAI");
                Timestamp time = rs.getTimestamp("NGAYTAO");
                boolean isActive = rs.getBoolean("IS_ACTIVE");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                int maNV = rs.getInt("MANV");
                return new TaiKhoan(tenTK, matKhau, soLanSai, time, isDeleted, isActive, maNV);
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
        final String sql = "INSERT INTO TaiKhoan(TENTK, MATKHAU, SOLANSAI, NGAYTAO, IS_ACTIVE, IS_DELETED, MANV) VALUES(?,?,?,?,?,?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getTenTK());
            ps.setString(2, entity.getMatKhau());
            ps.setInt(3, entity.getSoLanSai());
            ps.setTimestamp(4, entity.getNgayTao());
            ps.setBoolean(5, entity.isActive());
            ps.setBoolean(6, entity.isDeleted());
            ps.setInt(7, entity.getMaNV());
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
        final String sql = "UPDATE TaiKhoan SET TENTK = ?, MATKHAU = ?, SOLANSAI = ?, NGAYTAO = ?, IS_ACTIVE = ?, IS_DELETED = ? WHERE TENTK = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getTenTK());
            ps.setString(2, entity.getMatKhau());
            ps.setInt(3, entity.getSoLanSai());
            ps.setTimestamp(4, entity.getNgayTao());
            ps.setBoolean(5, entity.isActive());
            ps.setBoolean(6, entity.isDeleted());
            ps.setString(7, entity.getTenTK());
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
    public void delete(String username) {
        final String sql = "UPDATE TaiKhoan SET IS_DELETED = 1 WHERE TENTK = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }

    @Override
    public List<TaiKhoan> findAll() {
        final String sql = "SELECT * FROM TaiKhoan WHERE IS_DELETED = 0";
        connectManager = getConnectManager();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            List<TaiKhoan> list = new java.util.ArrayList<>();
            while (rs.next()) {
                String tenTK = rs.getString("TENTK");
                String matKhau = rs.getString("MATKHAU");
                Integer soLanSai = rs.getInt("SOLANSAI");
                Timestamp time = rs.getTimestamp("NGAYTAO");
                boolean isActive = rs.getBoolean("IS_ACTIVE");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                int maNV = rs.getInt("MANV");
                list.add(new TaiKhoan(tenTK, matKhau, soLanSai, time, isDeleted, isActive, maNV));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connectManager.closeConnection();
        }
        return null;
    }
}
