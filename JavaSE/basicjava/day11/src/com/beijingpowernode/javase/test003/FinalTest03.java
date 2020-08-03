package com.beijingpowernode.javase.test003;

public class FinalTest03 {

	public static void main(String[] args) {
		//创建用户对象
		User u = new User(100); // User u = 0x1234;
		
		//又创建了一个新的对象
		//程序执行到此处表示以上对象已变成垃圾数据，等待垃圾回收器的回收。
		u = new User(200); //User u = 0x2586;
		
		//创建用户对象
		final User user = new User(30);
		
		//User = new User(50);
		//final修饰的引用，一旦指向某个对象之后，不能再指向其它对象，那么指向的对象无法被垃圾回收器回收
		System.out.println(user.id);
		
		user.id = 50; 
		//final修饰的引用虽然指向某个对象之后不能指向其它对象，但是所指向的对象内部的内存是可以被修改的
		System.out.println(user.id);
		

	}

}
