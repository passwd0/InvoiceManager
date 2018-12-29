package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class IndirizzoGeografico{
	private String codiceIndirizzo; //(50) NOT NULL
	private String codiceConto; //(30) NOT NULL
	private String via; //(100) NULL
	private String provincia; //(3) NULL
	private String cap; //(10) NULL
	private String citta; //(50) NULL
	private String codiceNazione; //(10) NULL
	private String codiceTipoIndirizzo; //(3) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL
	private String loginModifica; //(30) NULL
	private String descrizione; //(100) NULL
	private boolean indicatoreIndirizzoDefault; // NULL
	private String codiceMinistero; //(50) NULL

	public IndirizzoGeografico(String codiceIndirizzo, String codiceConto){
		this.codiceIndirizzo = codiceIndirizzo;
		this.codiceConto = codiceConto;
	}
}
