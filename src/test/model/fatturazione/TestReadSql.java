package test.model.fatturazione;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import invoicemanager.controller.fatturazione.DataManager;

public class TestReadSql {
	private DataManager dm;
	
	@BeforeEach
	void setup() {
		dm = new DataManager();
	}
	
	@Test
	void readClientiSize() {
		assertEquals(1, dm.getClienti().size());
	}
}
