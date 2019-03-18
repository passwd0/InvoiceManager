package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Iva;
import invoicemanager.utils.Utils;

public class WriteIva {
	private Connection c;

	public WriteIva() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Iva a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Iva VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
			ps.setString(1, a.getCodiceIva());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getCodiceStato());
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
} 
