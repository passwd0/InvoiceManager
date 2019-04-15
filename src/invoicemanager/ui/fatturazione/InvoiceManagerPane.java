package invoicemanager.ui.fatturazione;

import invoicemanager.ui.controller.fatturazione.Controller;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class InvoiceManagerPane extends BorderPane {
	
	public InvoiceManagerPane(Controller controller, Stage stage) {
		this.setTop(new InvoiceManagerMenu());
		
		this.setCenter(new ScrollContainerGrid(controller, stage));
	}
}
