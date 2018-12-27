package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Iva;


public class ReadIva {
	private Connection c;

	public ReadIva() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Iva> read() {
		List<Iva> listiva = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Iva");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceIv = rs.getString("codiceIv");
String descrizion = rs.getString("descrizion");
String codice = rs.getString("codiceStat");
Stato codiceStat = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
int rigaIVAAcquist = rs.getInt("rigaIVAAcquist");
float addizionaleIV = rs.getFloat("addizionaleIV");
float aliquotaIV = rs.getFloat("aliquotaIV");
float imponibileAcquist = rs.getFloat("imponibileAcquist");
float imponibileAcquistiNonDetraibil = rs.getFloat("imponibileAcquistiNonDetraibil");
float impostaAcquist = rs.getFloat("impostaAcquist");
float imponibileVendit = rs.getFloat("imponibileVendit");
float imponibileVenditeNonDetraibil = rs.getFloat("imponibileVenditeNonDetraibil");
float impostaVendit = rs.getFloat("impostaVendit");
int rigaIVAVendit = rs.getInt("rigaIVAVendit");
float coefficienteIV = rs.getFloat("coefficienteIV");
String percentualeIndetraibilit = rs.getString("percentualeIndetraibilit");
float valoreArrotondament = rs.getFloat("valoreArrotondament");
boolean indicatoreTroncaAcquist = rs.getBoolean("indicatoreTroncaAcquist");
boolean indicatoreSommaAcquist = rs.getBoolean("indicatoreSommaAcquist");
boolean indicatoreArrotondaAcquist = rs.getBoolean("indicatoreArrotondaAcquist");
boolean indicatoreSottraeAcquist = rs.getBoolean("indicatoreSottraeAcquist");
boolean indicatoreTroncaVendit = rs.getBoolean("indicatoreTroncaVendit");
boolean indicatoreSommaVendit = rs.getBoolean("indicatoreSommaVendit");
boolean indicatoreArrotondaVendit = rs.getBoolean("indicatoreArrotondaVendit");
boolean indicatoreSottraeVendit = rs.getBoolean("indicatoreSottraeVendit");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
String loginInseriment = rs.getString("loginInseriment");
String loginModific = rs.getString("loginModific");
boolean elencoClientiFornitor = rs.getBoolean("elencoClientiFornitor");
String colonnaClientiFornitor = rs.getString("colonnaClientiFornitor");
String colonnaNoteClientiFornitor = rs.getString("colonnaNoteClientiFornitor");
Iva iva = new Iva(codiceIv, descrizion, codiceStat, rigaIVAAcquist, addizionaleIV, aliquotaIV, imponibileAcquist, imponibileAcquistiNonDetraibil, impostaAcquist, imponibileVendit, imponibileVenditeNonDetraibil, impostaVendit, rigaIVAVendit, coefficienteIV, percentualeIndetraibilit, valoreArrotondament, indicatoreTroncaAcquist, indicatoreSommaAcquist, indicatoreArrotondaAcquist, indicatoreSottraeAcquist, indicatoreTroncaVendit, indicatoreSommaVendit, indicatoreArrotondaVendit, indicatoreSottraeVendit, dataInseriment, dataUltimaModific, loginInseriment, loginModific, elencoClientiFornitor, colonnaClientiFornitor, colonnaNoteClientiFornitor);

		listiva.add(iva);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listiva;
	}

}
