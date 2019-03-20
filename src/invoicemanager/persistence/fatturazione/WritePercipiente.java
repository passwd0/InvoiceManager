package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Percipiente;
import invoicemanager.utils.Utils;

public class WritePercipiente {
	private Connection c;

	public WritePercipiente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Percipiente a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Percipiente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
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

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Percipiente (\r\n" + 
    			"	\"CodicePercipiente\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceStato\" Boolean NULL,\r\n" + 
    			"	\"AliquotaRitenutaAcconto\" Float NULL,\r\n" + 
    			"	\"PercentualeImponibileRitenutaAcconto\" Float NULL,\r\n" + 
    			"	\"CodiceTributo\" varchar(25) NULL,\r\n" + 
    			"	\"AssoggettamentoINPS\" Boolean NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
