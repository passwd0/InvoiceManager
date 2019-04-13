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

		PreparedStatement ps = c.prepareStatement("INSERT INTO Contatto VALUES (default, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceConto());
		ps.setString(2, a.getTipoDettaglio().name());
		ps.setString(3, a.getNumero());
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
