package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Agente;
import invoicemanager.model.Controparte;


public class ReadAgente {
	private Connection c;

	public ReadAgente() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
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

				Controparte controparte = null;
				for (int i=0; i<list.size(); i++) {
					String tmp = list.get(i).getCodiceControparte();
					if (tmp != null && tmp == codice) {
						controparte = list.get(i);
					}
				}

				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();
				Agente agente = new Agente(codiceAgente, nome, percentualeProvvigione, tipoProvvigione, tipoMandato, codiceContabile, controparte, dataInserimento, dataUltimaModifica);
				listAgente.add(agente);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listAgente;
	}
}
