package DAL.DataAcessObject;

import DAL.DataModels.ChiTietKhuyenMaiChoSP;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CTKhuyenMaiChoSPDAO extends AbtractDatabseAccess implements IAccessDetail<ChiTietKhuyenMaiChoSP,String,Integer> {

    @Override
    public List<ChiTietKhuyenMaiChoSP> findType1(String maKhuyenMai) {
        final String sql = "SELECT * FROM ChiTietKM_SP WHERE MaKM = ?";
        connectManager  = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1,maKhuyenMai);
            ResultSet rs = ps.executeQuery();
            List<ChiTietKhuyenMaiChoSP> list = new ArrayList<>();
            while (rs.next()) {
                String maKM = rs.getString("MaKM");
                Integer maSP = rs.getInt("MaSP");
                list.add(new ChiTietKhuyenMaiChoSP(maKM,maSP));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public List<ChiTietKhuyenMaiChoSP> findType2(Integer maSanPham) {
        final String sql = "SELECT * FROM ChiTietKM_SP WHERE MASP = ?";
        connectManager  = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, maSanPham);
            ResultSet rs = ps.executeQuery();
            List<ChiTietKhuyenMaiChoSP> list = new ArrayList<>();
            while (rs.next()) {
                String maKM = rs.getString("MaKM");
                Integer maSP = rs.getInt("MaSP");
                list.add(new ChiTietKhuyenMaiChoSP(maKM,maSP));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public ChiTietKhuyenMaiChoSP save(ChiTietKhuyenMaiChoSP chiTietKhuyenMaiChoSP) {
        final String sql = "INSERT INTO ChiTietKM_SP(MaKM,MaSP) VALUES(?,?)";
        connectManager  = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1,chiTietKhuyenMaiChoSP.getMaKM());
            ps.setInt(2,chiTietKhuyenMaiChoSP.getMaId());
            ps.executeUpdate();
            return chiTietKhuyenMaiChoSP;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            connectManager.closeConnection();
        }
        return null;
    }

    //Dump function
    @Override
    public ChiTietKhuyenMaiChoSP update(ChiTietKhuyenMaiChoSP chiTietKhuyenMaiChoSP) {
        final String sql = "UPDATE ChiTietKM_SP SET MaKM = ?, MaSP = ? WHERE MaKM = ? AND MaSP = ?";
        connectManager  = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1,chiTietKhuyenMaiChoSP.getMaKM());
            ps.setInt(2,chiTietKhuyenMaiChoSP.getMaId());
            ps.setString(3,chiTietKhuyenMaiChoSP.getMaKM());
            ps.setInt(4,chiTietKhuyenMaiChoSP.getMaId());
            ps.executeUpdate();
            return chiTietKhuyenMaiChoSP;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public void delete(String maKhuyenMai, Integer maSanPham) {
        final String sql = "DELETE FROM ChiTietKM_SP WHERE MaKM = ? AND MaSP = ?";
        connectManager  = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1,maKhuyenMai);
            ps.setInt(2,maSanPham);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }
}
