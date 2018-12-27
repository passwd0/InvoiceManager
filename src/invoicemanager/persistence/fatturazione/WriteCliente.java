package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Cliente;

public class WriteCliente {
	private Connection c;
	
	public WriteCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}
	
	public void add(Cliente a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO Cliente VALUES ("+
					a.getId()+",'"+a.getTarga()+"','"+a.getTipologia()+"','"+a.getStato()+"');";
			else
				sql = "UPDATE auto SET stato = 'Disponibile' WHERE id = " + a.getId() + ";";
			stmt.executeUpdate(sql);
			
			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}
	
	public void set(Cliente a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;
			
			sql = "UPDATE Cliente SET "
					+ "campo=value";
			stmt.executeUpdate(sql);
			
			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}
	
	public void delete(Cliente a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = 'Eliminato' WHERE id = " + a.getCodiceCliente() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
}