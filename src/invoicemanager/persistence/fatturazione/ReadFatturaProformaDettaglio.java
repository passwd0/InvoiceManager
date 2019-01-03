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
		c = DBConnect.getConnection();
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
int numeroRigaFattura = rs.getInt("numeroRigaFattura");
LocalDate dataFattura = rs.getDate("dataFattura")).toLocalDate();
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
List<Ordine> ordini = listaList<Ordine>.stream().filter(x->x.getCodiceList<Ordine>().equals(codice)).findFirst().get();
String codice = rs.getString("contratti");
List<Contratto> contratti = listaList<Contratto>.stream().filter(x->x.getCodiceList<Contratto>().equals(codice)).findFirst().get();
String codice = rs.getString("convenzioni");
List<Convenzione> convenzioni = listaList<Convenzione>.stream().filter(x->x.getCodiceList<Convenzione>().equals(codice)).findFirst().get();
String codice = rs.getString("ricezioni");
List<Ricezione> ricezioni = listaList<Ricezione>.stream().filter(x->x.getCodiceList<Ricezione>().equals(codice)).findFirst().get();
String codice = rs.getString("fattureCollegate");
List<FatturaCollegata> fattureCollegate = listaList<FatturaCollegata>.stream().filter(x->x.getCodiceList<FatturaCollegata>().equals(codice)).findFirst().get();
String codice = rs.getString("altriDatiGestionali");
List<AltroDatoGestionale> altriDatiGestionali = listaList<AltroDatoGestionale>.stream().filter(x->x.getCodiceList<AltroDatoGestionale>().equals(codice)).findFirst().get();
(List<List<Ordine>> listaList<Ordine>, List<List<Contratto>> listaList<Contratto>, List<List<Convenzione>> listaList<Convenzione>, List<List<Ricezione>> listaList<Ricezione>, List<List<FatturaCollegata>> listaList<FatturaCollegata>, List<List<AltroDatoGestionale>> listaList<AltroDatoGestionale>,)
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
