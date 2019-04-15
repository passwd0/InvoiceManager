package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.TipoRigaDocumento;
import invoicemanager.utils.Utils;

public class WriteTipoRigaDocumento {
	private Connection c;

	public WriteTipoRigaDocumento()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(TipoRigaDocumento a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO TipoRigaDocumento VALUES (?, ?, ?, ?)");
		ps.setString(1, a.getCodiceTipoRigaDocumento());
		ps.setString(2, a.getDescrizione());
		ps.setTimestamp(3, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(4, Utils.toTimestamp(a.getDataUltimaModifica()));

			res = ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.TipoRigaDocumento (\r\n" + 
    			"	\"CodiceTipoRigaDocumento\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
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
