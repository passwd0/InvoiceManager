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
			DataManager.createTables();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
