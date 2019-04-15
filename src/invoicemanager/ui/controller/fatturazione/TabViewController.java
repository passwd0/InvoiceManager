package invoicemanager.ui.controller.fatturazione;

import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.ArticoloMagazzino;
import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.DdtTestata;
import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.model.fatturazione.Magazzino;
import invoicemanager.model.fatturazione.OrdineTestata;
import invoicemanager.model.fatturazione.StatoAvanzamento;
import invoicemanager.model.fatturazione.UnitaMisura;
import invoicemanager.ui.fatturazione.InvoiceManagerGrid;
import invoicemanager.ui.fatturazione.converter.ArticoloMagazzinoConverter;
import invoicemanager.ui.fatturazione.converter.CodiceSpedizioneConverter;
import invoicemanager.ui.fatturazione.converter.DdtTestataConverter;
import invoicemanager.ui.fatturazione.converter.MagazzinoConverter;
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
import javafx.util.StringConverter;

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
    private TextField textfield_magazzino;

    @FXML
    public ComboBox<String> combobox_divisa;

    @FXML
    public TextField textfield_quantita;

    @FXML
    public TextField textfield_descr;
    
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
    public TextField textfield_algiorno;

    @FXML
    public ComboBox<String> combobox_cambio;

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

    //TESTATA
    public ObservableList<DdtTestata> oDdtTestata;
    public ObservableList<OrdineTestata> oOrdineTestata;
    public ObservableList<IndirizzoGeografico> oIndirizzoGeograficoSpedizione;
    //CORPO
    public ObservableList<Magazzino> oMagazzino;		//sono relativi all'utente che sta fatturando quindi pressoche' immodificabili
    private ObservableList<String> oDivisa;				//sono per tutti uguali quindi immodificabili
    public ObservableList<ArticoloMagazzino> oArticolo;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//TESTATA
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
		
		//CORPO
		oMagazzino = FXCollections.observableArrayList(DataManager.loadMagazzino());
		combobox_magazzino.setItems(oMagazzino);
		combobox_magazzino.setConverter(new MagazzinoConverter());
		
		oDivisa = FXCollections.observableArrayList(Arrays.asList("EUR", "USD", "AAA", "BBB"));
		combobox_divisa.setItems(oDivisa);
		
		textfield_algiorno.setText(LocalDate.now().format(Utils.formatterData));
		
		combobox_cambio.setItems(oDivisa);
		
		oArticolo = FXCollections.observableArrayList(DataManager.loadArticoloMagazzino());
		combobox_articolo.setItems(oArticolo);
		combobox_articolo.setConverter(new ArticoloMagazzinoConverter());
	}
	
	@FXML
	void combobox_articolo_onAction(ActionEvent event) {
		ArticoloMagazzino articolo = combobox_articolo.getValue();
//		textfield_descr.setText(articolo.getDescrizione());
//		textfield_descraggiuntiva.setText(articolo);
		textfield_scontoart.setText(String.valueOf(articolo.getSconto()));
		textarea_note.setText(articolo.getNote());
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

	public void clean() {
		label_ragionesociale.setText("");
		label_indirizzo.setText("");
		label_localita.setText("");
		label_nazione.setText("");
		label_partitaiva.setText("");
		textfield_percprovcliente.setText("");
		textfield_scontocliente.setText("");

		combobox_codicespedizione.getSelectionModel().clearSelection();
		combobox_localitaspedizione.getSelectionModel().clearSelection();
		combobox_nazionespedizione.getSelectionModel().clearSelection();

		textfield_indirizzospedizione.setText("");
		textfield_provinciaspedizione.setText("");
		textfield_capspedizione.setText("");

		label_pagamento.setText("");
		label_vettore.setText("");
		label_agente.setText("");
		label_banca.setText("");
		label_resa.setText("");
		label_imballo.setText("");
		label_divisa.setText("");
		label_esiva.setText("");
		label_lingua.setText("");
		label_vettore.setText("");
		label_vettore.setText("");
	}
	
	@FXML
    public void combobox_magazzino_onAction(Event event) {
		Magazzino magazzino = combobox_magazzino.getValue();
		textfield_magazzino.setText(magazzino.getDescrizione());
    }
}
