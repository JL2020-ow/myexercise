#!/bin/bash - 
#===============================================================================
#
#          FILE: case.sh
# 
#         USAGE: ./case.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 12:29
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
case $1 in 
"1")
	echo "banzhang"
;;
"2")
	echo "cls"
;;
*)
	echo "renyao"
;;
esac



