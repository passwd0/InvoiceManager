package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Contatto;
import invoicemanager.utils.Utils;

public class WriteContatto {
	private Connection c;

	public WriteContatto() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Contatto a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Contatto VALUES (?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceConto());
		ps.setInt(2, a.getProgressivo());
		ps.setString(3, a.getTipoContatto());
		ps.setString(4, a.getNumero());
		ps.setTimestamp(5, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(6, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.Contatto (\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"Progressivo\" INTEGER NOT NULL ,\r\n" + 
    			"	\"TipoContatto\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"Numero\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceConto\", \"Progressivo\", \"TipoContatto\") " +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
