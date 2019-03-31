package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.AltroDatoGestionale;
import invoicemanager.model.fatturazione.Contratto;
import invoicemanager.model.fatturazione.Convenzione;
import invoicemanager.model.fatturazione.FatturaCollegata;
import invoicemanager.model.fatturazione.FatturaDettaglio;
import invoicemanager.model.fatturazione.Ordine;
import invoicemanager.model.fatturazione.Ricezione;


public class ReadFatturaDettaglio {
	private Connection c;

	public ReadFatturaDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<FatturaDettaglio> read(List<Ordine> listaOrdine, List<Contratto> listaContratto, List<Convenzione> listaConvenzione, List<Ricezione> listaRicezione, List<FatturaCollegata> listaFatturaCollegata, List<AltroDatoGestionale> listaAltroDatoGestionale) {
		List<FatturaDettaglio> listfatturaDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroFattura = rs.getInt("numeroFattura");
				LocalDate dataFattura = rs.getDate("dataFattura").toLocalDate();
				int numeroRigaFattura = rs.getInt("numeroRigaFattura");
				int sezionale = rs.getInt("sezionale");
				String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
				String codiceArticolo = rs.getString("codiceArticolo");
				float costo = rs.getFloat("costo");
				int numeroOrdine = rs.getInt("numeroOrdine");
				int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
				LocalDate dataOrdine = rs.getDate("dataOrdine").toLocalDate();
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
				int codiceOrdine = rs.getInt("ordini");
				List<Ordine> ordini = listaOrdine.stream().filter(x->x.getNumeroOrdine() == codiceOrdine).collect(Collectors.toList());
				int codiceContratto = rs.getInt("contratti");
				List<Contratto> contratti = listaContratto.stream().filter(x->x.getNumeroContratto() == codiceContratto).collect(Collectors.toList());
				int codiceConvenzione = rs.getInt("convenzioni");
				List<Convenzione> convenzioni = listaConvenzione.stream().filter(x->x.getNumeroConvenzione() == codiceConvenzione).collect(Collectors.toList());
				int codiceRicezione = rs.getInt("ricezioni");
				List<Ricezione> ricezioni = listaRicezione.stream().filter(x->x.getNumeroRicezione() == codiceRicezione).collect(Collectors.toList());
				int codiceFatturaCollegata = rs.getInt("fattureCollegate");
				List<FatturaCollegata> fattureCollegate = listaFatturaCollegata.stream().filter(x->x.getNumeroFtCollegate() == codiceFatturaCollegata).collect(Collectors.toList());
				int codiceAltroDatoGestionale = rs.getInt("altriDatiGestionali");
				List<AltroDatoGestionale> altriDatiGestionali = listaAltroDatoGestionale.stream().filter(x->x.getCodiceAltroDatoGestionale() == codiceAltroDatoGestionale).collect(Collectors.toList());
				
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				FatturaDettaglio fatturaDettaglio = new FatturaDettaglio(numeroFattura, dataFattura, numeroRigaFattura, sezionale, codiceTipoRigaDocumento, codiceArticolo, costo, numeroOrdine, numeroRigaOrdine, dataOrdine, quantitaDaConsegnare, indicatoreEvasione, descrizione, quantita, prezzo, codiceIva, codiceContropartitaContabile, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, codiceUnitaMisura, serialNumber, indicatoreNoConferma, codiceMagazzino, numeroDdt, dataDdt, numeroRigaDdt, codicePercipiente, codiceCassaPrevidenziale, codiceCdc, contoRicavoUsato, ricavoUsato, ordini, contratti, convenzioni, ricezioni, fattureCollegate, altriDatiGestionali, dataInserimento, dataUltimaModifica);

				listfatturaDettaglio.add(fatturaDettaglio);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaDettaglio;
	}

}
