package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.BentoTestata;
import invoicemanager.utils.Utils;

public class WriteBentoTestata {
	private Connection c;

	public WriteBentoTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(BentoTestata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO BentoTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceBento());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getCodiceTipoBento());
		ps.setString(4, a.getCodiceMagazzino());
		ps.setString(5, a.getCodiceClienteFornitore());
		ps.setString(6, a.getNote());
		ps.setTimestamp(7, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataUltimaModifica()));
		ps.setString(9, a.getLoginInserimento());

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
