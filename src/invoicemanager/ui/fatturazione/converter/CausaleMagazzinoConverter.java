package invoicemanager.ui.fatturazione.converter;

import invoicemanager.model.fatturazione.CausaleMagazzino;
import javafx.util.StringConverter;

public class CausaleMagazzinoConverter extends StringConverter<CausaleMagazzino> {

	@Override
	public CausaleMagazzino fromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(CausaleMagazzino causaleMagazzino) {
		return causaleMagazzino == null ? null : causaleMagazzino.getDescrizione();
	}

}
