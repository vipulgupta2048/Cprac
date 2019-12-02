#!/bin/bash
#Switch like something using while read f loop

while read f
do
   case $f in
            hello)          echo English;;
            howdy)          echo American;;
            gday)           echo Australian;;
            bonjour)        echo French;;
            guten_tag)      echo German;;
            *)              echo Unknown Language;;
esac
done
