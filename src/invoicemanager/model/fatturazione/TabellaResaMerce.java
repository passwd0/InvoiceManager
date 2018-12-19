package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaResaMerce{
		private String CodiceResa; //(4) NOT NULL
		private String Descrizione; //(100) NULL
		private List<StatiTabelle> CodiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private float PercentualeAddebito; //  NULL
		private float ImportoMinimo; // (19, 5) NULL
		private boolean IndicatoreProvvigione; // NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String LoginInserimento; //(30) NULL

	public TabellaResaMerce(String CodiceResa){
		this.CodiceResa = CodiceResa;
	}
}
