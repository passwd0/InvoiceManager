package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Scadenze;
import invoicemanager.utils.Utils;

public class ScadenzeDao {
	private Connection c;

	public ScadenzeDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Scadenze a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Scadenze VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceConto());
		ps.setString(2, a.getCodiceTipoPagamento());
		ps.setString(3, a.getRiferimentoPartita());
		ps.setDate(4, a.getDataDocumento());
		ps.setDate(5, a.getDataScadenza());
		ps.setInt(6, a.getNumeroRegistrazione());
		ps.setString(7, a.getCodiceBanca());
		ps.setDate(8, a.getDataValuta());
		ps.setString(9, a.getCodicePagamento());
		ps.setString(10, a.getNumeroAssegno());
		ps.setFloat(11, a.getImportoImponibileRitenutaAcconto());
		ps.setFloat(12, a.getImportoRitenutaAcconto());
		ps.setFloat(13, a.getImportoRimborsiRitenutaAcconto());
		ps.setFloat(14, a.getImportoIVARitenutaAcconto());
		ps.setFloat(15, a.getContriburoINPSDatoreLavoro());
		ps.setFloat(16, a.getContriburoINPSDatorePercipiente());
		ps.setDate(17, a.getDataValutaAssegno());
		ps.setString(18, a.getNote());
		ps.setFloat(19, a.getImportoPagato());
		ps.setDate(20, a.getDataPagamento());
		ps.setString(21, a.getNumeroDocumento());
		ps.setString(22, a.getCodiceIVAInSospensione());
		ps.setFloat(23, a.getImportoPartita());
		ps.setFloat(24, a.getImpostaIVAInSospensione());
		ps.setFloat(25, a.getImponibileIVAInSospensione());
		ps.setInt(26, a.getNumeroGiornaleIVA());
		ps.setString(27, a.getTipoRitenutaAcconto());
		ps.setDate(28, a.getDataAutorizzazionePagamento());
		ps.setString(29, a.getCodiceDivisa());
		ps.setDate(30, a.getDataRegistrazione());
		ps.setFloat(31, a.getImportoAbbuono());
		ps.setTimestamp(32, a.getDataInserimento());
		ps.setTimestamp(33, a.getDataUltimaModifica());
		ps.setString(34, a.getDescrizioneAggiuntiva());
		ps.setBoolean(35, a.isIndicatoreFattureProforma());
		ps.setFloat(36, a.getImportoRimborsiCpap());

			res = ps.executeUpdate();
				ps.close();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
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

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Scadenze> read() {
		List<Scadenze> listscadenze = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Scadenze");
	         while ( rs.next() ) {

				String codiceConto = rs.getString("codiceConto");
				String codiceTipoPagamento = rs.getString("codiceTipoPagamento");
				String riferimentoPartita = rs.getString("riferimentoPartita");
				Date dataDocumento = rs.getDate("dataDocumento");
				Date dataScadenza = rs.getDate("dataScadenza");
				int numeroRegistrazione = rs.getInt("numeroRegistrazione");
				String codiceBanca = rs.getString("codiceBanca");
				Date dataValuta = rs.getDate("dataValuta");
				String codicePagamento = rs.getString("codicePagamento");
				String numeroAssegno = rs.getString("numeroAssegno");
				float importoImponibileRitenutaAcconto = rs.getFloat("importoImponibileRitenutaAcconto");
				float importoRitenutaAcconto = rs.getFloat("importoRitenutaAcconto");
				float importoRimborsiRitenutaAcconto = rs.getFloat("importoRimborsiRitenutaAcconto");
				float importoIVARitenutaAcconto = rs.getFloat("importoIVARitenutaAcconto");
				float contriburoINPSDatoreLavoro = rs.getFloat("contriburoINPSDatoreLavoro");
				float contriburoINPSDatorePercipiente = rs.getFloat("contriburoINPSDatorePercipiente");
				Date dataValutaAssegno = rs.getDate("dataValutaAssegno");
				String note = rs.getString("note");
				float importoPagato = rs.getFloat("importoPagato");
				Date dataPagamento = rs.getDate("dataPagamento");
				String numeroDocumento = rs.getString("numeroDocumento");
				String codiceIVAInSospensione = rs.getString("codiceIVAInSospensione");
				float importoPartita = rs.getFloat("importoPartita");
				float impostaIVAInSospensione = rs.getFloat("impostaIVAInSospensione");
				float imponibileIVAInSospensione = rs.getFloat("imponibileIVAInSospensione");
				int numeroGiornaleIVA = rs.getInt("numeroGiornaleIVA");
				String tipoRitenutaAcconto = rs.getString("tipoRitenutaAcconto");
				Date dataAutorizzazionePagamento = rs.getDate("dataAutorizzazionePagamento");
				String codiceDivisa = rs.getString("codiceDivisa");
				Date dataRegistrazione = rs.getDate("dataRegistrazione");
				float importoAbbuono = rs.getFloat("importoAbbuono");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
				boolean indicatoreFattureProforma = rs.getBoolean("indicatoreFattureProforma");
				float importoRimborsiCpap = rs.getFloat("importoRimborsiCpap");

				Scadenze scadenze = new Scadenze(codiceConto, codiceTipoPagamento, riferimentoPartita, dataDocumento, dataScadenza, numeroRegistrazione, codiceBanca, dataValuta, codicePagamento, numeroAssegno, importoImponibileRitenutaAcconto, importoRitenutaAcconto, importoRimborsiRitenutaAcconto, importoIVARitenutaAcconto, contriburoINPSDatoreLavoro, contriburoINPSDatorePercipiente, dataValutaAssegno, note, importoPagato, dataPagamento, numeroDocumento, codiceIVAInSospensione, importoPartita, impostaIVAInSospensione, imponibileIVAInSospensione, numeroGiornaleIVA, tipoRitenutaAcconto, dataAutorizzazionePagamento, codiceDivisa, dataRegistrazione, importoAbbuono, dataInserimento, dataUltimaModifica, descrizioneAggiuntiva, indicatoreFattureProforma, importoRimborsiCpap);

		listscadenze.add(scadenze);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listscadenze;
	}

}
