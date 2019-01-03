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

import invoicemanager.model.fatturazione.DdtDettaglio;
import invoicemanager.model.fatturazione.DdtTestata;


public class ReadDdtTestata {
	private Connection c;

	public ReadDdtTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<DdtTestata> read(List<DdtDettaglio> listaDdtDettaglio) {
		List<DdtTestata> listddtTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM DdtTestata");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroDDT = rs.getInt("numeroDDT");
				ts = rs.getTimestamp("dataDDT");
				LocalDateTime dataDDT = null;
				if (ts != null)
				dataDDT = ts.toLocalDateTime();
				boolean indicatoreStatoAvanzamento = rs.getBoolean("indicatoreStatoAvanzamento");
				String codiceCausale = rs.getString("codiceCausale");
				String codiceCausalePrelievi = rs.getString("codiceCausalePrelievi");
				String codiceClienteFatturazione = rs.getString("codiceClienteFatturazione");
				String codiceEsenzioneIva = rs.getString("codiceEsenzioneIva");
				String codiceAgente = rs.getString("codiceAgente");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				float percentualeSconto = rs.getFloat("percentualeSconto");
				int numeroCopieFattura = rs.getInt("numeroCopieFattura");
				boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
				boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
				int codiceListino = rs.getInt("codiceListino");
				String codiceResa = rs.getString("codiceResa");
				String codiceVettore = rs.getString("codiceVettore");
				String codiceImballo = rs.getString("codiceImballo");
				String codicePagamento = rs.getString("codicePagamento");
				String codiceBanca = rs.getString("codiceBanca");
				int numeroFattura = rs.getInt("numeroFattura");
				LocalDate dataFattura = rs.getDate("dataFattura").toLocalDate();
				String codiceDivisa = rs.getString("codiceDivisa");
				String causaleTrasporto = rs.getString("causaleTrasporto");
				float pesoColli = rs.getFloat("pesoColli");
				String descrizione = rs.getString("descrizione");
				int numeroColli = rs.getInt("numeroColli");
				boolean indicatorePreventivoDaConferma = rs.getBoolean("indicatorePreventivoDaConferma");
				boolean indicatoreBollaVisione = rs.getBoolean("indicatoreBollaVisione");
				String codiceClienteSpedizione = rs.getString("codiceClienteSpedizione");
				String nomeSpedizione = rs.getString("nomeSpedizione");
				String indirizzoSpedizione = rs.getString("indirizzoSpedizione");
				String capSpedizione = rs.getString("capSpedizione");
				String cittaSpedizione = rs.getString("cittaSpedizione");
				String provinciaSpedizione = rs.getString("provinciaSpedizione");
				String codiceNazioneSpedizione = rs.getString("codiceNazioneSpedizione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				String note = rs.getString("note");
				String codiceLingua = rs.getString("codiceLingua");
				int numeroDdtDeposito = rs.getInt("numeroDdtDeposito");
					String codiceDeposito = rs.getString("codiceDeposito");
				String noteCaricamento = rs.getString("noteCaricamento");
				String codiceFilialeEdi = rs.getString("codiceFilialeEdi");
				ts = rs.getTimestamp("dataCaricamento");
				LocalDateTime dataCaricamento = null;
				if (ts != null)
					dataCaricamento = ts.toLocalDateTime();
				String unitaMisuraPesoColli = rs.getString("unitaMisuraPesoColli");
				int codiceDdtDettaglio = rs.getInt("ddtDettagli");
				List<DdtDettaglio> ddtDettagli = listaDdtDettaglio.stream().filter(x->x.getNumeroDDT() == codiceDdtDettaglio).collect(Collectors.toList());
				
				DdtTestata ddtTestata = new DdtTestata(numeroDDT, dataDDT, indicatoreStatoAvanzamento, codiceCausale, codiceCausalePrelievi, codiceClienteFatturazione, codiceEsenzioneIva, codiceAgente, percentualeProvvigione, percentualeSconto, numeroCopieFattura, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, codiceListino, codiceResa, codiceVettore, codiceImballo, codicePagamento, codiceBanca, numeroFattura, dataFattura, codiceDivisa, causaleTrasporto, pesoColli, descrizione, numeroColli, indicatorePreventivoDaConferma, indicatoreBollaVisione, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, dataInserimento, dataUltimaModifica, note, codiceLingua, numeroDdtDeposito, codiceDeposito, noteCaricamento, codiceFilialeEdi, dataCaricamento, unitaMisuraPesoColli, ddtDettagli);
				listddtTestata.add(ddtTestata);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listddtTestata;
	}

}
