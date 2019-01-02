package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.ArticoloMagazzino;
import invoicemanager.utils.Utils;

public class WriteArticoloMagazzino {
	private Connection c;

	public WriteArticoloMagazzino() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(ArticoloMagazzino a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO ArticoloMagazzino VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
			ps.setString(1, a.getCodiceArticolo());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getCodiceUnitaMisura());
			ps.setString(4, a.getCodiceGruppoMerceologico());
			ps.setString(5, a.getCodiceSottogruppoMerceologico());
			ps.setString(6, a.getCodiceControparteContabile());
			ps.setString(7, a.getCodiceIVA());
			ps.setBoolean(8, a.isIndicatoreGestionePezzi());
			ps.setFloat(9, a.getSconto());
			ps.setString(10, a.getCodiceTaglieColori());
			ps.setString(11, a.getCodiceColore());
			ps.setString(12, a.getCodiceTaglia());
			ps.setFloat(13, a.getPercentualeProvvigione());
			ps.setBoolean(14, a.isIndicatoreSerialNumber());
			ps.setFloat(15, a.getPesoNetto());
			ps.setString(16, a.getCodiceConfezione());
			ps.setFloat(17, a.getNumeroPezziConfezione());
			ps.setInt(18, a.getNumeroColli());
			ps.setFloat(19, a.getPesoLordo());
			ps.setFloat(20, a.getVolumeConfezione());
			ps.setFloat(21, a.getAltezza());
			ps.setFloat(22, a.getLarghezza());
			ps.setFloat(23, a.getProfondita());
			ps.setBoolean(24, a.isIndicatoreArticoloPadreFiglio());
			ps.setString(25, a.getCodiceArticoloAlternativo());
			ps.setString(26, a.getCodicePercipiente());
			ps.setInt(27, a.getNumeroDecimali());
			ps.setString(28, a.getNote());
			ps.setBoolean(29, a.isIndicatorePubblicazioneWeb());
			ps.setBoolean(30, a.isIndicatoreInibizione());
			ps.setTimestamp(31, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(32, Utils.toTimestamp(a.getDataUltimaModifica()));
			ps.setBoolean(33, a.isIndicatoreScorporoIVA());
			ps.setString(34, a.getCodiceControparteContabileFornitore());
			ps.setString(35, a.getCodiceIVAFornitore());
			ps.setString(36, a.getCodiceStampo());
			ps.setString(37, a.getNoteProduzione());
	
			ps.executeUpdate();
			ps.close();
			c.commit();
			c.close();
			} catch (Exception e) {
			  //Utils.createAlertFailWriteDB();
			}
		}
}
