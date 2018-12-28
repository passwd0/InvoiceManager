package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.ResaMerce;
import invoicemanager.utils.Utils;

public class WriteResaMerce {
	private Connection c;

	public WriteResaMerce() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(ResaMerce a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO ResaMerci VALUES (?, ?, ?, ?, ?, ?, ?, ?,)");
	    	ps.setString(1, a.getCodiceResa());
	    	ps.setString(2, a.getDescrizione());
	    	ps.setString(3, a.getCodiceStato().name());
	    	ps.setFloat(4, a.getPercentualeAddebito());
	    	ps.setFloat(5, a.getImportoMinimo());
	    	ps.setBoolean(6, a.isIndicatoreProvvigione());
	    	ps.setTimestamp(7, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(8, Utils.toTimestamp(a.getDataUltimaModifica()));
	
			ps.executeUpdate();
			ps.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(ResaMerce a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE ResaMerce SET "
					+ "campo=value "
					+ "WHERE codiceResaMerce="+a.getCodiceResa();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(ResaMerce a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceResa() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
