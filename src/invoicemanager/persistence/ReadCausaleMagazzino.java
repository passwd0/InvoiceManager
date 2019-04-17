package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.CausaleMagazzino;
import invoicemanager.model.Stato;


public class ReadCausaleMagazzino {
	private Connection c;

	public ReadCausaleMagazzino() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<CausaleMagazzino> read() {
		List<CausaleMagazzino> listcausaleMagazzino = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CausaleMagazzino");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceCausaleMagazzino = rs.getString("codiceCausaleMagazzino");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				boolean segnoEsistenza = rs.getBoolean("segnoEsistenza");
				boolean segnoImpegniCliente = rs.getBoolean("segnoImpegniCliente");
				boolean segnoOrdiniFornitore = rs.getBoolean("segnoOrdiniFornitore");
				boolean segnoFatturato = rs.getBoolean("segnoFatturato");
				boolean segnoCaricoAValore = rs.getBoolean("segnoCaricoAValore");
				boolean segnoUnitaVendute = rs.getBoolean("segnoUnitaVendute");
				boolean segnoCaricoAQuantita = rs.getBoolean("segnoCaricoAQuantita");
				boolean indicatoreMovimentoAQuantita = rs.getBoolean("indicatoreMovimentoAQuantita");
				boolean indicatoreMovimentoAValore = rs.getBoolean("indicatoreMovimentoAValore");
				boolean indicatoreMovimentoContoLavorazione = rs.getBoolean("indicatoreMovimentoContoLavorazione");
				boolean indicatoreMovimentoCommessa = rs.getBoolean("indicatoreMovimentoCommessa");
				boolean indicatoreAggiornamentoDataUltimoCarico = rs.getBoolean("indicatoreAggiornamentoDataUltimoCarico");
				boolean indicatoreAggiornamentoDataUltimoScarico = rs.getBoolean("indicatoreAggiornamentoDataUltimoScarico");
				boolean indicatoreAggiornamentoCostoUltimo = rs.getBoolean("indicatoreAggiornamentoCostoUltimo");
				String valoreDaProporre = rs.getString("valoreDaProporre");
				String valorePerValorizzazioneMovimenti = rs.getString("valorePerValorizzazioneMovimenti");
				boolean indicatoreConcatenamento = rs.getBoolean("indicatoreConcatenamento");
				String codiceCausaleMagazzinoConcatenata = rs.getString("codiceCausaleMagazzinoConcatenata");
				String nomeFileMemo = rs.getString("nomeFileMemo");
				boolean indicatoreModifica = rs.getBoolean("indicatoreModifica");
				boolean indicatoreBollaEntrata = rs.getBoolean("indicatoreBollaEntrata");
				boolean indicatoreDocumentoDiTrasporto = rs.getBoolean("indicatoreDocumentoDiTrasporto");
				boolean indicatoreFatturaAccompagnatoria = rs.getBoolean("indicatoreFatturaAccompagnatoria");
				boolean indicatoreOrdineCliente = rs.getBoolean("indicatoreOrdineCliente");
				boolean indicatoreOrdineFornitore = rs.getBoolean("indicatoreOrdineFornitore");
				boolean indicatoreDistinta = rs.getBoolean("indicatoreDistinta");
				String note = rs.getString("note");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				boolean indicatoreLotti = rs.getBoolean("indicatoreLotti");
				
				CausaleMagazzino causaleMagazzino = new CausaleMagazzino(codiceCausaleMagazzino, descrizione, 
						stato, segnoEsistenza, segnoImpegniCliente, segnoOrdiniFornitore, segnoFatturato, 
						segnoCaricoAValore, segnoUnitaVendute, segnoCaricoAQuantita, indicatoreMovimentoAQuantita, 
						indicatoreMovimentoAValore, indicatoreMovimentoContoLavorazione, indicatoreMovimentoCommessa, 
						indicatoreAggiornamentoDataUltimoCarico, indicatoreAggiornamentoDataUltimoScarico, 
						indicatoreAggiornamentoCostoUltimo, valoreDaProporre, valorePerValorizzazioneMovimenti, 
						indicatoreConcatenamento, codiceCausaleMagazzinoConcatenata, nomeFileMemo, indicatoreModifica, 
						indicatoreBollaEntrata, indicatoreDocumentoDiTrasporto, indicatoreFatturaAccompagnatoria, 
						indicatoreOrdineCliente, indicatoreOrdineFornitore, indicatoreDistinta, note, dataInserimento, 
						dataUltimaModifica, indicatoreLotti);

				listcausaleMagazzino.add(causaleMagazzino);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcausaleMagazzino;
	}

}
