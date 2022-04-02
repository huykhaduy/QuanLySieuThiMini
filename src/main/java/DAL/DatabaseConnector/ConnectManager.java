package DAL.DatabaseConnector;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectManager {
    private Connection connect;

    public ConnectManager() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/java/DAL/DatabaseConnector/dbconfig.properties"));
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            this.connect = DriverManager.getConnection(url, username, password);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnect() {
        return connect;
    }

    public void closeConnect() {
        try {
            this.connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
