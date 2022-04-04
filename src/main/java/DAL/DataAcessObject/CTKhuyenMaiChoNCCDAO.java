package DAL.DataAcessObject;

import DAL.DataModels.ChiTietKhuyenMaiChoNCC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CTKhuyenMaiChoNCCDAO extends AbtractDatabseAccess implements IAccessDetail<ChiTietKhuyenMaiChoNCC, String, String> {
    @Override
    public List<ChiTietKhuyenMaiChoNCC> findType1(String maKhuyenMai) {
        final String sql = "SELECT * FROM ChiTietKhuyenMaiChoNCC WHERE MAKM = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, maKhuyenMai);
            ResultSet rs = ps.executeQuery();
            List<ChiTietKhuyenMaiChoNCC> list = new ArrayList<>();
            while (rs.next()) {
                String maKM = rs.getString("MAKM");
                String maNCC = rs.getString("MANCC");
                list.add(new ChiTietKhuyenMaiChoNCC(maKM, maNCC));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public List<ChiTietKhuyenMaiChoNCC> findType2(String maNhaCungCap) {
        final String sql = "SELECT * FROM ChiTietKhuyenMaiChoNCC WHERE MANCC = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, maNhaCungCap);
            ResultSet rs = ps.executeQuery();
            List<ChiTietKhuyenMaiChoNCC> list = new ArrayList<>();
            while (rs.next()) {
                String maKM = rs.getString("MAKM");
                String maNCC = rs.getString("MANCC");
                list.add(new ChiTietKhuyenMaiChoNCC(maKM, maNCC));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public ChiTietKhuyenMaiChoNCC save(ChiTietKhuyenMaiChoNCC chiTietKhuyenMaiChoNCC) {
        final String sql = "INSERT INTO ChiTietKhuyenMaiChoNCC(MAKM, MANCC) VALUES(?, ?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, chiTietKhuyenMaiChoNCC.getMaKM());
            ps.setString(2, chiTietKhuyenMaiChoNCC.getMaId());
            ps.executeUpdate();
            return chiTietKhuyenMaiChoNCC;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    //Dump function
    @Override
    public ChiTietKhuyenMaiChoNCC update(ChiTietKhuyenMaiChoNCC chiTietKhuyenMaiChoNCC) {
        final String sql = "UPDATE ChiTietKhuyenMaiChoNCC SET MAKM = ?, MANCC = ? WHERE MAKM = ? AND MANCC = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, chiTietKhuyenMaiChoNCC.getMaKM());
            ps.setString(2, chiTietKhuyenMaiChoNCC.getMaId());
            ps.setString(3, chiTietKhuyenMaiChoNCC.getMaKM());
            ps.setString(4, chiTietKhuyenMaiChoNCC.getMaId());
            ps.executeUpdate();
            return chiTietKhuyenMaiChoNCC;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public void delete(String maKhuyenMai, String maNhaCungCap) {
        final String sql = "DELETE FROM ChiTietKhuyenMaiChoNCC WHERE MAKM = ? AND MANCC = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, maKhuyenMai);
            ps.setString(2, maNhaCungCap);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            connectManager.closeConnection();
        }
    }
}
