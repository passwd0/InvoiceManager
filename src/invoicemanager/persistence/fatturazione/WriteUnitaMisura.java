package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.UnitaMisura;
import invoicemanager.utils.Utils;

public class WriteUnitaMisura {
	private Connection c;

	public WriteUnitaMisura() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(UnitaMisura a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO UnitaMisura VALUES (?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceUnitaMisura());
		ps.setString(2, a.getDescrizione());
		ps.setBoolean(3, a.isCodiceStato());
		ps.setTimestamp(4, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(5, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.UnitaMisura (\r\n" + 
    			"	\"CodiceUnitaMisura\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceStato\" Boolean NULL,\r\n" + 
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
