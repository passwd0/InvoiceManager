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

import invoicemanager.model.fatturazione.GruppoMerceologico;
import invoicemanager.model.fatturazione.ListinoPersonalizzato;


public class ReadListinoPersonalizzato {
	private Connection c;

	public ReadListinoPersonalizzato() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<ListinoPersonalizzato> read(List<GruppoMerceologico> listaGruppoMerceologico){
		List<ListinoPersonalizzato> listlistinoPersonalizzato = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ListinoPersonalizzato");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceListinoPersonalizzato = rs.getString("codiceListinoPersonalizzato");
				String codiceCliente = rs.getString("codiceCliente");
				String codiceArticolo = rs.getString("codiceArticolo");
				String variante = rs.getString("variante");
				float prezzo = rs.getFloat("prezzo");
				float provvigione = rs.getFloat("provvigione");
				String noteEsterne = rs.getString("noteEsterne");
				String noteInterne = rs.getString("noteInterne");
				int numeroDecimali = rs.getInt("numeroDecimali");
				float scontoCliente = rs.getFloat("scontoCliente");
				ts = rs.getTimestamp("dataAggiornamento");
				LocalDateTime dataAggiornamento = null;
				if (ts != null)
				dataAggiornamento = ts.toLocalDateTime();
				float scontoArticolo = rs.getFloat("scontoArticolo");
				float scontoPagamento = rs.getFloat("scontoPagamento");
				String codiceDivisa = rs.getString("codiceDivisa");
				String codice = rs.getString("gruppoMerceologico");
				GruppoMerceologico gruppoMerceologico = listaGruppoMerceologico.stream().filter(x->x.getCodiceGruppoMerceologico().equals(codice)).findFirst().orElse(null);
				LocalDate dataInizioValidita = rs.getDate("dataInizioValidita").toLocalDate();
				LocalDate dataFineValidita = rs.getDate("dataFineValidita").toLocalDate();
				boolean opzioneGruppi = rs.getBoolean("opzioneGruppi");
				boolean opzioneScontoClienti = rs.getBoolean("opzioneScontoClienti");
				boolean opzioneScontoArticolo = rs.getBoolean("opzioneScontoArticolo");
				boolean opzioneScontoPagamento = rs.getBoolean("opzioneScontoPagamento");
				boolean opzionePercentualeProvvigione = rs.getBoolean("opzionePercentualeProvvigione");
				boolean opzioneNoteEsterne = rs.getBoolean("opzioneNoteEsterne");
				boolean opzioneNoteInterne = rs.getBoolean("opzioneNoteInterne");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				ListinoPersonalizzato listinoPersonalizzato = new ListinoPersonalizzato(codiceListinoPersonalizzato, codiceCliente, codiceArticolo, variante, prezzo, provvigione, noteEsterne, noteInterne, numeroDecimali, scontoCliente, dataAggiornamento, scontoArticolo, scontoPagamento, codiceDivisa, gruppoMerceologico, dataInizioValidita, dataFineValidita, opzioneGruppi, opzioneScontoClienti, opzioneScontoArticolo, opzioneScontoPagamento, opzionePercentualeProvvigione, opzioneNoteEsterne, opzioneNoteInterne, dataInserimento, dataUltimaModifica);

				listlistinoPersonalizzato.add(listinoPersonalizzato);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listlistinoPersonalizzato;
	}

}
