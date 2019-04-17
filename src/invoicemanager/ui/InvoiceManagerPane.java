package invoicemanager.ui;

import invoicemanager.ui.controller.Controller;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class InvoiceManagerPane extends BorderPane {
	
	public InvoiceManagerPane(Controller controller, Stage stage) {
		this.setTop(new InvoiceManagerMenu());
		
		this.setCenter(new InvoiceManagerGrid(controller));
	}
}
