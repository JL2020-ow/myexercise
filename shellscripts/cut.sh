#!/bin/bash - 
#===============================================================================
#
#          FILE: cut.sh
# 
#         USAGE: ./cut.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 14:58
#      REVISION:  ---
#===============================================================================

#set -o nounset                              # Treat unset variables as an error
cut -d " " -f 1 /home/alex/workspace/myexercise/shellscripts/datas/cut.txt
echo "==========="
cut -d " " -f 2,3 /home/alex/workspace/myexercise/shellscripts/datas/cut.txt
echo "==========="
cat /home/alex/workspace/myexercise/shellscripts/datas/cut.txt |grep "shang" | cut -d  " " -f 3

