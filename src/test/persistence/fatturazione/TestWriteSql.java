package test.persistence.fatturazione;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import invoicemanager.controller.fatturazione.DataManager;
import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Banca;

public class TestWriteSql {
	private DataManager dm;
	private Agente agente;
	private Banca banca;
	
	@BeforeEach
	void setup() {
		dm = new DataManager();
		agente = new Agente("aaa");
		banca = new Banca("bbb");
	}
	
	@Test
	void writeAgente() {
		dm.add(agente);
		assertEquals(1, dm.getAgenti().size());
	}
	
	@Test
	void writeBanca() {
		dm.add(banca);
		assertEquals(1, dm.getBanche().size());
	}
}
