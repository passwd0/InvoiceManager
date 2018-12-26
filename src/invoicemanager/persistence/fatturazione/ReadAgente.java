package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Controparte;
import invoicemanager.model.fatturazione.Stato;


public class ReadAgente {
	private Connection c;

	public ReadAgente() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Agente> read(List<Controparte> list) {
		List<Agente> listAgente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Agente");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceAgente = rs.getString("codiceAgente");
				String nome = rs.getString("nome");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				boolean tipoProvvigione = rs.getBoolean("tipoProvvigione");
				boolean tipoMandato = rs.getBoolean("tipoMandato");
				String codiceContabile = rs.getString("codiceContabile");
				String codice = rs.getString("codiceControparte");
				
				Controparte codiceControparte = list.stream().filter(x->x.getCodiceControparte().equals(codice)).findFirst().get();

				
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();
				String loginInserimento = rs.getString("loginInserimento");
				String loginModifica = rs.getString("loginModifica");
				Agente agente = new Agente(codiceAgente, nome, percentualeProvvigione, tipoProvvigione, tipoMandato, codiceContabile, codiceControparte, dataInserimento, dataUltimaModifica, loginInserimento, loginModifica);
				listAgente.add(agente);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listAgente;
	}
}
