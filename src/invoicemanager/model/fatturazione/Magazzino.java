package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Magazzino{
private String codiceMagazzino; //(4) NOT NULL
private String descrizione; //(100) NULL
private boolean codiceStato; // NULL
private String codiceTipoMagazzino; //(15) NULL
private LocalDateTime dataInserimento; //  NULL
private LocalDateTime dataUltimaModifica; //  NULL
private String loginInserimento; //(30) NULL

	public Magazzino(String codiceMagazzino){
		this.codiceMagazzino = codiceMagazzino;
	}
}
