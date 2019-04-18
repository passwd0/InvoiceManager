package test.persistence;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import invoicemanager.model.Agente;
import invoicemanager.model.ArticoloMagazzino;
import invoicemanager.model.Banca;
import invoicemanager.model.CausaleMagazzino;
import invoicemanager.model.Cliente;
import invoicemanager.model.Contatto;
import invoicemanager.model.DdtTestata;
import invoicemanager.model.FatturaTestata;
import invoicemanager.model.IndirizzoGeografico;
import invoicemanager.model.ListinoArticolo;
import invoicemanager.model.Magazzino;
import invoicemanager.model.Ordine;
import invoicemanager.model.OrdineTestata;
import invoicemanager.model.Pagamento;
import invoicemanager.model.StatoAvanzamento;
import invoicemanager.model.TipoDettaglio;
import invoicemanager.model.UnitaMisura;
import invoicemanager.model.Utente;
import invoicemanager.model.Vettore;
import invoicemanager.ui.controller.DataManager;

public class TestWriteSql {
	
	//ATTENTION all fail if rows already present in tables
	

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
		cliente.setCodiceDestinatarioXml("codiceDestinatarioXML");
		cliente.setDataUltimaFattura(Date.valueOf(LocalDate.now()));
		cliente.setDataInizioPlafond(Date.valueOf(LocalDate.now()));
		Pagamento p = new Pagamento("1111");
		Vettore v = new Vettore("vettore");
		Agente a = new Agente("agente");
		
		cliente.setPagamento(p);
		cliente.setVettore(v);
		cliente.setAgente(a);
		
		DataManager.add(a);
		DataManager.add(v);
		DataManager.add(p);
		DataManager.add(cliente);
		
		cliente = new Cliente("a001");
		cliente.setCodiceDestinatarioXml("codiceDestinatarioXML2");
		cliente.setDataUltimaFattura(Date.valueOf(LocalDate.now()));
		cliente.setDataInizioPlafond(Date.valueOf(LocalDate.now()));
		p = new Pagamento("2222");
		v = new Vettore("vettore2");
		a = new Agente("agente2");
		
		cliente.setPagamento(p);
		cliente.setVettore(v);
		cliente.setAgente(a);
		
		DataManager.add(a);
		DataManager.add(v);
		DataManager.add(p);
		DataManager.add(cliente);
	
		cliente = new Cliente("b001");
		cliente.setCodiceDestinatarioXml("codiceDestinatarioXML3");
		cliente.setDataUltimaFattura(Date.valueOf(LocalDate.now()));
		cliente.setDataInizioPlafond(Date.valueOf(LocalDate.now()));
		p = new Pagamento("3333");
		v = new Vettore("vettore3");
		a = new Agente("agente3");
		
		cliente.setPagamento(p);
		cliente.setVettore(v);
		cliente.setAgente(a);
		
