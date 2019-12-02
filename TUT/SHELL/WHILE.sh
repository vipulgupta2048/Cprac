#!/bin/sh
#Bash Script for while loops

#Simple while loop
input=bye
while [ "$input" != "Bye" ]
do
	echo "Please type something in (Bye to quit)"
	read input
	echo "You typed:$input"
    if [ "$input" = "Hi" ];then
    echo "I am at peace"
    fi
done

#More elegant way
# while :
# do
#   echo "Please type something in (^C to quit)"
#   read INPUT_STRING
#   echo "You typed: $INPUT_STRING"
# done
