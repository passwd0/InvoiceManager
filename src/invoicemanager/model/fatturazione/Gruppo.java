package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Gruppo{
	private String codiceGruppo; //(10) NOT NULL
	private String descrizione; //(100) NOT NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL

	public Gruppo(String codiceGruppo, String descrizione){
		this.codiceGruppo = codiceGruppo;
		this.descrizione = descrizione;
	}
}
