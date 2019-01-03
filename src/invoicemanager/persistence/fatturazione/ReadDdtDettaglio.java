package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.DdtDettaglio;


public class ReadDdtDettaglio {
	private Connection c;

	public ReadDdtDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<DdtDettaglio> read() {
		List<DdtDettaglio> listddtDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM DdtDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroDDT = rs.getInt("numeroDDT");
ts = rs.getTimestamp("dataDDT");
LocalDateTime dataDDT = null;
if (ts != null)
dataDDT = ts.toLocalDateTime();
int numeroRigaDDT = rs.getInt("numeroRigaDDT");
String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
String codiceArticolo = rs.getString("codiceArticolo");
String codiceMagazzino = rs.getString("codiceMagazzino");
float costo = rs.getFloat("costo");
int numeroOrdine = rs.getInt("numeroOrdine");
int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
LocalDate dataOrdine = rs.getDate("dataOrdine")).toLocalDate();
float quantitaDaConsegnare = rs.getFloat("quantitaDaConsegnare");
boolean indicatoreEvasione = rs.getBoolean("indicatoreEvasione");
String descrizione = rs.getString("descrizione");
float quantita = rs.getFloat("quantita");
float prezzo = rs.getFloat("prezzo");
String codiceIva = rs.getString("codiceIva");
String codiceContropartitaContabile = rs.getString("codiceContropartitaContabile");
float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
float percentualeScontoCliente = rs.getFloat("percentualeScontoCliente");
float percentualeScontoArticolo = rs.getFloat("percentualeScontoArticolo");
float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
String serialNumber = rs.getString("serialNumber");
ts = rs.getTimestamp("DataInserimento");
LocalDateTime DataInserimento = null;
if (ts != null)
DataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("DataUltimaModifica");
LocalDateTime DataUltimaModifica = null;
if (ts != null)
DataUltimaModifica = ts.toLocalDateTime();
boolean indicatorePrelevatoVendita = rs.getBoolean("indicatorePrelevatoVendita");
String pesoLordo = rs.getString("pesoLordo");
()
DdtDettaglio ddtDettaglio = new DdtDettaglio(numeroDDT, dataDDT, numeroRigaDDT, codiceTipoRigaDocumento, codiceArticolo, codiceMagazzino, costo, numeroOrdine, numeroRigaOrdine, dataOrdine, quantitaDaConsegnare, indicatoreEvasione, descrizione, quantita, prezzo, codiceIva, codiceContropartitaContabile, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, descrizioneAggiuntiva, codiceUnitaMisura, serialNumber, DataInserimento, DataUltimaModifica, indicatorePrelevatoVendita, pesoLordo);

		listddtDettaglio.add(ddtDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listddtDettaglio;
	}

}
