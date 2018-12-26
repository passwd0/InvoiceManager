package test.model.fatturazione;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import invoicemanager.model.fatturazione.DdtDettaglio;

class TestDdtDettaglio {

	DdtDettaglio c1, c2;
	@BeforeEach
	void setUp() {
		c1 = new DdtDettaglio(1,1,LocalDateTime.of(2018, 12, 24, 10, 0));
		c2 = new DdtDettaglio(1,1,LocalDateTime.of(2018, 12, 25, 10, 0));
	}
	@Test
	void test() {
		assertEquals(c1, c2);
	}

}
