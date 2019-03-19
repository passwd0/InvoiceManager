package invoicemanager.ui.fatturazione;

import java.io.IOException;

import invoicemanager.controller.fatturazione.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class InvoiceManagerGrid extends GridPane {

	public InvoiceManagerGrid(Controller controller) {
		
		//this.add(new RiepilogoTestata(controller), 0, 0);
		try {
			GridPane riepilogoTestata = FXMLLoader.load(getClass().getClassLoader().getResource("RiepilogoTestata.fxml"));
			this.add(riepilogoTestata, 0, 0);
			TabPane rootContainer = FXMLLoader.load(getClass().getClassLoader().getResource("MainView.fxml"));
			this.add(rootContainer, 0, 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
