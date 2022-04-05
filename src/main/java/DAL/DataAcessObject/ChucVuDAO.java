package DAL.DataAcessObject;

import DAL.DataModels.ChucVu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChucVuDAO extends AbtractDatabseAccess implements IAccess<ChucVu,Integer> {

    @Override
    public ChucVu find(Integer integer) {
        final String sql = "SELECT * FROM chucvu WHERE MACHUCVU = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, integer);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer maChucVu = rs.getInt("MACHUCVU");
                String tenChucVu = rs.getString("TENCHUCVU");
                String moTa = rs.getString("MOTA");
                ChucVu chucVu = new ChucVu(maChucVu, tenChucVu, moTa);
                return chucVu;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public ChucVu save(ChucVu entity) {
        final String sql = "INSERT INTO chucvu(TENCHUCVU,MOTA) VALUES(?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getTenChucVu());
            ps.setString(2, entity.getMoTa());
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
    public ChucVu update(ChucVu entity) {
        final String sql = "UPDATE chucvu SET TENCHUCVU = ?, MOTA = ? WHERE MACHUCVU = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getTenChucVu());
            ps.setString(2, entity.getMoTa());
            ps.setInt(3, entity.getMaChucVu());
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
        final String sql = "DELETE FROM chucvu WHERE MACHUCVU = ?";
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
    public List<ChucVu> findAll() {
        final String sql = "SELECT * FROM chucvu";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<ChucVu> list = new ArrayList<ChucVu>();
            while (rs.next()) {
                Integer maChucVu = rs.getInt("MACHUCVU");
                String tenChucVu = rs.getString("TENCHUCVU");
                String moTa = rs.getString("MOTA");
                ChucVu chucVu = new ChucVu(maChucVu, tenChucVu, moTa);
                list.add(chucVu);
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
