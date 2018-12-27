package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Vettore;


public class ReadVettore {
	private Connection c;

	public ReadVettore() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Vettore> read() {
		List<Vettore> listvettore = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Vettore");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceVettore = rs.getString("codiceVettore");
String descrizione = rs.getString("descrizione");
String codice = rs.getString("codiceStato");
Stato codiceStato = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
String via = rs.getString("via");
String citta = rs.getString("citta");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
String loginInserimento = rs.getString("loginInserimento");
String loginModifica = rs.getString("loginModifica");
String partitaIva = rs.getString("partitaIva");
String iscrizione = rs.getString("iscrizione");
String telefono = rs.getString("telefono");
Vettore vettore = new Vettore(codiceVettore, descrizione, codiceStato, via, citta, dataInserimento, dataUltimaModifica, loginInserimento, loginModifica, partitaIva, iscrizione, telefono);

		listvettore.add(vettore);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listvettore;
	}

}
