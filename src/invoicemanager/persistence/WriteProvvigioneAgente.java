package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.ProvvigioneAgente;
import invoicemanager.utils.Utils;

public class WriteProvvigioneAgente {
	private Connection c;

	public WriteProvvigioneAgente()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ProvvigioneAgente a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO ProvvigioneAgente VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceProvvigione());
		ps.setString(2, a.getCodiceAgente());
		ps.setFloat(3, a.getScontoLegatoProvvigione());
		ps.setFloat(4, a.getProvvigioneLegataSconto());
		ps.setInt(5, a.getProgressivo());
		ps.setString(6, a.getCodiceGruppoMerceologico());
		ps.setTimestamp(7, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.ProvvigioneAgente (\r\n" + 
    			"	\"CodiceProvvigione\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"CodiceAgente\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"ScontoLegatoProvvigione\" Float NULL,\r\n" + 
    			"	\"ProvvigioneLegataSconto\" Float NULL,\r\n" + 
    			"	\"Progressivo\" INTEGER NULL,\r\n" + 
    			"	\"CodiceGruppoMerceologico\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceProvvigione\", \"CodiceAgente\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
}
