package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Banche{
private nString codiceABI; //(5) NOT NULL
private nString codiceCAB; //(5) NOT NULL
private nString descrizioneBanca; //(100) NULL
private nString descrizioneAgenzia; //(40) NULL
private nString indirizzo; //(40) NULL
private nString cap; //(5) NULL
private nString citta; //(40) NULL
private nString provincia; //(2) NULL
private nString localita; //(22) NULL
private LocalDateTime dataInserimento; //  NULL
private LocalDateTime dataUltimaModifica; //  NULL
private
private

	public Banche(nString codiceABI, nString codiceCAB){
		this.codiceABI = codiceABI;
		this.codiceCAB = codiceCAB;
	}
}
