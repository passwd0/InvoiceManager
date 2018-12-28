package invoicemanager.utils;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
	public static DateTimeFormatter formatterOra = DateTimeFormatter.ofPattern("HH:mm");
	public static DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static DateTimeFormatter formatterComplete = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	public static DateTimeFormatter formatterDataDB = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	public static DateTimeFormatter formatterCompleteDB = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public Utils() {}
	
	public static Timestamp toTimestamp(LocalDateTime datetime) {
		if (datetime == null)
			return null;
		return Timestamp.valueOf(datetime);
	}

}
