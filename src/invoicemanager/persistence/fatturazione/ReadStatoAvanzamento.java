package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.StatoAvanzamento;


public class ReadStatoAvanzamento {
	private Connection c;

	public ReadStatoAvanzamento() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<StatoAvanzamento> read() {
		List<StatoAvanzamento> liststatoAvanzamento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM StatoAvanzamento");
			Timestamp ts;
	         while ( rs.next() ) {

()
StatoAvanzamento statoAvanzamento = new StatoAvanzamento();

		liststatoAvanzamento.add(statoAvanzamento);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return liststatoAvanzamento;
	}

}
