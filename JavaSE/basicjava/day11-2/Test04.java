package org.apache;

import com.bjpowernode.javase.day11.*;
import java.util.*;
import java.util.Date;
/*
  import语句用来完成导入其它类，同一个包下的类不需要导入，
  不在同一个包下需要导入。

  import语法格式：
      import 类名；
      import 包名.*;
  import语句需要编写在package语句之下，class语句之上。

*/
//public class Test04
{
	public static void main(String[] args) {
		
		com.bjpowernode.javase.day11.Test01 tt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(tt); //com.bjpowernode.javase.day11.Test01@15db9742

		//以上程序可以，就是麻烦了一点
		Test01 x = new Test01();
		System.out.println(x);//com.bjpowernode.javase.day11.Test01@15db9742

		Test01 y = new Test01();
		System.out.println(y);
        
        //java.lang.*; 不需要手动引入，系统自动引入。
        //lang:language语言包，是java语言的核心类，不需要手动引入。
		String s = "abc";
		System.out.println(s);
        

        //直接编写以下代码出现错误，因为Date类没有找到
		//Date d = new Date();

		//java.util.Date d = new java.util.Date();

        //使用import语句之后：import java.util.Date;
        Date d = new Date();
	}
}
/*
  最终结论：
      什么时候需要import?
          *不是java.lang包下，并且不在同一个包下的时候，需要使用import进行引入
*/