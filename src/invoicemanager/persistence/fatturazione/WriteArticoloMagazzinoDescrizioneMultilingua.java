package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.ArticoloMagazzinoDescrizioneMultilingua;
import invoicemanager.utils.Utils;

public class WriteArticoloMagazzinoDescrizioneMultilingua {
	private Connection c;

	public WriteArticoloMagazzinoDescrizioneMultilingua() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(ArticoloMagazzinoDescrizioneMultilingua a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO ArticoloMagazzinoDescrizioneMultilingua VALUES (?, ?, ?, ?, ?,)");
				ps.setString(1, a.getCodiceArticolo());
				ps.setString(2, a.getCodiceLingua());
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
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.ArticoloMagazzinoDescrizioneMultilingua (\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"CodiceLingua\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL,\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}

	
}
