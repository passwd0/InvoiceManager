package invoicemanager.controller.fatturazione;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {
	
	public static void alert(String title, String headerMessage, String contentMessage) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle(title);
		alert.setHeaderText(headerMessage);
		alert.setContentText(contentMessage);
		alert.show();
	}
	
	public boolean testataConferma() {
		return true;
	}
	
	public boolean testataPrelievoDaOrdine() {
		return true;
	}
	
	public boolean Esci() {
		return true;
		//devo salvare?
	}
}
