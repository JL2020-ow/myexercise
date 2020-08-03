package com.beijingpowernode.javase.test003;

public class FinalTest04 {

	public static void main(String[] args) {
		
		System.out.println(Chinese.Guo_JI);
		
		System.out.println("圆周率：" + Math.PI);
	}
	
}
class Math{
	public static final double PI = 3.1415926;
}

//中国人
class Chinese {
	
	//国籍
	//假设需求：每一个中国人的国际都是中国，而且国籍不会发生改变，为了防止国籍被修改，建议加final修饰
	//final修饰的实例变量是不可变的，这种变量一般和static联合使用，被称为"常量"
	//常量的定义语法格式：
	//       public static final 类型 常量名=值;
	//java规范中要求的
	//static final String country = "中国";
	
	public static String Guo_JI = "中国";
	
}