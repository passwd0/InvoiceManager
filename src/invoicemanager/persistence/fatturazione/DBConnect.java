package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.controller.fatturazione.Controller;
import invoicemanager.controller.fatturazione.DataManager;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DBConnect {
    private static Connection conn;
    public final static String url = "jdbc:postgresql://127.0.0.1/";
	public final static String db = "invoicemanager";
	public final static String user = "postgres";
	public final static String pass = "";

    public static Connection connect() throws SQLException {
    	try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		conn = DriverManager.getConnection(url+db, user, pass);
        conn.setAutoCommit(false);
		
        return conn;
    }
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        if(conn !=null && !conn.isClosed())
            return conn;
        connect();
        return conn;
    }
    
    public static void verifyDB() {
    	try {
    	Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url, user, pass);
        Statement s;
		
			s = conn.createStatement();

        int Result = s.executeUpdate("CREATE DATABASE "+db);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}