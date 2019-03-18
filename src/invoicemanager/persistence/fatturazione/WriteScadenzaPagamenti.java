package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.ScadenzaPagamenti;
import invoicemanager.model.fatturazione.Scadenze;
import invoicemanager.utils.Utils;

public class WriteScadenzaPagamenti {
	private Connection c;

	public WriteScadenzaPagamenti() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(ScadenzaPagamenti a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Scadenze VALUES (?, ?, ?, ?)");
		
		ps.setInt(1, a.getNumeroFattura());
		ps.setFloat(2, a.getImportoScadenza());
		ps.setDate(3, Date.valueOf(a.getDataFattura()));
		ps.setDate(4, Date.valueOf(a.getDataScadenza()));
		

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
