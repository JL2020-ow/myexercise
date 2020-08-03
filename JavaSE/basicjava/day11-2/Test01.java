/*
  关于java语言当中的包机制
    1、包又称为package,java中引入package这种语法机制主要是为了方便程序的管理
    不同功能的类被分门别类放到软件包当中，查找比较方便，管理比较方便，易维护。

    2、怎么定义package呢？
      -在java源文件的第一行编写package语句。
      -package只能编写一个语句。
      -语法结构：
        package 包名;

    3、包名的命名规范：
       公司域名倒序+项目名+模块名+功能名;

       采用这种方式重名的几率较低。因为公司域名具有全球唯一性。

       例如：
          com.bjpowernode.oa.user.service;
          org.apache.tomcat.core;

    4、包名要求全部小写，包名也是标识符，必须遵守标识符的命名规则。

    5、一个包将来对应的是一个目录。

    6、使用了package机制之后，应该怎么编译？怎么运行？
       -使用package机制之后，类名不再是Test01了，类名是：com.bjpowernode.javase.day11.Test01
       -编译：javac java源文件路径 (在硬盘上生成一个class文件：Test01.class)
       -手动方式创建目录，将Test01.class字节码文件放到指定的目录下
       -运行： java com.bjpowernode.javase.day11.Test01

       -另一种方式(编译加运行)：javac -encoding utf-8 -d . *.java 
                              java com.bjpowernode.javase.day11.Test01
                    *编译：
                         javac -d 编译之后存放路径 java源文件的路径
                    *例如：将F:\Hello.java文件编译之后放到c:\目录下
                          java -d C:\ F:\HelloWorld.java
                    *javac -d . *.java
                       将当前路径中*.java编译之后存放到当前目录下。
                    *运行： JVM的类加载器ClassLoader默认从当前路径下加载
                     保证Dos命令窗口的路径先切换到com所在的路径，执行：
                     java com.bjpowernode.javase.day11.Test01
*/
 package com.bjpowernode.javase.day11;//4个目录 【目录之间使用.隔开】
  public class Test01
  {
  	public static void main(String[] args){
  		System.out.println("Test01's main method execute !");
  	}
  }
