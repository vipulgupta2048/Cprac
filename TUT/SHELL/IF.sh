#!/bin/sh
#if/else /elif/fi

echo "Tell us what is abc"
read abc

if [ $abc = "a" ];then
echo "abc is = a"

elif [ $abc = "c" ];then
echo "abc is = c"

elif [ $abc = "b" ];then
echo "abc is b"

else
echo "Sweetheart, you don't belong here."

fi