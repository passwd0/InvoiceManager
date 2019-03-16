package invoicemanager.ui.fatturazione;

import java.util.ArrayList;
import java.util.List;

import invoicemanager.controller.fatturazione.Controller;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class InvoiceManagerPane extends BorderPane{
	private Label tmp;
	private Button tmp1;
	
	public InvoiceManagerPane(Controller controller, Stage stage) {
		this.tmp = new Label("tmp");
		
		HBox topPane = new HBox();
		this.setTop(topPane);
//		List<String> tmp_list = new ArrayList<String>();
//		tmp_list.add("a");
//		tmp_list.add("b");
		topPane.getChildren().addAll(new Label("prova:"), tmp);
		
		tmp1 = new Button("Tmp1");
		this.setBottom(tmp1);
		
		this.setCenter(new InvoiceManagerGrid(controller, tmp, tmp1));
	}
}
