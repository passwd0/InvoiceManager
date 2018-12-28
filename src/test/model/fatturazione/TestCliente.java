package test.model.fatturazione;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import invoicemanager.model.fatturazione.Cliente;
class TestCliente {

	Cliente c1, c2;
	@BeforeEach
	void setUp() {
		c1 = new Cliente("prova");
		c1.setCodiceAffidabilita("asd");
		c2 = new Cliente("prova");
	}
	@Test
	void test() {
		assertEquals(c1, c2);
	}

}