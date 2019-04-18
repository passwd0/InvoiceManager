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

import invoicemanager.model.GruppoMerceologico;
import invoicemanager.model.ListinoPersonalizzato;
import invoicemanager.utils.Utils;

public class ListinoPersonalizzatoDao {
	private Connection c;

	public ListinoPersonalizzatoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ListinoPersonalizzato a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO ListinoPersonalizzato VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceCliente());
		ps.setString(2, a.getCodiceArticolo());
		ps.setString(3, a.getVariante());
		ps.setFloat(4, a.getPrezzo());
		ps.setFloat(5, a.getProvvigione());
		ps.setString(6, a.getNoteEsterne());
		ps.setString(7, a.getNoteInterne());
		ps.setInt(8, a.getNumeroDecimali());
		ps.setFloat(9, a.getScontoCliente());
		ps.setTimestamp(10, a.getDataAggiornamento());
		ps.setFloat(11, a.getScontoArticolo());
		ps.setFloat(12, a.getScontoPagamento());
		ps.setString(13, a.getCodiceDivisa());
		ps.setString(14, a.getCodiceGruppoMerceologico());
		ps.setDate(15, a.getDataInizioValidita());
		ps.setDate(16, a.getDataFineValidita());
		ps.setBoolean(17, a.isOpzioneGruppi());
		ps.setBoolean(18, a.isOpzioneScontoClienti());
		ps.setBoolean(19, a.isOpzioneScontoArticolo());
		ps.setBoolean(20, a.isOpzioneScontoPagamento());
		ps.setBoolean(21, a.isOpzionePercentualeProvvigione());
		ps.setBoolean(22, a.isOpzioneNoteEsterne());
		ps.setBoolean(23, a.isOpzioneNoteInterne());
		ps.setTimestamp(24, a.getDataInserimento());
		ps.setTimestamp(25, a.getDataUltimaModifica());

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

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<ListinoPersonalizzato> read(List<GruppoMerceologico> listaGruppoMerceologico){
		List<ListinoPersonalizzato> listlistinoPersonalizzato = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ListinoPersonalizzato");
	         while ( rs.next() ) {

				String codiceListinoPersonalizzato = rs.getString("codiceListinoPersonalizzato");
				String codiceCliente = rs.getString("codiceCliente");
				String codiceArticolo = rs.getString("codiceArticolo");
				String variante = rs.getString("variante");
				float prezzo = rs.getFloat("prezzo");
				float provvigione = rs.getFloat("provvigione");
				String noteEsterne = rs.getString("noteEsterne");
				String noteInterne = rs.getString("noteInterne");
				int numeroDecimali = rs.getInt("numeroDecimali");
				float scontoCliente = rs.getFloat("scontoCliente");
				Timestamp dataAggiornamento = rs.getTimestamp("dataAggiornamento");
				float scontoArticolo = rs.getFloat("scontoArticolo");
				float scontoPagamento = rs.getFloat("scontoPagamento");
				String codiceDivisa = rs.getString("codiceDivisa");
				String codice = rs.getString("gruppoMerceologico");
				GruppoMerceologico gruppoMerceologico = listaGruppoMerceologico.stream().filter(x->x.getCodiceGruppoMerceologico().equals(codice)).findFirst().orElse(null);
				Date dataInizioValidita = rs.getDate("dataInizioValidita");
				Date dataFineValidita = rs.getDate("dataFineValidita");
				boolean opzioneGruppi = rs.getBoolean("opzioneGruppi");
				boolean opzioneScontoClienti = rs.getBoolean("opzioneScontoClienti");
				boolean opzioneScontoArticolo = rs.getBoolean("opzioneScontoArticolo");
				boolean opzioneScontoPagamento = rs.getBoolean("opzioneScontoPagamento");
				boolean opzionePercentualeProvvigione = rs.getBoolean("opzionePercentualeProvvigione");
				boolean opzioneNoteEsterne = rs.getBoolean("opzioneNoteEsterne");
				boolean opzioneNoteInterne = rs.getBoolean("opzioneNoteInterne");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				ListinoPersonalizzato listinoPersonalizzato = new ListinoPersonalizzato(codiceListinoPersonalizzato, codiceCliente, codiceArticolo, variante, prezzo, provvigione, noteEsterne, noteInterne, numeroDecimali, scontoCliente, dataAggiornamento, scontoArticolo, scontoPagamento, codiceDivisa, gruppoMerceologico, dataInizioValidita, dataFineValidita, opzioneGruppi, opzioneScontoClienti, opzioneScontoArticolo, opzioneScontoPagamento, opzionePercentualeProvvigione, opzioneNoteEsterne, opzioneNoteInterne, dataInserimento, dataUltimaModifica);

				listlistinoPersonalizzato.add(listinoPersonalizzato);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listlistinoPersonalizzato;
	}

}
