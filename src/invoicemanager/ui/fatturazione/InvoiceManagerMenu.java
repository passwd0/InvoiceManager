package invoicemanager.ui.fatturazione;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

public class InvoiceManagerMenu extends BorderPane {
	
	public InvoiceManagerMenu() {
			MenuBar menubar  = new MenuBar();
			Menu menuOpzioni = new Menu("Opzioni");
			Menu menuPromemoria = new Menu("Promemoria");
			Menu menuPersonalizzaDocumento = new Menu("Personalizza Documento");
			Menu menuTipoFattura = new Menu("Tipo Fattura");
			
//			MenuItem menuSave = new MenuItem("Salva");
//			MenuItem menuOpen = new MenuItem("Apri");
//			MenuItem menuSetting = new MenuItem("Impostazioni");
//			
//			Menu menuPeriodo = new Menu("Periodo");
//			MenuItem menuCliente = new MenuItem("Cliente");
//			MenuItem menuAppuntamentiGiornalieri = new MenuItem("Giornaliero");
//			MenuItem menuAppuntamentiSettimanali = new MenuItem("Settimanale");
//			MenuItem menuAppuntamentiMensili = new MenuItem("Mensile");
//			MenuItem menuAppuntamentiAdvanced = new MenuItem("Avanzato");
//			
//			menuSave.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
//			menuOpen.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
//			menuCliente.setAccelerator(KeyCombination.keyCombination("Ctrl+P"));
			
			
//			menuFile.getItems().addAll(menuSave, menuOpen, menuSetting);
//			menuPeriodo.getItems().addAll(menuAppuntamentiGiornalieri, menuAppuntamentiSettimanali, menuAppuntamentiMensili, menuAppuntamentiAdvanced);
//			menuReport.getItems().addAll(menuPeriodo, menuCliente);
			menubar.getMenus().addAll(menuOpzioni, menuPromemoria, menuPersonalizzaDocumento, menuTipoFattura);
			setTop(menubar);
	}
}
