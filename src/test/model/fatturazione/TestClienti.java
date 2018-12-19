package test.model.fatturazione;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import invoicemanager.model.fatturazione.Clienti;
class TestClienti {

	Clienti c;
	@BeforeEach
	void setUp() {
		c = new Clienti("prova");
	}
	@Test
	void test() {
		assertEquals("prova", c.getCodiceCliente());
	}

}
