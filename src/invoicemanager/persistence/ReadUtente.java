package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Utente;


public class ReadUtente {
	private Connection c;

	public ReadUtente() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.connect();
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
ts = rs.getTimestamp("dataNascita");
LocalDateTime dataNascita = null;
if (ts != null)
dataNascita = ts.toLocalDateTime();
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
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
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
