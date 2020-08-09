#-n 依照数值的大小排序
#-r 以相反的顺序来排序
#-t 设置排序时所用的分隔字符
#-k 指定需要排序的列
#按照“：”分割后的第三列倒序排序。
sort -t : -nrk 3 /home/alex/workspace/myexercise/shellscripts/datas/sort.txt