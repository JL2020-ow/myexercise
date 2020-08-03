package com.beijingpowernode.javase.test001;

public class Test2 {

	public static void main(String[] args) {
		
		//父类型引用指向子类型对象
		//向上转型
		Animal a1 = new Cat();
		Animal a2 = new Bird();
		
		//向下转型【只有当访问子类对象当中特有的方法】
		if(a1 instanceof Cat) {
		Cat c1 = (Cat)a1;
		c1.catchMouse();
		}
		if(a2 instanceof Bird) {
		Bird b1 = (Bird)a2;
		b1.fly();
		}
	}

}
