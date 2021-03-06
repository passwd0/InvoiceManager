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

import invoicemanager.model.OrdineDettaglio;
import invoicemanager.model.OrdineTestata;
import invoicemanager.model.StatoAvanzamento;
import invoicemanager.utils.Utils;

public class OrdineTestataDao {
	private Connection c;

	public OrdineTestataDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(OrdineTestata a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO OrdineTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, a.getNumeroOrdine());
			ps.setDate(2, a.getDataOrdine());
			ps.setString(3, a.getStatoAvanzamento().name());
			ps.setString(4, a.getCodiceClienteFatturazione());
			ps.setString(5, a.getDescrizione());
			ps.setString(6, a.getCodiceEsenzioneIva());
			ps.setString(7, a.getCodiceAgente());
			ps.setFloat(8, a.getPercentualeProvvigione());
			ps.setFloat(9, a.getPercentualeSconto());
			ps.setFloat(10, a.getPercentualeScontoPagamento());
			ps.setInt(11, a.getNumeroCopieFattura());
			ps.setBoolean(12, a.isIndicatoreAddebitoBolli());
			ps.setBoolean(13, a.isIndicatoreAddebitoSpeseIncasso());
			ps.setInt(14, a.getCodiceListino());
			ps.setString(15, a.getCodiceResa());
			ps.setString(16, a.getCodiceVettore());
			ps.setString(17, a.getCodiceCausale());
			ps.setString(18, a.getCodicePagamento());
			ps.setString(19, a.getCodiceBanca());
			ps.setDate(20, a.getDataConsegna());
			ps.setString(21, a.getCausaleTrasporto());
			ps.setString(22, a.getCodiceDivisa());
			ps.setBoolean(23, a.isIndicatoreConsegnaParziale());
			ps.setBoolean(24, a.isIndicatoreRaggruppamentoConsegne());
			ps.setString(25, a.getCodiceAgenteVecchio());
			ps.setString(26, a.getCodiceClienteSpedizione());
			ps.setString(27, a.getNomeSpedizione());
			ps.setString(28, a.getIndirizzoSpedizione());
			ps.setString(29, a.getCapSpedizione());
			ps.setString(30, a.getCittaSpedizione());
			ps.setString(31, a.getProvinciaSpedizione());
			ps.setString(32, a.getCodiceNazioneSpedizione());
			ps.setString(33, a.getNote());
			ps.setString(34, a.getLoginInserimento());
			ps.setString(35, a.getLoginModifica());
			ps.setString(36, a.getCodiceLingua());
			ps.setString(37, a.getRevisione());
			ps.setString(38, a.getAttenzione());
			ps.setBoolean(39, a.isIndicatoreOrdineTrading());
			ps.setTimestamp(40, a.getDataInserimento());
			ps.setTimestamp(41, a.getDataUltimaModifica());

