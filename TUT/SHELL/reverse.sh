#!/bin/bash

read -p "Enter a number:" num

if [ "$num" == "" ]
then
echo "Error: Enter a number"
exit
else
echo $num | rev
fi
