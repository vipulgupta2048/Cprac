#!/bin/bash

read choice
if [ $choice -ge 0 ]; then
echo "$choice number is positive"
else
echo "$choice number is negative"
fi
