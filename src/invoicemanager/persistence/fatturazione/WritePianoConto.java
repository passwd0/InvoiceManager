package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.PianoConto;
import invoicemanager.utils.Utils;

public class WritePianoConto {
	private Connection c;

	public WritePianoConto() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(PianoConto a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO PianoConto VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceConto());
		ps.setString(2, a.getDescrizione());
		ps.setBoolean(3, a.isTipo());
		ps.setString(4, a.getCodiceClassificazione());
		ps.setFloat(5, a.getDarePeriodo());
		ps.setFloat(6, a.getAverePeriodo());
		ps.setFloat(7, a.getDareProgressivo());
		ps.setFloat(8, a.getAvereProgressivo());
		ps.setString(9, a.getCodiceDivisa());
		ps.setString(10, a.getCodiceBancaBonifico());
		ps.setBoolean(11, a.isContoBanca());
		ps.setTimestamp(12, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(13, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
