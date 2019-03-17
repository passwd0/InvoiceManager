package invoicemanager.ui.fatturazione;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import invoicemanager.controller.fatturazione.Controller;
import invoicemanager.controller.fatturazione.DataManager;
import invoicemanager.model.fatturazione.CausaleMagazzino;
import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.FatturaTestata;
import invoicemanager.ui.fatturazione.converter.CausaleMagazzinoConverter;
import invoicemanager.ui.fatturazione.converter.ClienteConverter;
import invoicemanager.ui.fatturazione.converter.FatturaTestataConverter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class RiepilogoTestata extends GridPane {
	private Controller controller;
	// ---- Clienti
	private Label lClienti;
	private Button bAnagrafica;
	private Button bDecodifica;
	private ComboBox<Cliente> cbClientiId;
	// ---- Fattura
	private Label lFattura;
	private ComboBox<FatturaTestata> cbFatturaId;
	private Label lDataFatturaPrefix;
	private Label lDataFattura;
	// ---- Causale default
	private Label lCausale;
	private ComboBox<CausaleMagazzino> cbCausaleId;
	private Label lCausaleDesc;
	private Button bCausali;
	
	public RiepilogoTestata(Controller controller) {
		this.controller = controller;
		
		// ---- Clienti
		lClienti = new Label("Clienti: ");
		bAnagrafica = new Button("Anagrafica");
		bDecodifica = new Button("Decodifica");
		ObservableList<Cliente> oClientiId = FXCollections.observableArrayList(
				DataManager.loadCliente().stream()
				  .collect(Collectors.toList())
				);
		cbClientiId = new ComboBox<>(oClientiId);
		cbClientiId.setConverter(new ClienteConverter());
		
		this.add(lClienti, 0, 0);
		this.add(bAnagrafica, 0, 1);
		this.add(bDecodifica, 0, 2);
		this.add(cbClientiId, 1, 1, 1, 2);
		
		// ---- Fattura
		lFattura = new Label("Fattura: ");
		ObservableList<FatturaTestata> oFattureId = FXCollections.observableArrayList(
				DataManager.loadFatturaTestata().stream()
				.collect(Collectors.toList())
				);
		cbFatturaId = new ComboBox<>(oFattureId);
		cbFatturaId.setConverter(new FatturaTestataConverter());
		lDataFatturaPrefix = new Label("del: ");
		lDataFattura = new Label("data");//(cbFatturaId.getSelectionModel().getSelectedItem().getDataFattura().toString());
		
		this.add(lFattura, 2, 0);
		this.add(cbFatturaId, 2, 1, 1, 2);
		this.add(lDataFatturaPrefix, 3, 1, 1, 2);
		this.add(lDataFattura, 4, 1, 1, 2);
		
		// ---- Causale default
		lCausale = new Label("Causale default: ");
		ObservableList<CausaleMagazzino> oCausaleId = FXCollections.observableArrayList(
				DataManager.loadCausaleMagazzino().stream()
				.collect(Collectors.toList())
				);
		cbCausaleId = new ComboBox<>(oCausaleId);
		cbCausaleId.setConverter(new CausaleMagazzinoConverter());
		lCausaleDesc = new Label("descrizione");
		bCausali = new Button("Causali");
		
		this.add(lCausale, 5, 0);
		this.add(cbCausaleId, 5, 1, 1, 2);
		this.add(lCausaleDesc, 6, 1, 1, 2);
		this.add(bCausali, 7, 1, 1, 2);
	}
}
