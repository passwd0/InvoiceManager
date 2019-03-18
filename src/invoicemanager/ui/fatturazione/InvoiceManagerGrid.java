package invoicemanager.ui.fatturazione;

import java.io.IOException;

import invoicemanager.controller.fatturazione.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class InvoiceManagerGrid extends GridPane {

	public InvoiceManagerGrid(Controller controller) {
		
		this.add(new RiepilogoTestata(controller), 0, 0);
		
        try {
			StackPane rootContainer = FXMLLoader.load(getClass().getClassLoader().getResource("InvoiceManagerStackPane.fxml"));
			this.add(rootContainer, 0, 1);
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
