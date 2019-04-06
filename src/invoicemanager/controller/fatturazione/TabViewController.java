package invoicemanager.controller.fatturazione;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.ArticoloMagazzino;
import invoicemanager.model.fatturazione.DdtTestata;
import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.model.fatturazione.Magazzino;
import invoicemanager.model.fatturazione.Ordine;
import invoicemanager.model.fatturazione.UnitaMisura;
import invoicemanager.ui.fatturazione.converter.CodiceSpedizioneConverter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
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
    private TextField textfield_codicespedizione;

    @FXML
    private ComboBox<IndirizzoGeografico> combobox_codicespedizione;

    @FXML
    private ComboBox<String> combobox_localitaspedizione;

    @FXML
    private ComboBox<String> combobox_nazionespedizione;

    @FXML
    private Label label_pagamento;

    @FXML
    private Label label_banca;

    @FXML
    private Label label_divisa;

    @FXML
    private Label label_vettore;

    @FXML
    private Label label_agente;

    @FXML
    private Label label_resa;

    @FXML
    private Label label_imballo;

    @FXML
    private Label label_esiva;

    @FXML
    private Label label_lingua;

    @FXML
    private CheckBox checkbox_bolli;

    @FXML
    private CheckBox checkbox_spese;

    @FXML
    private CheckBox checkbox_lotti;

    @FXML
    private TextField textfield_rif;

    @FXML
    private TextField textfield_idfiliale;

    @FXML
    private TextField textfield_ordinen_del;

    @FXML
    private TextField textfield_bollandel;

    @FXML
    private ComboBox<Ordine> combobox_ordinen;

    @FXML
    private ComboBox<DdtTestata> combobox_bollan;

    @FXML
    private TextField textfield_copie;

    @FXML
    private TextField textfield_listino;

    @FXML
    private ComboBox<Magazzino> combobox_magazzino;

    @FXML
    private ComboBox<?> combobox_divisa;

    @FXML
    private TextField textfield_quantita;

    @FXML
    private TextField textfield_descraggiuntiva;

    @FXML
    private TextField textfield_scontopag;

    @FXML
    private TextField textfield_divisa;

    @FXML
    private ComboBox<ArticoloMagazzino> combobox_articolo;

    @FXML
    private ComboBox<UnitaMisura> combobox_um;

    @FXML
    private TextField textfield_percpro;

    @FXML
    private Spinner<Integer> spinner_iva;

    @FXML
    private Spinner<Integer> spinner_controparti;

    @FXML
    private TextArea textarea_note;

    @FXML
    private ComboBox<?> combobox_algiorno;

    @FXML
    private ComboBox<?> combobox_cambio;

    @FXML
    private TextField textfield_netto;

    @FXML
    private TextField textfield_scontoart;

    @FXML
    private Button button_inserisci;

    @FXML
    private Button button_modifica;

    @FXML
    private Button button_pulisciriga;

    @FXML
    private Button button_eliminariga;

    @FXML
    private Button button_noteriga;

    @FXML
    private Button button_bento;

    @FXML
    private Button button_colonne;

    @FXML
    private TextField textfield_merce;

    @FXML
    private TextField textfield_spese;

    @FXML
    private TextField textfield_imposte;

    @FXML
    private TextField textfield_fattura;

    @FXML
    private TextField textfield_trasportoimballo;

    @FXML
    private TextField textfield_iva;

    @FXML
    private TextField textfield_spesebanca;

    @FXML
    private TextField textfield_bolli;

    @FXML
    private Label label_acconto;

    @FXML
    private Label label_ritenuta;

    @FXML
    private Label label_totalefattura;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<IndirizzoGeografico> oIndirizzoGeografico = FXCollections.observableArrayList(
				DataManager.loadIndirizzoGeografico().stream()
				.collect(Collectors.toList())
				);
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
	
	public void set_textfield_scontocliente(String scontocliente) {
		textfield_scontocliente.setText(scontocliente);
	}
	
	public void set_label_pagamento(String pagamento) {
		label_pagamento.setText(pagamento);
	}
	
	public void set_label_vettore(String vettore) {
		label_vettore.setText(vettore);
	}
	
	public void set_label_agente(String agente) {
		label_agente.setText(agente);
	}
	
	public void set_label_banca(String banca) {
		label_banca.setText(banca);
	}
	
	public void set_label_resa(String resa) {
		label_resa.setText(resa);
	}
	
	public void set_label_imballo(String imballo) {
		label_imballo.setText(imballo);
	}
	//-------------------------- da finire (label/textfield) -------------------------------------
	
	
	
	//--------------------------------------------------------------------------
	
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
