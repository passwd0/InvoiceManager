package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.ProvvigioneAgente;
import invoicemanager.utils.Utils;

public class WriteProvvigioneAgente {
	private Connection c;

	public WriteProvvigioneAgente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(ProvvigioneAgente a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO ProvvigioneAgente VALUES (?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceProvvigione());
		ps.setString(2, a.getCodiceAgente());
		ps.setFloat(3, a.getScontoLegatoProvvigione());
		ps.setFloat(4, a.getProvvigioneLegataSconto());
		ps.setInt(5, a.getProgressivo());
		ps.setString(6, a.getCodiceGruppoMerceologico());
		ps.setTimestamp(7, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
