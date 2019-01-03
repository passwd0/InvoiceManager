filename=$1
basename=`echo "$filename" | sed "s/.*\///g"`
classname=${basename:0:-5}
var=`echo ${classname:0:1} | tr '[:upper:]' '[:lower:]'`${classname:1}
newfile=Read$basename

find_private=0
element=()

#TEMPLATE1
echo "package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.$classname;


public class Read$classname {
	private Connection c;

	public Read$classname() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<$classname> read() {
		List<$classname> list${var} = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(\"SELECT * FROM $classname\");
			Timestamp ts;
	         while ( rs.next() ) {
" > $newfile

#COLUMNS
IFS=$'\n'
for l in `cat $filename`; do
	l=`echo $l | sed -r 's/\/\/.*//g'`
	l=`echo $l | sed -r 's/;.*//g'`
	if [[ $l =~ "private" ]]; then
		find_private=1
	else
		if [[ $find_private == 1 ]]; then
			break
		fi
	fi
	if [[ $find_private == 1 ]]; then
		jtype=`echo $l | cut -d' ' -f2`
		jtype2=`echo ${jtype:0:1} | tr '[:lower:]' '[:upper:]'`${jtype:1}
		jname=`echo $l | cut -d' ' -f3`
		element+=($jname,)

		if [[ "$jtype2" == 'String' || "$jtype2" == 'Int' || "$jtype2" == 'Boolean' || "$jtype2" == 'Float' ]]; then
			echo $jtype $jname = rs.get$jtype2\(\""$jname"\"\)\; >> $newfile
		elif [[ "$jtype2" == 'LocalDateTime' ]]; then
			echo ts = rs.getTimestamp\(\""$jname"\"\)\; >> $newfile
			echo "LocalDateTime $jname = null;" >> $newfile
			echo "if (ts != null)" >> $newfile
			echo "$jname = ts.toLocalDateTime();" >> $newfile
		elif [[ $jtype2 == 'Stato' ]]; then
			echo "Stato stato = Stato.valueOf(rs.getString(\"$jname\"));" >> $newfile
		else
			echo String codice = rs.getString\(\""$jname"\"\)\; >> $newfile
			echo "$jtype2 $jname = list.stream().filter(x->x.get$jtype2().equals(codice)).findFirst().get();" >> $newfile
		fi
	fi
done

a=`echo "${element[@]}"`
elements=${a:0:-1}
echo $classname $var = new $classname\($elements\)\; >> $newfile


#TEMPLATE2
echo "
		list${var}.add($var);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return list${var};
	}

}" >> $newfile
