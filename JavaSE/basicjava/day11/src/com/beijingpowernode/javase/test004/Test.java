package com.beijingpowernode.javase.test004;
//eclipse导入类的快捷键： ctrl +shift +o

import java.util.Date;

//eclipse导入类的快捷键：ctrl + shift + o
import com.beijingpowernode.javase.test001.Cat;

public class Test {

	public static void main(String[] args) {
		//编译错误
		//Cat c = new Cat();
		/*
		com.beijingpowernode.javase.test002.Cat = new com.beijingpowernode.javase.test002.Cat();
		System.out.println(c);
		*/
		
		Cat c = new Cat();
		System.out.println(c);
		
		Date t = new Date();
		System.out.println(t);//Sat Apr 18 18:28:41 CST 2020
	}

}
