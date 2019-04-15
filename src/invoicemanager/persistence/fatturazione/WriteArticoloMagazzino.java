package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.ArticoloMagazzino;
import invoicemanager.utils.Utils;

public class WriteArticoloMagazzino {
	private Connection c;

	public WriteArticoloMagazzino()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ArticoloMagazzino a, boolean exist) {
	    int res = 0;
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO ArticoloMagazzino VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
			ps.setBoolean(31, a.isIndicatoreScorporoIVA());
			ps.setString(32, a.getCodiceControparteContabileFornitore());
			ps.setString(33, a.getCodiceIVAFornitore());
			ps.setString(34, a.getCodiceStampo());
			ps.setString(35, a.getNoteProduzione());
			ps.setTimestamp(36, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(37, Utils.toTimestamp(a.getDataUltimaModifica()));
	
			res = ps.executeUpdate();
			ps.close();
			c.commit();

			} catch (Exception e) {
			  //Utils.createAlertFailWriteDB();
				e.getStackTrace();
			}
	    return res;
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.ArticoloMagazzino (\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceUnitaMisura\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceGruppoMerceologico\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceSottogruppoMerceologico\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceControparteContabile\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceIVA\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreGestionePezzi\" Boolean NULL,\r\n" + 
    			"	\"Sconto\" Float NULL,\r\n" + 
    			"	\"CodiceTaglieColori\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceColore\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceTaglia\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"IndicatoreSerialNumber\" Boolean NULL,\r\n" + 
    			"	\"PesoNetto\" Float NULL,\r\n" + 
    			"	\"CodiceConfezione\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroPezziConfezione\" Float NULL,\r\n" + 
    			"	\"NumeroColli\" INTEGER NULL,\r\n" + 
    			"	\"PesoLordo\" Float NULL,\r\n" + 
    			"	\"VolumeConfezione\" Float NULL,\r\n" + 
    			"	\"Altezza\" Float NULL,\r\n" + 
    			"	\"Larghezza\" Float NULL,\r\n" + 
    			"	\"Profondita\" Float NULL,\r\n" + 
    			"	\"IndicatoreArticoloPadreFiglio\" Boolean NULL,\r\n" + 
    			"	\"CodiceArticoloAlternativo\" varchar(25) NULL,\r\n" + 
    			"	\"CodicePercipiente\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroDecimali\" INTEGER NULL,\r\n" + 
    			"	\"Note\" varchar(250) NULL,\r\n" + 
    			"	\"IndicatorePubblicazioneWeb\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreInibizione\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreScorporoIVA\" Boolean NULL,\r\n" + 
    			"	\"CodiceControparteContabileFornitore\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceIVAFornitore\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceStampo\" varchar(25) NULL,\r\n" + 
    			"	\"NoteProduzione\" varchar(25) NULL, \r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
}
