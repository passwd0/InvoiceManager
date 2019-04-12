package invoicemanager.ui.fatturazione;

import invoicemanager.ui.controller.fatturazione.Controller;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class ScrollContainerGrid extends ScrollPane {
	
	public ScrollContainerGrid(Controller controller, Stage stage) {
		//this.getChildren().add(new InvoiceManagerPane(controller, stage));
		this.setFitToWidth(true);
		this.computePrefHeight(500);
		this.setContent(new InvoiceManagerGrid(controller));
	}
}
