#!/bin/bash - 
#===============================================================================
#
#          FILE: while.sh
# 
#         USAGE: ./while.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 12:51
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
s=0
i=1
while [ $i -le 100 ]
do
	s=$[$s+$i]
	i=$[$i+1]
done
echo $s

