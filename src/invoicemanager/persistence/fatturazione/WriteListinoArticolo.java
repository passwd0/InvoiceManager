package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.ListinoArticolo;
import invoicemanager.utils.Utils;

public class WriteListinoArticolo {
	private Connection c;

	public WriteListinoArticolo()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ListinoArticolo a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO ListinoArticolo VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceArticolo());
		ps.setInt(2, a.getProgressivo());
		ps.setString(3, a.getCodiceDivisa());
		ps.setFloat(4, a.getPrezzo());
		ps.setInt(5, a.getNumeroDecimali());
		ps.setDate(6, Utils.convertToDatabaseColumn(a.getDataDecorrenza()));
		ps.setDate(7, Utils.convertToDatabaseColumn(a.getDataValidita()));
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(9, Utils.toTimestamp(a.getDataUltimaModifica()));

			res = ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.ListinoArticolo (\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Progressivo\" INTEGER NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL,\r\n" + 
    			"	\"NumeroDecimali\" INTEGER NULL,\r\n" + 
    			"	\"DataDecorrenza\" Date NULL,\r\n" + 
    			"	\"DataValidita\" Date NULL,\r\n" + 
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
