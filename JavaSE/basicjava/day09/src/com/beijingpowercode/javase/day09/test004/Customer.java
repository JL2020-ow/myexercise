package com.beijingpowercode.javase.day09.test004;

public class Customer {
	private int no;
	private String name;
	private String birth;
	public Customer() {
	}
	public Customer(int no) {
		this.no = no;
	}
	public Customer(int a, String b, String c) {
		no = a;
		name = b;
		birth = c;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}
