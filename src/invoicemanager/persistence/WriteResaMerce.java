package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.ResaMerce;
import invoicemanager.utils.Utils;

public class WriteResaMerce {
	private Connection c;

	public WriteResaMerce()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ResaMerce a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO ResaMerce VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceResa());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getStato().name());
			ps.setFloat(4, a.getPercentualeAddebito());
			ps.setFloat(5, a.getImportoMinimo());
			ps.setBoolean(6, a.isIndicatoreProvvigione());
			ps.setTimestamp(7, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(8, Utils.toTimestamp(a.getDataUltimaModifica()));

	
			res = ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
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
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.ResaMerce (\r\n" + 
    			"	\"CodiceResa\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeAddebito\" Float NULL,\r\n" + 
    			"	\"ImportoMinimo\" Float NULL,\r\n" + 
    			"	\"IndicatoreProvvigione\" Boolean NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
} 
