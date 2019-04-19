package invoicemanager.ui;

import invoicemanager.ui.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class InvoiceManagerApp extends Application {
	private Controller controller;

	@Override
	public void start(Stage stage) throws Exception {
		controller = new Controller(); // arg: loadAll()
		if (controller == null) {
			Controller.error("Errore", "Controller", "Errore nella creazione del controller");
			System.exit(1);
		}
		stage.setTitle("Fatturazione");
		//stage.setResizable(false);
		InvoiceManagerPane root = new InvoiceManagerPane(controller, stage);
		
		Scene scene = new Scene(root, 1020, 630, Color.ALICEBLUE);
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}