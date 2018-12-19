package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaBanche{
		private String CodiceBanca; //(4) NOT NULL
		private String Descrizione; //(100) NULL
		private List<StatiTabelle> CodiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private String CodiceABI; //(5) NULL
		private String CodiceCAB; //(5) NULL
		private String Localita; //(50) NULL
		private String Provincia; //(20) NULL
		private String NumeroContoCorrente; //(40) NULL
		private String CodiceCIN; //(6) NULL
		private String CodiceCINEur; //(6) NULL
		private String Paese; //(6) NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String LoginInserimento; //(30) NULL
		private String LoginModifica; //(30) NULL
		private String Iban; //(50) NULL
		private String Swift; //(50) NULL
		private String CodiceConto; //(30) NULL
		private String Indirizzo; //(2000) NULL
}
