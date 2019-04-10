package invoicemanager.ui.controller.fatturazione;

import java.net.URL;
import java.util.ResourceBundle;

import invoicemanager.ui.fatturazione.InvoiceManagerGrid;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FooterViewController implements Initializable {
	@FXML
    private Button button_conferma;

    @FXML
    private Button button_prelievodaordinare;

    @FXML
    private TextField textfield_anno;

    @FXML
    private TextField textfield_n;

    @FXML
    private Button button_pulisci;

    @FXML
    private Button button_esci;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
    void button_conferma_onAction(ActionEvent event) {
		
    }

    @FXML
    void button_esci_onAction(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void button_prelievodaordinare_onAction(ActionEvent event) {

    }

    @FXML
    void button_pulisci_onAction(ActionEvent event) {
    	InvoiceManagerGrid.tabViewController.clean();
    }

}
