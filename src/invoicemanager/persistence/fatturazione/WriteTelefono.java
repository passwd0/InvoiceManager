package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Telefono;
import invoicemanager.utils.Utils;

public class WriteTelefono {
	private Connection c;

	public WriteTelefono() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Telefono a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Telefono VALUES (?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceConto());
		ps.setInt(2, a.getProgressivo());
		ps.setString(3, a.getTipoTelefono());
		ps.setString(4, a.getNumero());
		ps.setTimestamp(5, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(6, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.Telefono (\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Progressivo\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"TipoTelefono\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Numero\" varchar(25) NULL,\r\n" + 
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
