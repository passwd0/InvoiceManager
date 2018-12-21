package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaResaMerce{
		private String codiceResa; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private List<StatiTabelle> codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private float percentualeAddebito; //  NULL
		private float importoMinimo; // (19, 5) NULL
		private boolean indicatoreProvvigione; // NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL

	public TabellaResaMerce(String CodiceResa){
		this.codiceResa = CodiceResa;
	}
}
