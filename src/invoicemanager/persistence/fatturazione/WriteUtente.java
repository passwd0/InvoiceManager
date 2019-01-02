package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Utente;
import invoicemanager.utils.Utils;

public class WriteUtente {
	private Connection c;

	public WriteUtente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Utente a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO Utenti VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
	    	ps.setString(1, a.getCodiceUtente());
	    	ps.setString(2, a.getPath());
	    	ps.setString(3, a.getPathSalvataggi());
	    	ps.setString(4, a.getSubUtente());
	    	ps.setBoolean(5, a.isTipoUtente());
	    	ps.setString(6, a.getCognome());
	    	ps.setString(7, a.getNome());
	    	ps.setTimestamp(8, Utils.toTimestamp(a.getDataNascita()));
	    	ps.setBoolean(9, a.isSesso());
	    	ps.setString(10, a.getComuneNascita());
	    	ps.setString(11, a.getProvinciaNascita());
	    	ps.setString(12, a.getDomicilioFiscale());
	    	ps.setString(13, a.getComune());
	    	ps.setString(14, a.getProvincia());
	    	ps.setString(15, a.getPartitaIVA());
	    	ps.setString(16, a.getAttivita());
	    	ps.setString(17, a.getCodicePersonaFisica());
	    	ps.setString(18, a.getCodiceFiscale());
	    	ps.setString(19, a.getRagioneSociale());
	    	ps.setString(20, a.getNaturaGiuridica());
	    	ps.setString(21, a.getDomicilioAzienda());
	    	ps.setString(22, a.getComuneAzienda());
	    	ps.setString(23, a.getProvinciaAzienda());
	    	ps.setString(24, a.getPartitaIVAAzienda());
	    	ps.setString(25, a.getAttivitaAzienda());
	    	ps.setString(26, a.getCodiceAzienda());
	    	ps.setString(27, a.getCodiceFiscaleAzienda());
	    	ps.setBoolean(28, a.isIndicatoreConversione());
	    	ps.setString(29, a.getPassword());
	    	ps.setString(30, a.getCap());
	    	ps.setTimestamp(31, Utils.toTimestamp(a.getDataInserimento()));
	    	ps.setTimestamp(32, Utils.toTimestamp(a.getDataUltimaModifica()));

			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Utente a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE Utente SET "
//					+ "campo=value "
//					+ "WHERE codiceUtente="+a.getCodiceUtente();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(Utente a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceUtente() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
} 
