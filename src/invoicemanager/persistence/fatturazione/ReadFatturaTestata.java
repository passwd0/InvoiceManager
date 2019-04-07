package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.Allegato;
import invoicemanager.model.fatturazione.FatturaDettaglio;
import invoicemanager.model.fatturazione.FatturaTestata;
import invoicemanager.model.fatturazione.StatoAvanzamento;
import invoicemanager.utils.Utils;


public class ReadFatturaTestata {
	private Connection c;

	public ReadFatturaTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<FatturaTestata> read(StatoAvanzamento[] listaStatoAvanzamento, List<FatturaDettaglio> listaFatturaDettaglio, List<Allegato> listaAllegato) {
		List<FatturaTestata> listfatturaTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaTestata");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroFatturazione = rs.getInt("numeroFatturazione");
				LocalDate dataFattura = Utils.convertToEntityAttribute(rs.getDate("dataFattura"));
				StatoAvanzamento statoAvanzamento = StatoAvanzamento.valueOf(rs.getString("StatoAvanzamento"));
				int sezionale = rs.getInt("sezionale");
				String codiceClienteFatturazione = rs.getString("codiceClienteFatturazione");
				String codiceEsenzioneIva = rs.getString("codiceEsenzioneIva");
				String codiceAgente = rs.getString("codiceAgente");
				String codiceCausale = rs.getString("codiceCausale");
				String codiceCausalePrelievi = rs.getString("codiceCausalePrelievi");
				float percentualeSconto = rs.getFloat("percentualeSconto");
				float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				String descrizione = rs.getString("descrizione");
				boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
				boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
				boolean indicatoreScaricoMagazzino = rs.getBoolean("indicatoreScaricoMagazzino");
				int codiceListino = rs.getInt("codiceListino");
				String codiceResa = rs.getString("codiceResa");
				String codiceVettore = rs.getString("codiceVettore");
				boolean indicatoreFatturaAccompagnatoria = rs.getBoolean("indicatoreFatturaAccompagnatoria");
				String codicePagamento = rs.getString("codicePagamento");
				String codiceBanca = rs.getString("codiceBanca");
				String codiceImballo = rs.getString("codiceImballo");
				float pesoColli = rs.getFloat("pesoColli");
				float numeroColli = rs.getFloat("numeroColli");
				float acconto = rs.getFloat("acconto");
				String codiceDivisa = rs.getString("codiceDivisa");
				float cambio = rs.getFloat("cambio");
				String codiceClienteSpedizione = rs.getString("codiceClienteSpedizione");
				String nomeSpedizione = rs.getString("nomeSpedizione");
				String indirizzoSpedizione = rs.getString("indirizzoSpedizione");
				String capSpedizione = rs.getString("capSpedizione");
				String cittaSpedizione = rs.getString("cittaSpedizione");
				String provinciaSpedizione = rs.getString("provinciaSpedizione");
				String codiceNazioneSpedizione = rs.getString("codiceNazioneSpedizione");
				String note = rs.getString("note");
				boolean indicatoreFatturazioneDifferita = rs.getBoolean("indicatoreFatturazioneDifferita");
				boolean indicatoreEmail = rs.getBoolean("indicatoreEmail");
				boolean indicatorePa = rs.getBoolean("indicatorePa");
				List<FatturaDettaglio> fatturadettaglio = listaFatturaDettaglio.stream().filter(x->x.getNumeroFattura()==numeroFatturazione).collect(Collectors.toList());
				float speseTrasporto = rs.getFloat("speseTrasporto");
				float speseImballo = rs.getFloat("speseImballo");
				float speseIncasso = rs.getFloat("speseIncasso");
				float speseBolli = rs.getFloat("speseBolli");
				float omaggi = rs.getFloat("omaggi");
				float totalePagato = rs.getFloat("totalePagato");
				LocalDate dataScadenza = Utils.convertToEntityAttribute(rs.getDate("dataScadenza"));
				float importoScadenza = rs.getFloat("importoScadenza");
				int idFatturaTestata = rs.getInt("IdFatturaTestata");
				List<Allegato> allegati = listaAllegato.stream().filter(x->x.getIdFatturaTestata()== idFatturaTestata).collect(Collectors.toList());
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();
				FatturaTestata fatturaTestata = new FatturaTestata(numeroFatturazione, dataFattura, statoAvanzamento, sezionale, codiceClienteFatturazione, codiceEsenzioneIva, codiceAgente, codiceCausale, codiceCausalePrelievi, percentualeSconto, percentualeScontoPagamento, percentualeProvvigione, descrizione, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, indicatoreScaricoMagazzino, codiceListino, codiceResa, codiceVettore, indicatoreFatturaAccompagnatoria, codicePagamento, codiceBanca, codiceImballo, pesoColli, numeroColli, acconto, codiceDivisa, cambio, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, note, indicatoreFatturazioneDifferita, indicatoreEmail, indicatorePa, fatturadettaglio, speseTrasporto, speseImballo, speseIncasso, speseBolli, omaggi, totalePagato, dataScadenza, importoScadenza, allegati);

				listfatturaTestata.add(fatturaTestata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaTestata;
	}

}
