package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.TerzoIntermediario;

public class WriteTerzoIntermediario {
	private Connection c;

	public WriteTerzoIntermediario() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(TerzoIntermediario a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO TerzoIntermediario VALUES (?, ?, ?, ?, ?,)");
				ps.setString(1, a.getIdentificaticoFiscale());
				ps.setString(2, a.getDenominazione());
				ps.setString(3, a.getNome());
				ps.setString(4, a.getCognome());
				ps.setString(5, a.getCodEORI());
		
				ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
