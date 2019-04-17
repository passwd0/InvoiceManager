package invoicemanager.persistence;

import invoicemanager.model.ArticoloMagazzinoDescrizioneMultilingua;
import invoicemanager.utils.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
				ps.setTimestamp(4, Utils.toTimestamp(a.getDataInserimento()));
				ps.setTimestamp(5, Utils.toTimestamp(a.getDataUltimaModifica()));
		
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
        c.commit();

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
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceArticolo = rs.getString("codiceArticolo");
				String codiceLingua = rs.getString("codiceLingua");
				String descrizione = rs.getString("descrizione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
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
