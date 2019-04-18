package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import invoicemanager.model.AltroDatoGestionale;
import invoicemanager.model.Contratto;
import invoicemanager.model.Convenzione;
import invoicemanager.model.FatturaCollegata;
import invoicemanager.model.FatturaDettaglio;
import invoicemanager.model.Ordine;
import invoicemanager.model.Ricezione;
import invoicemanager.utils.Utils;

public class FatturaDettaglioDao {
	private Connection c;

	public FatturaDettaglioDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(FatturaDettaglio a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, a.getNumeroFattura());
			ps.setDate(2, a.getDataFattura());
			ps.setInt(3, a.getNumeroRigaFattura());
			ps.setInt(4, a.getSezionale());
			ps.setString(4, a.getCodiceTipoRigaDocumento());
			ps.setString(5, a.getCodiceArticolo());
			ps.setFloat(6, a.getCosto());
			ps.setInt(7, a.getNumeroOrdine());
			ps.setInt(8, a.getNumeroRigaOrdine());
			ps.setDate(9, a.getDataOrdine());
			ps.setFloat(10, a.getQuantitaDaConsegnare());
			ps.setBoolean(11, a.isIndicatoreEvasione());
			ps.setString(12, a.getDescrizione());
			ps.setFloat(13, a.getQuantita());
			ps.setFloat(14, a.getPrezzo());
			ps.setString(15, a.getCodiceIva());
			ps.setString(16, a.getCodiceContropartitaContabile());
			ps.setFloat(17, a.getPercentualeProvvigione());
			ps.setFloat(18, a.getPercentualeScontoCliente());
			ps.setFloat(19, a.getPercentualeScontoArticolo());
			ps.setFloat(20, a.getPercentualeScontoPagamento());
			ps.setString(21, a.getCodiceUnitaMisura());
			ps.setString(22, a.getSerialNumber());
			ps.setBoolean(23, a.isIndicatoreNoConferma());
			ps.setString(24, a.getCodiceMagazzino());
			ps.setInt(25, a.getNumeroDdt());
			ps.setTimestamp(26, a.getDataDdt());
			ps.setInt(27, a.getNumeroRigaDdt());
			ps.setString(28, a.getCodicePercipiente());
			ps.setString(29, a.getCodiceCassaPrevidenziale());
			ps.setString(30, a.getCodiceCdc());
			ps.setString(31, a.getContoRicavoUsato());
			ps.setString(32, a.getRicavoUsato());
			ps.setInt(33, a.getCodiceOrdine());
			ps.setInt(34, a.getCodiceContratto());
			ps.setInt(35, a.getCodiceConvezione());
			ps.setInt(36, a.getCodiceRicezione());
			ps.setInt(37, a.getCodiceFatturaCollegata());
			ps.setInt(38, a.getCodiceAltriDatiGestionali());
			ps.setTimestamp(39, a.getDataInserimento());
			ps.setTimestamp(40, a.getDataUltimaModifica());

			res = ps.executeUpdate();
			ps.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(FatturaDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE FatturaDettaglio SET "
//					+ "campo=value "
//					+ "WHERE codiceFatturaDettaglio="+a.getCodiceFatturaDettaglio();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(FatturaDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceFatturaDettaglio() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.FatturaDettaglio (\r\n" + 
    			"	\"NumeroFattura\" INTEGER NOT NULL ,\r\n" + 
    			"	\"DataFattura\" Date NOT NULL ,\r\n" + 
    			"	\"NumeroRigaFattura\" INTEGER NOT NULL,\r\n" + 
    			"	\"Sezionale\" INTEGER NOT NULL,\r\n" + 
    			"	\"CodiceTipoRigaDocumento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NULL,\r\n" + 
    			"	\"Costo\" Float NULL,\r\n" + 
    			"	\"NumeroOrdine\" INTEGER NULL,\r\n" + 
    			"	\"NumeroRigaOrdine\" INTEGER NULL,\r\n" + 
    			"	\"DataOrdine\" Date NULL,\r\n" + 
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
    			"	\"CodiceUnitaMisura\" varchar(25) NULL,\r\n" + 
    			"	\"SerialNumber\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreNoConferma\" Boolean NULL,\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroDdt\" INTEGER NULL,\r\n" + 
    			"	\"DataDdt\" Timestamp NULL,\r\n" + 
    			"	\"NumeroRigaDdt\" INTEGER NULL,\r\n" + 
    			"	\"CodicePercipiente\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCassaPrevidenziale\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCdc\" varchar(25) NULL,\r\n" + 
    			"	\"ContoRicavoUsato\" varchar(25) NULL,\r\n" + 
    			"	\"RicavoUsato\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceOrdine\" INTEGER NULL,\r\n" + 
    			"	\"CodiceContratto\" INTEGER NULL,\r\n" + 
    			"	\"CodiceConvezione\" INTEGER NULL,\r\n" + 
    			"	\"CodiceRicezione\" INTEGER NULL,\r\n" + 
    			"	\"CodiceFatturaCollegata\" INTEGER NULL,\r\n" + 
    			"	\"CodiceAltriDatiGestionali\" INTEGER NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"    Primary Key (\"NumeroFattura\", \"DataFattura\", \"NumeroRigaFattura\") " +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		e.getStackTrace();
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<FatturaDettaglio> read(List<Ordine> listaOrdine, List<Contratto> listaContratto, List<Convenzione> listaConvenzione, List<Ricezione> listaRicezione, List<FatturaCollegata> listaFatturaCollegata, List<AltroDatoGestionale> listaAltroDatoGestionale) {
		List<FatturaDettaglio> listfatturaDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaDettaglio");
	         while ( rs.next() ) {

				int numeroFattura = rs.getInt("numeroFattura");
				Date dataFattura = rs.getDate("dataFattura");
				int numeroRigaFattura = rs.getInt("numeroRigaFattura");
				int sezionale = rs.getInt("sezionale");
				String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
				String codiceArticolo = rs.getString("codiceArticolo");
				float costo = rs.getFloat("costo");
				int numeroOrdine = rs.getInt("numeroOrdine");
				int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
				Date dataOrdine = rs.getDate("dataOrdine");
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
				Timestamp dataDdt = rs.getTimestamp("dataDdt");
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
				
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
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
