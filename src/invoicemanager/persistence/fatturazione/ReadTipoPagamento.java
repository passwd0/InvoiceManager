package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.TipoPagamento;


public class ReadTipoPagamento {
	private Connection c;

	public ReadTipoPagamento() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<TipoPagamento> read() {
		List<TipoPagamento> listtipoPagamento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoPagamento");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceTipoPagamento = rs.getString("codiceTipoPagamento");
				String descrizione = rs.getString("descrizione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				TipoPagamento tipoPagamento = new TipoPagamento(codiceTipoPagamento, descrizione, dataInserimento, dataUltimaModifica);

		listtipoPagamento.add(tipoPagamento);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoPagamento;
	}

}
