package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Telefono;


public class ReadTelefono {
	private Connection c;

	public ReadTelefono() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Telefono> read() {
		List<Telefono> listtelefono = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Telefono");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceConto = rs.getString("codiceConto");
				int progressivo = rs.getInt("progressivo");
				String tipoTelefono = rs.getString("tipoTelefono");
				String numero = rs.getString("numero");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();

				Telefono telefono = new Telefono(codiceConto, progressivo, tipoTelefono, numero, dataInserimento, dataUltimaModifica);

		listtelefono.add(telefono);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtelefono;
	}

}
