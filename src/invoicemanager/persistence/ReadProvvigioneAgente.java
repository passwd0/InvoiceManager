package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.ProvvigioneAgente;


public class ReadProvvigioneAgente {
	private Connection c;

	public ReadProvvigioneAgente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<ProvvigioneAgente> read() {
		List<ProvvigioneAgente> listprovvigioneAgente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ProvvigioneAgente");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceProvvigione = rs.getString("codiceProvvigione");
				String codiceAgente = rs.getString("codiceAgente");
				float scontoLegatoProvvigione = rs.getFloat("scontoLegatoProvvigione");
				float provvigioneLegataSconto = rs.getFloat("provvigioneLegataSconto");
				int progressivo = rs.getInt("progressivo");
				String codiceGruppoMerceologico = rs.getString("codiceGruppoMerceologico");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				ProvvigioneAgente provvigioneAgente = new ProvvigioneAgente(codiceProvvigione, codiceAgente, scontoLegatoProvvigione, provvigioneLegataSconto, progressivo, codiceGruppoMerceologico, dataInserimento, dataUltimaModifica);

				listprovvigioneAgente.add(provvigioneAgente);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listprovvigioneAgente;
	}

}
