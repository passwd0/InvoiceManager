package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.FatturaProformaDettaglio;


public class ReadFatturaProformaDettaglio {
	private Connection c;

	public ReadFatturaProformaDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<FatturaProformaDettaglio> read() {
		List<FatturaProformaDettaglio> listfatturaProformaDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaProformaDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroFattura = rs.getInt("numeroFattura");
String codice = rs.getString("numeroRigaFattura");
Short numeroRigaFattura = list.stream().filter(x->x.getShort().equals(codice)).findFirst().get();
String codice = rs.getString("dataFattura");
LocalDate dataFattura = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
String codiceArticolo = rs.getString("codiceArticolo");
float costo = rs.getFloat("costo");
float quantitaDaConsegnare = rs.getFloat("quantitaDaConsegnare");
boolean indicatoreEvasione = rs.getBoolean("indicatoreEvasione");
String descrizione = rs.getString("descrizione");
float quantita = rs.getFloat("quantita");
float prezzo = rs.getFloat("prezzo");
String codiceIva = rs.getString("codiceIva");
String codiceContropartitaContabile = rs.getString("codiceContropartitaContabile");
float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
float percentualeScontoCliente = rs.getFloat("percentualeScontoCliente");
float percentualeScontoArticolo = rs.getFloat("percentualeScontoArticolo");
float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
String serialNumber = rs.getString("serialNumber");
boolean indicatoreNoConferma = rs.getBoolean("indicatoreNoConferma");
String codiceMagazzino = rs.getString("codiceMagazzino");
String codice = rs.getString("ordini");
List<Ordine> ordini = list.stream().filter(x->x.getList<Ordine>().equals(codice)).findFirst().get();
String codice = rs.getString("contratti");
List<Contratto> contratti = list.stream().filter(x->x.getList<Contratto>().equals(codice)).findFirst().get();
String codice = rs.getString("convenzioni");
List<Convenzione> convenzioni = list.stream().filter(x->x.getList<Convenzione>().equals(codice)).findFirst().get();
String codice = rs.getString("ricezioni");
List<Ricezione> ricezioni = list.stream().filter(x->x.getList<Ricezione>().equals(codice)).findFirst().get();
String codice = rs.getString("fattureCollegate");
List<FatturaCollegata> fattureCollegate = list.stream().filter(x->x.getList<FatturaCollegata>().equals(codice)).findFirst().get();
String codice = rs.getString("altriDatiGestionali");
List<AltroDatoGestionale> altriDatiGestionali = list.stream().filter(x->x.getList<AltroDatoGestionale>().equals(codice)).findFirst().get();
FatturaProformaDettaglio fatturaProformaDettaglio = new FatturaProformaDettaglio(numeroFattura, numeroRigaFattura, dataFattura, codiceTipoRigaDocumento, codiceArticolo, costo, quantitaDaConsegnare, indicatoreEvasione, descrizione, quantita, prezzo, codiceIva, codiceContropartitaContabile, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, descrizioneAggiuntiva, codiceUnitaMisura, serialNumber, indicatoreNoConferma, codiceMagazzino, ordini, contratti, convenzioni, ricezioni, fattureCollegate, altriDatiGestionali);

		listfatturaProformaDettaglio.add(fatturaProformaDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaProformaDettaglio;
	}

}
