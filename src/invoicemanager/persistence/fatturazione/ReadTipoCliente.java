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
		c = DBConnect.connect();
	}

	public List<TipoCliente> read() {
		List<TipoCliente> listtipoCliente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoCliente");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceTipoCliente = rs.getString("codiceTipoCliente");
String descrizione = rs.getString("descrizione");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
TipoCliente tipoCliente = new TipoCliente(codiceTipoCliente, descrizione, dataInserimento, dataUltimaModifica);

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
