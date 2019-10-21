#!/bin/bash


set -e
if [ "$#" -lt 1 ]
then
echo  "Please insert at least one argument"
exit
else
echo -e "\c"
fi

# echo $@

for file in "$@"
do
    y=$( du -b  $file | cut -f1 )
    if [ $y -ge 500 ]
    then
        echo "Greater or equal to"
    fi
done
