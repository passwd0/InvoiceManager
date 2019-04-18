package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.BancaGlobale;

public class BancaGlobaleDao {
	private Connection c;

	public BancaGlobaleDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(BancaGlobale a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO BancaGlobale VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceBanca());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getCodiceABI());
		ps.setString(4, a.getCodiceCAB());
		ps.setString(5, a.getLocalita());
		ps.setString(6, a.getProvincia());
		ps.setString(7, a.getNumeroContoCorrente());
		ps.setString(8, a.getCodiceCIN());
		ps.setString(9, a.getCodiceCINEur());
		ps.setString(10, a.getPaese());
		ps.setString(11, a.getIban());
		ps.setString(12, a.getSwift());
		ps.setString(13, a.getCodiceConto());
		ps.setString(14, a.getIndirizzo());
		ps.setString(15, a.getCap());
		ps.setTimestamp(16, a.getDataInserimento());
		ps.setTimestamp(17, a.getDataUltimaModifica());

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
    	String sql = "Create table public.BancaGlobale (\r\n" + 
    			"	\"CodiceBanca\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceABI\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceCAB\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Localita\" varchar(25) NULL,\r\n" + 
    			"	\"Provincia\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroContoCorrente\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCIN\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCINEur\" varchar(25) NULL,\r\n" + 
    			"	\"Paese\" varchar(25) NULL,\r\n" + 
    			"	\"Iban\" varchar(25) NULL,\r\n" + 
    			"	\"Swift\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceConto\" varchar(25) NULL,\r\n" + 
    			"	\"Indirizzo\" varchar(25) NULL,\r\n" + 
    			"	\"Cap\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}

	
	public List<BancaGlobale> read() {
		List<BancaGlobale> listbancaGlobale = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BancaGlobale");
	         while ( rs.next() ) {

				String codiceBanca = rs.getString("codiceBanca");
				String descrizione = rs.getString("descrizione");
				String codiceABI = rs.getString("codiceABI");
				String codiceCAB = rs.getString("codiceCAB");
				String localita = rs.getString("localita");
				String provincia = rs.getString("provincia");
				String numeroContoCorrente = rs.getString("numeroContoCorrente");
				String codiceCIN = rs.getString("codiceCIN");
				String codiceCINEur = rs.getString("codiceCINEur");
				String paese = rs.getString("paese");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				String iban = rs.getString("iban");
				String swift = rs.getString("swift");
				String codiceConto = rs.getString("codiceConto");
				String indirizzo = rs.getString("indirizzo");
				String cap = rs.getString("cap");
				BancaGlobale bancaGlobale = new BancaGlobale(codiceBanca, descrizione, codiceABI, codiceCAB, localita, provincia, numeroContoCorrente, codiceCIN, codiceCINEur, paese, iban, swift, codiceConto, indirizzo, cap, dataInserimento, dataUltimaModifica);

				listbancaGlobale.add(bancaGlobale);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listbancaGlobale;
	}

}
