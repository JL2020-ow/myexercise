package com.bjpowernode.javase.test004;
//用户类
public class User {
  //属性
	private int id;//实例变量
	private String name;
	//构造函数
	public User() {
		
	}
	/*
	public User(int a,String s) {
		id=a;
		name=s;
	}*/
	public User(int id,String name) {
		this.id=id;
		this.name=name;
	}
	//setter and getter
	/*
	public void setId(int a) {
		//this.id=a;//完整写法
		id=a;
	}*/
	//以下程序的id和实例变量id无关，不能采用这种方式
	/*
	public void setId(int id) {
		//this.id=a;//完整写法
		id=id;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * 	//正确方式：
	public void setId(int id) {
		//this.id=a;//完整写法
		//等号前边对的this.id是实例变量id
		//等号后面的id是局部变量id
		//用来区分实例变量和局部变量的时候，this不能省略。
		this.id=id;
	}*/
}
