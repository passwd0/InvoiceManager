package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.TipoMagazzino;


public class ReadTipoMagazzino {
	private Connection c;

	public ReadTipoMagazzino() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<TipoMagazzino> read() {
		List<TipoMagazzino> listtipoMagazzino = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoMagazzino");
			Timestamp ts;
	         while ( rs.next() ) {

				boolean codiceTipoMagazzino = rs.getBoolean("codiceTipoMagazzino");
				String descrizione = rs.getString("descrizione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				TipoMagazzino tipoMagazzino = new TipoMagazzino(codiceTipoMagazzino, descrizione, dataInserimento, dataUltimaModifica);
				listtipoMagazzino.add(tipoMagazzino);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoMagazzino;
	}

}
