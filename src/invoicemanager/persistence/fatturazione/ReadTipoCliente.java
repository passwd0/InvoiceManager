package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.TipoCliente;


public class ReadTipoCliente {
	private Connection c;

	public ReadTipoCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<TipoCliente> read() {
		List<TipoCliente> listtipoCliente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoCliente");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceTipoClient = rs.getString("codiceTipoClient");
String descrizion = rs.getString("descrizion");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
TipoCliente tipoCliente = new TipoCliente(codiceTipoClient, descrizion, dataInseriment, dataUltimaModific);

		listtipoCliente.add(tipoCliente);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoCliente;
	}

}
