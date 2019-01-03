package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.BentoDettaglio;


public class ReadBentoDettaglio {
	private Connection c;

	public ReadBentoDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<BentoDettaglio> read() {
		List<BentoDettaglio> listbentoDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BentoDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceBento = rs.getString("codiceBento");
int numeroRigaBento = rs.getInt("numeroRigaBento");
String codice = rs.getString("tipoBento");
TipoBento tipoBento = list.stream().filter(x->x.getTipoBento().equals(codice)).findFirst().get();
String codiceRigaBento = rs.getString("codiceRigaBento");
String codiceArticolo = rs.getString("codiceArticolo");
String descrizione = rs.getString("descrizione");
float quantita = rs.getFloat("quantita");
String codice = rs.getString("unitaMisura");
UnitaMisura unitaMisura = list.stream().filter(x->x.getUnitaMisura().equals(codice)).findFirst().get();
float prezzo = rs.getFloat("prezzo");
String codice = rs.getString("iva");
Iva iva = list.stream().filter(x->x.getIva().equals(codice)).findFirst().get();
String codice = rs.getString("controparte");
Controparte controparte = list.stream().filter(x->x.getControparte().equals(codice)).findFirst().get();
float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
float percentualeScontoCliente = rs.getFloat("percentualeScontoCliente");
float percentualeScontoArticolo = rs.getFloat("percentualeScontoArticolo");
float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
String codice = rs.getString("magazzino");
Magazzino magazzino = list.stream().filter(x->x.getMagazzino().equals(codice)).findFirst().get();
String codice = rs.getString("causale");
CausaleMagazzino causale = list.stream().filter(x->x.getCausaleMagazzino().equals(codice)).findFirst().get();
String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
BentoDettaglio bentoDettaglio = new BentoDettaglio(codiceBento, numeroRigaBento, tipoBento, codiceRigaBento, codiceArticolo, descrizione, quantita, unitaMisura, prezzo, iva, controparte, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, magazzino, causale, descrizioneAggiuntiva, dataInserimento, dataUltimaModifica);

		listbentoDettaglio.add(bentoDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listbentoDettaglio;
	}

}
