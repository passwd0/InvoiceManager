package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

public class FatturaProformaDettaglioDao {
	private Connection c;

	public FatturaProformaDettaglioDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(FatturaProformaDettaglio a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaProformaDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroFattura());
		ps.setInt(2, a.getNumeroRigaFattura());
		ps.setDate(3, Utils.convertToDatabaseColumn(a.getDataFattura()));
		ps.setInt(4,  a.getSezionale());
		ps.setString(5, a.getCodiceTipoRigaDocumento());
		ps.setString(6, a.getCodiceArticolo());
		ps.setFloat(7, a.getCosto());
		ps.setFloat(8, a.getQuantitaDaConsegnare());
		ps.setBoolean(9, a.isIndicatoreEvasione());
		ps.setString(10, a.getDescrizione());
		ps.setFloat(11, a.getQuantita());
		ps.setFloat(12, a.getPrezzo());
		ps.setString(13, a.getCodiceIva());
		ps.setString(14, a.getCodiceContropartitaContabile());
		ps.setFloat(15, a.getPercentualeProvvigione());
		ps.setFloat(16, a.getPercentualeScontoCliente());
		ps.setFloat(17, a.getPercentualeScontoArticolo());
		ps.setFloat(18, a.getPercentualeScontoPagamento());
		ps.setString(19, a.getDescrizioneAggiuntiva());
		ps.setString(20, a.getCodiceUnitaMisura());
		ps.setString(21, a.getSerialNumber());
		ps.setBoolean(22, a.isIndicatoreNoConferma());
		ps.setString(23, a.getCodiceMagazzino());
		ps.setInt(24, a.getCodiceOrdine());
		ps.setInt(25, a.getCodiceContratto());
		ps.setInt(26, a.getCodiceConvezione());
		ps.setInt(27, a.getCodiceRicezione());
		ps.setInt(28, a.getCodiceFatturaCollegata());
		ps.setInt(29, a.getCodiceAltriDatiGestionali());

			res = ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.FatturaProformaDettaglio (\r\n" + 
    			"	\"NumeroFattura\" INTEGER NOT NULL ,\r\n" + 
    			"	\"NumeroRigaFattura\" INTEGER NOT NULL ,\r\n" + 
    			"	\"DataFattura\" Date NOT NULL ,\r\n" + 
    			"	\"Sezionale\" INTEGER NOT NULL ,\r\n" + 
    			"	\"CodiceTipoRigaDocumento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NULL,\r\n" + 
    			"	\"Costo\" Float NULL,\r\n" + 
    			"	\"QuantitaDaConsegnare\" Float NULL,\r\n" + 
    			"	\"IndicatoreEvasione\" Boolean NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Quantita\" Float NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL,\r\n" + 
    			"	\"CodiceIva\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceContropartitaContabile\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoCliente\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoArticolo\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" + 
    			"	\"DescrizioneAggiuntiva\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceUnitaMisura\" varchar(25) NULL,\r\n" + 
    			"	\"SerialNumber\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreNoConferma\" Boolean NULL,\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceOrdine\" INTEGER NULL,\r\n" + 
    			"	\"CodiceContratto\" INTEGER NULL,\r\n" + 
    			"	\"CodiceConvezione\" INTEGER NULL,\r\n" + 
    			"	\"CodiceRicezione\" INTEGER NULL,\r\n" + 
    			"	\"CodiceFatturaCollegata\" INTEGER NULL,\r\n" + 
    			"	\"CodiceAltriDatiGestionali\" INTEGER NULL, \r\n" + 
    			"   Primary Key (\"NumeroFattura\", \"NumeroRigaFattura\", \"DataFattura\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

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
