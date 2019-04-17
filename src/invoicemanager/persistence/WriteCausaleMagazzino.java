package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.CausaleMagazzino;
import invoicemanager.utils.Utils;

public class WriteCausaleMagazzino {
	private Connection c;

	public WriteCausaleMagazzino()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(CausaleMagazzino a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO CausaleMagazzino VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceCausaleMagazzino());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getStato().name());
		ps.setBoolean(4, a.isSegnoEsistenza());
		ps.setBoolean(5, a.isSegnoImpegniCliente());
		ps.setBoolean(6, a.isSegnoOrdiniFornitore());
		ps.setBoolean(7, a.isSegnoFatturato());
		ps.setBoolean(8, a.isSegnoCaricoAValore());
		ps.setBoolean(9, a.isSegnoUnitaVendute());
		ps.setBoolean(10, a.isSegnoCaricoAQuantita());
		ps.setBoolean(11, a.isIndicatoreMovimentoAQuantita());
		ps.setBoolean(12, a.isIndicatoreMovimentoAValore());
		ps.setBoolean(13, a.isIndicatoreMovimentoContoLavorazione());
		ps.setBoolean(14, a.isIndicatoreMovimentoCommessa());
		ps.setBoolean(15, a.isIndicatoreAggiornamentoDataUltimoCarico());
		ps.setBoolean(16, a.isIndicatoreAggiornamentoDataUltimoScarico());
		ps.setBoolean(17, a.isIndicatoreAggiornamentoCostoUltimo());
		ps.setString(18, a.getValoreDaProporre());
		ps.setString(19, a.getValorePerValorizzazioneMovimenti());
		ps.setBoolean(20, a.isIndicatoreConcatenamento());
		ps.setString(21, a.getCodiceCausaleMagazzinoConcatenata());
		ps.setString(22, a.getNomeFileMemo());
		ps.setBoolean(23, a.isIndicatoreModifica());
		ps.setBoolean(24, a.isIndicatoreBollaEntrata());
		ps.setBoolean(25, a.isIndicatoreDocumentoDiTrasporto());
		ps.setBoolean(26, a.isIndicatoreFatturaAccompagnatoria());
		ps.setBoolean(27, a.isIndicatoreOrdineCliente());
		ps.setBoolean(28, a.isIndicatoreOrdineFornitore());
		ps.setBoolean(29, a.isIndicatoreDistinta());
		ps.setString(30, a.getNote());
		ps.setBoolean(31, a.isIndicatoreLotti());
		ps.setTimestamp(32, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(33, Utils.toTimestamp(a.getDataUltimaModifica()));

		res = ps.executeUpdate();
		ps.close();
		c.commit();

		} catch (Exception e) {
			System.err.println(e.getMessage());
			//Utils.createAlertFailWriteDB();
		}
	    return res;
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.CausaleMagazzino (\r\n" + 
    			"	\"CodiceCausaleMagazzino\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"SegnoEsistenza\" Boolean NULL,\r\n" + 
    			"	\"SegnoImpegniCliente\" Boolean NULL,\r\n" + 
    			"	\"SegnoOrdiniFornitore\" Boolean NULL,\r\n" + 
    			"	\"SegnoFatturato\" Boolean NULL,\r\n" + 
    			"	\"SegnoCaricoAValore\" Boolean NULL,\r\n" + 
    			"	\"SegnoUnitaVendute\" Boolean NULL,\r\n" + 
    			"	\"SegnoCaricoAQuantita\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreMovimentoAQuantita\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreMovimentoAValore\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreMovimentoContoLavorazione\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreMovimentoCommessa\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreAggiornamentoDataUltimoCarico\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreAggiornamentoDataUltimoScarico\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreAggiornamentoCostoUltimo\" Boolean NULL,\r\n" + 
    			"	\"ValoreDaProporre\" varchar(25) NULL,\r\n" + 
    			"	\"ValorePerValorizzazioneMovimenti\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreConcatenamento\" Boolean NULL,\r\n" + 
    			"	\"CodiceCausaleMagazzinoConcatenata\" varchar(25) NULL,\r\n" + 
    			"	\"NomeFileMemo\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreModifica\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreBollaEntrata\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreDocumentoDiTrasporto\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreFatturaAccompagnatoria\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreOrdineCliente\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreOrdineFornitore\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreDistinta\" Boolean NULL,\r\n" + 
    			"	\"Note\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreLotti\" Boolean NULL, \r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
