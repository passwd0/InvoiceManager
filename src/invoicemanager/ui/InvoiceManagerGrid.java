package invoicemanager.ui;

import java.io.IOException;

import invoicemanager.ui.controller.Controller;
import invoicemanager.ui.controller.FooterViewController;
import invoicemanager.ui.controller.RiepilogoTestataController;
import invoicemanager.ui.controller.TabViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class InvoiceManagerGrid extends GridPane {
	public static RiepilogoTestataController riepilogoTestataController;
	public static TabViewController tabViewController;
	public static FooterViewController footerViewController;

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
			
			FXMLLoader footerViewLoader = new FXMLLoader(getClass().getClassLoader().getResource("FooterView.fxml"));
			HBox footerView = (HBox) footerViewLoader.load();
			footerViewController = footerViewLoader.getController();
			this.add(footerView, 0, 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
