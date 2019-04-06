package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.CodiceABarre;


public class ReadCodiceABarre {
	private Connection c;

	public ReadCodiceABarre() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<CodiceABarre> read() {
		List<CodiceABarre> listcodiceABarre = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CodiceABarre");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceArticolo = rs.getString("codiceArticolo");
				String codABarre = rs.getString("codiceABarre");
				String tipo = rs.getString("tipo");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				CodiceABarre codiceABarre = new CodiceABarre(codiceArticolo, codABarre, tipo, dataInserimento, dataUltimaModifica);

				listcodiceABarre.add(codiceABarre);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcodiceABarre;
	}

}
