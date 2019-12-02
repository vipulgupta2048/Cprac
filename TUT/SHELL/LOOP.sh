#!/bin/bash
#This shell script will be about FOR loops

for i in 1 2 3 4 5
do
	echo "THIS IS BEING LOOPED $i many times"
done


for i in hello 1 * 2 goodbye
do
	echo "Looping $i many times"
done


#for (( ; ; ))
#do
#   echo "infinite loops [ hit CTRL+C to stop]"
#done


for ((i=0; i<=10; i++))
do
    echo "Welcome $i"
done

#Here star (*) takes everything that it is in the directory and loops over it.

for i in {0..10..2}
do
    echo "Welcome $i times"
done
