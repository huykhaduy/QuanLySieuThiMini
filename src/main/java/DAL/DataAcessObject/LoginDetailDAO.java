package DAL.DataAcessObject;

import DAL.DataModels.LoginDetail;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class LoginDetailDAO extends AbtractDatabseAccess implements IAccess<LoginDetail,Integer> {
    public LoginDetailDAO() {
        super();
    }
    @Override
    public LoginDetail find(Integer integer) {
        final String sql = "SELECT * FROM login_detail WHERE LOGIN_ID = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, integer);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int loginId = rs.getInt("LOGIN_ID");
                String tenTK = rs.getString("TENTK");
                String authKey = rs.getString("AUTH_KEY");
                String ipAddress = rs.getString("IP_ADDRESS");
                String macAddress = rs.getString("MAC_ADDRESS");
                Timestamp loginTime = rs.getTimestamp("LOGIN_TIME");
                Timestamp logoutTime = rs.getTimestamp("LOGOUT_TIME");
                return new LoginDetail(loginId, tenTK, authKey, loginTime, logoutTime,ipAddress, macAddress);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public LoginDetail save(LoginDetail entity) {
        final String sql = "INSERT INTO login_detail(TENTK, AUTH_KEY, IP_ADDRESS, MAC_ADDRESS, LOGIN_TIME, LOGOUT_TIME) VALUES (?,?,?,?,?,?)";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getTenTK());
            ps.setString(2, entity.getAuthKey());
            ps.setString(3, entity.getIpAddress());
            ps.setString(4, entity.getMacAddress());
            ps.setTimestamp(5, entity.getLoginTime());
            ps.setTimestamp(6, entity.getLogoutTime());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    @Override
    public LoginDetail update(LoginDetail entity) {
        final String sql = "UPDATE login_detail SET TENTK = ?, AUTH_KEY = ?, IP_ADDRESS = ?, MAC_ADDRESS = ?, LOGIN_TIME = ?, LOGOUT_TIME = ? WHERE LOGIN_ID = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, entity.getTenTK());
            ps.setString(2, entity.getAuthKey());
            ps.setString(3, entity.getIpAddress());
            ps.setString(4, entity.getMacAddress());
            ps.setTimestamp(5, entity.getLoginTime());
            ps.setTimestamp(6, entity.getLogoutTime());
            ps.setInt(7, entity.getLoginID());
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
    public void delete(Integer id) {
        final String sql = "DELETE FROM login_detail WHERE LOGIN_ID = ?";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
    }

    @Override
    public List<LoginDetail> findAll() {
        final String sql = "SELECT * FROM login_detail";
        connectManager = getConnectManager();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<LoginDetail> list = new ArrayList<LoginDetail>();
            while (rs.next()) {
                int loginId = rs.getInt("LOGIN_ID");
                String tenTK = rs.getString("TENTK");
                String authKey = rs.getString("AUTH_KEY");
                String ipAddress = rs.getString("IP_ADDRESS");
                String macAddress = rs.getString("MAC_ADDRESS");
                Timestamp loginTime = rs.getTimestamp("LOGIN_TIME");
                Timestamp logoutTime = rs.getTimestamp("LOGOUT_TIME");
                list.add(new LoginDetail(loginId, tenTK, authKey, loginTime, logoutTime,ipAddress, macAddress));
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
