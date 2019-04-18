package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.TipoRigaDocumento;

public class TipoRigaDocumentoDao {
	private Connection c;

	public TipoRigaDocumentoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(TipoRigaDocumento a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO TipoRigaDocumento VALUES (?, ?, ?, ?)");
		ps.setString(1, a.getCodiceTipoRigaDocumento());
		ps.setString(2, a.getDescrizione());
		ps.setTimestamp(3, a.getDataInserimento());
		ps.setTimestamp(4, a.getDataUltimaModifica());

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
	
	
	public List<TipoRigaDocumento> read() {
		List<TipoRigaDocumento> listtipoRigaDocumento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoRigaDocumento");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceTipoRigaDocumento = rs.getString("codiceTipoRigaDocumento");
				String descrizione = rs.getString("descrizione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				TipoRigaDocumento tipoRigaDocumento = new TipoRigaDocumento(codiceTipoRigaDocumento, descrizione, dataInserimento, dataUltimaModifica);

		listtipoRigaDocumento.add(tipoRigaDocumento);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoRigaDocumento;
	}

}
