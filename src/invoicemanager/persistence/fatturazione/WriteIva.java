package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Iva;

public class WriteIva {
	private Connection c;

	public WriteIva() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Iva a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO Iva "
+ "VALUES ("
+"','"+a.getCodiceIva()
+"','"+a.getDescrizione()
+"','"+a.getCodiceStato()
+"','"+a.getRigaIVAAcquisti()
+"','"+a.getAddizionaleIVA()
+"','"+a.getAliquotaIVA()
+"','"+a.getImponibileAcquisti()
+"','"+a.getImponibileAcquistiNonDetraibile()
+"','"+a.getImpostaAcquisti()
+"','"+a.getImponibileVendite()
+"','"+a.getImponibileVenditeNonDetraibile()
+"','"+a.getImpostaVendite()
+"','"+a.getRigaIVAVendite()
+"','"+a.getCoefficienteIVA()
+"','"+a.getPercentualeIndetraibilita()
+"','"+a.getValoreArrotondamento()
+"','"+a.getIndicatoreTroncaAcquisti()
+"','"+a.getIndicatoreSommaAcquisti()
+"','"+a.getIndicatoreArrotondaAcquisti()
+"','"+a.getIndicatoreSottraeAcquisti()
+"','"+a.getIndicatoreTroncaVendite()
+"','"+a.getIndicatoreSommaVendite()
+"','"+a.getIndicatoreArrotondaVendite()
+"','"+a.getIndicatoreSottraeVendite()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"','"+a.getLoginInserimento()
+"','"+a.getLoginModifica()
+"','"+a.getElencoClientiFornitori()
+"','"+a.getColonnaClientiFornitori()
+"','"+a.getColonnaNoteClientiFornitori()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceIva=\'" + a.getCodiceIva() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Iva a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Iva SET "
					+ "campo=value "
					+ "WHERE codiceIva="+a.getCodiceIva();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Iva a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceIva() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
