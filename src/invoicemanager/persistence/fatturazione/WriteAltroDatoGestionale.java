package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.AltroDatoGestionale;

public class WriteAltroDatoGestionale {
	private Connection c;

	public WriteAltroDatoGestionale() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(AltroDatoGestionale a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO AltroDatoGestionale VALUES (?, ?, ?, ?,)");
			ps.setString(1, a.getTipoDato());
			ps.setString(2, a.getRiferimentoTesto());
			ps.setFloat(3, a.getRiferimentoNumero());
			ps.setDate(4, Date.valueOf(a.getRiferimentoData()));
	
			ps.executeUpdate();
			ps.close();
			c.commit();

			} catch (Exception e) {
   			  //Utils.createAlertFailWriteDB();
			}
		}
}
