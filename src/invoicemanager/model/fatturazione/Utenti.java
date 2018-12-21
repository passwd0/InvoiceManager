package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Utenti{
		private String codiceUtente; //(15) NULL
		private String path; //(50) NULL
		private String pathSalvataggi; //(50) NULL
		private String subUtente; //(15) NULL
		private boolean tipoUtente; // NULL
		private String cognome; //(50) NULL
		private String nome; //(50) NULL
		private LocalDateTime dataNascita; //  NULL
		private boolean sesso; // NULL
		private String comuneNascita; //(50) NULL
		private String provinciaNascita; //(2) NULL
		private String domicilioFiscale; //(50) NULL
		private String comune; //(50) NULL
		private String provincia; //(2) NULL
		private String partitaIVA; //(15) NULL
		private String attivita; //(50) NULL
		private String codicePersonaFisica; //(5) NULL
		private String codiceFiscale; //(16) NULL
		private String ragioneSociale; //(60) NULL
		private String naturaGiuridica; //(5) NULL
		private String domicilioAzienda; //(50) NULL
		private String comuneAzienda; //(50) NULL
		private String provinciaAzienda; //(2) NULL
		private String partitaIVAAzienda; //(15) NULL
		private String attivitaAzienda; //(50) NULL
		private String codiceAzienda; //(5) NULL
		private String codiceFiscaleAzienda; //(16) NULL
		private boolean indicatoreConversione; // NULL
		private String password; //(20) NULL
		private String cap; //(50) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL

	public Utenti(){
	}
}
