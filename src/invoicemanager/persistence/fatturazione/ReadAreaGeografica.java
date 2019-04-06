package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.AreaGeografica;


public class ReadAreaGeografica {
	private Connection c;

	public ReadAreaGeografica() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<AreaGeografica> read() {
		List<AreaGeografica> listareaGeografica = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM AreaGeografica");
			Timestamp ts;
	         while ( rs.next() ) {

				int codiceArea = rs.getInt("codiceArea");
				String nazione = rs.getString("nazione");
				String area = rs.getString("area");
				String regione = rs.getString("regione");
				String provincia = rs.getString("provincia");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				AreaGeografica areaGeografica = new AreaGeografica(codiceArea, nazione, area, regione, provincia, dataInserimento, dataUltimaModifica);

				listareaGeografica.add(areaGeografica);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listareaGeografica;
	}

}
