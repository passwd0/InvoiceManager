package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Iso;
import invoicemanager.utils.Utils;

public class WriteIso {
	private Connection c;

	public WriteIso() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Iso a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Iso VALUES (?,?,?,?,?)");
	    	ps.setString(1, a.getCodiceIso());
	    	ps.setString(2, a.getDescrizione());
	    	ps.setString(3, a.getCodiceStato().name());
	    	ps.setTimestamp(4, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(5, Utils.toTimestamp(a.getDataUltimaModifica()));	    	
	    	
	    	ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Iso a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Imballo SET "
					+ "campo=value "
					+ "WHERE codiceImballo="+a.getCodiceIso();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Iso a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceIso() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
