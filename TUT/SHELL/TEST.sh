#!/bin/sh

if [ "$X" -lt "0" ]
then
  echo "X is less than zero"

elif [ "$X" -gt "0" ]; then
  echo "X is more than zero"

elif [ "$X" -le "0" ]; then
      echo "X is less than or equal to  zero"
elif [ "$X" -ge "0" ]; then
      echo "X is more than or equal to zero"
elif [ "$X" = "0" ]; then
      echo "X is the string or number \"0\""
elif [ "$X" = "hello" ]; then
      echo "X matches the string \"hello\""
elif [ "$X" != "hello" ]; then
       echo "X is not the string \"hello\""
elif [ -n "$X" ]; then
      echo "X is of nonzero length"
elif [ -f "$X" ]; then
      echo "X is the path of a real file" || \
      echo "No such file: $X"
elif [ -x "$X" ]; then
      echo "X is the path of an executable file"
elif [ "$X" -nt "/etc/passwd" ]; then
      echo "X is a file which is newer than /etc/passwd"
else
      echo "Go to hell "
fi