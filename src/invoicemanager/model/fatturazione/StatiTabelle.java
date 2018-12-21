package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class StatiTabelle{
		private boolean codiceStato; // NOT NULL
		private String descrizione; //(50) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL

	public StatiTabelle(boolean codiceStato){
		this.codiceStato = codiceStato;
	}
}
