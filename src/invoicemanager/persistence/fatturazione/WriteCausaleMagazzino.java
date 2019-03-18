package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.CausaleMagazzino;
import invoicemanager.utils.Utils;

public class WriteCausaleMagazzino {
	private Connection c;

	public WriteCausaleMagazzino() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(CausaleMagazzino a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO CausaleMagazzino VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceCausaleMagazzino());
		ps.setString(2, a.getDescrizione());
		ps.setBoolean(3, a.isCodiceStato());
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
		ps.setTimestamp(31, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(32, Utils.toTimestamp(a.getDataUltimaModifica()));
		ps.setString(33, a.getLoginInserimento());
		ps.setString(34, a.getLoginModifica());
		ps.setBoolean(35, a.isIndicatoreLotti());

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
