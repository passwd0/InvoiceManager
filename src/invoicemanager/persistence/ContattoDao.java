package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Contatto;
import invoicemanager.model.TipoDettaglio;

public class ContattoDao {
	private Connection c;

	public ContattoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Contatto a, boolean exist) {
		int res = 0;
	    try {

			PreparedStatement ps = c.prepareStatement("INSERT INTO Contatto VALUES (default, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceConto());
			ps.setString(2, a.getTipoDettaglio().name());
			ps.setString(3, a.getNumero());
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
    	String sql = "Create table public.Contatto (\r\n" + 
    			"	\"id\" serial NOT NULL primary key,\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"TipoDettaglio\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"Dettaglio\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Contatto> read() {
		List<Contatto> listtelefono = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Contatto");
	         while ( rs.next() ) {
	        	int id = rs.getInt("id");
				String codiceConto = rs.getString("codiceConto");
				TipoDettaglio tipoDettaglio = TipoDettaglio.valueOf(rs.getString("tipoDettaglio"));
				String dettaglio = rs.getString("dettaglio");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				Contatto telefono = new Contatto(id, codiceConto, tipoDettaglio, dettaglio, dataInserimento, dataUltimaModifica);
				
				listtelefono.add(telefono);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtelefono;
	}

}
