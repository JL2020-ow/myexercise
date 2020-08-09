#!/bin/bash - 
#===============================================================================
#
#          FILE: read.sh
# 
#         USAGE: ./read.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 13:28
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
read -t 7 -p "Enter your name in 7 seconds " NAME
echo $NAME

