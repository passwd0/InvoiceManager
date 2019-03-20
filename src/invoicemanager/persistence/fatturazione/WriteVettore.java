package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Vettore;
import invoicemanager.utils.Utils;

public class WriteVettore {
	private Connection c;

	public WriteVettore() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Vettore a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Vettore VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceVettore());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getCodiceStato());
			ps.setString(4, a.getVia());
			ps.setString(5, a.getCitta());
			ps.setString(6, a.getPartitaIva());
			ps.setString(7, a.getIscrizione());
			ps.setString(8, a.getTelefono());
			ps.setTimestamp(9, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(10, Utils.toTimestamp(a.getDataUltimaModifica()));

			ps.executeUpdate();
			ps.close();
			c.commit();

			} catch (Exception e) {
   			  //Utils.createAlertFailWriteDB();
			}
	}

	public void set(Vettore a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE Vettore SET "
//					+ "campo=value "
//					+ "WHERE codiceVettore="+a.getCodiceVettore();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(Vettore a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceVettore() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Vettore (\r\n" + 
    			"	\"CodiceVettore\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceStato\" varchar(25) NULL,\r\n" + 
    			"	\"Via\" varchar(25) NULL,\r\n" + 
    			"	\"Citta\" varchar(25) NULL,\r\n" + 
    			"	\"PartitaIva\" varchar(25) NULL,\r\n" + 
    			"	\"Iscrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Telefono\" varchar(25) NULL,\r\n" + 
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
