package test.persistence.fatturazione;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.Pagamento;
import invoicemanager.model.fatturazione.Vettore;
import invoicemanager.ui.controller.fatturazione.DataManager;

public class TestWriteSql {
	
//	@BeforeEach
//	void setup() {	}
	
//	@Test
//	void writeAgente() {
//		Agente agente = new Agente("bbb");
//		DataManager.add(agente);
//		//assertEquals(1, DataManager.loadAgente().size());
//	}
//	
//	@Test
//	void writeBanca() {
//		Banca banca = new Banca("bbb", "ccc");
//		DataManager.add(banca);
//		//assertEquals(1, DataManager.loadBanca().size());
//	}
//	
//	@Test
//	void writeVettore() {
//		
//	}
//	
//	@Test 
//	void writeCliente() {
//		Cliente cliente = new Cliente("a003");
//		cliente.setCodiceDestinatarioXml("codiceDestinatarioXML");
//		cliente.setDataUltimaFattura(LocalDate.now());
//		cliente.setDataInizioPlafond(LocalDate.now());
//		Pagamento p = new Pagamento("1111");
//		Vettore v = new Vettore("vettore");
//		Agente a = new Agente("agente");
//		
//		cliente.setPagamento(p);
//		cliente.setVettore(v);
//		cliente.setAgente(a);
//		
//		DataManager.add(a);
//		DataManager.add(v);
//		DataManager.add(p);
//		DataManager.add(cliente);
//		
//		cliente = new Cliente("a001");
//		cliente.setCodiceDestinatarioXml("codiceDestinatarioXML2");
//		cliente.setDataUltimaFattura(LocalDate.now());
//		cliente.setDataInizioPlafond(LocalDate.now());
//		p = new Pagamento("2222");
//		v = new Vettore("vettore2");
//		a = new Agente("agente2");
//		
//		cliente.setPagamento(p);
//		cliente.setVettore(v);
//		cliente.setAgente(a);
//		
//		DataManager.add(a);
//		DataManager.add(v);
//		DataManager.add(p);
//		DataManager.add(cliente);
//	
//		cliente = new Cliente("b001");
//		cliente.setCodiceDestinatarioXml("codiceDestinatarioXML3");
//		cliente.setDataUltimaFattura(LocalDate.now());
//		cliente.setDataInizioPlafond(LocalDate.now());
//		p = new Pagamento("3333");
//		v = new Vettore("vettore3");
//		a = new Agente("agente3");
//		
//		cliente.setPagamento(p);
//		cliente.setVettore(v);
//		cliente.setAgente(a);
//		
//		DataManager.add(a);
//		DataManager.add(v);
//		DataManager.add(p);
//		DataManager.add(cliente);
//		//assertEquals(2,  DataManager.loadCliente().size());
//	}
//	
//	@Test
//	void writeCausaleMagazzino() {
//		CausaleMagazzino cm1 = new CausaleMagazzino("1", "a");
//		CausaleMagazzino cm2 = new CausaleMagazzino("2", "b");
//		CausaleMagazzino cm3 = new CausaleMagazzino("3", "c");
//		CausaleMagazzino cm4 = new CausaleMagazzino("4", "d");
//		DataManager.add(cm1);
//		DataManager.add(cm2);
//		DataManager.add(cm3);
//		DataManager.add(cm4);
//		
//		//assertEquals(4,  DataManager.loadCausaleMagazzino().size());
//	}
//	
//	@Test
//	void writeUtente() {
//		Utente u = new Utente("a003");
//		u.setRagioneSociale("a003_ragione");
//		u.setDataNascita(LocalDateTime.of(1979, 1, 5, 5, 2));
//		u.setPartitaIVA("a003_partitaiva");
//		DataManager.add(u);
//		//assertEquals(3, DataManager.loadUtente().size());
//	}
//	
//	@Test 
//	void writeIndirizzoGeografico(){
//		IndirizzoGeografico ig = new IndirizzoGeografico("a000_indirizzo", "a000");
//		ig.setCodiceNazione("c0_nazione");
//		ig.setCodiceTipoIndirizzo("c0_tipoindirizzo");
//		DataManager.add(ig);
//		ig = new IndirizzoGeografico("a003_indirizzo", "a003");
//		ig.setCodiceNazione("c3_nazione");
//		ig.setCodiceTipoIndirizzo("c3_tipoindirizzo");
//		DataManager.add(ig);
//		//assertEquals(2, DataManager.loadIndirizzoGeografico().size());
//	}
//	
//	@Test
//	void writeFatturazioneTestata() {
//		FatturaTestata ft = new FatturaTestata(2, LocalDate.now(), 1, "a003");
//		FatturaTestata ft1 = new FatturaTestata(1, LocalDate.now(), 1, "a001");
//		DataManager.add(ft);
//		DataManager.add(ft1);
//	}
//	
//	@Test
//	void writeOrdine() {
//		Ordine o = new Ordine(1, 2, LocalDate.now(), "ordCodiceCommessaConv", "ordCodiceCUP", "ordCodiceCIG");
//		DataManager.add(o);
//	}
//	
//	@Test
//	void writeDdtTestata() {
//		DdtTestata ddtTestata = new DdtTestata(123, LocalDateTime.now());
//		ddtTestata.setDataCaricamento(LocalDateTime.now());
//		ddtTestata.setDataFattura(LocalDate.now());
//		ddtTestata.setCodiceClienteFatturazione("a003");
//		DataManager.add(ddtTestata);
//		
//		ddtTestata = new DdtTestata(135, LocalDateTime.now());
//		ddtTestata.setDataFattura(LocalDate.now());
//		ddtTestata.setDataCaricamento(LocalDateTime.now());
//		ddtTestata.setCodiceClienteFatturazione("a002");
//		DataManager.add(ddtTestata);
//		
//		ddtTestata = new DdtTestata(171, LocalDateTime.now());
//		ddtTestata.setDataFattura(LocalDate.now());
//		ddtTestata.setDataCaricamento(LocalDateTime.now());
//		ddtTestata.setCodiceClienteFatturazione("a001");
//		DataManager.add(ddtTestata);
//	}
//	
//	@Test
//	void writeOrdineTestata() {
//		OrdineTestata ordineTestata = new OrdineTestata(1, LocalDate.now());
//		ordineTestata.setCodiceClienteFatturazione("a003");
//		ordineTestata.setDataConsegna(LocalDate.now());
//		DataManager.add(ordineTestata);
//		
//		ordineTestata = new OrdineTestata(2, LocalDate.now());
//		ordineTestata.setCodiceClienteFatturazione("a003");
//		ordineTestata.setDataConsegna(LocalDate.now());
//		ordineTestata.setStatoAvanzamento(StatoAvanzamento.INVIATA);
//		DataManager.add(ordineTestata);
//		
//		ordineTestata = new OrdineTestata(3, LocalDate.now());
//		ordineTestata.setCodiceClienteFatturazione("a001");
//		ordineTestata.setDataConsegna(LocalDate.now());
//		DataManager.add(ordineTestata);
//		
//		ordineTestata = new OrdineTestata(4, LocalDate.now());
//		ordineTestata.setCodiceClienteFatturazione("a002");
//		DataManager.add(ordineTestata);
//	}
//	
//	@Test 
//	void writeContatto() {
//		Contatto contatto = new Contatto("a003", TipoDettaglio.TELEFONO, "041123");
//		DataManager.add(contatto);
//		contatto = new Contatto("a003", TipoDettaglio.EMAIL, "aaa.g@gmail.com");
//		DataManager.add(contatto);
//		contatto = new Contatto("a003", TipoDettaglio.FAX, "faaaax");
//		DataManager.add(contatto);
//		contatto = new Contatto("a003", TipoDettaglio.FAX, "fax2");
//		DataManager.add(contatto);
//		contatto = new Contatto("a003", TipoDettaglio.FAX, "faax3");
//		DataManager.add(contatto);
//	}
}
