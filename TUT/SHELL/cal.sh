#!/bin/sh

# cale(){
# n1=$1
# op=$2
# n2=$3
# ans=0
# if [ $# -eq 3 ]; then
# ans=$(( $n1 $op $n2 ))
# echo "$n1 $op $n2 = $ans"
# return $ans
# else
# echo "Function cal requires atleast three args"
# fi
# return
# }

# cale


# Take user Input
echo "Enter Two numbers : "
read a
read b

# Input type of operation
echo "Enter Choice :"
echo "1. Addition"
echo "2. Subtraction"
echo "3. Multiplication"
echo "4. Division"
read ch

# Switch Case to perform
# calulator operations
case $ch in
1)res=`echo $a + $b | bc`
;;
2)res=`echo $a - $b | bc`
;;
3)res=`echo $a \* $b | bc`
;;
4)res=`echo "scale=2; $a / $b" | bc`
;;
esac
echo "Result : $res"
