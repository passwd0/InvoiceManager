package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.PreventivoDettaglio;


public class ReadPreventivoDettaglio {
	private Connection c;

	public ReadPreventivoDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<PreventivoDettaglio> read() {
		List<PreventivoDettaglio> listpreventivoDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PreventivoDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroPreventivo = rs.getInt("numeroPreventivo");
int numeroRigaPreventivo = rs.getInt("numeroRigaPreventivo");
String codice = rs.getString("dataPreventivo");
LocalDate dataPreventivo = listaLocalDate.stream().filter(x->x.getCodiceLocalDate().equals(codice)).findFirst().get();
String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
String codiceArticolo = rs.getString("codiceArticolo");
float quantitaArticolo = rs.getFloat("quantitaArticolo");
float quantitaConsegnata = rs.getFloat("quantitaConsegnata");
float quantitaDaConsegnare = rs.getFloat("quantitaDaConsegnare");
String descrizione = rs.getString("descrizione");
String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
String codice = rs.getString("dataConsegna");
LocalDate dataConsegna = listaLocalDate.stream().filter(x->x.getCodiceLocalDate().equals(codice)).findFirst().get();
String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
float prezzo = rs.getFloat("prezzo");
String codiceIVA = rs.getString("codiceIVA");
String codiceControparte = rs.getString("codiceControparte");
float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
float percentualeScontoCliente = rs.getFloat("percentualeScontoCliente");
float percentualeScontoArticolo = rs.getFloat("percentualeScontoArticolo");
float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
String codiceMagazzino = rs.getString("codiceMagazzino");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
(List<LocalDate> listaLocalDate, List<LocalDate> listaLocalDate,)
PreventivoDettaglio preventivoDettaglio = new PreventivoDettaglio(numeroPreventivo, numeroRigaPreventivo, dataPreventivo, codiceTipoRigaDocumento, codiceArticolo, quantitaArticolo, quantitaConsegnata, quantitaDaConsegnare, descrizione, descrizioneAggiuntiva, dataConsegna, codiceUnitaMisura, prezzo, codiceIVA, codiceControparte, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, codiceMagazzino, dataInserimento, dataUltimaModifica);

		listpreventivoDettaglio.add(preventivoDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpreventivoDettaglio;
	}

}
