package invoicemanager.ui.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.ArticoloMagazzino;
import invoicemanager.model.Cliente;
import invoicemanager.model.DdtTestata;
import invoicemanager.model.IndirizzoGeografico;
import invoicemanager.model.ListinoArticolo;
import invoicemanager.model.Magazzino;
import invoicemanager.model.OrdineTestata;
import invoicemanager.model.StatoAvanzamento;
import invoicemanager.model.UnitaMisura;
import invoicemanager.ui.InvoiceManagerGrid;
import invoicemanager.ui.converter.ArticoloMagazzinoConverter;
import invoicemanager.ui.converter.CodiceSpedizioneConverter;
import invoicemanager.ui.converter.DdtTestataConverter;
import invoicemanager.ui.converter.ListinoArticoloConverter;
import invoicemanager.ui.converter.LocalitaSpedizioneConverter;
import invoicemanager.ui.converter.MagazzinoConverter;
import invoicemanager.ui.converter.NazioneSpedizioneConverter;
import invoicemanager.ui.converter.OrdineTestataConverter;
import invoicemanager.ui.converter.UnitaMisuraConverter;
import invoicemanager.ui.model.TableCorpo;
import invoicemanager.utils.Utils;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.WindowEvent;

public class TabViewController implements Initializable {
	@FXML
	public Label label_statodocumento;
	
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
    public TextField textfield_localitaspedizione;

    @FXML
    public TextField textfield_nazionespedizione;

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
    public TextField textfield_artquantita;
    
    @FXML
    public ComboBox<ListinoArticolo> combobox_artprezzo;

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
    public ComboBox<UnitaMisura> combobox_unitamisura;

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
    
    @FXML
    private TableView<TableCorpo> table_corpo = new TableView<>();
    
    @FXML
    private TableColumn<TableCorpo, String> table_corpocodice;

    @FXML
    private TableColumn<TableCorpo, String> table_corpodescr;

    @FXML
    private TableColumn<TableCorpo, String> table_corpoquantita;

    @FXML
    private TableColumn<TableCorpo, String> table_corpoprezzo;

    @FXML
    private TableColumn<TableCorpo, String> table_corpounitamisura;

    @FXML
    private TableColumn<TableCorpo, String> table_corposcontocliente;
    
    //TESTATA
    public ObservableList<IndirizzoGeografico> oCodiceSpedizione;
    public ObservableList<DdtTestata> oDdtTestata;
    public ObservableList<OrdineTestata> oOrdineTestata;
    //CORPO
    public ObservableList<Magazzino> oMagazzino;		//sono relativi all'utente che sta fatturando quindi pressoche' immodificabili
    private ObservableList<String> oDivisa;				//sono per tutti uguali quindi immodificabili
    public ObservableList<ArticoloMagazzino> oArticolo;
    public ObservableList<ListinoArticolo> oArticoloPrezzo;
    public ObservableList<UnitaMisura> oUnitaMisura;
    public ObservableList<TableCorpo> oTableCorpo;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		/* TESTATA */
		oCodiceSpedizione = FXCollections.observableArrayList();
		combobox_codicespedizione.setItems(oCodiceSpedizione);
		combobox_codicespedizione.setConverter(new CodiceSpedizioneConverter());
		
		oOrdineTestata = FXCollections.observableArrayList();
		combobox_ordinen.setItems(oOrdineTestata);
		combobox_ordinen.setConverter(new OrdineTestataConverter());

		oDdtTestata = FXCollections.observableArrayList();
		combobox_bollan.setItems(oDdtTestata);
		combobox_bollan.setConverter(new DdtTestataConverter());
		
		/* CORPO */
		oMagazzino = FXCollections.observableArrayList();
		combobox_magazzino.setItems(oMagazzino);
		combobox_magazzino.setConverter(new MagazzinoConverter());
		
		oDivisa = FXCollections.observableArrayList();
		combobox_divisa.setItems(oDivisa);
		
		textfield_algiorno.setText(LocalDate.now().format(Utils.formatterData));
		
		combobox_cambio.setItems(oDivisa);
		
		oArticolo = FXCollections.observableArrayList();
		combobox_articolo.setItems(oArticolo);
		combobox_articolo.setConverter(new ArticoloMagazzinoConverter());
		
		oArticoloPrezzo = FXCollections.observableArrayList();
		combobox_artprezzo.setItems(oArticoloPrezzo);
		combobox_artprezzo.setConverter(new ListinoArticoloConverter());
		
		oUnitaMisura = FXCollections.observableArrayList();
		combobox_unitamisura.setItems(oUnitaMisura);
		combobox_unitamisura.setConverter(new UnitaMisuraConverter());
		
