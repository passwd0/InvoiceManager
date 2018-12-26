package invoicemanager.controller.fatturazione;

import java.sql.SQLException;
import java.util.List;

import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Banca;
import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.Controparte;
import invoicemanager.model.fatturazione.DdtTestata;
import invoicemanager.model.fatturazione.FatturaTestata;
import invoicemanager.model.fatturazione.Imballo;
import invoicemanager.model.fatturazione.Iso;
import invoicemanager.model.fatturazione.Iva;
import invoicemanager.model.fatturazione.OrdineTestata;
import invoicemanager.model.fatturazione.Pagamento;
import invoicemanager.model.fatturazione.RaggruppamentoClienteFornitore;
import invoicemanager.model.fatturazione.ResaMerce;
import invoicemanager.model.fatturazione.Stato;
import invoicemanager.model.fatturazione.Utente;
import invoicemanager.model.fatturazione.Vettore;
import invoicemanager.persistence.fatturazione.ReadCliente;

public class DataManager {
	private List<Cliente> clienti;
	private List<Agente> agenti;
	private List<Banca> banche;
	private List<Controparte> controparti;
	private List<DdtTestata> ddt;			//ddtDettaglio, ddtTestata		//da raggruppare probabilmente
	private List<FatturaTestata> fatture;		//dettaglio, piede, testata
	private List<Imballo> imballi;
	private List<Iso> iso;
	private List<Iva> iva;
	private List<OrdineTestata> ordini;		//dettaglio, testata
	private List<Pagamento> pagamenti;
	private List<RaggruppamentoClienteFornitore> raggruppamentiClienteFornitori;
	private List<ResaMerce> reseMerci;
	private List<Stato> stati;
	private List<ResaMerce> tipoClienti;
	private List<Stato> tipoPagamenti;
	private List<Utente> utenti;
	private List<Vettore> vettori;
	
	public DataManager() {
		try {
			loadAll();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loadAll() throws ClassNotFoundException, SQLException {
		clienti = new ReadCliente().read();
		//try to load from sql
	}

	public List<Cliente> getClienti() {
		return clienti;
	}

	public List<Agente> getAgenti() {
		return agenti;
	}

	public List<Banca> getBanche() {
		return banche;
	}

	public List<Controparte> getControparti() {
		return controparti;
	}

	public List<DdtTestata> getDdt() {
		return ddt;
	}

	public List<FatturaTestata> getFatture() {
		return fatture;
	}

	public List<Imballo> getImballi() {
		return imballi;
	}

	public List<Iso> getIso() {
		return iso;
	}

	public List<Iva> getIva() {
		return iva;
	}

	public List<OrdineTestata> getOrdini() {
		return ordini;
	}

	public List<Pagamento> getPagamenti() {
		return pagamenti;
	}

	public List<RaggruppamentoClienteFornitore> getRaggruppamentiClienteFornitori() {
		return raggruppamentiClienteFornitori;
	}

	public List<ResaMerce> getReseMerci() {
		return reseMerci;
	}

	public List<Stato> getStati() {
		return stati;
	}

	public List<ResaMerce> getTipoClienti() {
		return tipoClienti;
	}

	public List<Stato> getTipoPagamenti() {
		return tipoPagamenti;
	}

	public List<Utente> getUtenti() {
		return utenti;
	}

	public List<Vettore> getVettori() {
		return vettori;
	}
	
	
}
