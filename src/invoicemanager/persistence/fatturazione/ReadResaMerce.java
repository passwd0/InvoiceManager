package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.ResaMerce;


public class ReadResaMerce {
	private Connection c;

	public ReadResaMerce() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<ResaMerce> read() {
		List<ResaMerce> listresaMerce = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ResaMerce");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceRes = rs.getString("codiceRes");
String descrizion = rs.getString("descrizion");
String codice = rs.getString("codiceStat");
Stato codiceStat = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
float percentualeAddebit = rs.getFloat("percentualeAddebit");
float importoMinim = rs.getFloat("importoMinim");
boolean indicatoreProvvigion = rs.getBoolean("indicatoreProvvigion");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
String loginInseriment = rs.getString("loginInseriment");
ResaMerce resaMerce = new ResaMerce(codiceRes, descrizion, codiceStat, percentualeAddebit, importoMinim, indicatoreProvvigion, dataInseriment, dataUltimaModific, loginInseriment);

		listresaMerce.add(resaMerce);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listresaMerce;
	}

}
