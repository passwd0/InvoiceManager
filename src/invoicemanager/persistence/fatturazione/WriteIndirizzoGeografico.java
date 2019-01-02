package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.utils.Utils;

public class WriteIndirizzoGeografico {
	private Connection c;

	public WriteIndirizzoGeografico() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(IndirizzoGeografico a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO IndirizzoGeografico VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceIndirizzo());
		ps.setString(2, a.getCodiceConto());
		ps.setString(3, a.getVia());
		ps.setString(4, a.getProvincia());
		ps.setString(5, a.getCap());
		ps.setString(6, a.getCitta());
		ps.setString(7, a.getCodiceNazione());
		ps.setString(8, a.getCodiceTipoIndirizzo());
		ps.setTimestamp(9, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(10, Utils.toTimestamp(a.getDataUltimaModifica()));
		ps.setString(11, a.getLoginInserimento());
		ps.setString(12, a.getLoginModifica());
		ps.setString(13, a.getDescrizione());
		ps.setBoolean(14, a.isIndicatoreIndirizzoDefault());
		ps.setString(15, a.getCodiceMinistero());

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
