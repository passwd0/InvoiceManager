package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Ricezione;
import invoicemanager.utils.Utils;


public class ReadRicezione {
	private Connection c;

	public ReadRicezione() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Ricezione> read() {
		List<Ricezione> listricezione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Ricezione");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroRicezione = rs.getInt("numeroRicezione");
				int numeroRigaRicezione = rs.getInt("numeroRigaRicezione");
				LocalDate dataRicezione = Utils.convertToEntityAttribute(rs.getDate("dataRicezione"));
				String rczCodiceCommessaRicezione = rs.getString("rczCodiceCommessaRicezione");
				String rczCodiceCUP = rs.getString("rczCodiceCUP");
				String rczCodiceCIG = rs.getString("rczCodiceCIG");
				
				Ricezione ricezione = new Ricezione(numeroRicezione, numeroRigaRicezione, dataRicezione, rczCodiceCommessaRicezione, rczCodiceCUP, rczCodiceCIG);

				listricezione.add(ricezione);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listricezione;
	}

}
