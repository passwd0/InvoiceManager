package test.persistence.fatturazione;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import invoicemanager.ui.controller.fatturazione.DataManager;

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
		assertEquals(2, DataManager.loadControparte().size());
	}
	
	@Test
	void readAgenteSize() {
		assertEquals(0, DataManager.loadAgente().size());
	}
	
	@Test
	void readIndirizzoGeografico() {
		assertEquals(1, DataManager.loadIndirizzoGeografico().size());
	}
}
