Create table public.Confezione (
	"CodiceConfezione" varchar(25) NULL,
	"Descrizione" varchar(25) NULL,
	"CodiceStato" Boolean NULL,
	"Larghezza" Float NULL,
	"Lunghezza" Float NULL,
	"Altezza" Float NULL,
	"Volume" Float NULL,
	"PesoLordo" Float NULL,
	"PesoTara" Float NULL,
	"DataInserimento" Timestamp NULL,
	"DataUltimaModifica" Timestamp NULL,
);
