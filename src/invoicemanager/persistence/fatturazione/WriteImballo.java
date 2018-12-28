package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Imballo;
import invoicemanager.utils.Utils;

public class WriteImballo {
	private Connection c;

	public WriteImballo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Imballo a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Imballi VALUES (?, ?, ?, ?, ?, ?,)");
	    	ps.setString(1, a.getCodiceImballo());
	    	ps.setString(2, a.getDescrizione());
	    	ps.setString(3, a.getCodiceStato().name());
	    	ps.setTimestamp(6, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(7, Utils.toTimestamp(a.getDataUltimaModifica()));	    	
	    	
	    	ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Imballo a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Imballo SET "
					+ "campo=value "
					+ "WHERE codiceImballo="+a.getCodiceImballo();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Imballo a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceImballo() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
