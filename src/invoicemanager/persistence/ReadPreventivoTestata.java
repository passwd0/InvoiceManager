package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.PreventivoTestata;
import invoicemanager.utils.Utils;


public class ReadPreventivoTestata {
	private Connection c;

	public ReadPreventivoTestata() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<PreventivoTestata> read() {
		List<PreventivoTestata> listpreventivoTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PreventivoTestata");
			Timestamp ts;
	         while ( rs.next() ) {

			int numeroPreventivo = rs.getInt("numeroPreventivo");
			LocalDate dataPreventivo = Utils.convertToEntityAttribute(rs.getDate("dataPreventivo"));
			boolean indicatoreStatoAvanzamento = rs.getBoolean("indicatoreStatoAvanzamento");
			LocalDate dataConsegna = Utils.convertToEntityAttribute(rs.getDate("dataConsegna"));
			LocalDate dataValidita = Utils.convertToEntityAttribute(rs.getDate("dataValidita"));
			String periodoValidita = rs.getString("periodoValidita");
			boolean indicatoreUtilizzoDataValidita = rs.getBoolean("indicatoreUtilizzoDataValidita");
			String codiceCliente = rs.getString("codiceCliente");
			String attenzione = rs.getString("attenzione");
			String oggetto = rs.getString("oggetto");
			String riferimentoInterno = rs.getString("riferimentoInterno");
			String numeroInterno = rs.getString("numeroInterno");
			String codiceIVA = rs.getString("codiceIVA");
			String codiceAgente = rs.getString("codiceAgente");
			String codiceResa = rs.getString("codiceResa");
			String codiceVettore = rs.getString("codiceVettore");
			String codicePagamento = rs.getString("codicePagamento");
			String codiceBanca = rs.getString("codiceBanca");
			String codiceCausale = rs.getString("codiceCausale");
			String codiceCausalePrelievo = rs.getString("codiceCausalePrelievo");
			boolean codiceListino = rs.getBoolean("codiceListino");
			String descrizioneOrdine = rs.getString("descrizioneOrdine");
			String codiceDivisa = rs.getString("codiceDivisa");
			float cambio = rs.getFloat("cambio");
			String numeroFax = rs.getString("numeroFax");
			String venditore = rs.getString("venditore");
			boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
			boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
			String note = rs.getString("note");
			String codiceClienteSpedizione = rs.getString("codiceClienteSpedizione");
			String nomeSpedizione = rs.getString("nomeSpedizione");
			String indirizzoSpedizione = rs.getString("indirizzoSpedizione");
			String capSpedizione = rs.getString("capSpedizione");
			String cittaSpedizione = rs.getString("cittaSpedizione");
			String provinciaSpedizione = rs.getString("provinciaSpedizione");
			String codiceNazioneSpedizione = rs.getString("codiceNazioneSpedizione");
			String loginInserimento = rs.getString("loginInserimento");
			ts = rs.getTimestamp("dataInserimento");
			LocalDateTime dataInserimento = null;
			if (ts != null)
			dataInserimento = ts.toLocalDateTime();
			ts = rs.getTimestamp("dataUltimaModifica");
			LocalDateTime dataUltimaModifica = null;
			if (ts != null)
			dataUltimaModifica = ts.toLocalDateTime();
			
			PreventivoTestata preventivoTestata = new PreventivoTestata(numeroPreventivo, dataPreventivo, indicatoreStatoAvanzamento, dataConsegna, dataValidita, periodoValidita, indicatoreUtilizzoDataValidita, codiceCliente, attenzione, oggetto, riferimentoInterno, numeroInterno, codiceIVA, codiceAgente, codiceResa, codiceVettore, codicePagamento, codiceBanca, codiceCausale, codiceCausalePrelievo, codiceListino, descrizioneOrdine, codiceDivisa, cambio, numeroFax, venditore, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, note, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, loginInserimento, dataInserimento, dataUltimaModifica);

			listpreventivoTestata.add(preventivoTestata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpreventivoTestata;
	}

}
