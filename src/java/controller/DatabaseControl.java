package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseControl {

    String host = "localhost";
    String username = "hr";
    String password = "hr";
    String port = "1521";
    String dbName = "XE";

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String host = this.host;
            String username = this.username;
            String password = this.password;
            String port = this.port;
            String dbName = this.dbName;

            String url = "jdbc:oracle:thin:@" + host + ":" + port + ":" + dbName;
            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
