package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.BentoDettaglio;
import invoicemanager.utils.Utils;

public class WriteBentoDettaglio {
	private Connection c;

	public WriteBentoDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(BentoDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO BentoDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				ps.setString(1, a.getCodiceBento());
				ps.setInt(2, a.getNumeroRigaBento());
				ps.setString(3, a.getCodiceTipoBento());
				ps.setString(4, a.getCodiceRigaBento());
				ps.setString(5, a.getCodiceArticolo());
				ps.setString(6, a.getDescrizione());
				ps.setFloat(7, a.getQuantita());
				ps.setString(8, a.getCodiceUnitaMisura());
				ps.setFloat(9, a.getPrezzo());
				ps.setString(10, a.getCodiceIva());
				ps.setString(11, a.getCodiceControparte());
				ps.setFloat(12, a.getPercentualeProvvigione());
				ps.setFloat(13, a.getPercentualeScontoCliente());
				ps.setFloat(14, a.getPercentualeScontoArticolo());
				ps.setFloat(15, a.getPercentualeScontoPagamento());
				ps.setString(16, a.getCodiceMagazzino());
				ps.setString(17, a.getCodiceCausaleMagazzino());
				ps.setString(18, a.getDescrizioneAggiuntiva());
				ps.setTimestamp(19, Utils.toTimestamp(a.getDataInserimento()));
				ps.setTimestamp(20, Utils.toTimestamp(a.getDataUltimaModifica()));
		
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
    	String sql = "Create table public.BentoDettaglio (\r\n" + 
    			"	\"CodiceBento\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"NumeroRigaBento\" INTEGER NOT NULL ,\r\n" + 
    			"	\"CodiceTipoBento\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"CodiceRigaBento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Quantita\" Float NULL,\r\n" + 
    			"	\"CodiceUnitaMisura\" varchar(25) NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL,\r\n" + 
    			"	\"CodiceIva\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceControparte\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoCliente\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoArticolo\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCausaleMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"DescrizioneAggiuntiva\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceBento\", \"NumeroRigaBento\", \"CodiceTipoBento\")" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
