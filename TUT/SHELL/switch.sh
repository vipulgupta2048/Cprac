#!/bin/bash
#Switch like something using while read f loop

while read f
do
   case $f in
            hello)          echo English;;
            howdy)          echo American;;
            gday)           echo Australian;;
            bonjour)        echo French;;
            "Guten Tag"     echo German;;
            *)              echo Unknown Language;; 
    $f
        ;;
        easc
        done<myfile