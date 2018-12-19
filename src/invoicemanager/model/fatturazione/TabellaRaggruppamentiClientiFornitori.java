package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaRaggruppamentiClientiFornitori{
		private String CodiceRaggruppamento; //(4) NOT NULL
		private String Descrizione; //(100) NULL
		private List<StatiTabelle> CodiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String LoginInserimento; //(30) NULL
}
