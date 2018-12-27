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
		c = DBConnect.getConnection();
	}

	public List<FatturaDettaglio> read() {
		List<FatturaDettaglio> listfatturaDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroRigaFattur = rs.getInt("numeroRigaFattur");
String codiceTipoRigaDocument = rs.getString("codiceTipoRigaDocument");
String codiceArticol = rs.getString("codiceArticol");
float cost = rs.getFloat("cost");
int numeroOrdin = rs.getInt("numeroOrdin");
int numeroRigaOrdin = rs.getInt("numeroRigaOrdin");
ts = rs.getTimestamp("dataOrdin");
LocalDateTime dataOrdin = null;
if (ts != null)
dataOrdin = ts.toLocalDateTime();
float quantitaDaConsegnar = rs.getFloat("quantitaDaConsegnar");
boolean indicatoreEvasion = rs.getBoolean("indicatoreEvasion");
String descrizion = rs.getString("descrizion");
float quantit = rs.getFloat("quantit");
float prezz = rs.getFloat("prezz");
String codiceIv = rs.getString("codiceIv");
String codiceContropartitaContabil = rs.getString("codiceContropartitaContabil");
float percentualeProvvigion = rs.getFloat("percentualeProvvigion");
float percentualeScontoClient = rs.getFloat("percentualeScontoClient");
float percentualeScontoArticol = rs.getFloat("percentualeScontoArticol");
float percentualeScontoPagament = rs.getFloat("percentualeScontoPagament");
FatturaDettaglio fatturaDettaglio = new FatturaDettaglio(numeroRigaFattur, codiceTipoRigaDocument, codiceArticol, cost, numeroOrdin, numeroRigaOrdin, dataOrdin, quantitaDaConsegnar, indicatoreEvasion, descrizion, quantit, prezz, codiceIv, codiceContropartitaContabil, percentualeProvvigion, percentualeScontoClient, percentualeScontoArticol, percentualeScontoPagament);

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
