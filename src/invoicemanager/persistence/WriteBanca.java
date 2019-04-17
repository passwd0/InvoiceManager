package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.Banca;
import invoicemanager.utils.Utils;

public class WriteBanca {
	private Connection c;

	public WriteBanca()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Banca a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO banca VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	    	ps.setString(1, a.getCodiceBanca());
	    	ps.setString(2, a.getDescrizione());
	    	ps.setString(3, a.getStato().name());
	    	ps.setString(4, a.getCodiceABI());
	    	ps.setString(5, a.getCodiceCAB());
			ps.setString(6, a.getLocalita());
	    	ps.setString(7, a.getProvincia());
	    	ps.setString(8, a.getNumeroContoCorrente());
	    	ps.setString(9, a.getCodiceCIN());
	    	ps.setString(10, a.getCodiceCINEur());
	    	ps.setString(11, a.getPaese());
	    	ps.setString(12, a.getIban());
	    	ps.setString(13, a.getSwift());
	    	ps.setString(14, a.getCodiceConto());
	    	ps.setString(15, a.getIndirizzo());
	    	ps.setString(16, a.getCap());
	    	ps.setTimestamp(17, Utils.toTimestamp(a.getDataInserimento()));
	    	ps.setTimestamp(18, Utils.toTimestamp(a.getDataUltimaModifica()));

	    	res = ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (SQLException e) {
	    	  System.err.println(e.getMessage()+"\n"+e.getErrorCode());
	    	  e.getStackTrace();
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(Banca a) throws ClassNotFoundException, SQLException {
		try {
			PreparedStatement ps = c.prepareStatement("UPDATE Banca SET nome=?, percentualeProvvigione=?, tipoProvvigione=?, tipoMandato=?, "
					+ "codiceContabile=?, codiceControparte=?, dataInserimento=?, dataUltimaModifica=?, loginInserimento=?, loginModifica=? "
					+ "WHERE codiceAgente=?");
	    	ps.setString(1, a.getDescrizione());
	    	ps.setString(2, a.getStato().name());
	    	ps.setString(3, a.getCodiceABI());
	    	ps.setString(4, a.getCodiceCAB());
	    	ps.setString(5, a.getProvincia());
	    	ps.setString(6, a.getNumeroContoCorrente());
	    	ps.setString(7, a.getCodiceCIN());
	    	ps.setString(8, a.getCodiceCINEur());
	    	ps.setString(9, a.getPaese());
	    	ps.setString(10, a.getIban());
	    	ps.setString(11, a.getSwift());
	    	ps.setString(12, a.getCodiceConto());
	    	ps.setString(13, a.getIndirizzo());
	    	ps.setTimestamp(14, Utils.toTimestamp(a.getDataInserimento()));
	    	ps.setTimestamp(15, Utils.toTimestamp(a.getDataUltimaModifica()));
			
			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Banca a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceBanca() + ";";
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
    	String sql = "Create table public.Banca (\r\n" + 
    			"	\"CodiceBanca\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceABI\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCAB\" varchar(25) NULL,\r\n" + 
    			"	\"Localita\" varchar(25) NULL,\r\n" + 
    			"	\"Provincia\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroContoCorrente\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCIN\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCINEur\" varchar(25) NULL,\r\n" + 
    			"	\"Paese\" varchar(25) NULL,\r\n" + 
    			"	\"Iban\" varchar(25) NULL,\r\n" + 
    			"	\"Swift\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceConto\" varchar(25) NULL,\r\n" + 
    			"	\"Indirizzo\" varchar(25) NULL,\r\n" + 
    			"	\"Cap\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
} 