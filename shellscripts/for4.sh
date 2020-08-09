#!/bin/bash - 
#===============================================================================
#
#          FILE: for4.sh
# 
#         USAGE: ./for4.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 12:47
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
#$*中的所有参数看成是一个整体，所以这个for循环只会循环一次
for i in "$*"
do
	echo "ban zhang love $i"
done
#$@中的每个参数都看成是独立的，所以$@中有几个参数，就会循环几次
for j in "$@"
do 
	echo "ban zhang love $j"
done


