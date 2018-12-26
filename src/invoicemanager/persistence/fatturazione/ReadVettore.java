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

String codiceVettor = rs.getString("codiceVettor");
String descrizion = rs.getString("descrizion");
String codice = rs.getString("codiceStat");
Stato codiceStat = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
String vi = rs.getString("vi");
String citt = rs.getString("citt");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
String loginInseriment = rs.getString("loginInseriment");
String loginModific = rs.getString("loginModific");
String partitaIv = rs.getString("partitaIv");
String iscrizion = rs.getString("iscrizion");
String telefon = rs.getString("telefon");
Vettore vettore = new Vettore(codiceVettor, descrizion, codiceStat, vi, citt, dataInseriment, dataUltimaModific, loginInseriment, loginModific, partitaIv, iscrizion, telefon);

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
