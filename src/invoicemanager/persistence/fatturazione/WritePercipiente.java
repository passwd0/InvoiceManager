package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Percipiente;
import invoicemanager.utils.Utils;

public class WritePercipiente {
	private Connection c;

	public WritePercipiente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Percipiente a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Percipiente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodicePercipiente());
		ps.setString(2, a.getDescrizione());
		ps.setBoolean(3, a.isCodiceStato());
		ps.setFloat(4, a.getAliquotaRitenutaAcconto());
		ps.setFloat(5, a.getPercentualeImponibileRitenutaAcconto());
		ps.setString(6, a.getCodiceTributo());
		ps.setBoolean(7, a.isAssoggettamentoINPS());
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(9, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
