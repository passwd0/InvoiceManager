package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.ArticoloMagazzinoDescrizioneMultilingua;


public class ReadArticoloMagazzinoDescrizioneMultilingua {
	private Connection c;

	public ReadArticoloMagazzinoDescrizioneMultilingua() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<ArticoloMagazzinoDescrizioneMultilingua> read() {
		List<ArticoloMagazzinoDescrizioneMultilingua> listarticoloMagazzinoDescrizioneMultilingua = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ArticoloMagazzinoDescrizioneMultilingua");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceArticolo = rs.getString("codiceArticolo");
String codiceLingua = rs.getString("codiceLingua");
String descrizione = rs.getString("descrizione");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
ArticoloMagazzinoDescrizioneMultilingua articoloMagazzinoDescrizioneMultilingua = new ArticoloMagazzinoDescrizioneMultilingua(codiceArticolo, codiceLingua, descrizione, dataInserimento, dataUltimaModifica);

		listarticoloMagazzinoDescrizioneMultilingua.add(articoloMagazzinoDescrizioneMultilingua);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listarticoloMagazzinoDescrizioneMultilingua;
	}

}
