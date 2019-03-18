package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.TipoPagamento;
import invoicemanager.utils.Utils;

public class WriteTipoPagamento {
	private Connection c;

	public WriteTipoPagamento() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(TipoPagamento a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO TipiPagamento VALUES (?, ?, ?, ?,)");
	    	ps.setString(1, a.getCodiceTipoPagamento());
	    	ps.setString(2, a.getDescrizione());
	    	ps.setTimestamp(3, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(4, Utils.toTimestamp(a.getDataUltimaModifica()));

			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(TipoPagamento a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE TipoPagamento SET "
//					+ "campo=value "
//					+ "WHERE codiceTipoPagamento="+a.getCodiceTipoPagamento();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(TipoPagamento a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceTipoPagamento() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.TipoPagamento (\r\n" + 
    			"	\"CodiceTipoPagamento\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();
        c.close();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
} 
