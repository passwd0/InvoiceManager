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

import invoicemanager.model.PreventivoTestata;
import invoicemanager.utils.Utils;

public class PreventivoTestataDao {
	private Connection c;

	public PreventivoTestataDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(PreventivoTestata a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO PreventivoTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroPreventivo());
		ps.setDate(2, a.getDataPreventivo());
		ps.setBoolean(3, a.isIndicatoreStatoAvanzamento());
		ps.setDate(4, a.getDataConsegna());
		ps.setDate(5, a.getDataValidita());
		ps.setString(6, a.getPeriodoValidita());
		ps.setBoolean(7, a.isIndicatoreUtilizzoDataValidita());
		ps.setString(8, a.getCodiceCliente());
		ps.setString(9, a.getAttenzione());
		ps.setString(10, a.getOggetto());
		ps.setString(11, a.getRiferimentoInterno());
		ps.setString(12, a.getNumeroInterno());
		ps.setString(13, a.getCodiceIVA());
		ps.setString(14, a.getCodiceAgente());
		ps.setString(15, a.getCodiceResa());
		ps.setString(16, a.getCodiceVettore());
		ps.setString(17, a.getCodicePagamento());
		ps.setString(18, a.getCodiceBanca());
		ps.setString(19, a.getCodiceCausale());
		ps.setString(20, a.getCodiceCausalePrelievo());
		ps.setBoolean(21, a.isCodiceListino());
		ps.setString(22, a.getDescrizioneOrdine());
		ps.setString(23, a.getCodiceDivisa());
		ps.setFloat(24, a.getCambio());
		ps.setString(25, a.getNumeroFax());
		ps.setString(26, a.getVenditore());
		ps.setBoolean(27, a.isIndicatoreAddebitoBolli());
		ps.setBoolean(28, a.isIndicatoreAddebitoSpeseIncasso());
		ps.setString(29, a.getNote());
		ps.setString(30, a.getCodiceClienteSpedizione());
		ps.setString(31, a.getNomeSpedizione());
		ps.setString(32, a.getIndirizzoSpedizione());
		ps.setString(33, a.getCapSpedizione());
		ps.setString(34, a.getCittaSpedizione());
		ps.setString(35, a.getProvinciaSpedizione());
		ps.setString(36, a.getCodiceNazioneSpedizione());
		ps.setString(37, a.getLoginInserimento());
		ps.setTimestamp(38, a.getDataInserimento());
		ps.setTimestamp(39, a.getDataUltimaModifica());

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
    	String sql = "Create table public.PreventivoTestata (\r\n" + 
    			"	\"NumeroPreventivo\" INTEGER NOT NULL ,\r\n" + 
    			"	\"DataPreventivo\" Date NOT NULL ,\r\n" + 
    			"	\"IndicatoreStatoAvanzamento\" Boolean NULL,\r\n" + 
    			"	\"DataConsegna\" Date NULL,\r\n" + 
    			"	\"DataValidita\" Date NULL,\r\n" + 
    			"	\"PeriodoValidita\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreUtilizzoDataValidita\" Boolean NULL,\r\n" + 
    			"	\"CodiceCliente\" varchar(25) NULL,\r\n" + 
    			"	\"Attenzione\" varchar(25) NULL,\r\n" + 
    			"	\"Oggetto\" varchar(25) NULL,\r\n" + 
    			"	\"RiferimentoInterno\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroInterno\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceIVA\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceAgente\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceResa\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceVettore\" varchar(25) NULL,\r\n" + 
    			"	\"CodicePagamento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceBanca\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCausale\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCausalePrelievo\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceListino\" Boolean NULL,\r\n" + 
    			"	\"DescrizioneOrdine\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"Cambio\" Float NULL,\r\n" + 
    			"	\"NumeroFax\" varchar(25) NULL,\r\n" + 
    			"	\"Venditore\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreAddebitoBolli\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreAddebitoSpeseIncasso\" Boolean NULL,\r\n" + 
    			"	\"Note\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceClienteSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"NomeSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"IndirizzoSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CapSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CittaSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"ProvinciaSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceNazioneSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"LoginInserimento\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"NumeroPreventivo\", \"DataPreventivo\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<PreventivoTestata> read() {
		List<PreventivoTestata> listpreventivoTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PreventivoTestata");
	         while ( rs.next() ) {

			int numeroPreventivo = rs.getInt("numeroPreventivo");
			Date dataPreventivo = rs.getDate("dataPreventivo");
			boolean indicatoreStatoAvanzamento = rs.getBoolean("indicatoreStatoAvanzamento");
			Date dataConsegna = rs.getDate("dataConsegna");
			Date dataValidita = rs.getDate("dataValidita");
			String periodoValidita = rs.getString("periodoValidita");
			boolean indicatoreUtilizzoDataValidita = rs.getBoolean("indicatoreUtilizzoDataValidita");
			String codiceCliente = rs.getString("codiceCliente");
			String attenzione = rs.getString("attenzione");
			String oggetto = rs.getString("oggetto");
			String riferimentoInterno = rs.getString("riferimentoInterno");
			String numeroInterno = rs.getString("numeroInterno");
			String codiceIVA = rs.getString("codiceIVA");
			String codiceAgente = rs.getString("codiceAgente");
			String codiceResa = rs.getString("codiceResa");
			String codiceVettore = rs.getString("codiceVettore");
			String codicePagamento = rs.getString("codicePagamento");
			String codiceBanca = rs.getString("codiceBanca");
			String codiceCausale = rs.getString("codiceCausale");
			String codiceCausalePrelievo = rs.getString("codiceCausalePrelievo");
			boolean codiceListino = rs.getBoolean("codiceListino");
			String descrizioneOrdine = rs.getString("descrizioneOrdine");
			String codiceDivisa = rs.getString("codiceDivisa");
			float cambio = rs.getFloat("cambio");
			String numeroFax = rs.getString("numeroFax");
			String venditore = rs.getString("venditore");
			boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
			boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
			String note = rs.getString("note");
			String codiceClienteSpedizione = rs.getString("codiceClienteSpedizione");
			String nomeSpedizione = rs.getString("nomeSpedizione");
			String indirizzoSpedizione = rs.getString("indirizzoSpedizione");
			String capSpedizione = rs.getString("capSpedizione");
			String cittaSpedizione = rs.getString("cittaSpedizione");
			String provinciaSpedizione = rs.getString("provinciaSpedizione");
			String codiceNazioneSpedizione = rs.getString("codiceNazioneSpedizione");
			String loginInserimento = rs.getString("loginInserimento");
			Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
			Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
			
			PreventivoTestata preventivoTestata = new PreventivoTestata(numeroPreventivo, dataPreventivo, indicatoreStatoAvanzamento, dataConsegna, dataValidita, periodoValidita, indicatoreUtilizzoDataValidita, codiceCliente, attenzione, oggetto, riferimentoInterno, numeroInterno, codiceIVA, codiceAgente, codiceResa, codiceVettore, codicePagamento, codiceBanca, codiceCausale, codiceCausalePrelievo, codiceListino, descrizioneOrdine, codiceDivisa, cambio, numeroFax, venditore, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, note, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, loginInserimento, dataInserimento, dataUltimaModifica);

			listpreventivoTestata.add(preventivoTestata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpreventivoTestata;
	}

}
