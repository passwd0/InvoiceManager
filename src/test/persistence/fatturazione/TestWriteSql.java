package test.persistence.fatturazione;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import invoicemanager.controller.fatturazione.DataManager;
import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Banca;
import invoicemanager.model.fatturazione.Cliente;

public class TestWriteSql {
	
	@BeforeEach
	void setup() {	}
	
	@Test
	void writeAgente() {
		Agente agente = new Agente("bbb");
		DataManager.add(agente);
		assertEquals(1, DataManager.loadAgente().size());
	}
	
	@Test
	void writeBanca() {
		Banca banca = new Banca("bbb", "ccc");
		DataManager.add(banca);
		assertEquals(1, DataManager.loadBanca().size());
	}
	
	@Test 
	void writeCliente() {
		Cliente cliente = new Cliente("a000");
		cliente.setDataUltimaFattura(LocalDate.now());
		cliente.setDataInizioPlafond(LocalDate.now());

		DataManager.add(cliente);
		assertEquals(1,  DataManager.loadCliente().size());
	}
}
