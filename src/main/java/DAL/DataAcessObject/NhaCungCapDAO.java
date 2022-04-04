package DAL.DataAcessObject;

import DAL.DataModels.NhaCungCap;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhaCungCapDAO extends AbtractDatabseAccess implements IAccess<NhaCungCap,String> {
    @Override
    public NhaCungCap find(String maNhaCungCap) {
        final String sql = "SELECT * FROM LoaiSanPham WHERE MALOAI = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, maNhaCungCap);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String maNCC = rs.getString("MANCC");
                String tenNCC = rs.getString("TENNCC");
                String diaChi = rs.getString("DIACHI");
                String sdt = rs.getString("SDT");
                String email = rs.getString("EMAIL");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                return new NhaCungCap(maNCC, tenNCC, diaChi, sdt, email, isDeleted);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public NhaCungCap save(NhaCungCap entity) {
        final String sql = "INSERT INTO NhaCungCap(MANCC, TENNCC, DIACHI, SDT, EMAIL, IS_DELETED) VALUES(?,?,?,?,?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getMaNCC());
            ps.setString(2, entity.getTenNCC());
            ps.setString(3, entity.getDiaChi());
            ps.setString(4, entity.getSdt());
            ps.setString(5, entity.getEmail());
            ps.setBoolean(6, entity.getIsDeleted());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public NhaCungCap update(NhaCungCap entity) {
        final String sql = "UPDATE NhaCungCap SET TENNCC = ?, DIACHI = ?, SDT = ?, EMAIL = ?, IS_DELETED = ? WHERE MANCC = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getTenNCC());
            ps.setString(2, entity.getDiaChi());
            ps.setString(3, entity.getSdt());
            ps.setString(4, entity.getEmail());
            ps.setBoolean(5, entity.getIsDeleted());
            ps.setString(6, entity.getMaNCC());
            ps.executeUpdate();
            return entity;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public void delete(String s) {
        final String sql = "UPDATE NhaCungCap SET IS_DELETED = 1 WHERE MANCC = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, s);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }

    @Override
    public List<NhaCungCap> findAll() {
        final String sql = "SELECT * FROM NhaCungCap WHERE IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<NhaCungCap> list = new ArrayList<>();
            while (rs.next()) {
                String maNCC = rs.getString("MANCC");
                String tenNCC = rs.getString("TENNCC");
                String diaChi = rs.getString("DIACHI");
                String sdt = rs.getString("SDT");
                String email = rs.getString("EMAIL");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                list.add(new NhaCungCap(maNCC, tenNCC, diaChi, sdt, email, isDeleted));
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
