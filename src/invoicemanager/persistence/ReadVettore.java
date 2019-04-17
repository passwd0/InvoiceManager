package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Stato;
import invoicemanager.model.Vettore;


public class ReadVettore {
	private Connection c;

	public ReadVettore() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<Vettore> read() {
		List<Vettore> listvettore = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Vettore");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceVettore = rs.getString("codiceVettore");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				String via = rs.getString("via");
				String citta = rs.getString("citta");
				String partitaIva = rs.getString("partitaIva");
				String iscrizione = rs.getString("iscrizione");
				String telefono = rs.getString("telefono");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Vettore vettore = new Vettore(codiceVettore, descrizione, stato, via, citta, partitaIva, iscrizione, telefono, dataInserimento, dataUltimaModifica);

		listvettore.add(vettore);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listvettore;
	}

}
