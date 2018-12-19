package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Utenti{
		private String CodiceUtente; //(15) NULL
		private String Path; //(50) NULL
		private String PathSalvataggi; //(50) NULL
		private String SubUtente; //(15) NULL
		private boolean TipoUtente; // NULL
		private String Cognome; //(50) NULL
		private String Nome; //(50) NULL
		private LocalDateTime DataNascita; //  NULL
		private boolean Sesso; // NULL
		private String ComuneNascita; //(50) NULL
		private String ProvinciaNascita; //(2) NULL
		private String DomicilioFiscale; //(50) NULL
		private String Comune; //(50) NULL
		private String Provincia; //(2) NULL
		private String PartitaIVA; //(15) NULL
		private String Attivita; //(50) NULL
		private String CodicePersonaFisica; //(5) NULL
		private String CodiceFiscale; //(16) NULL
		private String RagioneSociale; //(60) NULL
		private String NaturaGiuridica; //(5) NULL
		private String DomicilioAzienda; //(50) NULL
		private String ComuneAzienda; //(50) NULL
		private String ProvinciaAzienda; //(2) NULL
		private String PartitaIVAAzienda; //(15) NULL
		private String AttivitaAzienda; //(50) NULL
		private String CodiceAzienda; //(5) NULL
		private String CodiceFiscaleAzienda; //(16) NULL
		private boolean IndicatoreConversione; // NULL
		private String Password; //(20) NULL
		private String Cap; //(50) NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL

	public Utenti(){
	}
}
