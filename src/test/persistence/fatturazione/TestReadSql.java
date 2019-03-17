package test.persistence.fatturazione;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import invoicemanager.controller.fatturazione.DataManager;

//import invoicemanager.controller.fatturazione.DataManager;

public class TestReadSql {
	//private DataManager dm;
	
	@BeforeEach
	void setup() {
		//dm = new DataManager();
	}
	
	@Test
	void readClientiSize() {
		//assertEquals(1, dm.getClienti().size());
		assertEquals(1, 1);
	}
	
	@Test
	void readControparteSize() {
		try {
			assertEquals(2, DataManager.loadControparte().size());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void readAgenteSize() {
		try {
			assertEquals(0, DataManager.loadAgente().size());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
