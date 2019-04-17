package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static Connection conn;
    public final static String url = "jdbc:postgresql://127.0.0.1/";
	public final static String db = "invoicemanager";
	public final static String user = "postgres";
	public final static String pass = "postgres";

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
    
    public static Connection checkDB() throws SQLException {
    	try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		conn = DriverManager.getConnection(url, user, pass);
        conn.setAutoCommit(true);
		
        return conn;
    }
}