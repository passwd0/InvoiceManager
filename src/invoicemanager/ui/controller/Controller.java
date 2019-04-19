package invoicemanager.ui.controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {
	private DataManager dm;
	
	public Controller() {
		dm = new DataManager();
	}
	
	public static void error(String title, String headerMessage, String contentMessage) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle(title);
		alert.setHeaderText(headerMessage);
		alert.setContentText(contentMessage);
		alert.show();
	}
	
	public static void warning(String title, String headerMessage, String contentMessage) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle(title);
		alert.setHeaderText(headerMessage);
		alert.setContentText(contentMessage);
		alert.show();
	}
	
	public static void info(String title, String headerMessage, String contentMessage) {
		Alert alert = new Alert(AlertType.INFORMATION);
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
