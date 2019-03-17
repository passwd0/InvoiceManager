#!/bin/bash

filename=$1
basename_filename=$(basename $filename)
filename_noext=${basename_filename:5:-5}

IFS=$'\n'

echo "Create table public.$filename_noext ("
for i in `cat $filename`; do
	if [[ $i =~ "ps.executeUpdate" ]]; then
		break;
	fi
	var_type=$(echo $i | sed -n "s/.*ps.set\(.*\)(.*,.*a\.\(get\|is\)\(.*\)().*/\1/p")
	name=$(echo $i | sed -n "s/.*ps.set\(.*\)(.*,.*a\.\(is\|get\)\(.*\)().*/\3/p")
	if [[ ! -z $var_type ]]; then
		case $var_type in
			String)
				echo -e "\t\"$name\" varchar(25) NULL,"
				;;
			Int)
				echo -e "\t\"$name\" INTEGER NULL,"
				;;
			*)
				echo -e "\t\"$name\" $var_type NULL,"
				;;
		esac
	fi
done
echo -e ");"
