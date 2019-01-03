package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.PianoConto;


public class ReadPianoConto {
	private Connection c;

	public ReadPianoConto() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<PianoConto> read() {
		List<PianoConto> listpianoConto = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PianoConto");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceConto = rs.getString("codiceConto");
				String descrizione = rs.getString("descrizione");
				boolean tipo = rs.getBoolean("tipo");
				String codiceClassificazione = rs.getString("codiceClassificazione");
				float darePeriodo = rs.getFloat("darePeriodo");
				float averePeriodo = rs.getFloat("averePeriodo");
				float dareProgressivo = rs.getFloat("dareProgressivo");
				float avereProgressivo = rs.getFloat("avereProgressivo");
				String codiceDivisa = rs.getString("codiceDivisa");
				String codiceBancaBonifico = rs.getString("codiceBancaBonifico");
				boolean contoBanca = rs.getBoolean("contoBanca");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				PianoConto pianoConto = new PianoConto(codiceConto, descrizione, tipo, codiceClassificazione, darePeriodo, averePeriodo, dareProgressivo, avereProgressivo, codiceDivisa, codiceBancaBonifico, contoBanca, dataInserimento, dataUltimaModifica);

				listpianoConto.add(pianoConto);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpianoConto;
	}

}
