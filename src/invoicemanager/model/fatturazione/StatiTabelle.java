package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class StatiTabelle{
		private boolean CodiceStato; // NOT NULL
		private String Descrizione; //(50) NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
}

public StatiTabelle(boolean CodiceStato){
	this.CodiceStato = CodiceStato;
}
