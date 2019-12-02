#!/bin/sh
#Variables

my="Hello Vanilla"
echo "What is your name ?"
read name
echo "Welcome $name, I been waiting for you to show up."
echo "lets create a new file called ${name}_file"
touch "${name}_file"

#echo "MYVAR is: $MYVAR"
#MYVAR="hi there"
#echo "MYVAR is: $MYVAR"
