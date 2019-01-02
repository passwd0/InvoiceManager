package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Confezione;
import invoicemanager.utils.Utils;

public class WriteConfezione {
	private Connection c;

	public WriteConfezione() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Confezione a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Confezione VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceConfezione());
		ps.setString(2, a.getDescrizione());
		ps.setBoolean(3, a.isCodiceStato());
		ps.setFloat(4, a.getLarghezza());
		ps.setFloat(5, a.getLunghezza());
		ps.setFloat(6, a.getAltezza());
		ps.setFloat(7, a.getVolume());
		ps.setFloat(8, a.getPesoLordo());
		ps.setFloat(9, a.getPesoTara());
		ps.setTimestamp(10, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(11, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
