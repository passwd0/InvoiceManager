package test.persistence;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import invoicemanager.ui.controller.DataManager;

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
