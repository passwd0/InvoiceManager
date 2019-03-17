package invoicemanager.ui.fatturazione;

import invoicemanager.controller.fatturazione.Controller;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class InvoiceManagerPane extends BorderPane {
	
	public InvoiceManagerPane(Controller controller, Stage stage) {
		this.setTop(new InvoiceManagerMenu());
		
		this.setCenter(new InvoiceManagerGrid(controller));
	}
}
