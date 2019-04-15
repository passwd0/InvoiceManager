package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Telefono;
import invoicemanager.utils.Utils;

public class WriteTelefono {
	private Connection c;

	public WriteTelefono()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Telefono a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Telefono VALUES (?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceConto());
		ps.setInt(2, a.getProgressivo());
		ps.setString(3, a.getTipoTelefono());
		ps.setString(4, a.getNumero());
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
    	String sql = "Create table public.Telefono (\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"Progressivo\" INTEGER NOT NULL ,\r\n" + 
    			"	\"TipoTelefono\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"Numero\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceConto\", \"Progressivo\", \"TipoTelefono\") " +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
