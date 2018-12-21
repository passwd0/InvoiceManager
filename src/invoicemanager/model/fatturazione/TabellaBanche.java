package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaBanche{
		private String codiceBanca; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private List<StatiTabelle> codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private String codiceABI; //(5) NULL
		private String codiceCAB; //(5) NULL
		private String localita; //(50) NULL
		private String provincia; //(20) NULL
		private String numeroContoCorrente; //(40) NULL
		private String codiceCIN; //(6) NULL
		private String codiceCINEur; //(6) NULL
		private String paese; //(6) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL
		private String loginModifica; //(30) NULL
		private String iban; //(50) NULL
		private String swift; //(50) NULL
		private String codiceConto; //(30) NULL
		private String indirizzo; //(2000) NULL

	public TabellaBanche(String CodiceBanca){
		this.codiceBanca = codiceBanca;
	}
}
