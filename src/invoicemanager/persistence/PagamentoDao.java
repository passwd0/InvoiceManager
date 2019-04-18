package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Pagamento;
import invoicemanager.model.Stato;
import invoicemanager.model.TipoPagamento;

public class PagamentoDao {
	private Connection c;

	public PagamentoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Pagamento a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Pagamento VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodicePagamento());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getStato().name());
			ps.setString(4, a.getCodiceTipoPagamento());
			ps.setBoolean(5, a.isIndicatoreScadenzaAVista());
			ps.setString(6, a.getGiornoMese());
			ps.setInt(7, a.getNumeroGiorni());
			ps.setInt(8, a.getNumeroScadenze());
			ps.setFloat(9, a.getSconto());
			ps.setBoolean(10, a.isScadenzaIVAPrimaRata());
			ps.setTimestamp(11, a.getDataInserimento());
			ps.setTimestamp(12, a.getDataUltimaModifica());

			res = ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(Pagamento a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Pagamento SET "
					+ "campo=value "
					+ "WHERE codicePagamento="+a.getCodicePagamento();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Pagamento a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodicePagamento() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Pagamento (\r\n" + 
    			"	\"CodicePagamento\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceTipoPagamento\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreScadenzaAVista\" Boolean NULL,\r\n" + 
    			"	\"GiornoMese\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroGiorni\" INTEGER NULL,\r\n" + 
    			"	\"NumeroScadenze\" INTEGER NULL,\r\n" + 
    			"	\"Sconto\" Float NULL,\r\n" + 
    			"	\"ScadenzaIVAPrimaRata\" Boolean NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Pagamento> read(List<TipoPagamento> listaTipoPagamento) {
		List<Pagamento> listpagamento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Pagamento");
	         while ( rs.next() ) {

				String codicePagamento = rs.getString("codicePagamento");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				String codice = rs.getString("codiceTipoPagamento");
				TipoPagamento tipoPagamento = listaTipoPagamento.stream().filter(x->x.getCodiceTipoPagamento().equals(codice)).findFirst().orElse(null);
				boolean indicatoreScadenzaAVista = rs.getBoolean("indicatoreScadenzaAVista");
				String giornoMese = rs.getString("giornoMese");
				int numeroGiorni = rs.getInt("numeroGiorni");
				int numeroScadenze = rs.getInt("numeroScadenze");
				float sconto = rs.getFloat("sconto");
				boolean scadenzaIVAPrimaRata = rs.getBoolean("scadenzaIVAPrimaRata");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				Pagamento pagamento = new Pagamento(codicePagamento, descrizione, stato, tipoPagamento, indicatoreScadenzaAVista, giornoMese, numeroGiorni, numeroScadenze, sconto, scadenzaIVAPrimaRata, dataInserimento, dataUltimaModifica);

				listpagamento.add(pagamento);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpagamento;
	}

}
