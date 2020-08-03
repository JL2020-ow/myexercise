package com.bjpowernode.javase.test003;

/**
 * 带有static的方法中不能直接“直接”访问实例变量和实例方法。
 * 因为实例变量和实例方法都需要对象的存在。
 * 而static的方法当中是没有this的。也就是说当前对象是不存在的。
 * 自然也无法访问当前对象的实例变量和实例方法。
 */
public class ThisTest {
	//带有static
	//主方法
	public static void main(String[] args) {
		//调用doSome方法
		ThisTest.doSome();
		//调用doSome方法
		doSome();

		//调用doOther对象
		//ThisTest.doOther();//实例方法必须先通过创建对象，通过引用.的方式访问
		
		//doOther是实例方法
		//实例方法调用必须有对象的存在
		//以下代码表示的含义：调用当前对象达到doOther方法。
		//但是由于main方法中没有this,所以以下方法不能调用。
		//doOther();//编译错误
		//this.doOther();//编译错误
		
		ThisTest tt=new ThisTest();
		tt.doOther();
	}
	
	//带有static
	public static void doSome() {
		System.out.println("do some!");
	}
	public void doOther() {
		//this表示当前对象
		System.out.println("do other!");
	}
}
