package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.ListinoPersonalizzato;
import invoicemanager.utils.Utils;

public class WriteListinoPersonalizzato {
	private Connection c;

	public WriteListinoPersonalizzato() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(ListinoPersonalizzato a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO ListinoPersonalizzato VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceCliente());
		ps.setString(2, a.getCodiceArticolo());
		ps.setString(3, a.getVariante());
		ps.setFloat(4, a.getPrezzo());
		ps.setFloat(5, a.getProvvigione());
		ps.setString(6, a.getNoteEsterne());
		ps.setString(7, a.getNoteInterne());
		ps.setInt(8, a.getNumeroDecimali());
		ps.setFloat(9, a.getScontoCliente());
		ps.setTimestamp(10, Utils.toTimestamp(a.getDataAggiornamento()));
		ps.setFloat(11, a.getScontoArticolo());
		ps.setFloat(12, a.getScontoPagamento());
		ps.setString(13, a.getCodiceDivisa());
		ps.setString(14, a.getCodiceGruppoMerceologico());
		ps.setDate(15, Date.valueOf(a.getDataInizioValidita()));
		ps.setDate(16, Date.valueOf(a.getDataFineValidita()));
		ps.setBoolean(17, a.isOpzioneGruppi());
		ps.setBoolean(18, a.isOpzioneScontoClienti());
		ps.setBoolean(19, a.isOpzioneScontoArticolo());
		ps.setBoolean(20, a.isOpzioneScontoPagamento());
		ps.setBoolean(21, a.isOpzionePercentualeProvvigione());
		ps.setBoolean(22, a.isOpzioneNoteEsterne());
		ps.setBoolean(23, a.isOpzioneNoteInterne());
		ps.setTimestamp(24, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(25, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.ListinoPersonalizzato (\r\n" + 
    			"	\"CodiceCliente\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Variante\" varchar(25) NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL,\r\n" + 
    			"	\"Provvigione\" Float NULL,\r\n" + 
    			"	\"NoteEsterne\" varchar(25) NULL,\r\n" + 
    			"	\"NoteInterne\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroDecimali\" INTEGER NULL,\r\n" + 
    			"	\"ScontoCliente\" Float NULL,\r\n" + 
    			"	\"DataAggiornamento\" Timestamp NULL,\r\n" + 
    			"	\"ScontoArticolo\" Float NULL,\r\n" + 
    			"	\"ScontoPagamento\" Float NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceGruppoMerceologico\" varchar(25) NULL,\r\n" + 
    			"	\"DataInizioValidita\" Date NULL,\r\n" + 
    			"	\"DataFineValidita\" Date NULL,\r\n" + 
    			"	\"OpzioneGruppi\" Boolean NULL,\r\n" + 
    			"	\"OpzioneScontoClienti\" Boolean NULL,\r\n" + 
    			"	\"OpzioneScontoArticolo\" Boolean NULL,\r\n" + 
    			"	\"OpzioneScontoPagamento\" Boolean NULL,\r\n" + 
    			"	\"OpzionePercentualeProvvigione\" Boolean NULL,\r\n" + 
    			"	\"OpzioneNoteEsterne\" Boolean NULL,\r\n" + 
    			"	\"OpzioneNoteInterne\" Boolean NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceCliente\", \"CodiceArticolo\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
