package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.BancaGlobale;


public class ReadBancaGlobale {
	private Connection c;

	public ReadBancaGlobale() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<BancaGlobale> read() {
		List<BancaGlobale> listbancaGlobale = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BancaGlobale");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceBanca = rs.getString("codiceBanca");
				String descrizione = rs.getString("descrizione");
				String codiceABI = rs.getString("codiceABI");
				String codiceCAB = rs.getString("codiceCAB");
				String localita = rs.getString("localita");
				String provincia = rs.getString("provincia");
				String numeroContoCorrente = rs.getString("numeroContoCorrente");
				String codiceCIN = rs.getString("codiceCIN");
				String codiceCINEur = rs.getString("codiceCINEur");
				String paese = rs.getString("paese");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				String iban = rs.getString("iban");
				String swift = rs.getString("swift");
				String codiceConto = rs.getString("codiceConto");
				String indirizzo = rs.getString("indirizzo");
				String cap = rs.getString("cap");
				BancaGlobale bancaGlobale = new BancaGlobale(codiceBanca, descrizione, codiceABI, codiceCAB, localita, provincia, numeroContoCorrente, codiceCIN, codiceCINEur, paese, iban, swift, codiceConto, indirizzo, cap, dataInserimento, dataUltimaModifica);

				listbancaGlobale.add(bancaGlobale);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listbancaGlobale;
	}

}
