#!/bin/sh

echo "Enter Num1"
read num1
echo "Enter Num2"
read num2
echo "Enter Num3"
read num3

if [ $num1 -eq $num2 ] && [ $num1 -eq $num3 ] && [ $num2 -eq $num3 ]
then
    echo "All the three numbers are equal"
    exit
fi

if [ $num1 -gt $num2 ] && [ $num1 -gt $num3 ]
then
    echo "$num1 is the largest number"
elif [ $num2 -gt $num1 ] && [ $num2 -gt $num3 ]
then
    echo "$num2 is the largest number"
elif [ $num3 -gt $num1 ] && [ $num3 -gt $num2 ]
then
    echo "$num3 is the largest number"
else
    if [ $num1 -eq $num2 ] || [ $num1 -eq $num3 ] || [ $num2 -eq $num3 ]
    then
        echo "I cannot figure out which number is largest"
        exit
    fi
fi
