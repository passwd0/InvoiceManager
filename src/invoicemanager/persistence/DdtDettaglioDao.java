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

import invoicemanager.model.DdtDettaglio;
import invoicemanager.utils.Utils;

public class DdtDettaglioDao {
	private Connection c;

	public DdtDettaglioDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(DdtDettaglio a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO DdtDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, a.getNumeroDDT());
			ps.setTimestamp(2, a.getDataDDT());
			ps.setInt(3, a.getNumeroRigaDDT());
			ps.setString(4, a.getCodiceTipoRigaDocumento());
			ps.setString(5, a.getCodiceArticolo());
			ps.setString(6, a.getCodiceMagazzino());
			ps.setFloat(7, a.getCosto());
			ps.setInt(8, a.getNumeroOrdine());
			ps.setInt(9, a.getNumeroRigaOrdine());
			ps.setDate(10, a.getDataOrdine());
			ps.setFloat(11, a.getQuantitaDaConsegnare());
			ps.setBoolean(12, a.isIndicatoreEvasione());
			ps.setString(13, a.getDescrizione());
			ps.setFloat(14, a.getQuantita());
			ps.setFloat(15, a.getPrezzo());
			ps.setString(16, a.getCodiceIva());
			ps.setString(17, a.getCodiceContropartitaContabile());
			ps.setFloat(18, a.getPercentualeProvvigione());
			ps.setFloat(19, a.getPercentualeScontoCliente());
			ps.setFloat(20, a.getPercentualeScontoArticolo());
			ps.setFloat(21, a.getPercentualeScontoPagamento());
			ps.setString(22, a.getDescrizioneAggiuntiva());
			ps.setString(23, a.getCodiceUnitaMisura());
			ps.setString(24, a.getSerialNumber());
			ps.setBoolean(25, a.isIndicatorePrelevatoVendita());
			ps.setString(26, a.getPesoLordo());
			ps.setInt(27, a.getIdDdtTestata());
			ps.setTimestamp(27, a.getDataInserimento());
			ps.setTimestamp(28, a.getDataUltimaModifica());

			res = ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(DdtDettaglio a) throws ClassNotFoundException, SQLException {
		try {
			
//			ps.executeUpdate();
//			ps.close();
//			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(DdtDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceDdtDettaglio() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.DdtDettaglio (\r\n" + 
    			"	\"NumeroDDT\" INTEGER NOT NULL,\r\n" + 
    			"	\"DataDDT\" Timestamp NOT NULL,\r\n" + 
    			"	\"NumeroRigaDDT\" INTEGER NOT NULL,\r\n" + 
    			"	\"CodiceTipoRigaDocumento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"Costo\" Float NULL,\r\n" + 
    			"	\"NumeroOrdine\" INTEGER NULL,\r\n" + 
    			"	\"NumeroRigaOrdine\" INTEGER NULL,\r\n" + 
    			"	\"DataOrdine\" Date NULL,\r\n" + 
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
    			"	\"IndicatorePrelevatoVendita\" Boolean NULL,\r\n" + 
    			"	\"PesoLordo\" varchar(25) NULL,\r\n" + 
    			"	\"IdDdtTestata\" INTEGER NOT NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"    Primary Key (\"NumeroDDT\", \"DataDDT\", \"NumeroRigaDDT\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<DdtDettaglio> read() {
		List<DdtDettaglio> listddtDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM DdtDettaglio");
	         while ( rs.next() ) {

				int numeroDDT = rs.getInt("numeroDDT");
				Timestamp dataDDT = rs.getTimestamp("dataDDT");
				int numeroRigaDDT = rs.getInt("numeroRigaDDT");
				String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
				String codiceArticolo = rs.getString("codiceArticolo");
				String codiceMagazzino = rs.getString("codiceMagazzino");
				float costo = rs.getFloat("costo");
				int numeroOrdine = rs.getInt("numeroOrdine");
				int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
				Date dataOrdine = rs.getDate("dataOrdine");
				float quantitaDaConsegnare = rs.getFloat("quantitaDaConsegnare");
				boolean indicatoreEvasione = rs.getBoolean("indicatoreEvasione");
				String descrizione = rs.getString("descrizione");
				float quantita = rs.getFloat("quantita");
				float prezzo = rs.getFloat("prezzo");
				String codiceIva = rs.getString("codiceIva");
				String codiceContropartitaContabile = rs.getString("codiceContropartitaContabile");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				float percentualeScontoCliente = rs.getFloat("percentualeScontoCliente");
				float percentualeScontoArticolo = rs.getFloat("percentualeScontoArticolo");
				float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
				String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
				String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
				String serialNumber = rs.getString("serialNumber");
				boolean indicatorePrelevatoVendita = rs.getBoolean("indicatorePrelevatoVendita");
				String pesoLordo = rs.getString("pesoLordo");
				int idDdtTestata = rs.getInt("idDdtTestata");
				Timestamp DataInserimento = rs.getTimestamp("DataInserimento");
				Timestamp DataUltimaModifica = rs.getTimestamp("DataUltimaModifica");
				
				DdtDettaglio ddtDettaglio = new DdtDettaglio(numeroDDT, dataDDT, numeroRigaDDT, codiceTipoRigaDocumento, codiceArticolo, codiceMagazzino, 
						costo, numeroOrdine, numeroRigaOrdine, dataOrdine, quantitaDaConsegnare, indicatoreEvasione, descrizione, quantita, prezzo, 
						codiceIva, codiceContropartitaContabile, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, 
						percentualeScontoPagamento, descrizioneAggiuntiva, codiceUnitaMisura, serialNumber, indicatorePrelevatoVendita, pesoLordo, 
						idDdtTestata, DataInserimento, DataUltimaModifica);

				listddtDettaglio.add(ddtDettaglio);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listddtDettaglio;
	}

}
