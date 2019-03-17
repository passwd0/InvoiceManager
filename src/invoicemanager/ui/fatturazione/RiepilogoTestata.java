package invoicemanager.ui.fatturazione;

import java.sql.SQLException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import invoicemanager.controller.fatturazione.Controller;
import invoicemanager.controller.fatturazione.DataManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class RiepilogoTestata extends BorderPane {
	private Controller controller;
	private Label lClienti;
	private Button bAnagrafica;
	private Button bDecodifica;
	private ComboBox<String> cId;
	
	public RiepilogoTestata(Controller controller) {
		this.controller = controller;
		
		try {
			ObservableList<String> oId = FXCollections.observableArrayList(
					DataManager.loadCliente().stream()
					  .flatMap(c -> Stream.of(c.getCodiceCliente()))
					  .collect(Collectors.toList())
					);
			cId = new ComboBox<>(oId);
		} catch (ClassNotFoundException | SQLException e) {
			Controller.alert("Errore", "Errore di lettura", "Nessun risultato dalla tabella Clienti");
			e.printStackTrace();
		}
	}
}
