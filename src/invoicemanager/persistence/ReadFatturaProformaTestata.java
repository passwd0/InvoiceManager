package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.FatturaProformaTestata;
import invoicemanager.utils.Utils;


public class ReadFatturaProformaTestata {
	private Connection c;

	public ReadFatturaProformaTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<FatturaProformaTestata> read() {
		List<FatturaProformaTestata> listfatturaProformaTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaProformaTestata");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroFattura = rs.getInt("numeroFattura");
				LocalDate dataFattura = Utils.convertToEntityAttribute(rs.getDate("dataFattura"));
				boolean indicatoreStatoAvanzamento = rs.getBoolean("indicatoreStatoAvanzamento");
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
				int numeroCopieFattura = rs.getInt("numeroCopieFattura");
				boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
				boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
				boolean indicatoreScaricoMagazzino = rs.getBoolean("indicatoreScaricoMagazzino");
				int codiceListino = rs.getInt("codiceListino");
				String codiceResa = rs.getString("codiceResa");
				String codiceVettore = rs.getString("codiceVettore");
				boolean indicatoreFatturaAccompagnatoria = rs.getBoolean("indicatoreFatturaAccompagnatoria");
				String codicePagamento = rs.getString("codicePagamento");
				String codiceBanca = rs.getString("codiceBanca");
				int numeroDDT = rs.getInt("numeroDDT");
				LocalDate dataDDT = Utils.convertToEntityAttribute(rs.getDate("dataDDT"));
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
				LocalDate dataInserimento = Utils.convertToEntityAttribute(rs.getDate("dataInserimento"));
				LocalDate dataUltimaModifica = Utils.convertToEntityAttribute(rs.getDate("dataUltimaModifica"));
				String note = rs.getString("note");
				String codiceLingua = rs.getString("codiceLingua");
				boolean indicatoreFatturazioneDifferita = rs.getBoolean("indicatoreFatturazioneDifferita");
				boolean indicatoreEdi = rs.getBoolean("indicatoreEdi");
				String codiceFilialeEdi = rs.getString("codiceFilialeEdi");
				boolean indicatoreEmail = rs.getBoolean("indicatoreEmail");
				boolean indicatorePA = rs.getBoolean("indicatorePA");
				boolean indicatoreXML = rs.getBoolean("indicatoreXML");
				boolean indicatorePlafond = rs.getBoolean("indicatorePlafond");
				
				FatturaProformaTestata fatturaProformaTestata = new FatturaProformaTestata(numeroFattura, dataFattura, indicatoreStatoAvanzamento, sezionale, codiceClienteFatturazione, codiceEsenzioneIva, codiceAgente, codiceCausale, codiceCausalePrelievi, percentualeSconto, percentualeScontoPagamento, percentualeProvvigione, descrizione, numeroCopieFattura, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, indicatoreScaricoMagazzino, codiceListino, codiceResa, codiceVettore, indicatoreFatturaAccompagnatoria, codicePagamento, codiceBanca, numeroDDT, dataDDT, codiceImballo, pesoColli, numeroColli, acconto, codiceDivisa, cambio, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, dataInserimento, dataUltimaModifica, note, codiceLingua, indicatoreFatturazioneDifferita, indicatoreEdi, codiceFilialeEdi, indicatoreEmail, indicatorePA, indicatoreXML, indicatorePlafond);

				listfatturaProformaTestata.add(fatturaProformaTestata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaProformaTestata;
	}

}
