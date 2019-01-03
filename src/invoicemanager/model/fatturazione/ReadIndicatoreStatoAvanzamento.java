package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.IndicatoreStatoAvanzamento;


public class ReadIndicatoreStatoAvanzamento {
	private Connection c;

	public ReadIndicatoreStatoAvanzamento() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<IndicatoreStatoAvanzamento> read() {
		List<IndicatoreStatoAvanzamento> listindicatoreStatoAvanzamento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM IndicatoreStatoAvanzamento");
			Timestamp ts;
	         while ( rs.next() ) {

IndicatoreStatoAvanzamento indicatoreStatoAvanzamento = new IndicatoreStatoAvanzamento();

		listindicatoreStatoAvanzamento.add(indicatoreStatoAvanzamento);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listindicatoreStatoAvanzamento;
	}

}
