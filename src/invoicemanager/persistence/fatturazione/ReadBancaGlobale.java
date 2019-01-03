package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.BancaGlobale;


public class ReadBancaGlobale {
	private Connection c;

	public ReadBancaGlobale() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
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
LocalDate dataInserimento = rs.getDate("dataInserimento")).toLocalDate();
LocalDate dataUltimaModifica = rs.getDate("dataUltimaModifica")).toLocalDate();
String iban = rs.getString("iban");
String swift = rs.getString("swift");
String codiceConto = rs.getString("codiceConto");
String indirizzo = rs.getString("indirizzo");
String cap = rs.getString("cap");
()
BancaGlobale bancaGlobale = new BancaGlobale(codiceBanca, descrizione, codiceABI, codiceCAB, localita, provincia, numeroContoCorrente, codiceCIN, codiceCINEur, paese, dataInserimento, dataUltimaModifica, iban, swift, codiceConto, indirizzo, cap);

		listbancaGlobale.add(bancaGlobale);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listbancaGlobale;
	}

}