package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Confezione;


public class ReadConfezione {
	private Connection c;

	public ReadConfezione() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Confezione> read() {
		List<Confezione> listconfezione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Confezione");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceConfezione = rs.getString("codiceConfezione");
				String descrizione = rs.getString("descrizione");
				boolean codiceStato = rs.getBoolean("codiceStato");
				float larghezza = rs.getFloat("larghezza");
				float lunghezza = rs.getFloat("lunghezza");
				float altezza = rs.getFloat("altezza");
				float volume = rs.getFloat("volume");
				float pesoLordo = rs.getFloat("pesoLordo");
				float pesoTara = rs.getFloat("pesoTara");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Confezione confezione = new Confezione(codiceConfezione, descrizione, codiceStato, larghezza, lunghezza, altezza, volume, pesoLordo, pesoTara, dataInserimento, dataUltimaModifica);
	
				listconfezione.add(confezione);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listconfezione;
	}

}
