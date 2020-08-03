package com.beijingpowercode.javase.day09.test004;
/**
 * eclipse快速编辑，支持多行同时编辑：块编辑
 */
public class ConstructorTest03 {

	public static void main(String[] args) {
		Customer c1=new Customer();
		System.out.println(c1.getNo());
		System.out.println(c1.getName());
		System.out.println(c1.getBirth());
		
		Customer c2=new Customer(1111,"zhangsan","1980-10-11");
		System.out.println(c2.getNo());
		System.out.println(c2.getName());
		System.out.println(c2.getBirth());
		
	}                       

}
