package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.FatturaDettaglio;


public class ReadFatturaDettaglio {
	private Connection c;

	public ReadFatturaDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<FatturaDettaglio> read() {
		List<FatturaDettaglio> listfatturaDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroFattura = rs.getInt("numeroFattura");
String codice = rs.getString("dataFattura");
LocalDate dataFattura = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
int numeroRigaFattura = rs.getInt("numeroRigaFattura");
String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
String codiceArticolo = rs.getString("codiceArticolo");
float costo = rs.getFloat("costo");
int numeroOrdine = rs.getInt("numeroOrdine");
int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
String codice = rs.getString("dataOrdine");
LocalDate dataOrdine = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
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
String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
String serialNumber = rs.getString("serialNumber");
boolean indicatoreNoConferma = rs.getBoolean("indicatoreNoConferma");
String codiceMagazzino = rs.getString("codiceMagazzino");
int numeroDdt = rs.getInt("numeroDdt");
ts = rs.getTimestamp("dataDdt");
LocalDateTime dataDdt = null;
if (ts != null)
dataDdt = ts.toLocalDateTime();
int numeroRigaDdt = rs.getInt("numeroRigaDdt");
String codicePercipiente = rs.getString("codicePercipiente");
String codiceCassaPrevidenziale = rs.getString("codiceCassaPrevidenziale");
String codiceCdc = rs.getString("codiceCdc");
String contoRicavoUsato = rs.getString("contoRicavoUsato");
String ricavoUsato = rs.getString("ricavoUsato");
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
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
FatturaDettaglio fatturaDettaglio = new FatturaDettaglio(numeroFattura, dataFattura, numeroRigaFattura, codiceTipoRigaDocumento, codiceArticolo, costo, numeroOrdine, numeroRigaOrdine, dataOrdine, quantitaDaConsegnare, indicatoreEvasione, descrizione, quantita, prezzo, codiceIva, codiceContropartitaContabile, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, codiceUnitaMisura, serialNumber, indicatoreNoConferma, codiceMagazzino, numeroDdt, dataDdt, numeroRigaDdt, codicePercipiente, codiceCassaPrevidenziale, codiceCdc, contoRicavoUsato, ricavoUsato, ordini, contratti, convenzioni, ricezioni, fattureCollegate, altriDatiGestionali, dataInserimento, dataUltimaModifica);

		listfatturaDettaglio.add(fatturaDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaDettaglio;
	}

}
