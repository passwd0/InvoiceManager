package invoicemanager.ui.fatturazione.converter;

import invoicemanager.model.fatturazione.Cliente;
import javafx.util.StringConverter;

public class ClienteConverter extends StringConverter<Cliente> {

	@Override
	public Cliente fromString(String cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(Cliente cliente) {
		return cliente == null ? null : cliente.getCodiceCliente();
	}

}
