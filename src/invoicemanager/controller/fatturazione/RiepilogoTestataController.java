package invoicemanager.controller.fatturazione;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.ui.fatturazione.converter.ClienteConverter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class RiepilogoTestataController implements Initializable {
	@FXML
	private Button button_anagrafica;
	@FXML
	private Button button_decodifica;
	@FXML
	private ComboBox<Cliente> combobox_clienti;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<Cliente> oClientiId = FXCollections.observableArrayList(
				DataManager.loadCliente().stream()
				  .collect(Collectors.toList())
				);
		combobox_clienti.setItems(oClientiId);
		combobox_clienti.setConverter(new ClienteConverter());
	}
}