			res = ps.executeUpdate();
			ps.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(OrdineTestata a) throws ClassNotFoundException, SQLException {
		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE OrdineTestata SET "
//					+ "campo=value "
//					+ "WHERE codiceOrdineTestata="+a.getCodiceOrdineTestata();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(OrdineTestata a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceOrdineTestata() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.OrdineTestata (\r\n" + 
    			"	\"NumeroOrdine\" INTEGER NOT NULL ,\r\n" + 
    			"	\"DataOrdine\" Date NOT NULL ,\r\n" + 
    			"	\"StatoAvanzamento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceClienteFatturazione\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceEsenzioneIva\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceAgente\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"PercentualeSconto\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" + 
    			"	\"NumeroCopieFattura\" INTEGER NULL,\r\n" + 
    			"	\"IndicatoreAddebitoBolli\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreAddebitoSpeseIncasso\" Boolean NULL,\r\n" + 
    			"	\"CodiceListino\" INTEGER NULL,\r\n" + 
    			"	\"CodiceResa\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceVettore\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCausale\" varchar(25) NULL,\r\n" + 
    			"	\"CodicePagamento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceBanca\" varchar(25) NULL,\r\n" + 
    			"	\"DataConsegna\" Date NULL,\r\n" + 
    			"	\"CausaleTrasporto\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreConsegnaParziale\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreRaggruppamentoConsegne\" Boolean NULL,\r\n" + 
    			"	\"CodiceAgenteVecchio\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceClienteSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"NomeSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"IndirizzoSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CapSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CittaSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"ProvinciaSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceNazioneSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"Note\" varchar(25) NULL,\r\n" + 
    			"	\"LoginInserimento\" varchar(25) NULL,\r\n" + 
    			"	\"LoginModifica\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceLingua\" varchar(25) NULL,\r\n" + 
    			"	\"Revisione\" varchar(25) NULL,\r\n" + 
    			"	\"Attenzione\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreOrdineTrading\" Boolean NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"    Primary Key (\"NumeroOrdine\", \"DataOrdine\") \r\n " +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<OrdineTestata> read(StatoAvanzamento[] listaStatoAvanzamento, List<OrdineDettaglio> lista) {
		List<OrdineTestata> listordineTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM OrdineTestata");
	         while ( rs.next() ) {

				int numeroOrdine = rs.getInt("numeroOrdine");
				Date dataOrdine = rs.getDate("dataOrdine");
				StatoAvanzamento statoAvanzamento = StatoAvanzamento.valueOf(rs.getString("statoAvanzamento")); 
				String codiceClienteFatturazione = rs.getString("codiceClienteFatturazione");
				String descrizione = rs.getString("descrizione");
				String codiceEsenzioneIva = rs.getString("codiceEsenzioneIva");
				String codiceAgente = rs.getString("codiceAgente");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				float percentualeSconto = rs.getFloat("percentualeSconto");
				float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
				int numeroCopieFattura = rs.getInt("numeroCopieFattura");
				boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
				boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
				int codiceListino = rs.getInt("codiceListino");
				String codiceResa = rs.getString("codiceResa");
				String codiceVettore = rs.getString("codiceVettore");
				String codiceCausale = rs.getString("codiceCausale");
				String codicePagamento = rs.getString("codicePagamento");
				String codiceBanca = rs.getString("codiceBanca");
				Date dataConsegna = rs.getDate("dataConsegna");
				String causaleTrasporto = rs.getString("causaleTrasporto");
				String codiceDivisa = rs.getString("codiceDivisa");
				boolean indicatoreConsegnaParziale = rs.getBoolean("indicatoreConsegnaParziale");
				boolean indicatoreRaggruppamentoConsegne = rs.getBoolean("indicatoreRaggruppamentoConsegne");
				String codiceAgenteVecchio = rs.getString("codiceAgenteVecchio");
				String codiceClienteSpedizione = rs.getString("codiceClienteSpedizione");
				String nomeSpedizione = rs.getString("nomeSpedizione");
				String indirizzoSpedizione = rs.getString("indirizzoSpedizione");
				String capSpedizione = rs.getString("capSpedizione");
				String cittaSpedizione = rs.getString("cittaSpedizione");
				String provinciaSpedizione = rs.getString("provinciaSpedizione");
				String codiceNazioneSpedizione = rs.getString("codiceNazioneSpedizione");
				String note = rs.getString("note");
				String loginInserimento = rs.getString("loginInserimento");
				String loginModifica = rs.getString("loginModifica");
				String codiceLingua = rs.getString("codiceLingua");
				String revisione = rs.getString("revisione");
				String attenzione = rs.getString("attenzione");
				boolean indicatoreOrdineTrading = rs.getBoolean("indicatoreOrdineTrading");
				List<OrdineDettaglio> ordineDettagli = lista.stream().filter(x->x.getNumeroOrdine()==numeroOrdine).collect(Collectors.toList());
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				OrdineTestata ordineTestata = new OrdineTestata(numeroOrdine, dataOrdine, statoAvanzamento, codiceClienteFatturazione, descrizione, codiceEsenzioneIva, codiceAgente, percentualeProvvigione, percentualeSconto, percentualeScontoPagamento, numeroCopieFattura, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, codiceListino, codiceResa, codiceVettore, codiceCausale, codicePagamento, codiceBanca, dataConsegna, causaleTrasporto, codiceDivisa, indicatoreConsegnaParziale, indicatoreRaggruppamentoConsegne, codiceAgenteVecchio, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, note, loginInserimento, loginModifica, codiceLingua, revisione, attenzione, indicatoreOrdineTrading, ordineDettagli, dataInserimento, dataUltimaModifica);

				listordineTestata.add(ordineTestata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listordineTestata;
	}

}
