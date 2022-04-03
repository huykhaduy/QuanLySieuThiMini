package DAL.DataAcessObject;
import DAL.DataModels.PhieuNhap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PhieuNhapDAO extends AbtractDatabseAccess implements IAccess<PhieuNhap,Integer> {


    @Override
    public PhieuNhap find(Integer maPhieuNhap) {
        final String sql = "SELECT * FROM PhieuNhap WHERE MAPHIEU = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1,maPhieuNhap);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                int maPhieu = rs.getInt("MAPHIEU");
                Timestamp ngayLap = rs.getTimestamp("NGAYLAP");
                int maNV = rs.getInt("MANV");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                return new PhieuNhap(maPhieu,ngayLap,maNV,isDeleted);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public PhieuNhap save(PhieuNhap entity) {
        final String sql = "INSERT INTO PhieuNhap(MAPHIEU,NGAYLAP,MANV,IS_DELETED) VALUES(?,?,?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1,entity.getMaPhieu());
            ps.setTimestamp(2,entity.getNgayLap());
            ps.setInt(3,entity.getMaNV());
            ps.setBoolean(4,entity.isDeleted());
            ps.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public PhieuNhap update(PhieuNhap entity) {
        final String sql = "UPDATE PhieuNhap SET NGAYLAP = ?, MANV = ?, IS_DELETED = ? WHERE MAPHIEU = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setTimestamp(1,entity.getNgayLap());
            ps.setInt(2,entity.getMaNV());
            ps.setBoolean(3,entity.isDeleted());
            ps.setInt(4,entity.getMaPhieu());
            ps.executeUpdate();
            return entity;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public void delete(Integer integer) {
        final String sql = "UPDATE PhieuNhap SET IS_DELETED = 1 WHERE MAPHIEU = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1,integer);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            connectManager.closeConnection();
        }
    }

    @Override
    public List<PhieuNhap> findAll() {
        final String sql = "SELECT * FROM PhieuNhap WHERE IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            List<PhieuNhap> PhieuNhapList = new ArrayList<>();
            while (rs.next()){
                int maPhieu = rs.getInt("MAPHIEU");
                Timestamp ngayLap = rs.getTimestamp("NGAYLAP");
                int maNV = rs.getInt("MANV");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                PhieuNhapList.add(new PhieuNhap(maPhieu,ngayLap,maNV,isDeleted));
            }
            return PhieuNhapList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }
}
