package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TabellaContropartiCogeCoaCdc{
		private List<TabellaControparti> codiceControparte; // (4) COLLATE Latin1_General_CI_AS NOT NULL
		private String codiceContoCOGE; //(30) NOT NULL
		private String tipoDocumento; //(20) NOT NULL
		private List<Utenti> tipoUtente; // (20) COLLATE Latin1_General_CI_AS NOT NULL
		private int progressivoRelazioniCogeCoa; //  NULL
		private int progressivoRelazioniCoaCdc; //  NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL

	public TabellaContropartiCogeCoaCdc(List<TabellaControparti> codiceControparte, String codiceContoCOGE, String tipoDocumento, List<Utenti> tipoUtente){
		this.codiceControparte = codiceControparte;
		this.codiceContoCOGE = codiceContoCOGE;
		this.tipoDocumento = tipoDocumento;
		this.tipoUtente = tipoUtente;
	}
}
