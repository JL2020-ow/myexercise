package com.beijingpowercode.javase.day09.test004;

/**
 * @author fwm 账户类
 */
// 无参数构造器
public class Account {
	// 账号
	private String actno;// 实例变量/对象变量，也就是说，必须先有对象才能有对应的实例变量。
	// 余额
	private double balance;

	
	 public Account() { 
		 //初始化实例变量的空间 
		 //actno=null;
		 //balance=0.0; 
		 }
	 
	public Account(String s) {
		actno = s;
		// balance=0.0;
	}

	public Account(double d) {
		// actno=null;
		balance = d;
	}

	public Account(String s, double d) {
		actno = s;
		balance = d;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
