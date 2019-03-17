package invoicemanager.ui.fatturazione;

import invoicemanager.controller.fatturazione.Controller;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class InvoiceManagerGrid extends GridPane {

	public InvoiceManagerGrid(Controller controller) {
		
		this.add(new RiepilogoTestata(controller), 0, 0);
	}
	
	
}
