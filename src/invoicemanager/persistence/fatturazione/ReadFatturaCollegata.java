package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.FatturaCollegata;


public class ReadFatturaCollegata {
	private Connection c;

	public ReadFatturaCollegata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<FatturaCollegata> read() {
		List<FatturaCollegata> listfatturaCollegata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaCollegata");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroFtCollegate = rs.getInt("numeroFtCollegate");
				int numeroRigaFtCollegate = rs.getInt("numeroRigaFtCollegate");
				LocalDate dataFtCollegate = rs.getDate("dataFtCollegate").toLocalDate();
				String ftcCodiceCommessaFtCollegate = rs.getString("ftcCodiceCommessaFtCollegate");
				String ftcCodiceCUP = rs.getString("ftcCodiceCUP");
				String ftcCodiceCIG = rs.getString("ftcCodiceCIG");
				
				FatturaCollegata fatturaCollegata = new FatturaCollegata(numeroFtCollegate, numeroRigaFtCollegate, dataFtCollegate, ftcCodiceCommessaFtCollegate, ftcCodiceCUP, ftcCodiceCIG);

				listfatturaCollegata.add(fatturaCollegata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaCollegata;
	}

}
