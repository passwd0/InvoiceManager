package invoicemanager.ui.converter;

import java.util.List;
import java.util.stream.Collectors;

import invoicemanager.model.Cliente;
import invoicemanager.ui.InvoiceManagerGrid;
import invoicemanager.ui.controller.DataManager;
import javafx.util.StringConverter;

public class ClienteConverter extends StringConverter<Cliente> {

	@Override
	public Cliente fromString(String codiceCliente) {
		List<Cliente> clienti = DataManager.loadCliente().stream()
				.filter(c -> c.getCodiceCliente().contains(codiceCliente))
				.collect(Collectors.toList());
		InvoiceManagerGrid.riepilogoTestataController.oClienti.setAll(clienti);
		return clienti.size() == 0 ? null : clienti.get(0);
		//magari se non trova niente, ne crea uno nuovo
	}

	@Override
	public String toString(Cliente cliente) {
		return cliente == null ? null : cliente.getCodiceCliente();
	}

}
