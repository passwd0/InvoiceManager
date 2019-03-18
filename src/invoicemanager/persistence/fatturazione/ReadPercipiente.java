package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Percipiente;


public class ReadPercipiente {
	private Connection c;

	public ReadPercipiente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
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
				boolean codiceStato = rs.getBoolean("codiceStato");
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
				
				Percipiente percipiente = new Percipiente(codicePercipiente, descrizione, codiceStato, aliquotaRitenutaAcconto, percentualeImponibileRitenutaAcconto, codiceTributo, assoggettamentoINPS, dataInserimento, dataUltimaModifica);

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
