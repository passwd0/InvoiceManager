package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.CausaleMagazzino;
import invoicemanager.model.Stato;

public class CausaleMagazzinoDao {
	private Connection c;

	public CausaleMagazzinoDao() {
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
		ps.setTimestamp(32, a.getDataInserimento());
		ps.setTimestamp(33, a.getDataUltimaModifica());

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
	
	
	public List<CausaleMagazzino> read() {
		List<CausaleMagazzino> listcausaleMagazzino = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CausaleMagazzino");
	         while ( rs.next() ) {

				String codiceCausaleMagazzino = rs.getString("codiceCausaleMagazzino");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				boolean segnoEsistenza = rs.getBoolean("segnoEsistenza");
				boolean segnoImpegniCliente = rs.getBoolean("segnoImpegniCliente");
				boolean segnoOrdiniFornitore = rs.getBoolean("segnoOrdiniFornitore");
				boolean segnoFatturato = rs.getBoolean("segnoFatturato");
				boolean segnoCaricoAValore = rs.getBoolean("segnoCaricoAValore");
				boolean segnoUnitaVendute = rs.getBoolean("segnoUnitaVendute");
				boolean segnoCaricoAQuantita = rs.getBoolean("segnoCaricoAQuantita");
				boolean indicatoreMovimentoAQuantita = rs.getBoolean("indicatoreMovimentoAQuantita");
				boolean indicatoreMovimentoAValore = rs.getBoolean("indicatoreMovimentoAValore");
				boolean indicatoreMovimentoContoLavorazione = rs.getBoolean("indicatoreMovimentoContoLavorazione");
				boolean indicatoreMovimentoCommessa = rs.getBoolean("indicatoreMovimentoCommessa");
				boolean indicatoreAggiornamentoDataUltimoCarico = rs.getBoolean("indicatoreAggiornamentoDataUltimoCarico");
				boolean indicatoreAggiornamentoDataUltimoScarico = rs.getBoolean("indicatoreAggiornamentoDataUltimoScarico");
				boolean indicatoreAggiornamentoCostoUltimo = rs.getBoolean("indicatoreAggiornamentoCostoUltimo");
				String valoreDaProporre = rs.getString("valoreDaProporre");
				String valorePerValorizzazioneMovimenti = rs.getString("valorePerValorizzazioneMovimenti");
				boolean indicatoreConcatenamento = rs.getBoolean("indicatoreConcatenamento");
				String codiceCausaleMagazzinoConcatenata = rs.getString("codiceCausaleMagazzinoConcatenata");
				String nomeFileMemo = rs.getString("nomeFileMemo");
				boolean indicatoreModifica = rs.getBoolean("indicatoreModifica");
				boolean indicatoreBollaEntrata = rs.getBoolean("indicatoreBollaEntrata");
				boolean indicatoreDocumentoDiTrasporto = rs.getBoolean("indicatoreDocumentoDiTrasporto");
				boolean indicatoreFatturaAccompagnatoria = rs.getBoolean("indicatoreFatturaAccompagnatoria");
				boolean indicatoreOrdineCliente = rs.getBoolean("indicatoreOrdineCliente");
				boolean indicatoreOrdineFornitore = rs.getBoolean("indicatoreOrdineFornitore");
				boolean indicatoreDistinta = rs.getBoolean("indicatoreDistinta");
				String note = rs.getString("note");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				boolean indicatoreLotti = rs.getBoolean("indicatoreLotti");
				
				CausaleMagazzino causaleMagazzino = new CausaleMagazzino(codiceCausaleMagazzino, descrizione, 
						stato, segnoEsistenza, segnoImpegniCliente, segnoOrdiniFornitore, segnoFatturato, 
						segnoCaricoAValore, segnoUnitaVendute, segnoCaricoAQuantita, indicatoreMovimentoAQuantita, 
						indicatoreMovimentoAValore, indicatoreMovimentoContoLavorazione, indicatoreMovimentoCommessa, 
						indicatoreAggiornamentoDataUltimoCarico, indicatoreAggiornamentoDataUltimoScarico, 
						indicatoreAggiornamentoCostoUltimo, valoreDaProporre, valorePerValorizzazioneMovimenti, 
						indicatoreConcatenamento, codiceCausaleMagazzinoConcatenata, nomeFileMemo, indicatoreModifica, 
						indicatoreBollaEntrata, indicatoreDocumentoDiTrasporto, indicatoreFatturaAccompagnatoria, 
						indicatoreOrdineCliente, indicatoreOrdineFornitore, indicatoreDistinta, note, dataInserimento, 
						dataUltimaModifica, indicatoreLotti);

				listcausaleMagazzino.add(causaleMagazzino);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcausaleMagazzino;
	}

}
