package com.beijingpowercode.javase.day09.test004;

public class User {
	// 无参数构造方法
	public User() {
		System.out.println("User's Default Constructor Invoke!");
	}

	// 有参数的构造方法
	public User(int i) {
		System.out.println("User's Default Constructor Invoke!");
	}

	public User(String name) {
		System.out.println("带有String类型的构造器");
	}

	public User(int i, String name) {
		System.out.println("带有int、String类型的构造器");
	}
}
