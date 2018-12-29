package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class ArticoloMagazzinoDescrizioneMultilingua{
	private String codiceArticolo; //(30) NOT NULL
	private String codiceLingua; //(4) NOT NULL
	private String descrizione; //(500) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public ArticoloMagazzinoDescrizioneMultilingua(String codiceArticolo, String codiceLingua){
		this.codiceArticolo = codiceArticolo;
		this.codiceLingua = codiceLingua;
	}
}
