filename=$1
basename=`echo "$filename" | sed "s/.*\///g"`
classname=${basename:0:-5}
var=`echo ${classname:0:1} | tr '[:upper:]' '[:lower:]'`${classname:1}
newfile=/home/passwd/Documents/java/InvoiceManager/src/invoicemanager/persistence/fatturazione/Write$basename

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
	    try {"

#COLUMNS
psset=""
count=0
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
		count=$(($count+1))
		jtype=`echo $l | cut -d' ' -f2`
		jtype2=`echo ${jtype:0:1} | tr '[:lower:]' '[:upper:]'`${jtype:1}
		jname=`echo $l | cut -d' ' -f3`
		jname2=`echo ${jname:0:1} | tr '[:lower:]' '[:upper:]'`${jname:1}
		element+=($jname,)

		if [[ $jtype =~ "String" ]]; then
				psset+="\t\tps.setString($count, a.get$jname2());\n"
		elif [[ $jtype =~ "boolean" ]]; then
				psset+="\t\tps.setBoolean($count, a.is$jname2());\n"
		elif [[ $jtype =~ "float" ]]; then
				psset+="\t\tps.setFloat($count, a.get$jname2());\n"
		elif [[ $jtype =~ "int" ]]; then
				psset+="\t\tps.setInt($count, a.get$jname2());\n"
		elif [[ $jtype =~ "LocalDateTime" ]]; then
				psset+="\t\tps.setTimestamp($count, Utils.toTimestamp(a.get$jname2()));\n"
		elif [[ $jtype =~ "LocalDate" ]]; then
				psset+="\t\tps.setDate($count, Date.valueOf(a.get$jname2()));\n"
		else
				psset+="\t\tps.setString($count, a.getCodice$jname2());\n"
		fi
	fi
done
echo ${elements[@]}
b=()
for i in `seq $count`; do
	b+=(?,)
done
echo -e "\t\tPreparedStatement ps = c.prepareStatement(\"INSERT INTO $classname VALUES (${b[@]})\");"
echo -e $psset

a=`echo "${element[@]}"`
elements=${a:0:-1}

#TEMPLATE2
echo "		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}"

#	public void set(${classname} a) throws ClassNotFoundException, SQLException {
#		try {
#			Statement stmt = c.createStatement();
#			String sql;
#
#			sql = \"UPDATE ${classname} SET \"
#					+ \"campo=value \"
#					+ \"WHERE codice${classname}=\"+a.getCodice${classname}();
#			stmt.executeUpdate(sql);
#
#			stmt.close();
#			c.commit();
#			c.close();
#	      } catch (Exception e) {
#	    	  //Utils.createAlertFailWriteDB();
#	      }
#	}
#
#	public void delete(${classname} a) throws ClassNotFoundException, SQLException {
#		try {
#	        Statement stmt = c.createStatement();
#	    	String sql = \"UPDATE auto SET stato =\'Eliminato\' WHERE id = \" + a.getCodice${classname}() + \";\";
#	    	stmt.executeUpdate(sql);
#	    	stmt.close();
#	        c.commit();
#	        c.close();
#		} catch (Exception e) {
#			//Utils.createAlertFailWriteDB();
#		}
#	}
#} "
