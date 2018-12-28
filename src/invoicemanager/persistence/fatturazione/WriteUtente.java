package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Utente;

public class WriteUtente {
	private Connection c;

	public WriteUtente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Utente a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO Utente "
+ "VALUES ("
+"','"+a.getCodiceUtente()
+"','"+a.getPath()
+"','"+a.getPathSalvataggi()
+"','"+a.getSubUtente()
+"','"+a.getTipoUtente()
+"','"+a.getCognome()
+"','"+a.getNome()
+"','"+a.getDataNascita()
+"','"+a.getSesso()
+"','"+a.getComuneNascita()
+"','"+a.getProvinciaNascita()
+"','"+a.getDomicilioFiscale()
+"','"+a.getComune()
+"','"+a.getProvincia()
+"','"+a.getPartitaIVA()
+"','"+a.getAttivita()
+"','"+a.getCodicePersonaFisica()
+"','"+a.getCodiceFiscale()
+"','"+a.getRagioneSociale()
+"','"+a.getNaturaGiuridica()
+"','"+a.getDomicilioAzienda()
+"','"+a.getComuneAzienda()
+"','"+a.getProvinciaAzienda()
+"','"+a.getPartitaIVAAzienda()
+"','"+a.getAttivitaAzienda()
+"','"+a.getCodiceAzienda()
+"','"+a.getCodiceFiscaleAzienda()
+"','"+a.getIndicatoreConversione()
+"','"+a.getPassword()
+"','"+a.getCap()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceUtente=\'" + a.getCodiceUtente() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Utente a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Utente SET "
					+ "campo=value "
					+ "WHERE codiceUtente="+a.getCodiceUtente();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Utente a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceUtente() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
