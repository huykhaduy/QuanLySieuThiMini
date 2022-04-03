package DAL.DataAcessObject;

import DAL.DatabaseConnector.ConnectManager;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class AbtractDatabseAccess {
    protected ConnectManager connectManager;
    protected Connection connection;

    public AbtractDatabseAccess() {
    }

    public ConnectManager getConnectManager() {
        try {
            if (connectManager == null || connectManager.getConnection() == null || connectManager.getConnection().isClosed()) {
                connectManager = new ConnectManager();
                connection = connectManager.getConnection();
                return connectManager;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setConnectManager(ConnectManager connectManager) {
        this.connectManager = connectManager;
        connection = connectManager.getConnection();
    }
}


