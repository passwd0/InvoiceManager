package invoicemanager.controller.fatturazione;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.CausaleMagazzino;
import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.FatturaTestata;
import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.model.fatturazione.Utente;
import invoicemanager.ui.fatturazione.InvoiceManagerGrid;
import invoicemanager.ui.fatturazione.converter.CausaleMagazzinoConverter;
import invoicemanager.ui.fatturazione.converter.ClienteConverter;
import invoicemanager.utils.Utils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

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
    private ComboBox<Cliente> combobox_cliente;

    @FXML
    private TextField textfield_fattura;

    @FXML
    private TextField textfield_fattura_data;

    @FXML
    private TextField textfield_causale;

    @FXML
    private Button button_causali;

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ObservableList<Cliente> oClientiId = FXCollections.observableArrayList(
				DataManager.loadCliente().stream()
				  .collect(Collectors.toList())
				);
		combobox_cliente.setItems(oClientiId);
		combobox_cliente.setConverter(new ClienteConverter());
		
		textfield_fattura_data.setText(LocalDate.now().format(Utils.formatterData));
		
		ObservableList<CausaleMagazzino> oCausaliId = FXCollections.observableArrayList(
				DataManager.loadCausaleMagazzino().stream()
				  .collect(Collectors.toList())
				);
		combobox_causale.setItems(oCausaliId);
		combobox_causale.setConverter(new CausaleMagazzinoConverter());
		
 
		combobox_sezionale.setItems(FXCollections.observableArrayList(Arrays.asList(1, 2, 3, 4, 5)));
        combobox_sezionale.setValue(1);
        List<FatturaTestata> listFatturaTestata = DataManager.loadFatturaTestata();
        textfield_fattura.setText(
        		String.valueOf(listFatturaTestata.stream().filter(f -> f.getSezionale() == combobox_sezionale.getValue())
                .collect(Collectors.toList()).size())
        		);
	}
	
	@FXML
	public void combobox_causale_pressed(ActionEvent e) {
		textfield_causale.setText(combobox_causale.getSelectionModel().getSelectedItem().getDescrizione());
	}
	
	@FXML
	public void combobox_cliente_pressed(ActionEvent e) {
		Cliente cliente = combobox_cliente.getSelectionModel().getSelectedItem();
		if (cliente != null) {
			InvoiceManagerGrid.tabViewController.set_textfield_percprovcliente(String.valueOf(cliente.getPercentualeProvvigioneAgente()));
			InvoiceManagerGrid.tabViewController.set_textfield_scontocliente(String.valueOf(cliente.getScontoLegatoProvvigioniAgente()));
			//----------------------------- da finire -----------------------------------------------
		}
		Utente utente = DataManager.loadUtente().stream()
				.filter(u -> u.getCodiceUtente().equals(
						cliente.getCodiceCliente()))
				.findFirst().orElse(null);
		
		if (utente != null) {
			InvoiceManagerGrid.tabViewController.set_label_ragionesociale(utente.getRagioneSociale());
			InvoiceManagerGrid.tabViewController.set_label_partitaiva(utente.getPartitaIVA());
		}
		
		IndirizzoGeografico indirizzoGeografico = DataManager.loadIndirizzoGeografico().stream()
				.filter(ig -> ig.getCodiceConto().equals(
						utente.getCodiceUtente()))
				.findFirst().orElse(null);
		if (indirizzoGeografico != null) {
			InvoiceManagerGrid.tabViewController.set_label_indirizzo(indirizzoGeografico.getCodiceIndirizzo());
			InvoiceManagerGrid.tabViewController.set_label_localita(indirizzoGeografico.getCitta());
			InvoiceManagerGrid.tabViewController.set_label_nazione(indirizzoGeografico.getCodiceNazione());
		}
	}
	
	@FXML
    void combobox_sezionale_pressed(ActionEvent event) {
		List<FatturaTestata> listFatturaTestata = DataManager.loadFatturaTestata();
		textfield_fattura.setText(
        		String.valueOf(listFatturaTestata.stream().filter(f -> f.getSezionale() == combobox_sezionale.getSelectionModel().getSelectedItem())
                .collect(Collectors.toList()).size())
        		);
    }
	
	@FXML
    private void textfield_fattura_pressed(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			//caricare tutti i campi
		}
    }
}
