package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.ArticoloMagazzino;


public class ReadArticoloMagazzino {
	private Connection c;

	public ReadArticoloMagazzino() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<ArticoloMagazzino> read() {
		List<ArticoloMagazzino> listarticoloMagazzino = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ArticoloMagazzino");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceArticolo = rs.getString("codiceArticolo");
String descrizione = rs.getString("descrizione");
String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
String codiceGruppoMerceologico = rs.getString("codiceGruppoMerceologico");
String codiceSottogruppoMerceologico = rs.getString("codiceSottogruppoMerceologico");
String codiceControparteContabile = rs.getString("codiceControparteContabile");
String codiceIVA = rs.getString("codiceIVA");
boolean indicatoreGestionePezzi = rs.getBoolean("indicatoreGestionePezzi");
float sconto = rs.getFloat("sconto");
String codiceTaglieColori = rs.getString("codiceTaglieColori");
String codiceColore = rs.getString("codiceColore");
String codiceTaglia = rs.getString("codiceTaglia");
float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
boolean indicatoreSerialNumber = rs.getBoolean("indicatoreSerialNumber");
float pesoNetto = rs.getFloat("pesoNetto");
String codiceConfezione = rs.getString("codiceConfezione");
float numeroPezziConfezione = rs.getFloat("numeroPezziConfezione");
int numeroColli = rs.getInt("numeroColli");
float pesoLordo = rs.getFloat("pesoLordo");
float volumeConfezione = rs.getFloat("volumeConfezione");
float altezza = rs.getFloat("altezza");
float larghezza = rs.getFloat("larghezza");
float profondita = rs.getFloat("profondita");
boolean indicatoreArticoloPadreFiglio = rs.getBoolean("indicatoreArticoloPadreFiglio");
String codiceArticoloAlternativo = rs.getString("codiceArticoloAlternativo");
String codicePercipiente = rs.getString("codicePercipiente");
int numeroDecimali = rs.getInt("numeroDecimali");
String note = rs.getString("note");
boolean indicatorePubblicazioneWeb = rs.getBoolean("indicatorePubblicazioneWeb");
boolean indicatoreInibizione = rs.getBoolean("indicatoreInibizione");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
boolean indicatoreScorporoIVA = rs.getBoolean("indicatoreScorporoIVA");
String codiceControparteContabileFornitore = rs.getString("codiceControparteContabileFornitore");
String codiceIVAFornitore = rs.getString("codiceIVAFornitore");
String codiceStampo = rs.getString("codiceStampo");
String noteProduzione = rs.getString("noteProduzione");
ArticoloMagazzino articoloMagazzino = new ArticoloMagazzino(codiceArticolo, descrizione, codiceUnitaMisura, codiceGruppoMerceologico, codiceSottogruppoMerceologico, codiceControparteContabile, codiceIVA, indicatoreGestionePezzi, sconto, codiceTaglieColori, codiceColore, codiceTaglia, percentualeProvvigione, indicatoreSerialNumber, pesoNetto, codiceConfezione, numeroPezziConfezione, numeroColli, pesoLordo, volumeConfezione, altezza, larghezza, profondita, indicatoreArticoloPadreFiglio, codiceArticoloAlternativo, codicePercipiente, numeroDecimali, note, indicatorePubblicazioneWeb, indicatoreInibizione, dataInserimento, dataUltimaModifica, indicatoreScorporoIVA, codiceControparteContabileFornitore, codiceIVAFornitore, codiceStampo, noteProduzione);

		listarticoloMagazzino.add(articoloMagazzino);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listarticoloMagazzino;
	}

}
