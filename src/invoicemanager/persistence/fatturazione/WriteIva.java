package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Iva;
import invoicemanager.utils.Utils;

public class WriteIva {
	private Connection c;

	public WriteIva() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Iva a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Iva VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceIva());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getStato().name());
			ps.setInt(4, a.getRigaIVAAcquisti());
			ps.setFloat(5, a.getAddizionaleIVA());
			ps.setFloat(6, a.getAliquotaIVA());
			ps.setFloat(7, a.getImponibileAcquisti());
			ps.setFloat(8, a.getImponibileAcquistiNonDetraibile());
			ps.setFloat(9, a.getImpostaAcquisti());
			ps.setFloat(10, a.getImponibileVendite());
			ps.setFloat(11, a.getImponibileVenditeNonDetraibile());
			ps.setFloat(12, a.getImpostaVendite());
			ps.setInt(13, a.getRigaIVAVendite());
			ps.setFloat(14, a.getCoefficienteIVA());
			ps.setString(15, a.getPercentualeIndetraibilita());
			ps.setFloat(16, a.getValoreArrotondamento());
			ps.setBoolean(17, a.isIndicatoreTroncaAcquisti());
			ps.setBoolean(18, a.isIndicatoreSommaAcquisti());
			ps.setBoolean(19, a.isIndicatoreArrotondaAcquisti());
			ps.setBoolean(20, a.isIndicatoreSottraeAcquisti());
			ps.setBoolean(21, a.isIndicatoreTroncaVendite());
			ps.setBoolean(22, a.isIndicatoreSommaVendite());
			ps.setBoolean(23, a.isIndicatoreArrotondaVendite());
			ps.setBoolean(24, a.isIndicatoreSottraeVendite());
			ps.setString(25, a.getLoginInserimento());
			ps.setString(26, a.getLoginModifica());
			ps.setBoolean(27, a.isElencoClientiFornitori());
			ps.setString(28, a.getColonnaClientiFornitori());
			ps.setString(29, a.getColonnaNoteClientiFornitori());
			ps.setString(30, a.getSplitPayment());
			ps.setTimestamp(31, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(32, Utils.toTimestamp(a.getDataUltimaModifica()));

			ps.executeUpdate();
			ps.close();
			c.commit();

			} catch (Exception e) {
   			  //Utils.createAlertFailWriteDB();
			}
	}

	public void set(Iva a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE Iva SET "
//					+ "campo=value "
//					+ "WHERE codiceIva="+a.getCodiceIva();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(Iva a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceIva() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Iva (\r\n" + 
    			"	\"CodiceIva\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"RigaIVAAcquisti\" INTEGER NULL,\r\n" + 
    			"	\"AddizionaleIVA\" Float NULL,\r\n" + 
    			"	\"AliquotaIVA\" Float NULL,\r\n" + 
    			"	\"ImponibileAcquisti\" Float NULL,\r\n" + 
    			"	\"ImponibileAcquistiNonDetraibile\" Float NULL,\r\n" + 
    			"	\"ImpostaAcquisti\" Float NULL,\r\n" + 
    			"	\"ImponibileVendite\" Float NULL,\r\n" + 
    			"	\"ImponibileVenditeNonDetraibile\" Float NULL,\r\n" + 
    			"	\"ImpostaVendite\" Float NULL,\r\n" + 
    			"	\"RigaIVAVendite\" INTEGER NULL,\r\n" + 
    			"	\"CoefficienteIVA\" Float NULL,\r\n" + 
    			"	\"PercentualeIndetraibilita\" varchar(25) NULL,\r\n" + 
    			"	\"ValoreArrotondamento\" Float NULL,\r\n" + 
    			"	\"IndicatoreTroncaAcquisti\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreSommaAcquisti\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreArrotondaAcquisti\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreSottraeAcquisti\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreTroncaVendite\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreSommaVendite\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreArrotondaVendite\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreSottraeVendite\" Boolean NULL,\r\n" + 
    			"	\"LoginInserimento\" varchar(25) NULL,\r\n" + 
    			"	\"LoginModifica\" varchar(25) NULL,\r\n" + 
    			"	\"ElencoClientiFornitori\" Boolean NULL,\r\n" + 
    			"	\"ColonnaClientiFornitori\" varchar(25) NULL,\r\n" + 
    			"	\"ColonnaNoteClientiFornitori\" varchar(25) NULL,\r\n" + 
    			"	\"SplitPayment\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
} 
