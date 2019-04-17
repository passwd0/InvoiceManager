package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Ordine;
import invoicemanager.utils.Utils;


public class ReadOrdine {
	private Connection c;

	public ReadOrdine() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<Ordine> read() {
		List<Ordine> listordine = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Ordine");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroOrdine = rs.getInt("numeroOrdine");
				int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
				LocalDate dataOrdine = Utils.convertToEntityAttribute(rs.getDate("dataOrdine"));
				String ordCodiceCommessaConvenzione = rs.getString("ordCodiceCommessaConvenzione");
				String ordCodiceCUP = rs.getString("ordCodiceCUP");
				String ordCodiceCIG = rs.getString("ordCodiceCIG");
				
				Ordine ordine = new Ordine(numeroOrdine, numeroRigaOrdine, dataOrdine, ordCodiceCommessaConvenzione, ordCodiceCUP, ordCodiceCIG);

				listordine.add(ordine);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listordine;
	}

}
