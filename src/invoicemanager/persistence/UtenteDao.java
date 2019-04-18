package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Utente;

public class UtenteDao {
	private Connection c;

	public UtenteDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Utente a, boolean exist) {
	    int res = 0;
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO Utente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	    	ps.setString(1, a.getCodiceUtente());
	    	ps.setString(2, a.getPath());
	    	ps.setString(3, a.getPathSalvataggi());
	    	ps.setString(4, a.getSubUtente());
	    	ps.setBoolean(5, a.isTipoUtente());
	    	ps.setString(6, a.getCognome());
	    	ps.setString(7, a.getNome());
	    	ps.setTimestamp(8, a.getDataNascita());
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
	    	ps.setTimestamp(31, a.getDataInserimento());
	    	ps.setTimestamp(32, a.getDataUltimaModifica());

			res = ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
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
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Utente (\r\n" + 
    			"	\"CodiceUtente\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Path\" varchar(25) NULL,\r\n" + 
    			"	\"PathSalvataggi\" varchar(25) NULL,\r\n" + 
    			"	\"SubUtente\" varchar(25) NULL,\r\n" + 
    			"	\"TipoUtente\" Boolean NULL,\r\n" + 
    			"	\"Cognome\" varchar(25) NULL,\r\n" + 
    			"	\"Nome\" varchar(25) NULL,\r\n" + 
    			"	\"DataNascita\" Timestamp NULL,\r\n" + 
    			"	\"Sesso\" Boolean NULL,\r\n" + 
    			"	\"ComuneNascita\" varchar(25) NULL,\r\n" + 
    			"	\"ProvinciaNascita\" varchar(25) NULL,\r\n" + 
    			"	\"DomicilioFiscale\" varchar(25) NULL,\r\n" + 
    			"	\"Comune\" varchar(25) NULL,\r\n" + 
    			"	\"Provincia\" varchar(25) NULL,\r\n" + 
    			"	\"PartitaIVA\" varchar(25) NULL,\r\n" + 
    			"	\"Attivita\" varchar(25) NULL,\r\n" + 
    			"	\"CodicePersonaFisica\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceFiscale\" varchar(25) NULL,\r\n" + 
    			"	\"RagioneSociale\" varchar(25) NULL,\r\n" + 
    			"	\"NaturaGiuridica\" varchar(25) NULL,\r\n" + 
    			"	\"DomicilioAzienda\" varchar(25) NULL,\r\n" + 
    			"	\"ComuneAzienda\" varchar(25) NULL,\r\n" + 
    			"	\"ProvinciaAzienda\" varchar(25) NULL,\r\n" + 
    			"	\"PartitaIVAAzienda\" varchar(25) NULL,\r\n" + 
    			"	\"AttivitaAzienda\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceAzienda\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceFiscaleAzienda\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreConversione\" Boolean NULL,\r\n" + 
    			"	\"Password\" varchar(25) NULL,\r\n" + 
    			"	\"Cap\" varchar(25) NULL,\r\n" + 
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
	
	
	public List<Utente> read() {
		List<Utente> listutente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Utente");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceUtente = rs.getString("codiceUtente");
String path = rs.getString("path");
String pathSalvataggi = rs.getString("pathSalvataggi");
String subUtente = rs.getString("subUtente");
boolean tipoUtente = rs.getBoolean("tipoUtente");
String cognome = rs.getString("cognome");
String nome = rs.getString("nome");
Timestamp dataNascita = rs.getTimestamp("dataNascita");
boolean sesso = rs.getBoolean("sesso");
String comuneNascita = rs.getString("comuneNascita");
String provinciaNascita = rs.getString("provinciaNascita");
String domicilioFiscale = rs.getString("domicilioFiscale");
String comune = rs.getString("comune");
String provincia = rs.getString("provincia");
String partitaIVA = rs.getString("partitaIVA");
String attivita = rs.getString("attivita");
String codicePersonaFisica = rs.getString("codicePersonaFisica");
String codiceFiscale = rs.getString("codiceFiscale");
String ragioneSociale = rs.getString("ragioneSociale");
String naturaGiuridica = rs.getString("naturaGiuridica");
String domicilioAzienda = rs.getString("domicilioAzienda");
String comuneAzienda = rs.getString("comuneAzienda");
String provinciaAzienda = rs.getString("provinciaAzienda");
String partitaIVAAzienda = rs.getString("partitaIVAAzienda");
String attivitaAzienda = rs.getString("attivitaAzienda");
String codiceAzienda = rs.getString("codiceAzienda");
String codiceFiscaleAzienda = rs.getString("codiceFiscaleAzienda");
boolean indicatoreConversione = rs.getBoolean("indicatoreConversione");
String password = rs.getString("password");
String cap = rs.getString("cap");
Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
Utente utente = new Utente(codiceUtente, path, pathSalvataggi, subUtente, tipoUtente, cognome, nome, dataNascita, sesso, comuneNascita, 
		provinciaNascita, domicilioFiscale, comune, provincia, partitaIVA, attivita, codicePersonaFisica, codiceFiscale, ragioneSociale, 
		naturaGiuridica, domicilioAzienda, comuneAzienda, provinciaAzienda, partitaIVAAzienda, attivitaAzienda, codiceAzienda, codiceFiscaleAzienda, 
		indicatoreConversione, password, cap, dataInserimento, dataUltimaModifica);

		listutente.add(utente);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listutente;
	}

}
