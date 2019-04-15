package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Magazzino;
import invoicemanager.utils.Utils;

public class WriteMagazzino {
	private Connection c;

	public WriteMagazzino()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Magazzino a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Magazzino VALUES (?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceMagazzino());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getStato().name());
		ps.setString(4, a.getCodiceTipoMagazzino());
		ps.setTimestamp(5, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(6, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.Magazzino (\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceTipoMagazzino\" varchar(25) NULL,\r\n" + 
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
