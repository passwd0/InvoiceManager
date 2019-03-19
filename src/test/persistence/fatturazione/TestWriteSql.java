package test.persistence.fatturazione;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import invoicemanager.controller.fatturazione.DataManager;
import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Banca;
import invoicemanager.model.fatturazione.CausaleMagazzino;
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
	
	@Test
	void writeCausaleMagazzino() {
		CausaleMagazzino cm1 = new CausaleMagazzino("1", "a");
		CausaleMagazzino cm2 = new CausaleMagazzino("2", "b");
		CausaleMagazzino cm3 = new CausaleMagazzino("3", "c");
		CausaleMagazzino cm4 = new CausaleMagazzino("4", "d");

		DataManager.add(cm1);
		DataManager.add(cm2);
		DataManager.add(cm3);
		DataManager.add(cm4);
		
		assertEquals(4,  DataManager.loadCausaleMagazzino().size());
	}
}
