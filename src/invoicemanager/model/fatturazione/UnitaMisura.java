package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class UnitaMisura{
private String codiceUnitaMisura; //(4) NOT NULL
private String descrizione; //(100) NULL
private boolean codiceStato; // NULL
private LocalDateTime dataInserimento; //  NULL
private LocalDateTime dataUltimaModifica; //  NULL
private String loginInserimento; //(30) NULL

	public UnitaMisura(String codiceUnitaMisura){
		this.codiceUnitaMisura = codiceUnitaMisura;
	}
}
