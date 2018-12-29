package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TipoIndirizzo{
	private String codiceTipoIndirizzo; //(2) NOT NULL
	private String descrizione; //(50) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL

	public TipoIndirizzo(String codiceTipoIndirizzo){
		this.codiceTipoIndirizzo = codiceTipoIndirizzo;
	}
}