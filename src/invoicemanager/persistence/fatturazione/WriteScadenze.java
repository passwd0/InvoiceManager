package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Scadenze;
import invoicemanager.utils.Utils;

public class WriteScadenze {
	private Connection c;

	public WriteScadenze() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Scadenze a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Scadenze VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceConto());
		ps.setString(2, a.getCodiceTipoPagamento());
		ps.setString(3, a.getRiferimentoPartita());
		ps.setDate(4, Utils.convertToDatabaseColumn(a.getDataDocumento()));
		ps.setDate(5, Utils.convertToDatabaseColumn(a.getDataScadenza()));
		ps.setInt(6, a.getNumeroRegistrazione());
		ps.setString(7, a.getCodiceBanca());
		ps.setDate(8, Utils.convertToDatabaseColumn(a.getDataValuta()));
		ps.setString(9, a.getCodicePagamento());
		ps.setString(10, a.getNumeroAssegno());
		ps.setFloat(11, a.getImportoImponibileRitenutaAcconto());
		ps.setFloat(12, a.getImportoRitenutaAcconto());
		ps.setFloat(13, a.getImportoRimborsiRitenutaAcconto());
		ps.setFloat(14, a.getImportoIVARitenutaAcconto());
		ps.setFloat(15, a.getContriburoINPSDatoreLavoro());
		ps.setFloat(16, a.getContriburoINPSDatorePercipiente());
		ps.setDate(17, Utils.convertToDatabaseColumn(a.getDataValutaAssegno()));
		ps.setString(18, a.getNote());
		ps.setFloat(19, a.getImportoPagato());
		ps.setDate(20, Utils.convertToDatabaseColumn(a.getDataPagamento()));
		ps.setString(21, a.getNumeroDocumento());
		ps.setString(22, a.getCodiceIVAInSospensione());
		ps.setFloat(23, a.getImportoPartita());
		ps.setFloat(24, a.getImpostaIVAInSospensione());
		ps.setFloat(25, a.getImponibileIVAInSospensione());
		ps.setInt(26, a.getNumeroGiornaleIVA());
		ps.setString(27, a.getTipoRitenutaAcconto());
		ps.setDate(28, Utils.convertToDatabaseColumn(a.getDataAutorizzazionePagamento()));
		ps.setString(29, a.getCodiceDivisa());
		ps.setDate(30, Utils.convertToDatabaseColumn(a.getDataRegistrazione()));
		ps.setFloat(31, a.getImportoAbbuono());
		ps.setTimestamp(32, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(33, Utils.toTimestamp(a.getDataUltimaModifica()));
		ps.setString(34, a.getDescrizioneAggiuntiva());
		ps.setBoolean(35, a.isIndicatoreFattureProforma());
		ps.setFloat(36, a.getImportoRimborsiCpap());

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
    	String sql = "Create table public.Scadenze (\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"CodiceTipoPagamento\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"RiferimentoPartita\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"DataDocumento\" Date NOT NULL ,\r\n" + 
    			"	\"DataScadenza\" Date NOT NULL ,\r\n" + 
    			"	\"NumeroRegistrazione\" INTEGER NOT NULL ,\r\n" + 
    			"	\"CodiceBanca\" varchar(25) NULL,\r\n" + 
    			"	\"DataValuta\" Date NULL,\r\n" + 
    			"	\"CodicePagamento\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroAssegno\" varchar(25) NULL,\r\n" + 
    			"	\"ImportoImponibileRitenutaAcconto\" Float NULL,\r\n" + 
    			"	\"ImportoRitenutaAcconto\" Float NULL,\r\n" + 
    			"	\"ImportoRimborsiRitenutaAcconto\" Float NULL,\r\n" + 
    			"	\"ImportoIVARitenutaAcconto\" Float NULL,\r\n" + 
    			"	\"ContriburoINPSDatoreLavoro\" Float NULL,\r\n" + 
    			"	\"ContriburoINPSDatorePercipiente\" Float NULL,\r\n" + 
    			"	\"DataValutaAssegno\" Date NULL,\r\n" + 
    			"	\"Note\" varchar(25) NULL,\r\n" + 
    			"	\"ImportoPagato\" Float NULL,\r\n" + 
    			"	\"DataPagamento\" Date NULL,\r\n" + 
    			"	\"NumeroDocumento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceIVAInSospensione\" varchar(25) NULL,\r\n" + 
    			"	\"ImportoPartita\" Float NULL,\r\n" + 
    			"	\"ImpostaIVAInSospensione\" Float NULL,\r\n" + 
    			"	\"ImponibileIVAInSospensione\" Float NULL,\r\n" + 
    			"	\"NumeroGiornaleIVA\" INTEGER NULL,\r\n" + 
    			"	\"TipoRitenutaAcconto\" varchar(25) NULL,\r\n" + 
    			"	\"DataAutorizzazionePagamento\" Date NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"DataRegistrazione\" Date NULL,\r\n" + 
    			"	\"ImportoAbbuono\" Float NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL,\r\n" + 
    			"	\"DescrizioneAggiuntiva\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreFattureProforma\" Boolean NULL,\r\n" + 
    			"	\"ImportoRimborsiCpap\" Float NULL, \r\n" + 
    			"   Primary Key (\"CodiceConto\", \"CodiceTipoPagamento\", \"NumeroRegistrazione\", \"DataDocumento\", \"DataScadenza\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
