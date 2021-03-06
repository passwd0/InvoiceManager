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

import invoicemanager.model.FatturaProformaTestata;
import invoicemanager.utils.Utils;

public class FatturaProformaTestataDao {
	private Connection c;

	public FatturaProformaTestataDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(FatturaProformaTestata a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaProformaTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroFattura());
		ps.setDate(2, a.getDataFattura());
		ps.setBoolean(3, a.isIndicatoreStatoAvanzamento());
		ps.setInt(4, a.getSezionale());
		ps.setString(5, a.getCodiceClienteFatturazione());
		ps.setString(6, a.getCodiceEsenzioneIva());
		ps.setString(7, a.getCodiceAgente());
		ps.setString(8, a.getCodiceCausale());
		ps.setString(9, a.getCodiceCausalePrelievi());
		ps.setFloat(10, a.getPercentualeSconto());
		ps.setFloat(11, a.getPercentualeScontoPagamento());
		ps.setFloat(12, a.getPercentualeProvvigione());
		ps.setString(13, a.getDescrizione());
		ps.setInt(14, a.getNumeroCopieFattura());
		ps.setBoolean(15, a.isIndicatoreAddebitoBolli());
		ps.setBoolean(16, a.isIndicatoreAddebitoSpeseIncasso());
		ps.setBoolean(17, a.isIndicatoreScaricoMagazzino());
		ps.setInt(18, a.getCodiceListino());
		ps.setString(19, a.getCodiceResa());
		ps.setString(20, a.getCodiceVettore());
		ps.setBoolean(21, a.isIndicatoreFatturaAccompagnatoria());
		ps.setString(22, a.getCodicePagamento());
		ps.setString(23, a.getCodiceBanca());
		ps.setInt(24, a.getNumeroDDT());
		ps.setDate(25, a.getDataDDT());
		ps.setString(26, a.getCodiceImballo());
		ps.setFloat(27, a.getPesoColli());
		ps.setFloat(28, a.getNumeroColli());
		ps.setFloat(29, a.getAcconto());
		ps.setString(30, a.getCodiceDivisa());
		ps.setFloat(31, a.getCambio());
		ps.setString(32, a.getCodiceClienteSpedizione());
		ps.setString(33, a.getNomeSpedizione());
		ps.setString(34, a.getIndirizzoSpedizione());
		ps.setString(35, a.getCapSpedizione());
		ps.setString(36, a.getCittaSpedizione());
		ps.setString(37, a.getProvinciaSpedizione());
		ps.setString(38, a.getCodiceNazioneSpedizione());
		ps.setDate(39, a.getDataInserimento());
		ps.setDate(40, a.getDataUltimaModifica());
		ps.setString(41, a.getNote());
		ps.setString(42, a.getCodiceLingua());
		ps.setBoolean(43, a.isIndicatoreFatturazioneDifferita());
		ps.setBoolean(44, a.isIndicatoreEdi());
		ps.setString(45, a.getCodiceFilialeEdi());
		ps.setBoolean(46, a.isIndicatoreEmail());
		ps.setBoolean(47, a.isIndicatorePA());
		ps.setBoolean(48, a.isIndicatoreXML());
		ps.setBoolean(49, a.isIndicatorePlafond());

