package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.ArticoloMagazzinoDescrizioneMultilingua;
import invoicemanager.utils.Utils;

public class WriteArticoloMagazzinoDescrizioneMultilingua {
	private Connection c;

	public WriteArticoloMagazzinoDescrizioneMultilingua()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ArticoloMagazzinoDescrizioneMultilingua a, boolean exist) {
	    int res = 0;
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO ArticoloMagazzinoDescrizioneMultilingua VALUES (?, ?, ?, ?, ?)");
				ps.setString(1, a.getCodiceArticolo());
				ps.setString(2, a.getCodiceLingua());
				ps.setString(3, a.getDescrizione());
				ps.setTimestamp(4, Utils.toTimestamp(a.getDataInserimento()));
				ps.setTimestamp(5, Utils.toTimestamp(a.getDataUltimaModifica()));
		
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
    	String sql = "Create table public.ArticoloMagazzinoDescrizioneMultilingua (\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"CodiceLingua\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceArticolo\", \"CodiceLingua\")" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}

	
}
