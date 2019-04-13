package invoicemanager.ui.controller.fatturazione;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.Contatto;
import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.model.fatturazione.TipoDettaglio;
import invoicemanager.ui.fatturazione.InvoiceManagerGrid;
import invoicemanager.ui.fatturazione.converter.ContattoConverter;
import invoicemanager.utils.Utils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

public class AnagraficaController implements Initializable {
    
	@FXML
    private RadioButton radiobutton_eserciziocorr;

    @FXML
    private RadioButton radiobutton_esercizioanno;

    @FXML
    private ComboBox<Integer> combobox_esercizioanno;

    @FXML
    private Button button_contatti;

    @FXML
    private Button button_nuovo;

    @FXML
    private Button button_decodifica;

    @FXML
    private ComboBox<String> combobox_tipo;

    @FXML
    private CheckBox checkbox_ii;

    @FXML
    private ComboBox<String> combobox_divisa;

    @FXML
    private ComboBox<?> combobox_algiorno;

    @FXML
    private ComboBox<?> combobox_cambio;

    @FXML
    private TextField textfield_ragsociale;

    @FXML
    private TextField textfield_indirizzo;

    @FXML
    private Button button_nuovaloc;

    @FXML
    private Button button_nuovanaz;

    @FXML
    private ComboBox<String> combobox_localita;

    @FXML
    private ComboBox<String> combobox_nazione;

    @FXML
    private TextField textfield_prov;

    @FXML
    private TextField textfield_cap;

    @FXML
    private ComboBox<?> combobox_prefissinazionali;

    @FXML
    private ComboBox<Contatto> combobox_fax;

    @FXML
    private ComboBox<Contatto> combobox_telefoni;

    @FXML
    private ComboBox<Contatto> combobox_email;

    @FXML
    private ComboBox<Contatto> combobox_url;

    @FXML
    private TextField textfield_partitaiva;

    @FXML
    private TextField textfield_codicefiscale;

    @FXML
    private Button button_inserisci;

    @FXML
    private Button button_intrastat;
    
    @FXML
    private TextField textfield_cliente;
    
    private ObservableList<Contatto> oTelefoni;
    private ObservableList<Contatto> oEmail;
    private ObservableList<Contatto> oFax;
    private ObservableList<Contatto> oUrl;
    private Contatto selectedTelefono;
    private Contatto selectedEmail;
    private Contatto selectedFax;
    private Contatto selectedUrl;

    	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Cliente cliente = InvoiceManagerGrid.riepilogoTestataController.combobox_cliente.getValue();
		
		ToggleGroup tg = new ToggleGroup();
		radiobutton_esercizioanno.setToggleGroup(tg);
		radiobutton_eserciziocorr.setToggleGroup(tg);
		combobox_esercizioanno.setItems(FXCollections.observableArrayList(Arrays.asList(2019, 2018, 2017, 2016)));
		textfield_cliente.setText(cliente.getCodiceCliente());
		if (cliente.getTipoCliente() != null) combobox_tipo.setValue(cliente.getTipoCliente().getCodiceTipoCliente());
		
		combobox_divisa.setValue(cliente.getCodiceDivisa());
		
		textfield_ragsociale.setText(cliente.getDescrizione());
		combobox_localita.setItems(FXCollections.observableArrayList(Utils.listaLocalita));
		combobox_nazione.setItems(FXCollections.observableArrayList(Utils.listaNazioni));

		IndirizzoGeografico indirizzoGeograficoDefault = DataManager.loadIndirizzoGeografico().stream()
				.filter(ig -> ig.getCodiceConto().equals(cliente.getCodiceCliente()))
				.filter(ig -> ig.isIndicatoreIndirizzoDefault()).findFirst().orElse(null);
		if (indirizzoGeograficoDefault != null) {
			textfield_indirizzo.setText(indirizzoGeograficoDefault.getCodiceIndirizzo());
			combobox_localita.setValue(indirizzoGeograficoDefault.getCitta());
			combobox_nazione.setValue(indirizzoGeograficoDefault.getCodiceNazione());
			textfield_prov.setText(indirizzoGeograficoDefault.getProvincia());
			textfield_cap.setText(indirizzoGeograficoDefault.getCap());
		}
		combobox_telefoni.setConverter(new ContattoConverter());
		oTelefoni = FXCollections.observableArrayList(cliente.getContatti().stream().
				filter(c -> c.getTipoDettaglio()==TipoDettaglio.TELEFONO)
				.collect(Collectors.toList()));
		if (oTelefoni.size() > 0) {
			selectedTelefono = oTelefoni.get(0);
			combobox_telefoni.setValue(oTelefoni.get(0));
			combobox_telefoni.setItems(oTelefoni);
		}
		combobox_email.setConverter(new ContattoConverter());
		oEmail = FXCollections.observableArrayList(cliente.getContatti().stream().
				filter(c -> c.getTipoDettaglio()==TipoDettaglio.EMAIL)
				.collect(Collectors.toList()));
		if (oEmail.size() > 0) {
			selectedEmail = oEmail.get(0);
			combobox_email.setItems(oEmail);
			combobox_email.setValue(oEmail.get(0));
		}
		combobox_fax.setConverter(new ContattoConverter());
		oFax = FXCollections.observableArrayList(cliente.getContatti().stream().
				filter(c -> c.getTipoDettaglio()==TipoDettaglio.FAX)
				.collect(Collectors.toList()));
		if (oFax.size() > 0) {
			selectedFax = oFax.get(0);
			combobox_fax.setValue(oFax.get(0));
			combobox_fax.setItems(oFax);
		}
		combobox_url.setConverter(new ContattoConverter());
		oUrl = FXCollections.observableArrayList(cliente.getContatti().stream().
				filter(c -> c.getTipoDettaglio()==TipoDettaglio.URL)
				.collect(Collectors.toList()));
		if (oUrl.size() > 0) {
			selectedUrl = oUrl.get(0);
			combobox_url.setItems(oUrl);
			combobox_url.setValue(oUrl.get(0));
		}
	}
	
    @FXML
    void radiobutton_esercizioanno_onAction(ActionEvent event) {
    	combobox_esercizioanno.setDisable(false);
    }
    
    @FXML
    void radiobutton_eserciziocorr_onAction(ActionEvent event) {
    	combobox_esercizioanno.setDisable(true);
    }
    
    @FXML
    void combobox_telefoni_onAction() {
    	if (combobox_telefoni.isFocused() || combobox_telefoni.getValue() != null) {
    		selectedTelefono = combobox_telefoni.getValue();
    	} else
    		combobox_telefoni.setValue(selectedTelefono);
    }
    @FXML
    void combobox_email_onAction() {
    	if (combobox_email.isFocused() || combobox_email.getValue() != null) {
    		selectedEmail = combobox_email.getValue();
    	} else
    		combobox_email.setValue(selectedEmail);
    }
    @FXML
    void combobox_fax_onAction() {
    	if (combobox_fax.isFocused() || combobox_fax.getValue() != null) {
    		selectedFax = combobox_fax.getValue();
    	} else
    		combobox_fax.setValue(selectedFax);
    }
    @FXML
    void combobox_url_onAction() {
    	if (combobox_url.isFocused() || combobox_url.getValue() != null) {
    		selectedUrl = combobox_url.getValue();
    	} else
    		combobox_url.setValue(selectedUrl);
    }
}
