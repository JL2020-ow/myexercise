#!/bin/bash - 
#===============================================================================
#
#          FILE: sed.sh
# 
#         USAGE: ./sed.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2020年08月09日 15:27
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error
#a 新增，a的后面可以接字串，在下一行出现
#d 删除
#s查找并替换

#将mei nv这个单词插入到sed.txt第二行下，打印
sed '2a mei nv' /home/alex/workspace/myexercise/shellscripts/datas/sed.txt
#删除sed.txt文件所有包含wo的行
echo "==========================="
sed '/wo/d' /home/alex/workspace/myexercise/shellscripts/datas/sed.txt
echo "==========================="
sed 's/wo/ni/g' /home/alex/workspace/myexercise/shellscripts/datas/sed.txt
#g global 表示全部替换

