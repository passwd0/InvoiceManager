package test.persistence.fatturazione;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import invoicemanager.model.fatturazione.Cliente;
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
		Cliente c = DataManager.loadCliente().get(0);
		System.out.print(c.getCodiceCliente());
		assertEquals(1, c.getContatti().size());
	}
	
//	@Test
//	void readControparteSize() {
//		assertEquals(2, DataManager.loadControparte().size());
//	}
//	
//	@Test
//	void readAgenteSize() {
//		assertEquals(0, DataManager.loadAgente().size());
//	}
//	
//	@Test
//	void readIndirizzoGeografico() {
//		assertEquals(1, DataManager.loadIndirizzoGeografico().size());
//	}
}
