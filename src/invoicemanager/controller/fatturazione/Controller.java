package invoicemanager.controller.fatturazione;

import java.util.SortedSet;
import java.util.TreeSet;

import invoicemanager.model.fatturazione.Cliente;

public class Controller {
	private SortedSet<Cliente> clienti;
	
	public void loadClienti() {
		clienti = new TreeSet<>();
		//try to load from sql
	}
	
	public boolean addCliente(Cliente cliente) {
		if (clienti.contains(cliente)) {
			//alarm
			return false;
		}
		clienti.add(cliente);
		return true;
	}
}
