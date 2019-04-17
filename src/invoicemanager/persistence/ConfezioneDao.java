package invoicemanager.persistence;

import invoicemanager.model.Confezione;
import invoicemanager.model.Stato;
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

public class ConfezioneDao {
	private Connection c;

	public ConfezioneDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Confezione a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Confezione VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceConfezione());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getStato().name());
		ps.setFloat(4, a.getLarghezza());
		ps.setFloat(5, a.getLunghezza());
		ps.setFloat(6, a.getAltezza());
		ps.setFloat(7, a.getVolume());
		ps.setFloat(8, a.getPesoLordo());
		ps.setFloat(9, a.getPesoTara());
		ps.setTimestamp(10, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(11, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.Confezione (\r\n" + 
    			"	\"CodiceConfezione\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"Larghezza\" Float NULL,\r\n" + 
    			"	\"Lunghezza\" Float NULL,\r\n" + 
    			"	\"Altezza\" Float NULL,\r\n" + 
    			"	\"Volume\" Float NULL,\r\n" + 
    			"	\"PesoLordo\" Float NULL,\r\n" + 
    			"	\"PesoTara\" Float NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Confezione> read() {
		List<Confezione> listconfezione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Confezione");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceConfezione = rs.getString("codiceConfezione");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				float larghezza = rs.getFloat("larghezza");
				float lunghezza = rs.getFloat("lunghezza");
				float altezza = rs.getFloat("altezza");
				float volume = rs.getFloat("volume");
				float pesoLordo = rs.getFloat("pesoLordo");
				float pesoTara = rs.getFloat("pesoTara");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Confezione confezione = new Confezione(codiceConfezione, descrizione, stato, larghezza, lunghezza, altezza, volume, pesoLordo, pesoTara, dataInserimento, dataUltimaModifica);
	
				listconfezione.add(confezione);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listconfezione;
	}

}
