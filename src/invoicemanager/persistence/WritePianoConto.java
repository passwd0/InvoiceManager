package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.PianoConto;
import invoicemanager.utils.Utils;

public class WritePianoConto {
	private Connection c;

	public WritePianoConto()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(PianoConto a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO PianoConto VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceConto());
		ps.setString(2, a.getDescrizione());
		ps.setBoolean(3, a.isTipo());
		ps.setString(4, a.getCodiceClassificazione());
		ps.setFloat(5, a.getDarePeriodo());
		ps.setFloat(6, a.getAverePeriodo());
		ps.setFloat(7, a.getDareProgressivo());
		ps.setFloat(8, a.getAvereProgressivo());
		ps.setString(9, a.getCodiceDivisa());
		ps.setString(10, a.getCodiceBancaBonifico());
		ps.setBoolean(11, a.isContoBanca());
		ps.setTimestamp(12, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(13, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.PianoConto (\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Tipo\" Boolean NULL,\r\n" + 
    			"	\"CodiceClassificazione\" varchar(25) NULL,\r\n" + 
    			"	\"DarePeriodo\" Float NULL,\r\n" + 
    			"	\"AverePeriodo\" Float NULL,\r\n" + 
    			"	\"DareProgressivo\" Float NULL,\r\n" + 
    			"	\"AvereProgressivo\" Float NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceBancaBonifico\" varchar(25) NULL,\r\n" + 
    			"	\"ContoBanca\" Boolean NULL,\r\n" + 
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
