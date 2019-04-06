package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.CapItaliano;


public class ReadCapItaliano {
	private Connection c;

	public ReadCapItaliano() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<CapItaliano> read() {
		List<CapItaliano> listcapItaliano = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CapItaliano");
			Timestamp ts;
	         while ( rs.next() ) {

				int id = rs.getInt("id");
				String cap = rs.getString("cap");
				String comune = rs.getString("comune");
				String provincia = rs.getString("provincia");
				String nazione = rs.getString("nazione");
				String codiceISTAT = rs.getString("codiceISTAT");
				String codiceCAB = rs.getString("codiceCAB");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				CapItaliano capItaliano = new CapItaliano(id, cap, comune, provincia, nazione, codiceISTAT, codiceCAB, dataInserimento, dataUltimaModifica);

				listcapItaliano.add(capItaliano);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcapItaliano;
	}

}
