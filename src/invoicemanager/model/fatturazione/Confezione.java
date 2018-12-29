package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Confezione{
	private String codiceConfezione; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private boolean codiceStato; // NULL
	private float larghezza; //  NULL
	private float lunghezza; //  NULL
	private float altezza; //  NULL
	private float volume; //  NULL
	private float pesoLordo; //  NULL
	private float pesoTara; //  NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public Confezione(String codiceConfezione){
		this.codiceConfezione = codiceConfezione;
	}
}
