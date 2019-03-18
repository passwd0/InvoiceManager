package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.TipoMagazzino;
import invoicemanager.utils.Utils;

public class WriteTipoMagazzino {
	private Connection c;

	public WriteTipoMagazzino() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(TipoMagazzino a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO TipoMagazzino VALUES (?, ?, ?, ?,)");
		ps.setBoolean(1, a.isCodiceTipoMagazzino());
		ps.setString(2, a.getDescrizione());
		ps.setTimestamp(3, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(4, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.TipoMagazzino (\r\n" + 
    			"	\"CodiceTipoMagazzino\" Boolean NOT NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
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
