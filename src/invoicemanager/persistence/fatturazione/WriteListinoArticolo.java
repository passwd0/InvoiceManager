package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.ListinoArticolo;
import invoicemanager.utils.Utils;

public class WriteListinoArticolo {
	private Connection c;

	public WriteListinoArticolo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(ListinoArticolo a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO ListinoArticolo VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceArticolo());
		ps.setInt(2, a.getProgressivo());
		ps.setString(3, a.getCodiceDivisa());
		ps.setFloat(4, a.getPrezzo());
		ps.setInt(5, a.getNumeroDecimali());
		ps.setDate(6, Date.valueOf(a.getDataDecorrenza()));
		ps.setDate(7, Date.valueOf(a.getDataValidita()));
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(9, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
