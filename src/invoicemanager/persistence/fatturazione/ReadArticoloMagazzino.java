package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.ArticoloMagazzino;
import invoicemanager.model.fatturazione.GruppoMerceologico;
import invoicemanager.model.fatturazione.Percipiente;
import invoicemanager.model.fatturazione.SottogruppoMerceologico;
import invoicemanager.model.fatturazione.UnitaMisura;


public class ReadArticoloMagazzino {
	private Connection c;

	public ReadArticoloMagazzino() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<ArticoloMagazzino> read(List<UnitaMisura> unitaMisure, List<GruppoMerceologico> gruppiMerceologici, List<SottogruppoMerceologico> sottogruppiMerceologici, 
			List<Percipiente> percipienti) {
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
				UnitaMisura unitaMisura = unitaMisure.stream().filter(u -> u.getCodiceUnitaMisura().equals(codiceUnitaMisura)).findFirst().orElse(null);
				String codiceGruppoMerceologico = rs.getString("codiceGruppoMerceologico");
				GruppoMerceologico gruppoMerceologico = gruppiMerceologici.stream().filter(gm -> gm.getCodiceGruppoMerceologico().equals(codiceGruppoMerceologico)).findFirst().orElse(null);
				String codiceSottogruppoMerceologico = rs.getString("codiceSottogruppoMerceologico");
				SottogruppoMerceologico sottogruppoMerceologico = sottogruppiMerceologici.stream().filter(gm -> gm.getCodiceSottogruppoMerceologico().equals(codiceSottogruppoMerceologico)).findFirst().orElse(null);
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
				Percipiente percipiente = percipienti.stream().filter(p -> p.getCodicePercipiente().equals(codicePercipiente)).findFirst().orElse(null);
				int numeroDecimali = rs.getInt("numeroDecimali");
				String note = rs.getString("note");
				boolean indicatorePubblicazioneWeb = rs.getBoolean("indicatorePubblicazioneWeb");
				boolean indicatoreInibizione = rs.getBoolean("indicatoreInibizione");
				boolean indicatoreScorporoIVA = rs.getBoolean("indicatoreScorporoIVA");
				String codiceControparteContabileFornitore = rs.getString("codiceControparteContabileFornitore");
				String codiceIVAFornitore = rs.getString("codiceIVAFornitore");
				String codiceStampo = rs.getString("codiceStampo");
				String noteProduzione = rs.getString("noteProduzione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();
				ArticoloMagazzino articoloMagazzino = new ArticoloMagazzino(codiceArticolo, descrizione, unitaMisura, gruppoMerceologico, sottogruppoMerceologico, codiceControparteContabile, 
						codiceIVA, indicatoreGestionePezzi, sconto, codiceTaglieColori, codiceColore, codiceTaglia, percentualeProvvigione, indicatoreSerialNumber, pesoNetto, 
						codiceConfezione, numeroPezziConfezione, numeroColli, pesoLordo, volumeConfezione, altezza, larghezza, profondita, indicatoreArticoloPadreFiglio, 
						codiceArticoloAlternativo, percipiente, numeroDecimali, note, indicatorePubblicazioneWeb, indicatoreInibizione, indicatoreScorporoIVA, 
						codiceControparteContabileFornitore, codiceIVAFornitore, codiceStampo, noteProduzione, dataInserimento, dataUltimaModifica);
				
				listarticoloMagazzino.add(articoloMagazzino);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listarticoloMagazzino;
	}

}
