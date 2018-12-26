package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Utente;


public class ReadUtente {
	private Connection c;

	public ReadUtente() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Utente> read() {
		List<Utente> listutente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Utente");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceUtent = rs.getString("codiceUtent");
String pat = rs.getString("pat");
String pathSalvatagg = rs.getString("pathSalvatagg");
String subUtent = rs.getString("subUtent");
boolean tipoUtent = rs.getBoolean("tipoUtent");
String cognom = rs.getString("cognom");
String nom = rs.getString("nom");
ts = rs.getTimestamp("dataNascit");
LocalDateTime dataNascit = null;
if (ts != null)
dataNascit = ts.toLocalDateTime();
boolean sess = rs.getBoolean("sess");
String comuneNascit = rs.getString("comuneNascit");
String provinciaNascit = rs.getString("provinciaNascit");
String domicilioFiscal = rs.getString("domicilioFiscal");
String comun = rs.getString("comun");
String provinci = rs.getString("provinci");
String partitaIV = rs.getString("partitaIV");
String attivit = rs.getString("attivit");
String codicePersonaFisic = rs.getString("codicePersonaFisic");
String codiceFiscal = rs.getString("codiceFiscal");
String ragioneSocial = rs.getString("ragioneSocial");
String naturaGiuridic = rs.getString("naturaGiuridic");
String domicilioAziend = rs.getString("domicilioAziend");
String comuneAziend = rs.getString("comuneAziend");
String provinciaAziend = rs.getString("provinciaAziend");
String partitaIVAAziend = rs.getString("partitaIVAAziend");
String attivitaAziend = rs.getString("attivitaAziend");
String codiceAziend = rs.getString("codiceAziend");
String codiceFiscaleAziend = rs.getString("codiceFiscaleAziend");
boolean indicatoreConversion = rs.getBoolean("indicatoreConversion");
String passwor = rs.getString("passwor");
String ca = rs.getString("ca");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
Utente utente = new Utente(codiceUtent, pat, pathSalvatagg, subUtent, tipoUtent, cognom, nom, dataNascit, sess, comuneNascit, provinciaNascit, domicilioFiscal, comun, provinci, partitaIV, attivit, codicePersonaFisic, codiceFiscal, ragioneSocial, naturaGiuridic, domicilioAziend, comuneAziend, provinciaAziend, partitaIVAAziend, attivitaAziend, codiceAziend, codiceFiscaleAziend, indicatoreConversion, passwor, ca, dataInseriment, dataUltimaModific);

		listutente.add(utente);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listutente;
	}

}
