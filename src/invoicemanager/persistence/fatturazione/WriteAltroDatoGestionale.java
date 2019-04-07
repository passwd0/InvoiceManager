package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.AltroDatoGestionale;
import invoicemanager.utils.Utils;

public class WriteAltroDatoGestionale {
	private Connection c;

	public WriteAltroDatoGestionale() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(AltroDatoGestionale a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO AltroDatoGestionale VALUES (?, ?, ?, ?)");
			ps.setString(1, a.getTipoDato());
			ps.setString(2, a.getRiferimentoTesto());
			ps.setFloat(3, a.getRiferimentoNumero());
			ps.setDate(4, Utils.convertToDatabaseColumn(a.getRiferimentoData()));
	
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
    	String sql = "Create table public.AltroDatoGestionale (\r\n" + 
    			"  \"CodiceAltroDatoGestionale\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"TipoDato\" varchar(25) NULL,\r\n" + 
    			"	\"RiferimentoTesto\" varchar(25) NULL,\r\n" + 
    			"	\"RiferimentoNumero\" Float NULL,\r\n" + 
    			"	\"RiferimentoData\" Date NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	
	
}
