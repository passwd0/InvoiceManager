package invoicemanager.persistence;

import invoicemanager.model.PianoConto;
import invoicemanager.utils.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PianoContoDao {
	private Connection c;

	public PianoContoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(PianoConto a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO PianoConto VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
    	String sql = "Create table public.PianoConto (\r\n" + 
    			"	\"CodiceConto\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Tipo\" Boolean NULL,\r\n" + 
    			"	\"CodiceClassificazione\" varchar(25) NULL,\r\n" + 
    			"	\"DarePeriodo\" Float NULL,\r\n" + 
    			"	\"AverePeriodo\" Float NULL,\r\n" + 
    			"	\"DareProgressivo\" Float NULL,\r\n" + 
    			"	\"AvereProgressivo\" Float NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceBancaBonifico\" varchar(25) NULL,\r\n" + 
    			"	\"ContoBanca\" Boolean NULL,\r\n" + 
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
	
	
	public List<PianoConto> read() {
		List<PianoConto> listpianoConto = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PianoConto");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceConto = rs.getString("codiceConto");
				String descrizione = rs.getString("descrizione");
				boolean tipo = rs.getBoolean("tipo");
				String codiceClassificazione = rs.getString("codiceClassificazione");
				float darePeriodo = rs.getFloat("darePeriodo");
				float averePeriodo = rs.getFloat("averePeriodo");
				float dareProgressivo = rs.getFloat("dareProgressivo");
				float avereProgressivo = rs.getFloat("avereProgressivo");
				String codiceDivisa = rs.getString("codiceDivisa");
				String codiceBancaBonifico = rs.getString("codiceBancaBonifico");
				boolean contoBanca = rs.getBoolean("contoBanca");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				PianoConto pianoConto = new PianoConto(codiceConto, descrizione, tipo, codiceClassificazione, darePeriodo, averePeriodo, dareProgressivo, avereProgressivo, codiceDivisa, codiceBancaBonifico, contoBanca, dataInserimento, dataUltimaModifica);

				listpianoConto.add(pianoConto);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpianoConto;
	}

}
