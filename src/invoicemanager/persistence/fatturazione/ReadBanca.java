package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Banca;
import invoicemanager.model.fatturazione.Stato;


public class ReadBanca {
	private Connection c;

	public ReadBanca() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Banca> read(List<Stato> list) {
		List<Banca> listbanca = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Banca");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceBanca = rs.getString("codiceBanca");
				String descrizione = rs.getString("descrizione");
				String codice = rs.getString("stato");
				Stato stato = list.stream().filter(x->x.getCodiceStato().equals(codice)).findFirst().get();
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
				String loginInserimento = rs.getString("loginInserimento");
				String loginModifica = rs.getString("loginModifica");
				String iban = rs.getString("iban");
				String swift = rs.getString("swift");
				String codiceConto = rs.getString("codiceConto");
				String indirizzo = rs.getString("indirizzo");
				Banca banca = new Banca(codiceBanca, descrizione, stato, codiceABI, codiceCAB, localita, provincia, numeroContoCorrente, codiceCIN, codiceCINEur, paese, dataInserimento, dataUltimaModifica, loginInserimento, loginModifica, iban, swift, codiceConto, indirizzo);

				listbanca.add(banca);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listbanca;
	}

}
