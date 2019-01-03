package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.StatoFattura;


public class ReadStatoFattura {
	private Connection c;

	public ReadStatoFattura() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<StatoFattura> read() {
		List<StatoFattura> liststatoFattura = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM StatoFattura");
			Timestamp ts;
	         while ( rs.next() ) {

				boolean indicatoreStatoAvanzamento = rs.getBoolean("indicatoreStatoAvanzamento");
				boolean tipoDocumento = rs.getBoolean("tipoDocumento");
				String descrizione = rs.getString("descrizione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();

				StatoFattura statoFattura = new StatoFattura(indicatoreStatoAvanzamento, tipoDocumento, descrizione, dataInserimento, dataUltimaModifica);

		liststatoFattura.add(statoFattura);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return liststatoFattura;
	}

}
