package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Cliente;


public class ReadCliente implements ReadSql<Cliente> {
	private Connection c;
	
	public ReadCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}
	
	@Override
	public List<Cliente> read() {
		List<Cliente> clienti = new ArrayList<>();
		Statement stmt;
		
		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT * FROM Clienti;" );
	         while ( rs.next() ) {

	        	 
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return clienti;
	}

}
