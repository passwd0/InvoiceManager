Create table public.PreventivoTestata (
	"NumeroPreventivo" INTEGER NULL,
	"DataPreventivo" Date NULL,
	"IndicatoreStatoAvanzamento" Boolean NULL,
	"DataConsegna" Date NULL,
	"DataValidita" Date NULL,
	"PeriodoValidita" varchar(25) NULL,
	"IndicatoreUtilizzoDataValidita" Boolean NULL,
	"CodiceCliente" varchar(25) NULL,
	"Attenzione" varchar(25) NULL,
	"Oggetto" varchar(25) NULL,
	"RiferimentoInterno" varchar(25) NULL,
	"NumeroInterno" varchar(25) NULL,
	"CodiceIVA" varchar(25) NULL,
	"CodiceAgente" varchar(25) NULL,
	"CodiceResa" varchar(25) NULL,
	"CodiceVettore" varchar(25) NULL,
	"CodicePagamento" varchar(25) NULL,
	"CodiceBanca" varchar(25) NULL,
	"CodiceCausale" varchar(25) NULL,
	"CodiceCausalePrelievo" varchar(25) NULL,
	"CodiceListino" Boolean NULL,
	"DescrizioneOrdine" varchar(25) NULL,
	"CodiceDivisa" varchar(25) NULL,
	"Cambio" Float NULL,
	"NumeroFax" varchar(25) NULL,
	"Venditore" varchar(25) NULL,
	"IndicatoreAddebitoBolli" Boolean NULL,
	"IndicatoreAddebitoSpeseIncasso" Boolean NULL,
	"Note" varchar(25) NULL,
	"CodiceClienteSpedizione" varchar(25) NULL,
	"NomeSpedizione" varchar(25) NULL,
	"IndirizzoSpedizione" varchar(25) NULL,
	"CapSpedizione" varchar(25) NULL,
	"CittaSpedizione" varchar(25) NULL,
	"ProvinciaSpedizione" varchar(25) NULL,
	"CodiceNazioneSpedizione" varchar(25) NULL,
	"LoginInserimento" varchar(25) NULL,
	"DataInserimento" Timestamp NULL,
	"DataUltimaModifica" Timestamp NULL,
);
