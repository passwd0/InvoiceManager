package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.SottogruppoMerceologico;
import invoicemanager.model.Stato;


public class ReadSottogruppoMerceologico {
	private Connection c;

	public ReadSottogruppoMerceologico() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<SottogruppoMerceologico> read() {
		List<SottogruppoMerceologico> listsottogruppoMerceologico = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM SottogruppoMerceologico");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceSottogruppoMerceologico = rs.getString("codiceSottogruppoMerceologico");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
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
				String loginInserimento = rs.getString("loginInserimento");

				SottogruppoMerceologico sottogruppoMerceologico = new SottogruppoMerceologico(codiceSottogruppoMerceologico, descrizione, stato, sconto, percentualeProvvigione, dataInserimento, dataUltimaModifica, loginInserimento);

		listsottogruppoMerceologico.add(sottogruppoMerceologico);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listsottogruppoMerceologico;
	}

}
