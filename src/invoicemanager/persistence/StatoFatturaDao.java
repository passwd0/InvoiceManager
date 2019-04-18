package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.StatoFattura;

public class StatoFatturaDao {
	private Connection c;

	public StatoFatturaDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(StatoFattura a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO StatoFattura VALUES (?, ?, ?, ?, ?)");
		ps.setBoolean(1, a.isIndicatoreStatoAvanzamento());
		ps.setBoolean(2, a.isTipoDocumento());
		ps.setString(3, a.getDescrizione());
		ps.setTimestamp(4, a.getDataInserimento());
		ps.setTimestamp(5, a.getDataUltimaModifica());

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
    	String sql = "Create table public.StatoFattura (\r\n" + 
    			"	\"IndicatoreStatoAvanzamento\" Boolean NOT NULL,\r\n" + 
    			"	\"TipoDocumento\" Boolean NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<StatoFattura> read() {
		List<StatoFattura> liststatoFattura = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM StatoFattura");
	         while ( rs.next() ) {

				boolean indicatoreStatoAvanzamento = rs.getBoolean("indicatoreStatoAvanzamento");
				boolean tipoDocumento = rs.getBoolean("tipoDocumento");
				String descrizione = rs.getString("descrizione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");

				StatoFattura statoFattura = new StatoFattura(indicatoreStatoAvanzamento, tipoDocumento, descrizione, dataInserimento, dataUltimaModifica);

		liststatoFattura.add(statoFattura);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return liststatoFattura;
	}

}
