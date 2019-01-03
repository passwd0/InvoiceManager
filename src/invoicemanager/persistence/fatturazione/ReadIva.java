package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Iva;
import invoicemanager.model.fatturazione.Stato;


public class ReadIva {
	private Connection c;

	public ReadIva() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Iva> read() {
		List<Iva> listiva = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Iva");
			Timestamp ts;
	         while ( rs.next() ) {
				
				String codiceIva = rs.getString("codiceIva");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				int rigaIVAAcquisti = rs.getInt("rigaIVAAcquisti");
				float addizionaleIVA = rs.getFloat("addizionaleIVA");
				float aliquotaIVA = rs.getFloat("aliquotaIVA");
				float imponibileAcquisti = rs.getFloat("imponibileAcquisti");
				float imponibileAcquistiNonDetraibile = rs.getFloat("imponibileAcquistiNonDetraibile");
				float impostaAcquisti = rs.getFloat("impostaAcquisti");
				float imponibileVendite = rs.getFloat("imponibileVendite");
				float imponibileVenditeNonDetraibile = rs.getFloat("imponibileVenditeNonDetraibile");
				float impostaVendite = rs.getFloat("impostaVendite");
				int rigaIVAVendite = rs.getInt("rigaIVAVendite");
				float coefficienteIVA = rs.getFloat("coefficienteIVA");
				String percentualeIndetraibilita = rs.getString("percentualeIndetraibilita");
				float valoreArrotondamento = rs.getFloat("valoreArrotondamento");
				boolean indicatoreTroncaAcquisti = rs.getBoolean("indicatoreTroncaAcquisti");
				boolean indicatoreSommaAcquisti = rs.getBoolean("indicatoreSommaAcquisti");
				boolean indicatoreArrotondaAcquisti = rs.getBoolean("indicatoreArrotondaAcquisti");
				boolean indicatoreSottraeAcquisti = rs.getBoolean("indicatoreSottraeAcquisti");
				boolean indicatoreTroncaVendite = rs.getBoolean("indicatoreTroncaVendite");
				boolean indicatoreSommaVendite = rs.getBoolean("indicatoreSommaVendite");
				boolean indicatoreArrotondaVendite = rs.getBoolean("indicatoreArrotondaVendite");
				boolean indicatoreSottraeVendite = rs.getBoolean("indicatoreSottraeVendite");
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
				boolean elencoClientiFornitori = rs.getBoolean("elencoClientiFornitori");
				String colonnaClientiFornitori = rs.getString("colonnaClientiFornitori");
				String colonnaNoteClientiFornitori = rs.getString("colonnaNoteClientiFornitori");
				String splitPayment = rs.getString("splitPayment");
				
				Iva iva = new Iva(codiceIva, descrizione, stato, rigaIVAAcquisti, addizionaleIVA, aliquotaIVA, imponibileAcquisti, imponibileAcquistiNonDetraibile, impostaAcquisti, imponibileVendite, imponibileVenditeNonDetraibile, impostaVendite, rigaIVAVendite, coefficienteIVA, percentualeIndetraibilita, valoreArrotondamento, indicatoreTroncaAcquisti, indicatoreSommaAcquisti, indicatoreArrotondaAcquisti, indicatoreSottraeAcquisti, indicatoreTroncaVendite, indicatoreSommaVendite, indicatoreArrotondaVendite, indicatoreSottraeVendite, dataInserimento, dataUltimaModifica, loginInserimento, loginModifica, elencoClientiFornitori, colonnaClientiFornitori, colonnaNoteClientiFornitori, splitPayment);

		listiva.add(iva);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listiva;
	}

}
