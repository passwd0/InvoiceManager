package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.ArticoloMagazzinoDescrizioneMultilingua;

public class ArticoloMagazzinoDescrizioneMultilinguaDao {
	private Connection c;

	public ArticoloMagazzinoDescrizioneMultilinguaDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ArticoloMagazzinoDescrizioneMultilingua a, boolean exist) {
	    int res = 0;
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO ArticoloMagazzinoDescrizioneMultilingua VALUES (?, ?, ?, ?, ?)");
				ps.setString(1, a.getCodiceArticolo());
				ps.setString(2, a.getCodiceLingua());
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
    	String sql = "Create table public.ArticoloMagazzinoDescrizioneMultilingua (\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"CodiceLingua\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceArticolo\", \"CodiceLingua\")" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}

	
	public List<ArticoloMagazzinoDescrizioneMultilingua> read() {
		List<ArticoloMagazzinoDescrizioneMultilingua> listarticoloMagazzinoDescrizioneMultilingua = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ArticoloMagazzinoDescrizioneMultilingua");
	         while ( rs.next() ) {

				String codiceArticolo = rs.getString("codiceArticolo");
				String codiceLingua = rs.getString("codiceLingua");
				String descrizione = rs.getString("descrizione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				ArticoloMagazzinoDescrizioneMultilingua articoloMagazzinoDescrizioneMultilingua = new ArticoloMagazzinoDescrizioneMultilingua(codiceArticolo, codiceLingua, descrizione, dataInserimento, dataUltimaModifica);

				listarticoloMagazzinoDescrizioneMultilingua.add(articoloMagazzinoDescrizioneMultilingua);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listarticoloMagazzinoDescrizioneMultilingua;
	}

}
