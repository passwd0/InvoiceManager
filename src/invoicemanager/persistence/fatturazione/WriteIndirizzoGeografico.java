package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.utils.Utils;

public class WriteIndirizzoGeografico {
	private Connection c;

	public WriteIndirizzoGeografico() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(IndirizzoGeografico a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO IndirizzoGeografico VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceIndirizzo());
		ps.setString(2, a.getCodiceConto());
		ps.setString(3, a.getVia());
		ps.setString(4, a.getProvincia());
		ps.setString(5, a.getCap());
		ps.setString(6, a.getCitta());
		ps.setString(7, a.getCodiceNazione());
		ps.setString(8, a.getCodiceTipoIndirizzo());
		ps.setString(9, a.getDescrizione());
		ps.setBoolean(10, a.isIndicatoreIndirizzoDefault());
		ps.setString(11, a.getCodiceMinistero());
		ps.setTimestamp(12, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(13, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.IndirizzoGeografico (\r\n" + 
    			"	\"CodiceIndirizzo\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Via\" varchar(25) NULL,\r\n" + 
    			"	\"Provincia\" varchar(25) NULL,\r\n" + 
    			"	\"Cap\" varchar(25) NULL,\r\n" + 
    			"	\"Citta\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceNazione\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceTipoIndirizzo\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreIndirizzoDefault\" Boolean NULL,\r\n" + 
    			"	\"CodiceMinistero\" varchar(25) NULL, \r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL,\r\n" + 
    			"   Primary Key (\"CodiceIndirizzo\", \"CodiceConto\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
