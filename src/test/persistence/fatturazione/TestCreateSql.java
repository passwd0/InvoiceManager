package test.persistence.fatturazione;

import java.sql.SQLException;
import org.junit.jupiter.api.Test;

import invoicemanager.controller.fatturazione.DataManager;
import invoicemanager.persistence.fatturazione.DBConnect;
import invoicemanager.persistence.fatturazione.WriteAgente;
import invoicemanager.persistence.fatturazione.WriteAltroDatoGestionale;
import invoicemanager.persistence.fatturazione.WriteAreaGeografica;

public class TestCreateSql {
	
	@Test
	void createDB() {
		try {
			DataManager.createDB();
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Error: DB gia' esistente");
		}
	}
}
