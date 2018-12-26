package invoicemanager.persistence.fatturazione;

import java.util.List;

public interface ReadSql<T> {
	public List<T> read();

}
