package test.persistence.fatturazione;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Banca;
import invoicemanager.model.fatturazione.CausaleMagazzino;
import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.FatturaTestata;
import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.model.fatturazione.Pagamento;
import invoicemanager.model.fatturazione.Utente;
import invoicemanager.ui.controller.fatturazione.DataManager;

public class TestWriteSql {
	
//	@BeforeEach
//	void setup() {	}
//	
	@Test
	void writeAgente() {
		Agente agente = new Agente("bbb");
		DataManager.add(agente);
		//assertEquals(1, DataManager.loadAgente().size());
	}
	
	@Test
	void writeBanca() {
		Banca banca = new Banca("bbb", "ccc");
		DataManager.add(banca);
		//assertEquals(1, DataManager.loadBanca().size());
	}
	
	@Test 
	void writeCliente() {
		
		
		Cliente cliente = new Cliente("a003");
		cliente.setDataUltimaFattura(LocalDate.now());
		cliente.setDataInizioPlafond(LocalDate.now());
		Pagamento p = new Pagamento("1111");
		cliente.setPagamento(p);
		DataManager.add(p);
		DataManager.add(cliente);
		//assertEquals(2,  DataManager.loadCliente().size());
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
		
		//assertEquals(4,  DataManager.loadCausaleMagazzino().size());
	}
	
	@Test
	void writeUtente() {
		Utente u = new Utente("a003");
		u.setRagioneSociale("a003_ragione");
		u.setDataNascita(LocalDateTime.of(1979, 1, 5, 5, 2));
		u.setPartitaIVA("a003_partitaiva");
		DataManager.add(u);
		//assertEquals(3, DataManager.loadUtente().size());
	}
	
	@Test 
	void writeIndirizzoGeografico(){
		IndirizzoGeografico ig = new IndirizzoGeografico("a000_indirizzo", "a000");
		ig.setCodiceNazione("c0_nazione");
		ig.setCodiceTipoIndirizzo("c0_tipoindirizzo");
		DataManager.add(ig);
		//assertEquals(2, DataManager.loadIndirizzoGeografico().size());
	}
	
	@Test
	void writeFatturazioneTestata() {
		FatturaTestata ft = new FatturaTestata(2, LocalDate.now(), 1, "a003");
		FatturaTestata ft1 = new FatturaTestata(1, LocalDate.now(), 1, "a001");
		DataManager.add(ft);
		DataManager.add(ft1);
	}
}
