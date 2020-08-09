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
# -d 分隔符,按照指定的分隔符分隔列
# -f 列号 提取第几列
cut -d " " -f 1 /home/alex/workspace/myexercise/shellscripts/datas/cut.txt
echo "==========="
cut -d " " -f 2,3 /home/alex/workspace/myexercise/shellscripts/datas/cut.txt
echo "==========="
cat /home/alex/workspace/myexercise/shellscripts/datas/cut.txt |grep "shang" | cut -d  " " -f 3
echo $PATH
echo "=========="
echo $PATH | cut -d: -f 2-
echo "============================================================================================"
ifconfig
echo "============================================================================================"
#下列命令只适合于桥接模式而不是nat模式
#ifconfig eth0 | grep "inet addr" | cut -d: -f 2 | cut -d" " -f1
