package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.StatoFattura;
import invoicemanager.utils.Utils;

public class WriteStatoFattura {
	private Connection c;

	public WriteStatoFattura() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(StatoFattura a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO StatoFattura VALUES (?, ?, ?, ?, ?)");
		ps.setBoolean(1, a.isIndicatoreStatoAvanzamento());
		ps.setBoolean(2, a.isTipoDocumento());
		ps.setString(3, a.getDescrizione());
		ps.setTimestamp(4, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(5, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.StatoFattura (\r\n" + 
    			"	\"IndicatoreStatoAvanzamento\" Boolean NOT NULL,\r\n" + 
    			"	\"TipoDocumento\" Boolean NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
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
