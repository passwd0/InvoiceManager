package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.RappresentanteFiscale;

public class WriteRappresentanteFiscale {
	private Connection c;

	public WriteRappresentanteFiscale() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(RappresentanteFiscale a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO RappresentanteFiscale VALUES (DEFAULT, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getPaese());
		ps.setString(2, a.getIdentificativoFiscale());
		ps.setString(3, a.getDenominazione());
		ps.setString(4, a.getNome());
		ps.setString(5, a.getCognome());

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
