package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.TerzoIntermediario;

public class WriteTerzoIntermediario {
	private Connection c;

	public WriteTerzoIntermediario() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(TerzoIntermediario a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO TerzoIntermediario VALUES (DEFAULT, ?, ?, ?, ?, ?,)");
				ps.setString(1, a.getIdentificaticoFiscale());
				ps.setString(2, a.getDenominazione());
				ps.setString(3, a.getNome());
				ps.setString(4, a.getCognome());
				ps.setString(5, a.getCodEORI());
		
				ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();
        c.close();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}

	
}
