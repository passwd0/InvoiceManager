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
		if [[ $i -ge 1 ]]; then
			echo } >> $javaname
		fi
		javaname=`echo -n $l | sed -rn 's/CREATE TABLE \[dbo\]\.\[(.*)\]\(.*/\1/p'`.java
		listfiles+=($javaname)
		echo -e "package invoicemanager.model.fatturazione;\nimport java.time.LocalDateTime;\nimport java.util.List;\n" > $javaname
		echo $l | sed -rn 's/CREATE TABLE \[dbo\]\.\[(.*)\]\(/public class \1{/p' >> $javaname
	else
		if [[ $l =~ "varchar" ]]; then
			echo $l | sed -rn 's/\[(.*)\] \[(.*)\](.*) COLLATE Latin1_General_CI_AS (.*),/\tprivate \2 \1; \/\/\3 \4/p' >> $javaname
		else
			echo $l | sed -rn 's/\[(.*)\] \[(.*)\](.*),/\tprivate \2 \1; \/\/ \3/p' >> $javaname
		fi
	fi

	i=$(($i+1))
done
echo } >> $javaname
echo ${listfiles[@]}
for f in ${listfiles[@]}; do
	sed -r -i 's/varchar(.*)\(1\)(.*)/boolean\1\2/g' $f
	sed -r -i 's/ \/\/ NULL$//' $f
	sed -r -i 's/ NULL$//' $f
	sed -r -i 's/varchar/String/' $f
	sed -r -i 's/private money/private float/' $f
	sed -r -i 's/datetime/LocalDateTime/' $f
	sed -r -i 's/smallint/short/' $f
	sed -r -i 's/decimal/float/' $f
done
