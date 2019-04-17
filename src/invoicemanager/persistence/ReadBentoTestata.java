package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.BentoTestata;


public class ReadBentoTestata {
	private Connection c;

	public ReadBentoTestata() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<BentoTestata> read() {
		List<BentoTestata> listbentoTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BentoTestata");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceBento = rs.getString("codiceBento");
				String descrizione = rs.getString("descrizione");
				String codiceTipoBento = rs.getString("codiceTipoBento");
				String codiceMagazzino = rs.getString("codiceMagazzino");
				String codiceClienteFornitore = rs.getString("codiceClienteFornitore");
				String note = rs.getString("note");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				BentoTestata bentoTestata = new BentoTestata(codiceBento, descrizione, codiceTipoBento, codiceMagazzino, codiceClienteFornitore, note, dataInserimento, dataUltimaModifica);
				listbentoTestata.add(bentoTestata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listbentoTestata;
	}

}
