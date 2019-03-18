package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Agente;
import invoicemanager.utils.Utils;

public class WriteAgente {
	private Connection c;

	public WriteAgente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Agente a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Agente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceAgente());
		ps.setString(2, a.getNome());
		ps.setFloat(3, a.getPercentualeProvvigione());
		ps.setBoolean(4, a.isTipoProvvigione());
		ps.setBoolean(5, a.isTipoMandato());
		ps.setString(6, a.getCodiceContabile());
		ps.setString(7, a.getCodiceControparte());
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(9, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
		ps.close();
		c.commit();
		c.close();
		} catch (Exception e) {
		  //Utils.createAlertFailWriteDB();
		}
	}

	public void set(Agente a) throws ClassNotFoundException, SQLException {
		try {
			PreparedStatement ps = c.prepareStatement("UPDATE Agenti SET nome=?, percentualeProvvigione=?, "
					+ "tipoProvvigione=?, tipoMandato=?, dataInserimento=?, dataUltimaModifica=? "
					+ "WHERE codiceAgente=?");
			ps.setString(1, a.getNome());
			ps.setFloat(2, a.getPercentualeProvvigione());
			ps.setBoolean(3, a.isTipoProvvigione());
			ps.setBoolean(4, a.isTipoMandato());
			ps.setTimestamp(5, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(6, Utils.toTimestamp(a.getDataUltimaModifica()));
			
			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Agente a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato=\'Eliminato\' WHERE id = " + a.getCodiceAgente() + ";";		//AGGIUNGERE STATO
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//	        c.close();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Agente (\r\n" + 
    			"	\"CodiceAgente\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Nome\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"TipoProvvigione\" Boolean NULL,\r\n" + 
    			"	\"TipoMandato\" Boolean NULL,\r\n" + 
    			"	\"CodiceContabile\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceControparte\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			"); ";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();
        c.close();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	
	
	
} 
