package invoicemanager.ui.controller;

import java.net.URL;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.Allegato;
import invoicemanager.model.ArticoloMagazzino;
import invoicemanager.model.CausaleMagazzino;
import invoicemanager.model.Cliente;
import invoicemanager.model.FatturaDettaglio;
import invoicemanager.model.FatturaTestata;
import invoicemanager.model.IndirizzoGeografico;
import invoicemanager.ui.InvoiceManagerGrid;
import invoicemanager.ui.model.TableCorpo;
import invoicemanager.utils.Utils;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FooterViewController implements Initializable {
	@FXML
    private Button button_conferma;

    @FXML
    private Button button_prelievodaordinare;

    @FXML
    private TextField textfield_anno;

    @FXML
    private TextField textfield_n;

    @FXML
    private Button button_pulisci;

    @FXML
    private Button button_esci;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
    void button_conferma_onAction(ActionEvent event) {
		Cliente cliente = InvoiceManagerGrid.riepilogoTestataController.combobox_cliente.getValue();
        if (cliente == null) {
                Controller.warning("Attenzione", "Fattura Testata", "Inserire un cliente");
                return;
        }
        String codiceClienteFatturazione = cliente.getCodiceCliente();
        int sezionale = InvoiceManagerGrid.riepilogoTestataController.combobox_sezionale.getValue();
        if (sezionale < 0) {
                Controller.warning("Attenzione", "Fattura Testata", "Inserire un sezionale");
                return;
        }
        int numeroFatturazione = -1;
        try {
                numeroFatturazione = Integer.parseInt(InvoiceManagerGrid.riepilogoTestataController.textfield_fattura.getText());
        } catch (Exception e) {
                Controller.warning("Attenzione", "Fattura Testata", "Inserire un numero di fatturazione");
                return;
        }
        String dataFatturaS = InvoiceManagerGrid.riepilogoTestataController.textfield_fattura_data.getText();
        Date dataFattura;
        try {
                dataFattura = Utils.fromString(dataFatturaS);
        } catch(ParseException e) {
                Controller.warning("Attenzione", "Fattura Testata", "Inserire una data di fatturazione");
                return;
        }
        
        ObservableList<TableCorpo> oTableCorpo = InvoiceManagerGrid.tabViewController.oTableCorpo;
        if (oTableCorpo == null || oTableCorpo.isEmpty()) {
        	Controller.warning("Attenzione", "Fattura Dettaglio", "Inserire almeno una riga fattura");
        	return;
        }
        FatturaTestata fatturaTestata = new FatturaTestata(numeroFatturazione, dataFattura, sezionale, codiceClienteFatturazione);
        
        
//      fatturaTestata.setCodiceEsenzioneIva();
        fatturaTestata.setCodiceAgente(InvoiceManagerGrid.tabViewController.label_agente.getText());
        CausaleMagazzino causaleMagazzino = InvoiceManagerGrid.riepilogoTestataController.combobox_causale.getValue();
        if (causaleMagazzino != null) {
                fatturaTestata.setCodiceCausale(causaleMagazzino.getCodiceCausaleMagazzino());
//                fatturaTestata.setCodiceCausalePrelievi(causaleMagazzino.get);
        }
//        private float percentualeSconto;
//    	private float percentualeScontoPagamento;
        String percentualeProvvigioneS = InvoiceManagerGrid.tabViewController.textfield_percprovcliente.getText();
        try {
        	 float percentualeProvvigione = Float.parseFloat(percentualeProvvigioneS);
        	 fatturaTestata.setPercentualeProvvigione(percentualeProvvigione);
        } catch (NumberFormatException e) {
        	Controller.error("Errore", "Fattura Testata", "Inserire una percentuale provvigione cliente");
            return;
        }
        	
    	
//    	private String descrizione;
    	fatturaTestata.setIndicatoreAddebitoBolli(InvoiceManagerGrid.tabViewController.checkbox_bolli.isSelected());
    	fatturaTestata.setIndicatoreAddebitoSpeseIncasso(InvoiceManagerGrid.tabViewController.checkbox_spese.isSelected());
//    	private boolean indicatoreScaricoMagazzino;
    	String codiceListinoS = InvoiceManagerGrid.tabViewController.textfield_listino.getText();
    	try {
    		int codiceListino = Integer.parseInt(codiceListinoS);
    		fatturaTestata.setCodiceListino(codiceListino);
    	} catch (NumberFormatException e) {
    		Controller.error("Errore", "Fattura Testata", "Inserire un codice listino");
            return;
    	}
    	fatturaTestata.setCodiceResa(InvoiceManagerGrid.tabViewController.label_resa.getText());
    	fatturaTestata.setCodiceVettore(InvoiceManagerGrid.tabViewController.label_vettore.getText());
//    	private boolean indicatoreFatturaAccompagnatoria;
    	fatturaTestata.setCodicePagamento(InvoiceManagerGrid.tabViewController.label_pagamento.getText());
    	fatturaTestata.setCodiceBanca(InvoiceManagerGrid.tabViewController.label_banca.getText());
    	fatturaTestata.setCodiceImballo(InvoiceManagerGrid.tabViewController.label_imballo.getText());
//    	private float pesoColli;
//    	private float numeroColli;
//    	private float acconto;
    	fatturaTestata.setCodiceDivisa(InvoiceManagerGrid.tabViewController.combobox_divisa.getValue());
//    	String cambio = InvoiceManagerGrid.tabViewController.combobox_cambio.getValue();
//    	private String codiceClienteSpedizione;
//    	private String nomeSpedizione;				//note dell'indirizzo di spedizione
    	IndirizzoGeografico indirizzoGeograficoSpedizione = InvoiceManagerGrid.tabViewController.combobox_codicespedizione.getValue();
    	if (indirizzoGeograficoSpedizione != null) {
    		fatturaTestata.setIndirizzoSpedizione(indirizzoGeograficoSpedizione.getCodiceIndirizzo());
    		fatturaTestata.setCapSpedizione(indirizzoGeograficoSpedizione.getCap());
    		fatturaTestata.setCittaSpedizione(indirizzoGeograficoSpedizione.getCitta());
    		fatturaTestata.setProvinciaSpedizione(indirizzoGeograficoSpedizione.getProvincia());
    		fatturaTestata.setCodiceNazioneSpedizione(indirizzoGeograficoSpedizione.getCodiceNazione());
    	}
    	fatturaTestata.setNote(InvoiceManagerGrid.tabViewController.textarea_note.getText());
//    	private boolean indicatoreFatturazioneDifferita;
//    	private boolean indicatoreEmail;
//    	private boolean indicatorePa;
//    	private float speseTrasporto;
//    	private float speseImballo;
//    	private float speseIncasso;
//    	private float speseBolli;
//    	private float omaggi;
//    	private float totalePagato;
//    	private Date dataScadenza;
//    	private float importoScadenza;
//    	private List<Allegato> allegati;	
    	DataManager.add(fatturaTestata);
    	
    	/* Fattura Dettaglio */
    	int count = 0;
    	for (TableCorpo tb : oTableCorpo) {
	    	FatturaDettaglio fatturaDettaglio = new FatturaDettaglio(numeroFatturazione, dataFattura, count, tb.getCodiceArticolo(), tb.getQuantita(), tb.getPrezzo());
	    	DataManager.add(fatturaDettaglio);
	    	count++;
    	}
    	
    	Controller.info("Conferma", "Fattura Testata", "La fattura e' stata inserita");
    	InvoiceManagerGrid.riepilogoTestataController.textfield_fattura.setText(
        		String.valueOf(DataManager.loadFatturaTestata().stream()
        				.filter(f -> f.getSezionale() == InvoiceManagerGrid.riepilogoTestataController.combobox_sezionale.getValue())
        				.collect(Collectors.toList()).size()));
    }

    @FXML
    void button_esci_onAction(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void button_prelievodaordinare_onAction(ActionEvent event) {

    }

    @FXML
    void button_pulisci_onAction(ActionEvent event) {
    	InvoiceManagerGrid.tabViewController.cleanTestata();
    	InvoiceManagerGrid.tabViewController.cleanCorpo();
    }

}
