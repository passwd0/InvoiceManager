if [[ $# != 1 ]]; then
	exit
fi

NAMEFILE=$1
listfiles=()
javaname=tmp00000

i=0
IFS=$'\n'
for l in $(cat $NAMEFILE); do
	if [[ $l =~ "CREATE TABLE" ]]; then
		javaname=`echo -n $l | sed -r 's/CREATE TABLE \[dbo\]\.\[(.*)\]\(.*/\1/; s/_//; s/[Tt]abella//'`.java
		listfiles+=($javaname)
		echo -e "package invoicemanager.model.fatturazione;\nimport java.time.LocalDateTime;\nimport java.util.List;\n" > $javaname
		echo $l | sed -rn 's/CREATE TABLE \[dbo\]\.\[(.*)\]\(/public class \1{/p' >> $javaname
	else
		if [[ $l =~ "varchar" ]]; then
			line=`echo $l | sed -rn 's/\[(.*)\].*\[(.*)\](.*)/\tprivate \2 \1; \/\/\3/p'`
			mytype=`echo $line | cut -d' ' -f2`
			var=`echo $line | cut -d' ' -f3`
			other=`echo $line | cut -d' ' -f4-`
			var_min=`echo ${var:0:1} | tr '[:upper:]' '[:lower:]'`${var:1}
			echo private $mytype $var_min $other >> $javaname
		else
			line=`echo $l | sed -rn 's/\[(.*)\] \[(.*)\](.*)/\tprivate \2 \1; \/\/ \3/p'`
			mytype=`echo $line | cut -d' ' -f2`
			var=`echo $line | cut -d' ' -f3`
			var_min=`echo ${var:0:1} | tr '[:upper:]' '[:lower:]'`${var:1}
			other=`echo $line | cut -d' ' -f4-`
			echo private $mytype $var_min $other >> $javaname
		fi
	fi

	i=$(($i+1))
done

for f in ${listfiles[@]}; do
	sed -r -i 's/varchar(.*)\(1\)(.*)/boolean\1\2/g' $f
	sed -r -i 's/ \/\/ NULL$//' $f
	sed -r -i 's/ NULL$//' $f
	sed -r -i 's/varchar/String/' $f
	sed -r -i 's/private money/private float/' $f
	sed -r -i 's/datetime/LocalDateTime/' $f
	sed -r -i 's/smallint/short/' $f
	sed -r -i 's/decimal/float/' $f
	sed -r -i 's/private date/private LocalDate/' $f
done

#create costructor
IFS=$'\n'
for f in ${listfiles[@]}; do
	list_element=()
	for l in `cat $f`; do
		if [[ $l =~ "NOT NULL" ]]; then
			element=`echo $l | awk '{ print $2" "$3 }'`
			list_element+=(${element:0:-1})
		fi
	done
	echo -ne "\n\tpublic ${f:0:-5}(" >> $f
	for e in ${list_element[@]}; do
		echo -ne "$e" >> $f
		if [[ $e != ${list_element[-1]} ]]; then
			echo -ne ", " >> $f
		fi
	done
	echo -ne "){\n" >> $f
	for e in ${list_element[@]}; do
		IFS=', ' read -r -a tmp <<< "$e"
		echo -ne "\t\tthis.${tmp[1]} = ${tmp[1]};\n" >> $f
	done
	echo -e "\t}\n}" >> $f
done

