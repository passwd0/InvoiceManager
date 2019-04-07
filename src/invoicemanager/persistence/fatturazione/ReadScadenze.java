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

import invoicemanager.model.fatturazione.Scadenze;
import invoicemanager.utils.Utils;


public class ReadScadenze {
	private Connection c;

	public ReadScadenze() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Scadenze> read() {
		List<Scadenze> listscadenze = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Scadenze");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceConto = rs.getString("codiceConto");
				String codiceTipoPagamento = rs.getString("codiceTipoPagamento");
				String riferimentoPartita = rs.getString("riferimentoPartita");
				LocalDate dataDocumento = Utils.convertToEntityAttribute(rs.getDate("dataDocumento"));
				LocalDate dataScadenza = Utils.convertToEntityAttribute(rs.getDate("dataScadenza"));
				int numeroRegistrazione = rs.getInt("numeroRegistrazione");
				String codiceBanca = rs.getString("codiceBanca");
				LocalDate dataValuta = Utils.convertToEntityAttribute(rs.getDate("dataValuta"));
				String codicePagamento = rs.getString("codicePagamento");
				String numeroAssegno = rs.getString("numeroAssegno");
				float importoImponibileRitenutaAcconto = rs.getFloat("importoImponibileRitenutaAcconto");
				float importoRitenutaAcconto = rs.getFloat("importoRitenutaAcconto");
				float importoRimborsiRitenutaAcconto = rs.getFloat("importoRimborsiRitenutaAcconto");
				float importoIVARitenutaAcconto = rs.getFloat("importoIVARitenutaAcconto");
				float contriburoINPSDatoreLavoro = rs.getFloat("contriburoINPSDatoreLavoro");
				float contriburoINPSDatorePercipiente = rs.getFloat("contriburoINPSDatorePercipiente");
				LocalDate dataValutaAssegno = Utils.convertToEntityAttribute(rs.getDate("dataValutaAssegno"));
				String note = rs.getString("note");
				float importoPagato = rs.getFloat("importoPagato");
				LocalDate dataPagamento = Utils.convertToEntityAttribute(rs.getDate("dataPagamento"));
				String numeroDocumento = rs.getString("numeroDocumento");
				String codiceIVAInSospensione = rs.getString("codiceIVAInSospensione");
				float importoPartita = rs.getFloat("importoPartita");
				float impostaIVAInSospensione = rs.getFloat("impostaIVAInSospensione");
				float imponibileIVAInSospensione = rs.getFloat("imponibileIVAInSospensione");
				int numeroGiornaleIVA = rs.getInt("numeroGiornaleIVA");
				String tipoRitenutaAcconto = rs.getString("tipoRitenutaAcconto");
				LocalDate dataAutorizzazionePagamento = Utils.convertToEntityAttribute(rs.getDate("dataAutorizzazionePagamento"));
				String codiceDivisa = rs.getString("codiceDivisa");
				LocalDate dataRegistrazione = Utils.convertToEntityAttribute(rs.getDate("dataRegistrazione"));
				float importoAbbuono = rs.getFloat("importoAbbuono");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
				boolean indicatoreFattureProforma = rs.getBoolean("indicatoreFattureProforma");
				float importoRimborsiCpap = rs.getFloat("importoRimborsiCpap");

				Scadenze scadenze = new Scadenze(codiceConto, codiceTipoPagamento, riferimentoPartita, dataDocumento, dataScadenza, numeroRegistrazione, codiceBanca, dataValuta, codicePagamento, numeroAssegno, importoImponibileRitenutaAcconto, importoRitenutaAcconto, importoRimborsiRitenutaAcconto, importoIVARitenutaAcconto, contriburoINPSDatoreLavoro, contriburoINPSDatorePercipiente, dataValutaAssegno, note, importoPagato, dataPagamento, numeroDocumento, codiceIVAInSospensione, importoPartita, impostaIVAInSospensione, imponibileIVAInSospensione, numeroGiornaleIVA, tipoRitenutaAcconto, dataAutorizzazionePagamento, codiceDivisa, dataRegistrazione, importoAbbuono, dataInserimento, dataUltimaModifica, descrizioneAggiuntiva, indicatoreFattureProforma, importoRimborsiCpap);

		listscadenze.add(scadenze);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listscadenze;
	}

}
