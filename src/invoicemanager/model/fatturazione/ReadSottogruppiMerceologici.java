package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.SottogruppiMerceologici;


public class ReadSottogruppiMerceologici {
	private Connection c;

	public ReadSottogruppiMerceologici() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<SottogruppiMerceologici> read() {
		List<SottogruppiMerceologici> listsottogruppiMerceologici = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM SottogruppiMerceologici");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceSottogruppoMerceologico = rs.getString("codiceSottogruppoMerceologico");
String descrizione = rs.getString("descrizione");
boolean codiceStato = rs.getBoolean("codiceStato");
float sconto = rs.getFloat("sconto");
float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
SottogruppiMerceologici sottogruppiMerceologici = new SottogruppiMerceologici(codiceSottogruppoMerceologico, descrizione, codiceStato, sconto, percentualeProvvigione, dataInserimento, dataUltimaModifica);

		listsottogruppiMerceologici.add(sottogruppiMerceologici);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listsottogruppiMerceologici;
	}

}
