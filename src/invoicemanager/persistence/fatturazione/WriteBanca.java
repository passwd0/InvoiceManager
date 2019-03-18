package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Banca;
import invoicemanager.utils.Utils;

public class WriteBanca {
	private Connection c;

	public WriteBanca() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Banca a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Banche VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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

	    	ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Banca a) throws ClassNotFoundException, SQLException {
		try {
			PreparedStatement ps = c.prepareStatement("UPDATE Banche SET nome=?, percentualeProvvigione=?, tipoProvvigione=?, tipoMandato=?, "
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
	    	ps.setTimestamp(10, Utils.toTimestamp(a.getDataInserimento()));
	    	ps.setTimestamp(11, Utils.toTimestamp(a.getDataUltimaModifica()));
	    	ps.setString(12, a.getIban());
	    	ps.setString(13, a.getSwift());
	    	ps.setString(14, a.getCodiceConto());
	    	ps.setString(15, a.getIndirizzo());
			
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
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Banca (\r\n" + 
    			"	\"CodiceBanca\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Stato().name\" varchar(25) NULL,\r\n" + 
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
    			"	\"DataUltimaModifica\" Timestamp NULL,\r\n" + 
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