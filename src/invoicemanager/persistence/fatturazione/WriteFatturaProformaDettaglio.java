package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.FatturaProformaDettaglio;
import invoicemanager.utils.Utils;

public class WriteFatturaProformaDettaglio {
	private Connection c;

	public WriteFatturaProformaDettaglio()  {
		try { c = DBConnect.getConnection(); }
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
	
	
}
