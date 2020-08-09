#!/bin/bash - 
#===============================================================================
#
#          FILE: function.sh
# 
#         USAGE: ./function.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 14:32
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
function sum(){
    s=0
    s=$[ $1 + $2]
    echo "$s"
}
read -p "Please input the number1:" n1;
read -p "Please input the number2:" n2;
sum $n1 $n2;
