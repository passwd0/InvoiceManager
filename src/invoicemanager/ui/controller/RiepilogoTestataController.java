package invoicemanager.ui.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.CausaleMagazzino;
import invoicemanager.model.Cliente;
import invoicemanager.model.DdtTestata;
import invoicemanager.model.FatturaTestata;
import invoicemanager.model.IndirizzoGeografico;
import invoicemanager.model.OrdineTestata;
import invoicemanager.model.StatoAvanzamento;
import invoicemanager.ui.InvoiceManagerGrid;
import invoicemanager.ui.converter.CausaleMagazzinoConverter;
import invoicemanager.ui.converter.ClienteConverter;
import invoicemanager.utils.Utils;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RiepilogoTestataController implements Initializable {
    @FXML
    private Button button_anagrafica;

    @FXML
    private ComboBox<Integer> combobox_sezionale;

    @FXML
    private ComboBox<CausaleMagazzino> combobox_causale;

    @FXML
    private Button button_decodifica;

    @FXML
    public ComboBox<Cliente> combobox_cliente;

    @FXML
    private TextField textfield_fattura;

    @FXML
    private TextField textfield_fattura_data;

    @FXML
    private TextField textfield_causale;

    @FXML
    private Button button_causali;
    
    public ObservableList<Cliente> oClienti;
    private ObservableList<Integer> oSezionali;
    private ObservableList<CausaleMagazzino> oCausali;
//    private Cliente selectedCliente;
    
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		oClienti = FXCollections.observableArrayList();
		combobox_cliente.setItems(oClienti);
		combobox_cliente.setConverter(new ClienteConverter());
		
		textfield_fattura_data.setText(LocalDate.now().format(Utils.formatterData));
		
		oCausali = FXCollections.observableArrayList();
		combobox_causale.setItems(oCausali);
		combobox_causale.setConverter(new CausaleMagazzinoConverter());
 
		oSezionali = FXCollections.observableArrayList();
		combobox_sezionale.setItems(oSezionali);
        combobox_sezionale.setValue(1);
        
        textfield_fattura.setText(
        		String.valueOf(DataManager.loadFatturaTestata().stream()
        				.filter(f -> f.getSezionale() == combobox_sezionale.getValue())
        				.collect(Collectors.toList()).size()));
	}
	
	@FXML
	public void combobox_cliente_onShowing(Event event) {
		oClienti.setAll(DataManager.loadCliente());
	}
	@FXML
	public void combobox_sezionale_onShowing(Event event) {
		oSezionali.setAll(Utils.listaSezionali);
	}
	@FXML
	public void combobox_causale_onShowing(Event event) {
		oCausali.setAll(DataManager.loadCausaleMagazzino());
	}
	
	@FXML
	public void combobox_causale_onAction(ActionEvent e) {
		textfield_causale.setText(combobox_causale.getValue().getDescrizione());
	}
	
	@FXML
	public void combobox_cliente_onAction(ActionEvent e) {
		InvoiceManagerGrid.tabViewController.cleanTestata();
		InvoiceManagerGrid.tabViewController.cleanCorpo();

		Cliente cliente = combobox_cliente.getValue();
		if (cliente == null) {
			Controller.alert("Attenzione", "Cliente", "Il cliente selezionato non esiste");
			return;
		}
	
		//TESTATA
		InvoiceManagerGrid.tabViewController.label_partitaiva.setText(cliente.getPartitaIVA());
		InvoiceManagerGrid.tabViewController.label_ragionesociale.setText(cliente.getDescrizione());

		IndirizzoGeografico indirizzoGeograficoDefault = DataManager.loadIndirizzoGeografico().stream()
				.filter(ig -> ig.isIndicatoreIndirizzoDefault() && ig.getCodiceConto().equals(cliente.getCodiceCliente()))
				.findFirst().orElse(null);
		if (indirizzoGeograficoDefault != null) {
			InvoiceManagerGrid.tabViewController.label_indirizzo.setText(indirizzoGeograficoDefault.getCodiceIndirizzo());
			InvoiceManagerGrid.tabViewController.label_localita.setText(indirizzoGeograficoDefault.getCitta());
			InvoiceManagerGrid.tabViewController.label_nazione.setText(indirizzoGeograficoDefault.getCodiceNazione());
		}
		List<IndirizzoGeografico> indirizziGeografici = DataManager.loadIndirizzoGeografico().stream()
				.filter(ig -> ig.getCodiceConto().equals(cliente.getCodiceCliente()))
				.collect(Collectors.toList());
		if (indirizziGeografici.size() > 0) {
				InvoiceManagerGrid.tabViewController.textfield_indirizzospedizione.setText(indirizzoGeograficoDefault.getCodiceIndirizzo());
				InvoiceManagerGrid.tabViewController.oCodiceSpedizione.setAll(indirizzoGeograficoDefault);
				InvoiceManagerGrid.tabViewController.combobox_codicespedizione.setValue(indirizzoGeograficoDefault);
				InvoiceManagerGrid.tabViewController.textfield_localitaspedizione.setText(indirizzoGeograficoDefault.getCitta());
				InvoiceManagerGrid.tabViewController.textfield_nazionespedizione.setText(indirizzoGeograficoDefault.getCodiceNazione());
				InvoiceManagerGrid.tabViewController.textfield_provinciaspedizione.setText(indirizzoGeograficoDefault.getProvincia());
				InvoiceManagerGrid.tabViewController.textfield_capspedizione.setText(indirizzoGeograficoDefault.getCap());
		}
			
		InvoiceManagerGrid.tabViewController.label_partitaiva.setText(cliente.getPartitaIVA());
		InvoiceManagerGrid.tabViewController.textfield_percprovcliente.setText(String.valueOf(cliente.getPercentualeProvvigioneAgente()));
		InvoiceManagerGrid.tabViewController.textfield_scontocliente.setText(String.valueOf(cliente.getScontoLegatoProvvigioniAgente()));
		
		InvoiceManagerGrid.tabViewController.label_pagamento.setText(cliente.getCodicePagamento());
		InvoiceManagerGrid.tabViewController.label_vettore.setText(cliente.getCodiceVettore());
		InvoiceManagerGrid.tabViewController.label_agente.setText(cliente.getCodiceAgente());
		InvoiceManagerGrid.tabViewController.label_banca.setText(cliente.getCodiceBanca());
		InvoiceManagerGrid.tabViewController.label_resa.setText(cliente.getCodiceResaMerce());
		InvoiceManagerGrid.tabViewController.label_imballo.setText(cliente.getCodiceImballo());
		InvoiceManagerGrid.tabViewController.label_divisa.setText(cliente.getCodiceDivisa());
		InvoiceManagerGrid.tabViewController.label_esiva.setText(cliente.getCodiceIva());
		InvoiceManagerGrid.tabViewController.label_lingua.setText(cliente.getCodiceLingua());
		
		InvoiceManagerGrid.tabViewController.checkbox_bolli.setSelected(cliente.isIndicatoreAddebitoSpeseBolli());
		InvoiceManagerGrid.tabViewController.textfield_iddest.setText(cliente.getCodiceDestinatarioXml());
		
		InvoiceManagerGrid.tabViewController.oOrdineTestata.setAll(DataManager.loadOrdineTestata().stream()
				.filter(ot -> ot.getCodiceClienteFatturazione().equals(cliente.getCodiceCliente()))
				.collect(Collectors.toList()));
		if (InvoiceManagerGrid.tabViewController.oOrdineTestata.size() > 0)
			InvoiceManagerGrid.tabViewController.combobox_ordinen.setValue(InvoiceManagerGrid.tabViewController.oOrdineTestata.get(0));

		InvoiceManagerGrid.tabViewController.oDdtTestata.setAll(DataManager.loadDdtTestata().stream()
				.filter(dt -> dt.getCodiceClienteFatturazione().equals(cliente.getCodiceCliente()))
				.collect(Collectors.toList()));
		if (InvoiceManagerGrid.tabViewController.oDdtTestata.size() > 0)
			InvoiceManagerGrid.tabViewController.combobox_bollan.setValue(InvoiceManagerGrid.tabViewController.oDdtTestata.get(0));
		
		InvoiceManagerGrid.tabViewController.textfield_copie.setText(String.valueOf(cliente.getNumeroCopieFattura()));

		
		//CORPO
		InvoiceManagerGrid.tabViewController.combobox_divisa.setValue(cliente.getCodiceDivisa());
		InvoiceManagerGrid.tabViewController.combobox_cambio.setValue(cliente.getCodiceDivisa());
	}
	
	@FXML
    void combobox_sezionale_onAction(ActionEvent event) {
		List<FatturaTestata> listFatturaTestata = DataManager.loadFatturaTestata();
		textfield_fattura.setText(
        		String.valueOf(listFatturaTestata.stream().filter(f -> f.getSezionale() == combobox_sezionale.getValue())
                .collect(Collectors.toList()).size()));
    }
	
	@FXML
    private void textfield_fattura_onAction(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			//caricare tutti i campi
		}
    }
	
	@FXML
	private void button_anagrafica_onAction(ActionEvent event) {
		if (combobox_cliente.getValue() != null) {
			try {
				FXMLLoader anagraficaLoader = new FXMLLoader(getClass().getClassLoader().getResource("Anagrafica.fxml"));
				AnchorPane anagrafica = (AnchorPane) anagraficaLoader.load();
				AnagraficaController anagraficaController = anagraficaLoader.getController();		
				
				Stage stage = new Stage();
				stage.setTitle("Anagrafica");
	
				Scene scene = new Scene(anagrafica, 1020, 505, Color.ALICEBLUE);
				stage.setResizable(false);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@FXML
	private void combobox_cliente_onKeyReleased(KeyEvent event) {
		oClienti.setAll(DataManager.loadCliente().stream().filter(c -> c.getCodiceCliente().contains(combobox_cliente.getEditor().getText())).collect(Collectors.toList()));
	}
}