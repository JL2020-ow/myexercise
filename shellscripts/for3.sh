#!/bin/bash - 
#===============================================================================
#
#          FILE: for3.sh
# 
#         USAGE: ./for3.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 12:45
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
for i in $*
do
	echo "ban zhang love $i"
done
for j in $@
do
	echo "ban zhang love $j"
done


