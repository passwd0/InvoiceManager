package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.FatturaDettaglio;


public class ReadFatturaDettaglio {
	private Connection c;

	public ReadFatturaDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<FatturaDettaglio> read() {
		List<FatturaDettaglio> listfatturaDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroRigaFattura = rs.getInt("numeroRigaFattura");
String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
String codiceArticolo = rs.getString("codiceArticolo");
float costo = rs.getFloat("costo");
int numeroOrdine = rs.getInt("numeroOrdine");
int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
ts = rs.getTimestamp("dataOrdine");
LocalDateTime dataOrdine = null;
if (ts != null)
dataOrdine = ts.toLocalDateTime();
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
FatturaDettaglio fatturaDettaglio = new FatturaDettaglio(numeroRigaFattura, codiceTipoRigaDocumento, codiceArticolo, costo, numeroOrdine, numeroRigaOrdine, dataOrdine, quantitaDaConsegnare, indicatoreEvasione, descrizione, quantita, prezzo, codiceIva, codiceContropartitaContabile, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento);

		listfatturaDettaglio.add(fatturaDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaDettaglio;
	}

}
