package com.bjpowernode;

public class Test03
{
	public static void main(String[] args) {
		
		//创建Test01对象
		//以下代码编译错误：当省略包名之后，会在当前包下找Test01
		//实际上编译器去找：com.bjpowernode.Test01.class文件了。这个类不存在，编译错误。
		//Test01 tt = new Test01();
		//System.out.println(tt);

		//修改以上的错误
		//包名不要省略，添加包名
		//结论：什么时候前边的包名可以省略呢？Test03和Test02在同一个软件包当中。
		com.bjpowernode.javase.day11.Test01 tt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(tt); //com.bjpowernode.javase.day11.Test01@15db9742

		
	}
}