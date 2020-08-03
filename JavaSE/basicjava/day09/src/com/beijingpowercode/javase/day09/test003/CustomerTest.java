package com.beijingpowercode.javase.day09.test003;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c = new Customer();
		//私有的属性不能在外部直接访问，这就是封装
		//c.id=410;
		
		//操作入口变成了只通过set和get方法进行访问
		//在set方法和get方法执行过程中可以进行安全过滤。
		c.setId(100);
		c.setName("张三");
		c.setAge(30);
		c.setAddr("北京大兴区");

		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAddr());
	}
}
