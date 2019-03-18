package test.persistence.fatturazione;

import java.sql.SQLException;
import org.junit.jupiter.api.Test;

import invoicemanager.controller.fatturazione.DataManager;
import invoicemanager.persistence.fatturazione.WriteAgente;
import invoicemanager.persistence.fatturazione.WriteAltroDatoGestionale;

public class TestCreateSql {
	
	@Test
	void createDB() {
		//DBConnect.verifyDB();
		try {
			new WriteAltroDatoGestionale().createDB();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
