package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Contatto;
import invoicemanager.utils.Utils;

public class WriteContatto {
	private Connection c;

	public WriteContatto() {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Contatto a, boolean exist) {
		int res = 0;
	    try {

			PreparedStatement ps = c.prepareStatement("INSERT INTO Contatto VALUES (default, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceConto());
			ps.setString(2, a.getTipoDettaglio().name());
			ps.setString(3, a.getNumero());
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
    	String sql = "Create table public.Contatto (\r\n" + 
    			"	\"id\" serial NOT NULL primary key,\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"TipoDettaglio\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"Dettaglio\" varchar(25) NULL,\r\n" + 
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
