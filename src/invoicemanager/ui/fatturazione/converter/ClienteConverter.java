package invoicemanager.ui.fatturazione.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.ui.controller.fatturazione.DataManager;
import invoicemanager.ui.fatturazione.InvoiceManagerGrid;
import javafx.util.StringConverter;

public class ClienteConverter extends StringConverter<Cliente> {

	@Override
	public Cliente fromString(String codiceCliente) {
		List<Cliente> clienti = DataManager.loadCliente().stream()
				.filter(c -> c.getCodiceCliente().contains(codiceCliente))
				.collect(Collectors.toList());
		InvoiceManagerGrid.riepilogoTestataController.oClientiId.setAll(clienti);
		return clienti.size() == 0 ? null : clienti.get(0);
	}

	@Override
	public String toString(Cliente cliente) {
		return cliente == null ? null : cliente.getCodiceCliente();
	}

}
