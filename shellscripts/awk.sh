#统计passwd文件名，每行的行号，每行的列数
awk -F: '{print "filename:"FILENAME ", linenumber:" NR ",columns:" NF}' passwd
echo "=============================="
#切割ip
ifconfig eth0 | grep "inet addr" | awk -F: '{print $2}' | awk -F " " '{print $1}'
echo "=============================="
#查询sed.txt中空行所在的行号
awk '/^$/{print NR}' sed.txt