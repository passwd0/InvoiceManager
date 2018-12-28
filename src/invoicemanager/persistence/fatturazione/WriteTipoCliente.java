package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.TipoCliente;
import invoicemanager.utils.Utils;

public class WriteTipoCliente {
	private Connection c;

	public WriteTipoCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(TipoCliente a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO TipiCliente VALUES (?, ?, ?, ?,)");
	    	ps.setString(1, a.getCodiceTipoCliente());
	    	ps.setString(2, a.getDescrizione());
	    	ps.setTimestamp(3, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(4, Utils.toTimestamp(a.getDataUltimaModifica()));
	    	
			ps.executeUpdate();
			ps.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(TipoCliente a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE TipoCliente SET "
					+ "campo=value "
					+ "WHERE codiceTipoCliente="+a.getCodiceTipoCliente();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(TipoCliente a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceTipoCliente() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
