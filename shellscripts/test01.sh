#!/bin/bash - 
#===============================================================================
#
#          FILE: test01.sh
# 
#         USAGE: ./test01.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 11:46
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
[ 23 -ge 22 ]
echo $?
[ -w helloworld.sh ]
echo $?
[ -e /home/alex/Mydata/cls.txt ]
echo $?
[ -e /home/alex/Mydata/Txt/cls.txt ]
echo $?
[ condition ] && echo OK || echo notok
[ condition ] && [ ] || echo notok

