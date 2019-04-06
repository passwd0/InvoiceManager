package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.TipoIndirizzo;


public class ReadTipoIndirizzo {
	private Connection c;

	public ReadTipoIndirizzo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<TipoIndirizzo> read() {
		List<TipoIndirizzo> listtipoIndirizzo = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoIndirizzo");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceTipoIndirizzo = rs.getString("codiceTipoIndirizzo");
				String descrizione = rs.getString("descrizione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				TipoIndirizzo tipoIndirizzo = new TipoIndirizzo(codiceTipoIndirizzo, descrizione, dataInserimento, dataUltimaModifica);

				listtipoIndirizzo.add(tipoIndirizzo);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoIndirizzo;
	}

}
