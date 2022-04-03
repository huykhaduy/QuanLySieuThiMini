package DAL.DataAcessObject;

import DAL.DataModels.MaKhuyenMai;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MaKhuyenMaiDAO extends AbtractDatabseAccess implements IAccess<MaKhuyenMai, String> {
    @Override
    public MaKhuyenMai find(String maKhuyenMai) {
        final String sql = "SELECT * FROM MAKHUYENMAI WHERE MAKM = ? AND IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, maKhuyenMai);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                String maKM = rs.getString("MAKM");
                int loaiKM = rs.getInt("LOAIKM");
                String moTa = rs.getString("MOTA");
                Timestamp ngayDB = rs.getTimestamp("NGAYDB");
                Timestamp ngayKT = rs.getTimestamp("NGAYKT");
                long giaTriToiThieu = rs.getLong("GIATRITOITHIEU");
                long kmToiThieu = rs.getLong("KMTOITHIEU");
                long kmToiDa = rs.getLong("KMTOIDA");
                int ptGiam = rs.getInt("PTGIAM");
                int soLuotSD = rs.getInt("SOLUOTSD");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                return new MaKhuyenMai(maKM, moTa, loaiKM, ngayDB, ngayKT, giaTriToiThieu, kmToiThieu, kmToiDa, ptGiam, soLuotSD, isDeleted);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public MaKhuyenMai save(MaKhuyenMai entity) {
        final String sql = "INSERT INTO MAKHUYENMAI(MAKM, MOTA, LOAIKM, NGAYDB, NGAYKT, GIATRITOITHIEU, KMTOITHIEU, KMTOIDA, PTGIAM, SOLUOTSD, IS_DELETED) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, entity.getMaKM());
            ps.setString(2, entity.getMoTa());
            ps.setInt(3, entity.getLoaiKM());
            ps.setTimestamp(4, entity.getNgayDB());
            ps.setTimestamp(5, entity.getNgayKT());
            ps.setLong(6, entity.getGiaTriToiThieu());
            ps.setLong(7, entity.getKmToiThieu());
            ps.setLong(8, entity.getKmToiDa());
            ps.setInt(9, entity.getPtGiam());
            ps.setInt(10, entity.getSoLuotSD());
            ps.setBoolean(11, entity.getIsDeleted());
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
    public MaKhuyenMai update(MaKhuyenMai entity) {
        final String sql  = "UPDATE MAKHUYENMAI SET MOTA = ?, LOAIKM = ?, NGAYDB = ?, NGAYKT = ?, GIATRITOITHIEU = ?, KMTOITHIEU = ?, KMTOIDA = ?, PTGIAM = ?, SOLUOTSD = ?, IS_DELETED = ? WHERE MAKM = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, entity.getMoTa());
            ps.setInt(2, entity.getLoaiKM());
            ps.setTimestamp(3, entity.getNgayDB());
            ps.setTimestamp(4, entity.getNgayKT());
            ps.setLong(5, entity.getGiaTriToiThieu());
            ps.setLong(6, entity.getKmToiThieu());
            ps.setLong(7, entity.getKmToiDa());
            ps.setInt(8, entity.getPtGiam());
            ps.setInt(9, entity.getSoLuotSD());
            ps.setBoolean(10, entity.getIsDeleted());
            ps.setString(11, entity.getMaKM());
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
    public void delete(String maKhuyenMai) {
        final String sql = "UPDATE MAKHUYENMAI SET IS_DELETED = 1 WHERE MAKM = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, maKhuyenMai);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }

    @Override
    public List<MaKhuyenMai> findAll() {
        final String sql = "SELECT * FROM MAKHUYENMAI WHERE IS_DELETED = 0";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            List<MaKhuyenMai> maKhuyenMais = new ArrayList<>();
            while (rs.next()){
                String maKM = rs.getString("MAKM");
                String moTa = rs.getString("MOTA");
                int loaiKM = rs.getInt("LOAIKM");
                Timestamp ngayDB = rs.getTimestamp("NGAYDB");
                Timestamp ngayKT = rs.getTimestamp("NGAYKT");
                long giaTriToiThieu = rs.getLong("GIATRITOITHIEU");
                long kmToiThieu = rs.getLong("KMTOITHIEU");
                long kmToiDa = rs.getLong("KMTOIDA");
                int ptGiam = rs.getInt("PTGIAM");
                int soLuotSD = rs.getInt("SOLUOTSD");
                boolean isDeleted = rs.getBoolean("IS_DELETED");
                MaKhuyenMai maKhuyenMai = new MaKhuyenMai(maKM, moTa, loaiKM, ngayDB, ngayKT, giaTriToiThieu, kmToiThieu, kmToiDa, ptGiam, soLuotSD, isDeleted);
                maKhuyenMais.add(maKhuyenMai);
            }
            return maKhuyenMais;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }
}