		DataManager.add(a);
		DataManager.add(v);
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
		u.setDataNascita(Timestamp.valueOf(LocalDateTime.of(1979, 1, 5, 5, 2)));
		u.setPartitaIVA("a003_partitaiva");
		DataManager.add(u);
		//assertEquals(3, DataManager.loadUtente().size());
	}
	
	@Test 
	void writeIndirizzoGeografico(){
		IndirizzoGeografico ig = new IndirizzoGeografico("a000_indirizzo", "a001");
		ig.setCodiceNazione("nazione_b");
		ig.setCodiceTipoIndirizzo("c0_tipoindirizzo");
		DataManager.add(ig);
		ig = new IndirizzoGeografico("a003_indirizzo", "a003");
		ig.setCodiceNazione("nazione_a");
		ig.setCodiceTipoIndirizzo("c3_tipoindirizzo");
		DataManager.add(ig);
		//assertEquals(2, DataManager.loadIndirizzoGeografico().size());
	}
	
	@Test
	void writeFatturazioneTestata() {
		FatturaTestata ft = new FatturaTestata(2, Date.valueOf(LocalDate.now()), 1, "a003");
		FatturaTestata ft1 = new FatturaTestata(1, Date.valueOf(LocalDate.now()), 1, "a001");
		DataManager.add(ft);
		DataManager.add(ft1);
	}

	@Test
	void writeDdtTestata() {
		DdtTestata ddtTestata = new DdtTestata(123, Timestamp.valueOf(LocalDateTime.now()));
		ddtTestata.setDataCaricamento(Timestamp.valueOf(LocalDateTime.now()));
		ddtTestata.setDataFattura(Date.valueOf(LocalDate.now()));
		ddtTestata.setCodiceClienteFatturazione("a003");
		DataManager.add(ddtTestata);
		
		ddtTestata = new DdtTestata(135, Timestamp.valueOf(LocalDateTime.now()));
		ddtTestata.setDataFattura(Date.valueOf(LocalDate.now()));
		ddtTestata.setDataCaricamento(Timestamp.valueOf(LocalDateTime.now()));
		ddtTestata.setCodiceClienteFatturazione("a002");
		DataManager.add(ddtTestata);
		
		ddtTestata = new DdtTestata(171, Timestamp.valueOf(LocalDateTime.now()));
		ddtTestata.setDataFattura(Date.valueOf(LocalDate.now()));
		ddtTestata.setDataCaricamento(Timestamp.valueOf(LocalDateTime.now()));
		ddtTestata.setCodiceClienteFatturazione("a001");
		DataManager.add(ddtTestata);
	}
	
	@Test
	void writeOrdineTestata() {
		OrdineTestata ordineTestata = new OrdineTestata(1, Date.valueOf(LocalDate.now()));
		ordineTestata.setCodiceClienteFatturazione("a003");
		ordineTestata.setDataConsegna(Date.valueOf(LocalDate.now()));
		DataManager.add(ordineTestata);
		
		ordineTestata = new OrdineTestata(2, Date.valueOf(LocalDate.now()));
		ordineTestata.setCodiceClienteFatturazione("a003");
		ordineTestata.setDataConsegna(Date.valueOf(LocalDate.now()));
		ordineTestata.setStatoAvanzamento(StatoAvanzamento.INVIATA);
		DataManager.add(ordineTestata);
		
		ordineTestata = new OrdineTestata(3, Date.valueOf(LocalDate.now()));
		ordineTestata.setCodiceClienteFatturazione("a001");
		ordineTestata.setDataConsegna(Date.valueOf(LocalDate.now()));
		DataManager.add(ordineTestata);
		
		ordineTestata = new OrdineTestata(4, Date.valueOf(LocalDate.now()));
		ordineTestata.setCodiceClienteFatturazione("a002");
		DataManager.add(ordineTestata);
	}
	
	@Test 
	void writeContatto() {
		Contatto contatto = new Contatto("a003", TipoDettaglio.TELEFONO, "041123");
		DataManager.add(contatto);
		contatto = new Contatto("a003", TipoDettaglio.EMAIL, "aaa.g@gmail.com");
		DataManager.add(contatto);
		contatto = new Contatto("a003", TipoDettaglio.FAX, "faaaax");
		DataManager.add(contatto);
		contatto = new Contatto("a003", TipoDettaglio.FAX, "fax2");
		DataManager.add(contatto);
		contatto = new Contatto("a003", TipoDettaglio.FAX, "faax3");
		DataManager.add(contatto);
	}

	@Test
	void writeOrdine() {
		Ordine o = new Ordine(1, 2, Date.valueOf(LocalDate.now()), "ordCodiceCommessaConv", "ordCodiceCUP", "ordCodiceCIG");
		int res = DataManager.add(o);
		assertTrue(res > 0);
	}
	
	@Test
	void writeMagazzino() {
		Magazzino m = new Magazzino("m003_1");
		int res = DataManager.add(m);
		assertTrue(res > 0);
		m = new Magazzino("m003_2");
		res = DataManager.add(m);
		assertTrue(res > 0);
	}
	
	@Test
	void writeArticolo() {
		ArticoloMagazzino am = new ArticoloMagazzino("a2", "articolo2");
		am.setSconto(8.0F);
		am.setNumeroColli(40);
		am.setPercentualeProvvigione(20F);
		am.setNote("asd\nseconda\terza");
		int res = DataManager.add(am);
		assertTrue(res > 0);
	}
	
	@Test
	void writeListino() {
		ListinoArticolo la = new ListinoArticolo("a0", 1, "EUR");
		la.setPrezzo(40);
		DataManager.add(la);
		
		la = new ListinoArticolo("a0", 2, "EUR");
		la.setPrezzo(60);
		DataManager.add(la);
		
		la = new ListinoArticolo("a1", 0, "EUR");
		la.setPrezzo(12);
		DataManager.add(la);
	}
	
	@Test
	void writeUnitaMisura() {
		UnitaMisura um = new UnitaMisura("litri");
		DataManager.add(um);
		um = new UnitaMisura("grammi");
		DataManager.add(um);
		um = new UnitaMisura("metro");
		DataManager.add(um);
	}
}
