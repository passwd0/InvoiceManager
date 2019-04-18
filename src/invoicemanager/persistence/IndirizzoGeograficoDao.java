package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.IndirizzoGeografico;

public class IndirizzoGeograficoDao {
	private Connection c;

	public IndirizzoGeograficoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(IndirizzoGeografico a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO IndirizzoGeografico VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceIndirizzo());
		ps.setString(2, a.getCodiceConto());
		ps.setString(3, a.getVia());
		ps.setString(4, a.getProvincia());
		ps.setString(5, a.getCap());
		ps.setString(6, a.getCitta());
		ps.setString(7, a.getCodiceNazione());
		ps.setString(8, a.getCodiceTipoIndirizzo());
		ps.setString(9, a.getDescrizione());
		ps.setBoolean(10, a.isIndicatoreIndirizzoDefault());
		ps.setString(11, a.getCodiceMinistero());
		ps.setTimestamp(12, a.getDataInserimento());
		ps.setTimestamp(13, a.getDataUltimaModifica());

		res = ps.executeUpdate();
		ps.close();
		c.commit();

		} catch (Exception e) {
		  //Utils.createAlertFailWriteDB();
		}
	    return res;
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.IndirizzoGeografico (\r\n" + 
    			"	\"CodiceIndirizzo\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Via\" varchar(25) NULL,\r\n" + 
    			"	\"Provincia\" varchar(25) NULL,\r\n" + 
    			"	\"Cap\" varchar(25) NULL,\r\n" + 
    			"	\"Citta\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceNazione\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceTipoIndirizzo\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreIndirizzoDefault\" Boolean NULL,\r\n" + 
    			"	\"CodiceMinistero\" varchar(25) NULL, \r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL,\r\n" + 
    			"   Primary Key (\"CodiceIndirizzo\", \"CodiceConto\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<IndirizzoGeografico> read() {
		List<IndirizzoGeografico> listindirizzoGeografico = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM IndirizzoGeografico");
	         while ( rs.next() ) {

				String codiceIndirizzo = rs.getString("codiceIndirizzo");
				String codiceConto = rs.getString("codiceConto");
				String via = rs.getString("via");
				String provincia = rs.getString("provincia");
				String cap = rs.getString("cap");
				String citta = rs.getString("citta");
				String codiceNazione = rs.getString("codiceNazione");
				String codiceTipoIndirizzo = rs.getString("codiceTipoIndirizzo");
				String descrizione = rs.getString("descrizione");
				boolean indicatoreIndirizzoDefault = rs.getBoolean("indicatoreIndirizzoDefault");
				String codiceMinistero = rs.getString("codiceMinistero");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				IndirizzoGeografico indirizzoGeografico = new IndirizzoGeografico(codiceIndirizzo, codiceConto, via, provincia, cap, citta, codiceNazione, codiceTipoIndirizzo, descrizione, indicatoreIndirizzoDefault, codiceMinistero, dataInserimento, dataUltimaModifica);

				listindirizzoGeografico.add(indirizzoGeografico);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listindirizzoGeografico;
	}

}
