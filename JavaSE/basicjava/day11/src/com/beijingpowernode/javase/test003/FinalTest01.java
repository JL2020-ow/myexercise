package com.beijingpowernode.javase.test003;
/**
 * 关于java语言当中的final关键字：
 *       1、final是一个关键字你，表示最终的，不可变的。
 *       2、final修饰的类无法被继承
 *       3、final修饰的方法无法被覆盖
 *       4、final修饰的变量一旦赋值之后，不可重新赋值
 *       5、final修饰的实例变量？？？？
 *       6、final修饰的引用？？？
 *  关于eclipse怎么链接源码？
 *        打开某个.class字节码文件，当没有看到源码的时：
 *                点击“Attached Source”
 *                   -Workspace 【源码在当前工作区当中】
 *                   -External file 【源码在某个压缩包当中】
 *                   -External Folder 【源码在某个目录当中】
 *                   
 *       7、final修饰的实例变量，一般和static联合使用，被称为常量。
 *                   
 *  以后所有的程序尽量都链接源码。
 *  养成看源代码的习惯。   
 *  
 * 对于以后学习的类库，一般都是包括三个部分的：
 *            -源码【可以看源码来理解程序】
 *            -字节码【程序开发的过程中使用的就是这个部分】        
 *            -帮助文档【对源码的解释说明被提取出来，更方便源码的开发,对开发者提供帮助】        
 *            注意使用的时候版本统一。     
 */
public class FinalTest01 {

	public static void main(String[] args) {
		String newString = "abcdef".replaceAll("a","x");
		System.out.println(newString);
		
		int i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
		
		final int k = 100;
		//编译错误：无法为最终变量分配值
		//k = 100;
		//final int m 
		//m = 100;
		//编译错误：无法为最终变量分配值
		//m = 300;
		
	}

}
