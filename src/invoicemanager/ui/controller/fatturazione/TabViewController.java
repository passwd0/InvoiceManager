package invoicemanager.ui.controller.fatturazione;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.ArticoloMagazzino;
import invoicemanager.model.fatturazione.DdtTestata;
import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.model.fatturazione.Magazzino;
import invoicemanager.model.fatturazione.OrdineTestata;
import invoicemanager.model.fatturazione.StatoAvanzamento;
import invoicemanager.model.fatturazione.UnitaMisura;
import invoicemanager.ui.fatturazione.converter.CodiceSpedizioneConverter;
import invoicemanager.ui.fatturazione.converter.DdtTestataConverter;
import invoicemanager.ui.fatturazione.converter.OrdineTestataConverter;
import invoicemanager.utils.Utils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    public Label label_ragionesociale;

    @FXML
    public Label label_indirizzo;

    @FXML
    public Label label_nazione;

    @FXML
    public Label label_localita;

    @FXML
    public Label label_partitaiva;

    @FXML
    public TextField textfield_percprovcliente;

    @FXML
    public TextField textfield_scontocliente;

    @FXML
    public Button button_nuovanazspedizione;

    @FXML
    public Button button_nuovalocspedizione;

    @FXML
    public Button button_indirizzispedizione;

    @FXML
    public TextField textfield_capspedizione;

    @FXML
    public TextField textfield_provinciaspedizione;

    @FXML
    public TextField textfield_indirizzospedizione;

    @FXML
    public TextField textfield_codicespedizione;

    @FXML
    public ComboBox<IndirizzoGeografico> combobox_codicespedizione;

    @FXML
    public ComboBox<String> combobox_localitaspedizione;

    @FXML
    public ComboBox<String> combobox_nazionespedizione;

    @FXML
    public Label label_pagamento;

    @FXML
    public Label label_banca;

    @FXML
    public Label label_divisa;

    @FXML
    public Label label_vettore;

    @FXML
    public Label label_agente;

    @FXML
    public Label label_resa;

    @FXML
    public Label label_imballo;

    @FXML
    public Label label_esiva;

    @FXML
    public Label label_lingua;

    @FXML
    public CheckBox checkbox_bolli;

    @FXML
    public CheckBox checkbox_spese;

    @FXML
    public CheckBox checkbox_lotti;

    @FXML
    public TextField textfield_rif;

    @FXML
    public TextField textfield_iddest;

    @FXML
    public TextField textfield_ordinendel;

    @FXML
    public TextField textfield_bollandel;

    @FXML
    public ComboBox<OrdineTestata> combobox_ordinen;

    @FXML
    public ComboBox<DdtTestata> combobox_bollan;

    @FXML
    public TextField textfield_copie;

    @FXML
    public TextField textfield_listino;

    @FXML
    public ComboBox<Magazzino> combobox_magazzino;

    @FXML
    public ComboBox<?> combobox_divisa;

    @FXML
    public TextField textfield_quantita;

    @FXML
    public TextField textfield_descraggiuntiva;

    @FXML
    public TextField textfield_scontopag;

    @FXML
    public TextField textfield_divisa;

    @FXML
    public ComboBox<ArticoloMagazzino> combobox_articolo;

    @FXML
    public ComboBox<UnitaMisura> combobox_um;

    @FXML
    public TextField textfield_percpro;

    @FXML
    public Spinner<Integer> spinner_iva;

    @FXML
    public Spinner<Integer> spinner_controparti;

    @FXML
    public TextArea textarea_note;

    @FXML
    public ComboBox<?> combobox_algiorno;

    @FXML
    public ComboBox<?> combobox_cambio;

    @FXML
    public TextField textfield_netto;

    @FXML
    public TextField textfield_scontoart;

    @FXML
    public Button button_inserisci;

    @FXML
    public Button button_modifica;

    @FXML
    public Button button_pulisciriga;

    @FXML
    public Button button_eliminariga;

    @FXML
    public Button button_noteriga;

    @FXML
    public Button button_bento;

    @FXML
    public Button button_colonne;

    @FXML
    public TextField textfield_merce;

    @FXML
    public TextField textfield_spese;

    @FXML
    public TextField textfield_imposte;

    @FXML
    public TextField textfield_fattura;

    @FXML
    public TextField textfield_trasportoimballo;

    @FXML
    public TextField textfield_iva;

    @FXML
    public TextField textfield_spesebanca;

    @FXML
    public TextField textfield_bolli;

    @FXML
    public Label label_acconto;

    @FXML
    public Label label_ritenuta;

    @FXML
    public Label label_totalefattura;
    
    public ObservableList<DdtTestata> oDdtTestata;
    public ObservableList<OrdineTestata> oOrdineTestata;
    public ObservableList<IndirizzoGeografico> oIndirizzoGeograficoSpedizione;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		oIndirizzoGeograficoSpedizione = FXCollections.observableArrayList(
				DataManager.loadIndirizzoGeografico().stream()
				.collect(Collectors.toList()));
		combobox_codicespedizione.setItems(oIndirizzoGeograficoSpedizione);
		combobox_codicespedizione.setConverter(new CodiceSpedizioneConverter());
		
		oOrdineTestata = FXCollections.observableArrayList(
				DataManager.loadOrdineTestata().stream()
				.filter(o -> o.getStatoAvanzamento() == StatoAvanzamento.DAINVIARE)
				.collect(Collectors.toList()));
		combobox_ordinen.setItems(oOrdineTestata);
		combobox_ordinen.setConverter(new OrdineTestataConverter());
		
		oDdtTestata = FXCollections.observableArrayList(
				DataManager.loadDdtTestata().stream()
				.filter(d -> d.getStatoAvanzamento() == StatoAvanzamento.DAINVIARE)
				.collect(Collectors.toList()));
		combobox_bollan.setItems(oDdtTestata);
		combobox_bollan.setConverter(new DdtTestataConverter());
		
		combobox_localitaspedizione.setItems(FXCollections.observableArrayList(Utils.listaLocalita));
		combobox_nazionespedizione.setItems(FXCollections.observableArrayList(Utils.listaNazioni));
	}

	void set_label_ragionesociale(String ragionesociale) {
		if (ragionesociale != null)
			label_ragionesociale.setText(ragionesociale);
	}

	void set_label_indirizzo(String indirizzo) {
		if (indirizzo == null)
			indirizzo = "";
		label_indirizzo.setText(indirizzo);
	}

	void set_label_localita(String localita) {
		if (localita != null)
			label_localita.setText(localita);
	}

	void set_label_nazione(String nazione) {
		if (nazione != null)
			label_nazione.setText(nazione);
	}

	public void set_label_partitaiva(String partitaIVA) {
		if (partitaIVA != null)
			label_partitaiva.setText(partitaIVA);
	}

	public void set_textfield_percprovcliente(String percentualeProvvigioneAgente) {
		if (percentualeProvvigioneAgente != null)
			textfield_percprovcliente.setText(percentualeProvvigioneAgente);
	}

	public void set_textfield_scontocliente(String scontocliente) {
		if (scontocliente != null)
			textfield_scontocliente.setText(scontocliente);
	}

	public void set_label_pagamento(String pagamento) {
		if (pagamento != null)
			label_pagamento.setText(pagamento);
	}

	public void set_label_vettore(String vettore) {
		if (vettore != null)
			label_vettore.setText(vettore);
	}

	public void set_label_agente(String agente) {
		if (agente != null)
			label_agente.setText(agente);
	}

	public void set_label_banca(String banca) {
		if (banca != null)
			label_banca.setText(banca);
	}

	public void set_label_resa(String resa) {
		if (resa != null)
			label_resa.setText(resa);
	}

	public void set_label_imballo(String imballo) {
		if (imballo != null)
			label_imballo.setText(imballo);
	}

	public void set_label_divisa(String divisa) {
		if (divisa != null)
			label_divisa.setText(divisa);
	}

	public void set_label_esiva(String esIva) {
		if (esIva != null)
			label_esiva.setText(esIva);
	}

	public void set_label_lingua(String lingua) {
		if (lingua != null)
			label_lingua.setText(lingua);
	}
	
	public void set_textfield_iddest(String idDestinazioneXML) {
		if (idDestinazioneXML != null)
			textfield_iddest.setText(idDestinazioneXML);
	}

	@FXML
	public void combobox_codicespedizione_onAction(Event e) {
//		IndirizzoGeografico indirizzoGeografico = combobox_codicespedizione.getValue();
//		if (indirizzoGeografico != null) {
//			textfield_indirizzospedizione.setText(indirizzoGeografico.getCodiceIndirizzo());
//			combobox_localitaspedizione.setItems(FXCollections.observableArrayList(indirizzoGeografico.getCitta()));
//			combobox_localitaspedizione.setValue(indirizzoGeografico.getCitta());
//			combobox_nazionespedizione.setItems(FXCollections.observableArrayList(indirizzoGeografico.getCodiceNazione()));
//			combobox_nazionespedizione.setValue(indirizzoGeografico.getCodiceNazione());
//			textfield_provinciaspedizione.setText(indirizzoGeografico.getProvincia());
//			textfield_capspedizione.setText(indirizzoGeografico.getCap());
//		}
	}

	@FXML
	public void combobox_ordinen_onAction(ActionEvent event) {
		OrdineTestata ordineTestata = combobox_ordinen.getValue();
		textfield_ordinendel.setText(
				ordineTestata != null ? ordineTestata.getDataOrdine().format(Utils.formatterData): "");
	}
	
	@FXML
	public void combobox_bollan_onAction(ActionEvent event) {
		DdtTestata ddtTestata = combobox_bollan.getValue();
		textfield_bollandel.setText(
				ddtTestata != null? ddtTestata.getDataDDT().format(Utils.formatterData) : "");
	}
}
