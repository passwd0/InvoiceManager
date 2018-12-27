filename=$1
basename=`echo "$filename" | sed "s/.*\///g"`
classname=${basename:0:-5}
var=`echo ${classname:0:1} | tr '[:upper:]' '[:lower:]'`${classname:1}
newfile=/home/passwd/Documents/java/InvoiceManager/src/invoicemanager/persistence/fatturazione/Read$basename

find_private=0
element=()

#TEMPLATE1
echo "package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.${classname};

public class Write${classname} {
	private Connection c;

	public Write${classname}() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(${classname} a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = \"INSERT INTO ${classname} VALUES (\""

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
		jname=${jname:0:-1}
		element+=($jname,)

		echo "+\"\',\'\"+a.get$jname()"
	fi
done
echo "')';"

a=`echo "${element[@]}"`
elements=${a:0:-1}

#TEMPLATE2
echo "			else
				sql = \"UPDATE auto SET stato = \'Disponibile\' WHERE codiceCliente=\'\" + a.getCodiceCliente() + \"\';\";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Cliente a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = \"UPDATE Cliente SET \"
					+ \"campo=value \"
					+ \"WHERE codiceCliente=\"+a.getCodiceCliente();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Cliente a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = \"UPDATE auto SET stato = \'Eliminato\' WHERE id = \" + a.getCodiceCliente() + \";\";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} "
