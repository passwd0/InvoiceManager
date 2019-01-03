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

import invoicemanager.model.fatturazione.OrdineDettaglio;


public class ReadOrdineDettaglio {
	private Connection c;

	public ReadOrdineDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<OrdineDettaglio> read() {
		List<OrdineDettaglio> listordineDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM OrdineDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroOrdine = rs.getInt("numeroOrdine");
				LocalDate dataOrdine = rs.getDate("dataOrdine").toLocalDate();
				int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
				String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
				String codiceMagazzino = rs.getString("codiceMagazzino");
				String codiceArticolo = rs.getString("codiceArticolo");
				float quantitaConsegnata = rs.getFloat("quantitaConsegnata");
				boolean indicatoreEvasione = rs.getBoolean("indicatoreEvasione");
				String descrizione = rs.getString("descrizione");
				LocalDate dataConsegna = rs.getDate("dataConsegna").toLocalDate();
				float quantita = rs.getFloat("quantita");
				String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
				float prezzo = rs.getFloat("prezzo");
				String codiceIva = rs.getString("codiceIva");
				String codiceContropartitaContabile = rs.getString("codiceContropartitaContabile");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				float percentualeScontoCliente = rs.getFloat("percentualeScontoCliente");
				float percentualeScontoArticolo = rs.getFloat("percentualeScontoArticolo");
				float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
				String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
				boolean indicatoreCoordinamento = rs.getBoolean("indicatoreCoordinamento");
				boolean indicatoreOrdineDaFatturare = rs.getBoolean("indicatoreOrdineDaFatturare");
				float quantitaVariata = rs.getFloat("quantitaVariata");
				int numeroPreventivo = rs.getInt("numeroPreventivo");
				int numeroRigaPreventivo = rs.getInt("numeroRigaPreventivo");
				LocalDate dataPreventivo = rs.getDate("dataPreventivo").toLocalDate();
				float quantitaEvasa = rs.getFloat("quantitaEvasa");
				boolean indicatoreEvasionePreventivi = rs.getBoolean("indicatoreEvasionePreventivi");
				boolean indicatoreEvasioneRigheNote = rs.getBoolean("indicatoreEvasioneRigheNote");
				boolean indicatoreNoConferma = rs.getBoolean("indicatoreNoConferma");
				LocalDate dataConsegnaSchedulatore = rs.getDate("dataConsegnaSchedulatore").toLocalDate();
				LocalDate dataConsegnaProposta = rs.getDate("dataConsegnaProposta").toLocalDate();
				boolean indicatoreBloccato = rs.getBoolean("indicatoreBloccato");
				boolean indicatoreOrdineTrading = rs.getBoolean("indicatoreOrdineTrading");
				LocalDate dataInizioSchedulatore = rs.getDate("dataInizioSchedulatore").toLocalDate();
				String codiceArticoloBis = rs.getString("codiceArticoloBis");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				OrdineDettaglio ordineDettaglio = new OrdineDettaglio(numeroOrdine, dataOrdine, numeroRigaOrdine, codiceTipoRigaDocumento, codiceMagazzino, codiceArticolo, quantitaConsegnata, indicatoreEvasione, descrizione, dataConsegna, quantita, codiceUnitaMisura, prezzo, codiceIva, codiceContropartitaContabile, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, descrizioneAggiuntiva, indicatoreCoordinamento, indicatoreOrdineDaFatturare, quantitaVariata, numeroPreventivo, numeroRigaPreventivo, dataPreventivo, quantitaEvasa, indicatoreEvasionePreventivi, indicatoreEvasioneRigheNote, indicatoreNoConferma, dataConsegnaSchedulatore, dataConsegnaProposta, indicatoreBloccato, indicatoreOrdineTrading, dataInizioSchedulatore, codiceArticoloBis, dataInserimento, dataUltimaModifica);
	
				listordineDettaglio.add(ordineDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listordineDettaglio;
	}

}
