package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class ListinoPersonalizzato implements Listino {
	private int codiceListinoPersonalizzato;
	private String codiceCliente; //(30) NOT NULL
	private String codiceArticolo; //(30) NOT NULL
	private String variante; //(20) NULL
	private float prezzo; // (19, 5) NULL
	private float provvigione; //  NULL
	private String noteEsterne; //(200) NULL
	private String noteInterne; //(200) NULL
	private int numeroDecimali; //  NULL
	private float scontoCliente; //  NULL
	private LocalDateTime dataAggiornamento; //  NULL
	private float scontoArticolo; //  NULL
	private float scontoPagamento; //  NULL
	private String codiceDivisa; //(4) NOT NULL
	private GruppoMerceologico gruppoMerceologico; //(4) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private LocalDateTime dataInizioValidita; //  NULL
	private LocalDateTime dataFineValidita; //  NULL
	private boolean opzioneGruppi; //  NULL
	private boolean opzioneScontoClienti; //  NULL
	private boolean opzioneScontoArticolo; //  NULL
	private boolean opzioneScontoPagamento; //  NULL
	private boolean opzionePercentualeProvvigione; //  NULL
	private boolean opzioneNoteEsterne; //  NULL
	private boolean opzioneNoteInterne; //  NULL

	public ListinoPersonalizzato(String codiceCliente, String codiceArticolo, String codiceDivisa){
		this.codiceCliente = codiceCliente;
		this.codiceArticolo = codiceArticolo;
		this.codiceDivisa = codiceDivisa;
	}
	
	public String getCodiceGruppoMerceologico() {
		if (gruppoMerceologico == null)
			return null;
		return gruppoMerceologico.getCodiceGruppoMerceologico();
	}
}
