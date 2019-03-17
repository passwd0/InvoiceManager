package invoicemanager.ui.fatturazione;

import invoicemanager.controller.fatturazione.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class InvoiceManagerApp extends Application {
	private Controller controller;

	@Override
	public void start(Stage stage) throws Exception {
		controller = new Controller(); // arg: loadAll()
		if (controller == null) {
			Controller.alert("Errore", "Errore nella creazione del controller", "Uscendo");
			System.exit(1);
		}
		stage.setTitle("Fatturazione");
		InvoiceManagerPane root = new InvoiceManagerPane(controller, stage);

		Scene scene = new Scene(root, 1000, 500, Color.ALICEBLUE);
		
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
