package invoicemanager.controller.fatturazione;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.ui.fatturazione.converter.CodiceSpedizioneConverter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TabViewController implements Initializable {
	@FXML
    private Label label_ragionesociale;

    @FXML
    private Label label_indirizzo;

    @FXML
    private Label label_nazione;

    @FXML
    private Label label_localita;

    @FXML
    private Label label_partitaiva;

    @FXML
    private TextField textfield_percprovcliente;

    @FXML
    private TextField textfield_scontocliente;

    @FXML
    private Button button_nuovanazspedizione;

    @FXML
    private Button button_nuovalocspedizione;

    @FXML
    private Button button_indirizzispedizione;

    @FXML
    private TextField textfield_capspedizione;

    @FXML
    private TextField textfield_provinciaspedizione;

    @FXML
    private TextField textfield_indirizzospedizione;

    @FXML
    private ComboBox<IndirizzoGeografico> combobox_codicespedizione;

    @FXML
    private ComboBox<String> combobox_localitaspedizione;

    @FXML
    private ComboBox<String> combobox_nazionespedizione;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<IndirizzoGeografico> oIndirizzoGeografico = FXCollections.observableArrayList(
				DataManager.loadIndirizzoGeografico().stream()
				.collect(Collectors.toList())
				);
		System.out.println(oIndirizzoGeografico.get(0).getCodiceConto());
		combobox_codicespedizione.setItems(oIndirizzoGeografico);
		combobox_codicespedizione.setConverter(new CodiceSpedizioneConverter());
	}
	
	void set_label_ragionesociale(String ragionesociale) {
		label_ragionesociale.setText(ragionesociale);
	}
	
	void set_label_indirizzo(String indirizzo) {
		label_indirizzo.setText(indirizzo);
	}
	
	void set_label_localita(String localita) {
		label_localita.setText(localita);
	}
	
	void set_label_nazione(String nazione) {
		label_nazione.setText(nazione);
	}

	public void set_label_partitaiva(String partitaIVA) {
		label_partitaiva.setText(partitaIVA);
		
	}
	
	public void set_textfield_percprovcliente(String percentualeProvvigioneAgente) {
		textfield_percprovcliente.setText(percentualeProvvigioneAgente);
	}
	
	public void set_textfield_scontocliente(String scontoLegatoProvvigioniAgente) {
		textfield_scontocliente.setText(scontoLegatoProvvigioniAgente);
	}
	
	public void combobox_codicespedizione_pressed(Event e) {
		IndirizzoGeografico indirizzoGeografico = combobox_codicespedizione.getSelectionModel().getSelectedItem();
		textfield_indirizzospedizione.setText(indirizzoGeografico.getCodiceIndirizzo());
		//combobox_localitaspedizione.setItems(FXCollections.observableArrayList(indirizzoGeografico.getCitta()));
		//combobox_nazionespedizione.setItems(FXCollections.observableArrayList(indirizzoGeografico.getCodiceNazione()));
		combobox_localitaspedizione.setValue(indirizzoGeografico.getCodiceNazione());
		combobox_nazionespedizione.setValue(indirizzoGeografico.getCodiceNazione());
		textfield_provinciaspedizione.setText(indirizzoGeografico.getProvincia());
		textfield_capspedizione.setText(indirizzoGeografico.getCap());
	}
	
}
