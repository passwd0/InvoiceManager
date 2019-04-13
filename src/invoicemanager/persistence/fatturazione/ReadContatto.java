package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Contatto;
import invoicemanager.model.fatturazione.TipoDettaglio;


public class ReadContatto {
	private Connection c;

	public ReadContatto() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Contatto> read() {
		List<Contatto> listtelefono = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Contatto");
			Timestamp ts;
	         while ( rs.next() ) {
	        	int id = rs.getInt("id");
				String codiceConto = rs.getString("codiceConto");
				TipoDettaglio tipoDettaglio = TipoDettaglio.valueOf(rs.getString("tipoDettaglio"));
				String dettaglio = rs.getString("dettaglio");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();
				
				Contatto telefono = new Contatto(id, codiceConto, tipoDettaglio, dettaglio, dataInserimento, dataUltimaModifica);
				
				listtelefono.add(telefono);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtelefono;
	}

}
