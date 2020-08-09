#!/bin/bash - 
#===============================================================================
#
#          FILE: for1.sh
# 
#         USAGE: ./for1.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 12:35
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
s=0
for((i=0;i<=100;i++))
do
	s=$[$s+$i]
done
echo $s



