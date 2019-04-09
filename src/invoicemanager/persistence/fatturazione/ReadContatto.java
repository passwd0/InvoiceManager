package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Contatto;


public class ReadContatto {
	private Connection c;

	public ReadContatto() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Contatto> read() {
		List<Contatto> listtelefono = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Contatto");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceConto = rs.getString("codiceConto");
				int progressivo = rs.getInt("progressivo");
				String tipoContatto = rs.getString("tipoContatto");
				String numero = rs.getString("numero");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();

				Contatto telefono = new Contatto(codiceConto, progressivo, tipoContatto, numero, dataInserimento, dataUltimaModifica);

		listtelefono.add(telefono);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtelefono;
	}

}
