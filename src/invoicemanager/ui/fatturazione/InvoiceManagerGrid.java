package invoicemanager.ui.fatturazione;

import java.io.IOException;

import invoicemanager.controller.fatturazione.Controller;
import invoicemanager.controller.fatturazione.RiepilogoTestataController;
import invoicemanager.controller.fatturazione.TabViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class InvoiceManagerGrid extends GridPane {
	public static RiepilogoTestataController riepilogoTestataController;
	public static TabViewController tabViewController;

	public InvoiceManagerGrid(Controller controller) {
		
		try {
			FXMLLoader riepilogoTestataLoader = new FXMLLoader(getClass().getClassLoader().getResource("RiepilogoTestata.fxml"));
			GridPane riepilogoTestata = (GridPane) riepilogoTestataLoader.load();
			riepilogoTestataController = riepilogoTestataLoader.getController();
			this.add(riepilogoTestata, 0, 0);
			
			FXMLLoader tabViewLoader = new FXMLLoader(getClass().getClassLoader().getResource("TabView.fxml"));
			TabPane tabView = (TabPane) tabViewLoader.load();
			tabViewController = tabViewLoader.getController();
			this.add(tabView, 0, 1);
			
			HBox footerView = FXMLLoader.load(getClass().getClassLoader().getResource("FooterView.fxml"));
			this.add(footerView, 0, 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
