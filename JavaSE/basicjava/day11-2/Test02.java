 package com.bjpowernode.javase.day11;

 public class Test02
 {
 	public static void main(String[] args) {
 		
 		com.bjpowernode.javase.day11.Test01 t = new com.bjpowernode.javase.day11.Test01();
 		System.out.println(t); //com.bjpowernode.javase.day11.Test01@15db9742

 		//可以省略包名，因为Test01和Test02在同一个软件包当中。
 		Test01 tt = new Test01();
 		System.out.println(tt); //com.bjpowernode.javase.day11.Test01@15db9742


 	}
 }