#!/bin/bash - 
#===============================================================================
#
#          FILE: for2.sh
# 
#         USAGE: ./for2.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 12:42
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
#打印数字

for i in $*
do
	echo "banzhang love $i"
done

