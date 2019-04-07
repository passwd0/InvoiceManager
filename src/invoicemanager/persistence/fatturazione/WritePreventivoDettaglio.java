package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.PreventivoDettaglio;
import invoicemanager.utils.Utils;

public class WritePreventivoDettaglio {
	private Connection c;

	public WritePreventivoDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(PreventivoDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO PreventivoDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				ps.setInt(1, a.getNumeroPreventivo());
				ps.setInt(2, a.getNumeroRigaPreventivo());
				ps.setDate(3, Utils.convertToDatabaseColumn(a.getDataPreventivo()));
				ps.setString(4, a.getCodiceTipoRigaDocumento());
				ps.setString(5, a.getCodiceArticolo());
				ps.setFloat(6, a.getQuantitaArticolo());
				ps.setFloat(7, a.getQuantitaConsegnata());
				ps.setFloat(8, a.getQuantitaDaConsegnare());
				ps.setString(9, a.getDescrizione());
				ps.setString(10, a.getDescrizioneAggiuntiva());
				ps.setDate(11, Utils.convertToDatabaseColumn(a.getDataConsegna()));
				ps.setString(12, a.getCodiceUnitaMisura());
				ps.setFloat(13, a.getPrezzo());
				ps.setString(14, a.getCodiceIVA());
				ps.setString(15, a.getCodiceControparte());
				ps.setFloat(16, a.getPercentualeProvvigione());
				ps.setFloat(17, a.getPercentualeScontoCliente());
				ps.setFloat(18, a.getPercentualeScontoArticolo());
				ps.setFloat(19, a.getPercentualeScontoPagamento());
				ps.setString(20, a.getCodiceMagazzino());
				ps.setTimestamp(21, Utils.toTimestamp(a.getDataInserimento()));
				ps.setTimestamp(22, Utils.toTimestamp(a.getDataUltimaModifica()));
		
				ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
				  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.PreventivoDettaglio (\r\n" + 
    			"	\"NumeroPreventivo\" INTEGER NOT NULL ,\r\n" + 
    			"	\"NumeroRigaPreventivo\" INTEGER NOT NULL ,\r\n" + 
    			"	\"DataPreventivo\" Date NOT NULL ,\r\n" + 
    			"	\"CodiceTipoRigaDocumento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NULL,\r\n" + 
    			"	\"QuantitaArticolo\" Float NULL,\r\n" + 
    			"	\"QuantitaConsegnata\" Float NULL,\r\n" + 
    			"	\"QuantitaDaConsegnare\" Float NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"DescrizioneAggiuntiva\" varchar(25) NULL,\r\n" + 
    			"	\"DataConsegna\" Date NULL,\r\n" + 
    			"	\"CodiceUnitaMisura\" varchar(25) NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL,\r\n" + 
    			"	\"CodiceIVA\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceControparte\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoCliente\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoArticolo\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"NumeroPreventivo\", \"NumeroRigaPreventivo\", \"DataPreventivo\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
