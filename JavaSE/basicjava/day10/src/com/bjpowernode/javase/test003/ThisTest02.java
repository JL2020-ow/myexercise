package com.bjpowernode.javase.test003;

public class ThisTest02 {
	//实例
	 String name;
	 //实例
	 public void doSome() {
		 
	 }
	 //主方法带有static
	public static void main(String[] args) {
		//这里没有this
		//System.out.println(name);
		//doSome();
		//编译错误
	   //System.out.println(this.name);
		//this.doSome();
		//编译错误
		ThisTest02 tt=new ThisTest02();
		System.out.println(tt.name);
		tt.doSome();
	}

}
