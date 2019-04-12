package test.persistence.fatturazione;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Banca;
import invoicemanager.model.fatturazione.CausaleMagazzino;
import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.FatturaTestata;
import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.model.fatturazione.Ordine;
import invoicemanager.model.fatturazione.Pagamento;
import invoicemanager.model.fatturazione.Utente;
import invoicemanager.model.fatturazione.Vettore;
import invoicemanager.ui.controller.fatturazione.DataManager;

public class TestWriteSql {
	
	//ATTENTION all fail if rows already present in tables
	
	@Test
	void writeAgente() {
		Agente agente = new Agente("bbb");
		int res = DataManager.add(agente);
		assertTrue(res > 0);
	}
	
	@Test
	void writeBanca() {
		Banca banca = new Banca("bbb", "ccc");
		int res = DataManager.add(banca);
		assertTrue(res > 0);
	}
	
	/*@Test
	void writeVettore() {
		
	}*/
	
	@Test 
	void writeCliente() {
		Cliente cliente = new Cliente("a003");
		cliente.setDataUltimaFattura(LocalDate.now());
		cliente.setDataInizioPlafond(LocalDate.now());
		Pagamento p = new Pagamento("1111");
		Vettore v = new Vettore("vettore");
		Agente a = new Agente("agente");
		
		cliente.setPagamento(p);
		cliente.setVettore(v);
		cliente.setAgente(a);
		
		int res1 = DataManager.add(a);
		assertTrue(res1 > 0);
		int res2 = DataManager.add(v);
		assertTrue(res2 > 0);
		int res3 = DataManager.add(p);
		assertTrue(res3 > 0);
		int res4 = DataManager.add(cliente);
		assertTrue(res4 > 0);
	}
	
	@Test
	void writeCausaleMagazzino() {
		CausaleMagazzino cm1 = new CausaleMagazzino("1", "a");
		CausaleMagazzino cm2 = new CausaleMagazzino("2", "b");
		CausaleMagazzino cm3 = new CausaleMagazzino("3", "c");
		CausaleMagazzino cm4 = new CausaleMagazzino("4", "d");
		int res1 = DataManager.add(cm1);
		assertTrue(res1 > 0);
		int res2 = DataManager.add(cm2);
		assertTrue(res2 > 0);
		int res3 = DataManager.add(cm3);
		assertTrue(res3 > 0);
		int res4 = DataManager.add(cm4);
		assertTrue(res4 > 0);		
	}
	
	@Test
	void writeUtente() {
		Utente u = new Utente("a003");
		u.setRagioneSociale("a003_ragione");
		u.setDataNascita(LocalDateTime.of(1979, 1, 5, 5, 2));
		u.setPartitaIVA("a003_partitaiva");
		int res = DataManager.add(u);
		assertTrue(res > 0);
	}
	
	@Test 
	void writeIndirizzoGeografico(){
		IndirizzoGeografico ig = new IndirizzoGeografico("a000_indirizzo", "a000");
		ig.setCodiceNazione("c0_nazione");
		ig.setCodiceTipoIndirizzo("c0_tipoindirizzo");
		int res = DataManager.add(ig);
		assertTrue(res > 0);
	}
	
	@Test
	void writeFatturazioneTestata() {
		FatturaTestata ft = new FatturaTestata(2, LocalDate.now(), 1, "a003");
		FatturaTestata ft1 = new FatturaTestata(1, LocalDate.now(), 1, "a001");
		int res1 = DataManager.add(ft);
		assertTrue(res1 > 0);
		int res2 = DataManager.add(ft1);
		assertTrue(res2 > 0);
	}
	
	@Test
	void writeOrdine() {
		Ordine o = new Ordine(1, 2, LocalDate.now(), "ordCodiceCommessaConv", "ordCodiceCUP", "ordCodiceCIG");
		int res = DataManager.add(o);
		assertTrue(res > 0);
	}
}
