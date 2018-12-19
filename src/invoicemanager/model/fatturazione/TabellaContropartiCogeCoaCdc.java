package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaContropartiCogeCoaCdc{
		private List<TabellaControparti> CodiceControparte; // (4) COLLATE Latin1_General_CI_AS NOT NULL
		private String CodiceContoCOGE; //(30) NOT NULL
		private String TipoDocumento; //(20) NOT NULL
		private List<Utenti> TipoUtente; // (20) COLLATE Latin1_General_CI_AS NOT NULL
		private int ProgressivoRelazioniCogeCoa; //  NULL
		private int ProgressivoRelazioniCoaCdc; //  NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String LoginInserimento; //(30) NULL

	public TabellaContropartiCogeCoaCdc(List<TabellaControparti> CodiceControparte, String CodiceContoCOGE, String TipoDocumento, List<Utenti> TipoUtente){
		this.CodiceControparte = CodiceControparte;
		this.CodiceContoCOGE = CodiceContoCOGE;
		this.TipoDocumento = TipoDocumento;
		this.TipoUtente = TipoUtente;
	}
}
