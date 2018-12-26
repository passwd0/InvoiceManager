package test.model.fatturazione;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import invoicemanager.controller.fatturazione.DataManager;

public class TestReadSql {
	
	@Test
	void test() {
		DataManager dm = new DataManager();
		assertEquals(1, dm.getClienti().size());
	}
}
