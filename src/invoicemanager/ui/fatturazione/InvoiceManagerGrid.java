package invoicemanager.ui.fatturazione;

import java.io.IOException;

import invoicemanager.controller.fatturazione.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class InvoiceManagerGrid extends GridPane {

	public InvoiceManagerGrid(Controller controller) {
		
		//this.add(new RiepilogoTestata(controller), 0, 0);
		try {
			GridPane riepilogoTestata = FXMLLoader.load(getClass().getClassLoader().getResource("RiepilogoTestata.fxml"));
			this.add(riepilogoTestata, 0, 0);
			TabPane tabView = FXMLLoader.load(getClass().getClassLoader().getResource("TabView.fxml"));
			this.add(tabView, 0, 1);
			HBox footerView = FXMLLoader.load(getClass().getClassLoader().getResource("FooterView.fxml"));
			this.add(footerView, 0, 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
