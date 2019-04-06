package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.TipoBento;


public class ReadTipoBento {
	private Connection c;

	public ReadTipoBento() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<TipoBento> read() {
		List<TipoBento> listtipoBento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoBento");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceTipoBento = rs.getString("codiceTipoBento");
				String descrizione = rs.getString("descrizione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();
				
				TipoBento tipoBento = new TipoBento(codiceTipoBento, descrizione, dataInserimento, dataUltimaModifica);

				listtipoBento.add(tipoBento);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoBento;
	}

}
