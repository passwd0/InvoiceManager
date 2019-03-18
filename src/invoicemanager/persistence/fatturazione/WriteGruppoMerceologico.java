package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.GruppoMerceologico;
import invoicemanager.utils.Utils;

public class WriteGruppoMerceologico {
	private Connection c;

	public WriteGruppoMerceologico() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(GruppoMerceologico a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO GruppoMerceologico VALUES (?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceGruppoMerceologico());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getCodiceStato());
		ps.setFloat(4, a.getSconto());
		ps.setFloat(5, a.getPercentualeProvvigione());
		ps.setInt(6, a.getNumeroPezziConfezione());
		ps.setTimestamp(7, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.GruppoMerceologico (\r\n" + 
    			"	\"CodiceGruppoMerceologico\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceStato\" varchar(25) NULL,\r\n" + 
    			"	\"Sconto\" Float NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"NumeroPezziConfezione\" INTEGER NULL,\r\n" + 
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
