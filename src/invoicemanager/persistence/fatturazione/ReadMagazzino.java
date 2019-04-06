package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Magazzino;
import invoicemanager.model.fatturazione.Stato;


public class ReadMagazzino {
	private Connection c;

	public ReadMagazzino() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Magazzino> read() {
		List<Magazzino> listmagazzino = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Magazzino");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceMagazzino = rs.getString("codiceMagazzino");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				String codiceTipoMagazzino = rs.getString("codiceTipoMagazzino");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Magazzino magazzino = new Magazzino(codiceMagazzino, descrizione, stato, codiceTipoMagazzino, dataInserimento, dataUltimaModifica);

				listmagazzino.add(magazzino);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listmagazzino;
	}

}
