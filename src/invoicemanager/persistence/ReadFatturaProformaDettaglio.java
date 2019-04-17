package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import invoicemanager.model.AltroDatoGestionale;
import invoicemanager.model.Contratto;
import invoicemanager.model.Convenzione;
import invoicemanager.model.FatturaCollegata;
import invoicemanager.model.FatturaProformaDettaglio;
import invoicemanager.model.Ordine;
import invoicemanager.model.Ricezione;
import invoicemanager.utils.Utils;


public class ReadFatturaProformaDettaglio {
	private Connection c;

	public ReadFatturaProformaDettaglio() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<FatturaProformaDettaglio> read(List<Ordine> listaOrdine, List<Contratto> listaContratto, List<Convenzione> listaConvenzione, 
			List<Ricezione> listaRicezione, List<FatturaCollegata> listaFatturaCollegata, List<AltroDatoGestionale> listaAltroDatoGestionale) {
		List<FatturaProformaDettaglio> listfatturaProformaDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaProformaDettaglio");
	         while ( rs.next() ) {

					int numeroFattura = rs.getInt("numeroFattura");
					int numeroRigaFattura = rs.getInt("numeroRigaFattura");
					LocalDate dataFattura = Utils.convertToEntityAttribute(rs.getDate("dataFattura"));
					int sezionale = rs.getInt("sezionale");
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
					
					FatturaProformaDettaglio fatturaProformaDettaglio = new FatturaProformaDettaglio(numeroFattura, numeroRigaFattura, dataFattura, sezionale, codiceTipoRigaDocumento, codiceArticolo, costo, quantitaDaConsegnare, indicatoreEvasione, descrizione, quantita, prezzo, codiceIva, codiceContropartitaContabile, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, descrizioneAggiuntiva, codiceUnitaMisura, serialNumber, indicatoreNoConferma, codiceMagazzino, ordini, contratti, convenzioni, ricezioni, fattureCollegate, altriDatiGestionali);

					listfatturaProformaDettaglio.add(fatturaProformaDettaglio);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaProformaDettaglio;
	}

}
