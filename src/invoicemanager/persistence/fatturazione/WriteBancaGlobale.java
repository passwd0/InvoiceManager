package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.BancaGlobale;
import invoicemanager.utils.Utils;

public class WriteBancaGlobale {
	private Connection c;

	public WriteBancaGlobale() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(BancaGlobale a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO BancaGlobale VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceBanca());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getCodiceABI());
		ps.setString(4, a.getCodiceCAB());
		ps.setString(5, a.getLocalita());
		ps.setString(6, a.getProvincia());
		ps.setString(7, a.getNumeroContoCorrente());
		ps.setString(8, a.getCodiceCIN());
		ps.setString(9, a.getCodiceCINEur());
		ps.setString(10, a.getPaese());
		ps.setString(11, a.getIban());
		ps.setString(12, a.getSwift());
		ps.setString(13, a.getCodiceConto());
		ps.setString(14, a.getIndirizzo());
		ps.setString(15, a.getCap());
		ps.setTimestamp(16, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(17, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.BancaGlobale (\r\n" + 
    			"	\"CodiceBanca\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceABI\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceCAB\" varchar(25) NOT NULL,\r\n" + 
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
        c.close();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}

	
}
