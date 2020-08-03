package com.bjpowernode.javase.test008;
/**
 * “中国人”类
 *
 */
public class Chinese {
	//身份证号【每一个对象的身份证号不同】
	 String id;
	//姓名【每一个对象的姓名不同】
	String name;
	//国籍【每一个对象由于都是由“中国人”这个类实例化化的。所以每一个中国人的国际都是中国】
	//无论通过Chinese类实例化多少个java对象，这些java对象的国籍都是“中国”
	//实例变量【实例变量是一个java对象就有一份，１００个java对象，就有１００个country】，分析这种方法有什么缺点？
	//实例变量存储java对象内部，在堆内存当中，在构造方法执行的时候初始化。
	//所有的中国人的国籍都是“中国”，这里声明为实例变量显然是不合适的，太浪费内存空间。没必要让每一个对象保留一份国籍内存。
	String country;
	
	//构造函数
	public Chinese() {
		/*
		this.id=null;
		this.name=null;
		this.country=null;
		*/
	}
	public Chinese(String id,String name,String country) {
	this.id=id;
	this.name=name;
	this.country=country;
	}
}
