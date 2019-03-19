package invoicemanager.controller.fatturazione;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class TabViewController implements Initializable {
	@FXML
	private Label label_ragionesociale;
	@FXML
	private Label label_indirizzo;
	@FXML
	private Label label_localita;
	@FXML
	private Label label_nazione;
	@FXML
	private Label label_partitaiva;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	void set_label_ragionesociale(String ragionesociale) {
		label_ragionesociale.setText(ragionesociale);
	}
	
	void set_label_indirizzo(String indirizzo) {
		label_indirizzo.setText(indirizzo);
	}
	
	void set_label_localita(String localita) {
		label_localita.setText(localita);
	}
	
	void set_label_nazione(String nazione) {
		label_nazione.setText(nazione);
	}

	public void set_label_partitaiva(String partitaIVA) {
		label_partitaiva.setText(partitaIVA);
		
	}
	
}
