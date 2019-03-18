package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Convenzione;


public class ReadConvenzione {
	private Connection c;

	public ReadConvenzione() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Convenzione> read() {
		List<Convenzione> listconvenzione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Convenzione");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroConvenzione = rs.getInt("numeroConvenzione");
				int numeroRigaConvenzione = rs.getInt("numeroRigaConvenzione");
				LocalDate dataConvenzione = rs.getDate("dataConvenzione").toLocalDate();
				String cnvCodiceCommessaConvenzione = rs.getString("cnvCodiceCommessaConvenzione");
				String cnvCodiceCUP = rs.getString("cnvCodiceCUP");
				String cnvCodiceCIG = rs.getString("cnvCodiceCIG");
				
				Convenzione convenzione = new Convenzione(numeroConvenzione, numeroRigaConvenzione, dataConvenzione, cnvCodiceCommessaConvenzione, cnvCodiceCUP, cnvCodiceCIG);
				listconvenzione.add(convenzione);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listconvenzione;
	}

}
