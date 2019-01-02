package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.StatoAvanzamento;

public class WriteStatoAvanzamento {
	private Connection c;

	public WriteStatoAvanzamento() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(StatoAvanzamento a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO StatoAvanzamento VALUES ()");

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
