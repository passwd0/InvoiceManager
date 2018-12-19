package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaAgenti{
		private String CodiceAgente; //(10) NOT NULL
		private String Nome; //(50) NULL
		private float PercentualeProvvigione; //  NULL
		private boolean TipoProvvigione; // NULL
		private boolean TipoMandato; // NULL
		private String CodiceContabile; //(30) NULL
		private List<TabellaControparti> CodiceControparte; // (10) COLLATE Latin1_General_CI_AS NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String LoginInserimento; //(30) NULL
		private String LoginModifica; //(30) NULL
}

public TabellaAgenti(String CodiceAgente){
	this.CodiceAgente = CodiceAgente;
}
