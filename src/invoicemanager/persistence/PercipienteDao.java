package invoicemanager.persistence;

import invoicemanager.model.Percipiente;
import invoicemanager.model.Stato;
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

public class PercipienteDao {
	private Connection c;

	public PercipienteDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Percipiente a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Percipiente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodicePercipiente());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getStato().name());
		ps.setFloat(4, a.getAliquotaRitenutaAcconto());
		ps.setFloat(5, a.getPercentualeImponibileRitenutaAcconto());
		ps.setString(6, a.getCodiceTributo());
		ps.setBoolean(7, a.isAssoggettamentoINPS());
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(9, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.Percipiente (\r\n" + 
    			"	\"CodicePercipiente\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
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
	
	
	public List<Percipiente> read() {
		List<Percipiente> listpercipiente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Percipiente");
			Timestamp ts;
	         while ( rs.next() ) {

				String codicePercipiente = rs.getString("codicePercipiente");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				float aliquotaRitenutaAcconto = rs.getFloat("aliquotaRitenutaAcconto");
				float percentualeImponibileRitenutaAcconto = rs.getFloat("percentualeImponibileRitenutaAcconto");
				String codiceTributo = rs.getString("codiceTributo");
				boolean assoggettamentoINPS = rs.getBoolean("assoggettamentoINPS");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Percipiente percipiente = new Percipiente(codicePercipiente, descrizione, stato, aliquotaRitenutaAcconto, percentualeImponibileRitenutaAcconto, codiceTributo, assoggettamentoINPS, dataInserimento, dataUltimaModifica);

				listpercipiente.add(percipiente);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpercipiente;
	}

}
