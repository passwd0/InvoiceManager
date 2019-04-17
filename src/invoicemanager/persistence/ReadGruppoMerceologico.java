package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.GruppoMerceologico;
import invoicemanager.model.Stato;


public class ReadGruppoMerceologico {
	private Connection c;

	public ReadGruppoMerceologico() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<GruppoMerceologico> read() {
		List<GruppoMerceologico> listgruppoMerceologico = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM GruppoMerceologico");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceGruppoMerceologico = rs.getString("codiceGruppoMerceologico");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				float sconto = rs.getFloat("sconto");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				int numeroPezziConfezione = rs.getInt("numeroPezziConfezione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				GruppoMerceologico gruppoMerceologico = new GruppoMerceologico(codiceGruppoMerceologico, descrizione, stato, sconto, percentualeProvvigione, numeroPezziConfezione, dataInserimento, dataUltimaModifica);

				listgruppoMerceologico.add(gruppoMerceologico);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listgruppoMerceologico;
	}

}
