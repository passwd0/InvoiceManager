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
		c = DBConnect.connect();
	}

	public List<TipoPagamento> read() {
		List<TipoPagamento> listtipoPagamento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoPagamento");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceTipoPagament = rs.getString("codiceTipoPagament");
String descrizion = rs.getString("descrizion");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
TipoPagamento tipoPagamento = new TipoPagamento(codiceTipoPagament, descrizion, dataInseriment, dataUltimaModific);

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
