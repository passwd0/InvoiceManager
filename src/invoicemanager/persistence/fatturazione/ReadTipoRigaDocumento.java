package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.TipoRigaDocumento;


public class ReadTipoRigaDocumento {
	private Connection c;

	public ReadTipoRigaDocumento() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<TipoRigaDocumento> read() {
		List<TipoRigaDocumento> listtipoRigaDocumento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoRigaDocumento");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
String descrizione = rs.getString("descrizione");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
TipoRigaDocumento tipoRigaDocumento = new TipoRigaDocumento(codiceTipoRigaDocumento, descrizione, dataInserimento, dataUltimaModifica);

		listtipoRigaDocumento.add(tipoRigaDocumento);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoRigaDocumento;
	}

}