			res = ps.executeUpdate();
				ps.close();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}

	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.FatturaProformaTestata (\r\n" +
    			"	\"NumeroFattura\" INTEGER NOT NULL,\r\n" +
    			"	\"DataFattura\" Date NOT NULL,\r\n" +
    			"	\"Sezionale\" INTEGER NOT NULL,\r\n" +
    			"	\"IndicatoreStatoAvanzamento\" Boolean NULL,\r\n" +
    			"	\"CodiceClienteFatturazione\" varchar(25) NOT NULL,\r\n" +
    			"	\"CodiceEsenzioneIva\" varchar(25) NULL,\r\n" +
    			"	\"CodiceAgente\" varchar(25) NULL,\r\n" +
    			"	\"CodiceCausale\" varchar(25) NULL,\r\n" +
    			"	\"CodiceCausalePrelievi\" varchar(25) NULL,\r\n" +
    			"	\"PercentualeSconto\" Float NULL,\r\n" +
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" +
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" +
    			"	\"Descrizione\" varchar(25) NULL,\r\n" +
    			"	\"NumeroCopieFattura\" INTEGER NULL,\r\n" +
    			"	\"IndicatoreAddebitoBolli\" Boolean NULL,\r\n" +
    			"	\"IndicatoreAddebitoSpeseIncasso\" Boolean NULL,\r\n" +
    			"	\"IndicatoreScaricoMagazzino\" Boolean NULL,\r\n" +
    			"	\"CodiceListino\" INTEGER NULL,\r\n" +
    			"	\"CodiceResa\" varchar(25) NULL,\r\n" +
    			"	\"CodiceVettore\" varchar(25) NULL,\r\n" +
    			"	\"IndicatoreFatturaAccompagnatoria\" Boolean NULL,\r\n" +
    			"	\"CodicePagamento\" varchar(25) NULL,\r\n" +
    			"	\"CodiceBanca\" varchar(25) NULL,\r\n" +
    			"	\"NumeroDDT\" INTEGER NULL,\r\n" +
    			"	\"DataDDT\" Date NULL,\r\n" +
    			"	\"CodiceImballo\" varchar(25) NULL,\r\n" +
    			"	\"PesoColli\" Float NULL,\r\n" +
    			"	\"NumeroColli\" Float NULL,\r\n" +
    			"	\"Acconto\" Float NULL,\r\n" +
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" +
    			"	\"Cambio\" Float NULL,\r\n" +
    			"	\"CodiceClienteSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"NomeSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"IndirizzoSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"CapSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"CittaSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"ProvinciaSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"CodiceNazioneSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"DataInserimento\" Date NULL,\r\n" +
    			"	\"DataUltimaModifica\" Date NULL,\r\n" +
    			"	\"Note\" varchar(25) NULL,\r\n" +
    			"	\"CodiceLingua\" varchar(25) NULL,\r\n" +
    			"	\"IndicatoreFatturazioneDifferita\" Boolean NULL,\r\n" +
    			"	\"IndicatoreEdi\" Boolean NULL,\r\n" +
    			"	\"CodiceFilialeEdi\" varchar(25) NULL,\r\n" +
    			"	\"IndicatoreEmail\" Boolean NULL,\r\n" +
    			"	\"IndicatorePA\" Boolean NULL,\r\n" +
    			"	\"IndicatoreXML\" Boolean NULL,\r\n" +
    			"	\"IndicatorePlafond\" Boolean NULL, \r\n" +
    			"   Primary Key (\"NumeroFattura\", \"DataFattura\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}


	public List<FatturaProformaTestata> read() {
		List<FatturaProformaTestata> listfatturaProformaTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaProformaTestata");
	         while ( rs.next() ) {

				int numeroFattura = rs.getInt("numeroFattura");
				Date dataFattura = rs.getDate("dataFattura");
				boolean indicatoreStatoAvanzamento = rs.getBoolean("indicatoreStatoAvanzamento");
				int sezionale = rs.getInt("sezionale");
				String codiceClienteFatturazione = rs.getString("codiceClienteFatturazione");
				String codiceEsenzioneIva = rs.getString("codiceEsenzioneIva");
				String codiceAgente = rs.getString("codiceAgente");
				String codiceCausale = rs.getString("codiceCausale");
				String codiceCausalePrelievi = rs.getString("codiceCausalePrelievi");
				float percentualeSconto = rs.getFloat("percentualeSconto");
				float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				String descrizione = rs.getString("descrizione");
				int numeroCopieFattura = rs.getInt("numeroCopieFattura");
				boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
				boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
				boolean indicatoreScaricoMagazzino = rs.getBoolean("indicatoreScaricoMagazzino");
				int codiceListino = rs.getInt("codiceListino");
				String codiceResa = rs.getString("codiceResa");
				String codiceVettore = rs.getString("codiceVettore");
				boolean indicatoreFatturaAccompagnatoria = rs.getBoolean("indicatoreFatturaAccompagnatoria");
				String codicePagamento = rs.getString("codicePagamento");
				String codiceBanca = rs.getString("codiceBanca");
				int numeroDDT = rs.getInt("numeroDDT");
				Date dataDDT = rs.getDate("dataDDT");
				String codiceImballo = rs.getString("codiceImballo");
				float pesoColli = rs.getFloat("pesoColli");
				float numeroColli = rs.getFloat("numeroColli");
				float acconto = rs.getFloat("acconto");
				String codiceDivisa = rs.getString("codiceDivisa");
				float cambio = rs.getFloat("cambio");
				String codiceClienteSpedizione = rs.getString("codiceClienteSpedizione");
				String nomeSpedizione = rs.getString("nomeSpedizione");
				String indirizzoSpedizione = rs.getString("indirizzoSpedizione");
				String capSpedizione = rs.getString("capSpedizione");
				String cittaSpedizione = rs.getString("cittaSpedizione");
				String provinciaSpedizione = rs.getString("provinciaSpedizione");
				String codiceNazioneSpedizione = rs.getString("codiceNazioneSpedizione");
				Date dataInserimento = rs.getDate("dataInserimento");
				Date dataUltimaModifica = rs.getDate("dataUltimaModifica");
				String note = rs.getString("note");
				String codiceLingua = rs.getString("codiceLingua");
				boolean indicatoreFatturazioneDifferita = rs.getBoolean("indicatoreFatturazioneDifferita");
				boolean indicatoreEdi = rs.getBoolean("indicatoreEdi");
				String codiceFilialeEdi = rs.getString("codiceFilialeEdi");
				boolean indicatoreEmail = rs.getBoolean("indicatoreEmail");
				boolean indicatorePA = rs.getBoolean("indicatorePA");
				boolean indicatoreXML = rs.getBoolean("indicatoreXML");
				boolean indicatorePlafond = rs.getBoolean("indicatorePlafond");
				
				FatturaProformaTestata fatturaProformaTestata = new FatturaProformaTestata(numeroFattura, dataFattura, indicatoreStatoAvanzamento, sezionale, codiceClienteFatturazione, codiceEsenzioneIva, codiceAgente, codiceCausale, codiceCausalePrelievi, percentualeSconto, percentualeScontoPagamento, percentualeProvvigione, descrizione, numeroCopieFattura, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, indicatoreScaricoMagazzino, codiceListino, codiceResa, codiceVettore, indicatoreFatturaAccompagnatoria, codicePagamento, codiceBanca, numeroDDT, dataDDT, codiceImballo, pesoColli, numeroColli, acconto, codiceDivisa, cambio, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, dataInserimento, dataUltimaModifica, note, codiceLingua, indicatoreFatturazioneDifferita, indicatoreEdi, codiceFilialeEdi, indicatoreEmail, indicatorePA, indicatoreXML, indicatorePlafond);

				listfatturaProformaTestata.add(fatturaProformaTestata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaProformaTestata;
	}

}
