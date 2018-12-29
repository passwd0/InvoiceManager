package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TipoBento{
private String codiceTipoBento; //(2) NOT NULL
private String descrizione; //(50) NULL
private LocalDateTime dataInserimento; //  NULL
private LocalDateTime dataUltimaModifica; //  NULL

	public TipoBento(String codiceTipoBento){
		this.codiceTipoBento = codiceTipoBento;
	}
}
