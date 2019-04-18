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

import invoicemanager.model.PreventivoDettaglio;
import invoicemanager.utils.Utils;

public class PreventivoDettaglioDao {
	private Connection c;

	public PreventivoDettaglioDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(PreventivoDettaglio a, boolean exist) {
	    int res = 0;
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO PreventivoDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				ps.setInt(1, a.getNumeroPreventivo());
				ps.setInt(2, a.getNumeroRigaPreventivo());
				ps.setDate(3, a.getDataPreventivo());
				ps.setString(4, a.getCodiceTipoRigaDocumento());
				ps.setString(5, a.getCodiceArticolo());
				ps.setFloat(6, a.getQuantitaArticolo());
				ps.setFloat(7, a.getQuantitaConsegnata());
				ps.setFloat(8, a.getQuantitaDaConsegnare());
				ps.setString(9, a.getDescrizione());
				ps.setString(10, a.getDescrizioneAggiuntiva());
				ps.setDate(11, a.getDataConsegna());
				ps.setString(12, a.getCodiceUnitaMisura());
				ps.setFloat(13, a.getPrezzo());
				ps.setString(14, a.getCodiceIVA());
				ps.setString(15, a.getCodiceControparte());
				ps.setFloat(16, a.getPercentualeProvvigione());
				ps.setFloat(17, a.getPercentualeScontoCliente());
				ps.setFloat(18, a.getPercentualeScontoArticolo());
				ps.setFloat(19, a.getPercentualeScontoPagamento());
				ps.setString(20, a.getCodiceMagazzino());
				ps.setTimestamp(21, a.getDataInserimento());
				ps.setTimestamp(22, a.getDataUltimaModifica());
		
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

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<PreventivoDettaglio> read() {
		List<PreventivoDettaglio> listpreventivoDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PreventivoDettaglio");
	         while ( rs.next() ) {

				int numeroPreventivo = rs.getInt("numeroPreventivo");
				int numeroRigaPreventivo = rs.getInt("numeroRigaPreventivo");
				Date dataPreventivo = rs.getDate("dataPreventivo");
				String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
				String codiceArticolo = rs.getString("codiceArticolo");
				float quantitaArticolo = rs.getFloat("quantitaArticolo");
				float quantitaConsegnata = rs.getFloat("quantitaConsegnata");
				float quantitaDaConsegnare = rs.getFloat("quantitaDaConsegnare");
				String descrizione = rs.getString("descrizione");
				String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
				Date dataConsegna = rs.getDate("dataConsegna");
				String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
				float prezzo = rs.getFloat("prezzo");
				String codiceIVA = rs.getString("codiceIVA");
				String codiceControparte = rs.getString("codiceControparte");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				float percentualeScontoCliente = rs.getFloat("percentualeScontoCliente");
				float percentualeScontoArticolo = rs.getFloat("percentualeScontoArticolo");
				float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
				String codiceMagazzino = rs.getString("codiceMagazzino");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				PreventivoDettaglio preventivoDettaglio = new PreventivoDettaglio(numeroPreventivo, numeroRigaPreventivo, dataPreventivo, codiceTipoRigaDocumento, codiceArticolo, quantitaArticolo, quantitaConsegnata, quantitaDaConsegnare, descrizione, descrizioneAggiuntiva, dataConsegna, codiceUnitaMisura, prezzo, codiceIVA, codiceControparte, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, codiceMagazzino, dataInserimento, dataUltimaModifica);

		listpreventivoDettaglio.add(preventivoDettaglio);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpreventivoDettaglio;
	}

}