		table_corpocodice.setCellValueFactory(new PropertyValueFactory<TableCorpo, String>("codiceArticolo"));
		table_corpodescr.setCellValueFactory(new PropertyValueFactory<TableCorpo, String>("descrizione"));
		table_corpoquantita.setCellValueFactory(new PropertyValueFactory<TableCorpo, String>("quantita"));
		table_corpoprezzo.setCellValueFactory(new PropertyValueFactory<TableCorpo, String>("prezzo"));
		table_corpounitamisura.setCellValueFactory(new PropertyValueFactory<TableCorpo, String>("unitaMisura"));
		table_corposcontocliente.setCellValueFactory(new PropertyValueFactory<TableCorpo, String>("scontoCliente"));
		oTableCorpo = FXCollections.observableArrayList();
		table_corpo.setItems(oTableCorpo);
	}
	
	/* TESTATA UPDATE */
	@FXML
	void combobox_codicespedizione_onShowing(Event event) {
		Cliente cliente = InvoiceManagerGrid.riepilogoTestataController.combobox_cliente.getValue();
		if (cliente == null) {
			Controller.warning("Attenzione", "Codice Spedizione", "Inserire un cliente esistente per procedere");
			return;
		}
		oCodiceSpedizione.setAll(DataManager.loadIndirizzoGeografico().stream()
				.filter(ig -> ig.getCodiceConto().equals(cliente.getCodiceCliente()))
				.collect(Collectors.toList()));
	}
	@FXML
	void combobox_ordinen_onShowing(Event event) {
		Cliente cliente = InvoiceManagerGrid.riepilogoTestataController.combobox_cliente.getValue();
		if (cliente == null) {
			Controller.warning("Attenzione", "Ordine", "Inserire un cliente esistente per procedere");
			return;
		}
		oOrdineTestata.setAll(
				DataManager.loadOrdineTestata().stream()
				.filter(o -> o.getStatoAvanzamento() == StatoAvanzamento.DAINVIARE && 
						o.getCodiceClienteFatturazione().equals(cliente.getCodiceCliente()))
				.collect(Collectors.toList()));
	}
	@FXML
	void combobox_bollan_onShowing(Event event) {
		Cliente cliente = InvoiceManagerGrid.riepilogoTestataController.combobox_cliente.getValue();
		if (cliente == null) {
			Controller.warning("Attenzione", "Bolla", "Inserire un cliente esistente per procedere");
			return;
		}
		oDdtTestata.setAll(
				DataManager.loadDdtTestata().stream()
				.filter(d -> d.getStatoAvanzamento() == StatoAvanzamento.DAINVIARE && 
						d.getCodiceClienteFatturazione().equals(cliente.getCodiceCliente()))
				.collect(Collectors.toList()));
	}
	
	
	/* CORPO UPDATE */
	@FXML
	void combobox_magazzino_onShowing(Event event) {
		oMagazzino.setAll(DataManager.loadMagazzino());
	}
	@FXML
	void combobox_divisa_onShowing(Event event) {
		oDivisa.setAll(Utils.listaDivise);	//bisognera' mettere un enum oppure una tabella
	}
	@FXML
	void combobox_articolo_onShowing(Event event) {
		oArticolo.setAll(DataManager.loadArticoloMagazzino());
	}
	@FXML
	void combobox_artprezzo_onShowing(Event event) {
		ArticoloMagazzino articolo = combobox_articolo.getValue();
		if (articolo == null) {
			Controller.warning("Attenzione", "Articolo Prezzo", "Inserire un articolo esistente per procedere");
			return;
		}
		oArticoloPrezzo.setAll(articolo.getListiniArticolo());
	}
	@FXML 
	void combobox_unitamisura_onShowing(Event event){
		oUnitaMisura.setAll(DataManager.loadUnitaMisura());
	}
	
	/* TESTATA */
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
		if (ordineTestata != null)
			textfield_ordinendel.setText(Utils.toString(ordineTestata.getDataOrdine()));
	}

	@FXML
	public void combobox_bollan_onAction(ActionEvent event) {
		DdtTestata ddtTestata = combobox_bollan.getValue();
		if (ddtTestata != null)
			textfield_bollandel.setText(Utils.toString(ddtTestata.getDataDDT()));
	}
	
	/* CORPO */
	@FXML
	void combobox_articolo_onAction(ActionEvent event) {
		ArticoloMagazzino articolo = combobox_articolo.getValue();
		if (articolo != null) {
			textfield_descr.setText(articolo.getDescrizione());
//			textfield_descraggiuntiva.setText(articolo);
			oArticoloPrezzo.setAll(articolo.getListiniArticolo());
			if (oArticoloPrezzo.size() > 0)
				combobox_artprezzo.setValue(oArticoloPrezzo.get(0));
			textfield_scontoart.setText(String.valueOf(articolo.getSconto()));
			textarea_note.setText(articolo.getNote());
		}
	}
	@FXML
    public void combobox_magazzino_onAction(ActionEvent event) {
		Magazzino magazzino = combobox_magazzino.getValue();
		if (magazzino != null)
			textfield_magazzino.setText(magazzino.getDescrizione());
    }
	
	@FXML 
	void button_inserisci_onAction(ActionEvent event) {
		ArticoloMagazzino articoloMagazzino = combobox_articolo.getValue();
		float artQuantita = 0;
		float scontoCliente = 0;
		if (articoloMagazzino == null) {
			Controller.error("Errore", "Codice Articolo", "Inserire un codice articolo per inserire un riga");
			return;
		}
		try {
			artQuantita = Float.valueOf(textfield_artquantita.getText());
		} catch (Exception e) {
			Controller.warning("Attenzione", "Articolo Quantita'", "Inserire un numero corretto in Articolo Quantita'");
			return;
		}
		try {
			scontoCliente = Float.valueOf(textfield_scontocliente.getText());
		} catch (Exception e) {
			Controller.warning("Attenzione", "Sconto Cliente'", "Inserire un numero corretto in Sconto Cliente");
			return;
		}
		if (combobox_artprezzo.getValue() == null) {
			Controller.warning("Attenzione", "Prezzo Articolo", "Inserire un prezzo per l'articolo corrente");
			return;
		}
		if (combobox_unitamisura == null) {
			Controller.warning("Attenzione", "Unita di Misura", "Non e' stata inserita alcuna Unita' di Misura");
			return;
		}
		oTableCorpo.add(new TableCorpo(articoloMagazzino.getCodiceArticolo(), textfield_descr.getText(), artQuantita, combobox_artprezzo.getValue().getPrezzo(), combobox_unitamisura.getValue(), scontoCliente));
		cleanCorpoArticolo();
	}
	@FXML
	void button_modifica_onAction(ActionEvent event) {
		TableCorpo rowSelected = table_corpo.getSelectionModel().getSelectedItem();
		if (rowSelected == null) {
			Controller.warning("Attenzione", "Fattura Dettaglio", "Non e' stata selzionata alcuna riga");
			return;
		}
		ArticoloMagazzino articoloSelected = DataManager.loadArticoloMagazzino().stream().filter(a -> a.getCodiceArticolo().equals(rowSelected.getCodiceArticolo())).findFirst().orElse(null);
		if (articoloSelected == null) {
			Controller.warning("Attenzione", "Articolo", "L'articolo selezionato non e' piu' disponibile");
			return;
		}
		combobox_articolo.setValue(articoloSelected);
		textarea_note.setText(articoloSelected.getNote());
		oArticoloPrezzo.setAll(articoloSelected.getListiniArticolo());

		textfield_descr.setText(rowSelected.getDescrizione());
		textfield_descraggiuntiva.setText(rowSelected.getDescrizione());
		textfield_artquantita.setText(String.valueOf(rowSelected.getQuantita()));
		textfield_scontocliente.setText(String.valueOf(rowSelected.getScontoCliente()));
		combobox_artprezzo.setValue(oArticoloPrezzo.stream().filter(x -> x.getPrezzo() == rowSelected.getPrezzo()).findFirst().orElse(null));
		combobox_unitamisura.setValue(oUnitaMisura.stream().filter(um -> um.getCodiceUnitaMisura().equals(rowSelected.getUnitaMisura())).findFirst().orElse(null));
		oTableCorpo.remove(rowSelected);
	}
	@FXML
	void button_eliminariga_onAction(ActionEvent event) {
		TableCorpo element = table_corpo.getSelectionModel().getSelectedItem();
		if (element != null)
			oTableCorpo.remove(element);
	}

	/* CLEANER */
	public void cleanTestata() {
		label_statodocumento.setText("");
		label_ragionesociale.setText("");
		label_indirizzo.setText("");
		label_localita.setText("");
		label_nazione.setText("");
		label_partitaiva.setText("");
		textfield_percprovcliente.clear();
		textfield_scontocliente.clear();
		
		cleanTestataSpedizione();

		label_pagamento.setText("");
		label_vettore.setText("");
		label_agente.setText("");
		label_banca.setText("");
		label_resa.setText("");
		label_imballo.setText("");
		label_divisa.setText("");
		label_esiva.setText("");
		label_lingua.setText("");
		
		oOrdineTestata.clear();
		textfield_ordinendel.clear();
		oDdtTestata.clear();
		textfield_bollandel.clear();
		textfield_copie.clear();
		textfield_listino.clear();
		checkbox_bolli.setSelected(false);
		checkbox_spese.setSelected(false);
		textfield_rif.clear();
		checkbox_lotti.setSelected(false);
		textfield_iddest.clear();
	}
	public void cleanTestataSpedizione() {
		oCodiceSpedizione.clear();
		textfield_codicespedizione.clear();
		textfield_indirizzospedizione.clear();
		textfield_localitaspedizione.clear();
		textfield_provinciaspedizione.clear();
		textfield_capspedizione.clear();
		textfield_nazionespedizione.clear();
	}
	public void cleanCorpo() {
		oMagazzino.clear();
		textfield_magazzino.clear();
		oDivisa.clear();
		textfield_divisa.clear();
		textfield_algiorno.clear();
		cleanCorpoArticolo();
	}
	private void cleanCorpoArticolo() {
		oArticolo.clear();
		textfield_descr.clear();
		textfield_descraggiuntiva.clear();
		textfield_artquantita.clear();
		oArticoloPrezzo.clear();
		oUnitaMisura.clear();
		//spinner_iva
		textfield_scontocliente.clear();
		textfield_scontoart.clear();
		textfield_scontopag.clear();
		textfield_percpro.clear();
		//spinner_controparti
		textarea_note.clear();
		textfield_netto.clear();
	}
}
