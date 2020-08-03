package com.bjpowernode.javase.test009;

public class ChineseTest {
	public static void main(String[] args) {
		// 创建“中国人”对象１
		Chinese zhangsan = new Chinese("1", "张三", "中国");
		System.out.println(zhangsan.id + "," + zhangsan.name + "," + zhangsan.country);

		// 创建“中国人”对象２
		Chinese lisi = new Chinese("2", "李四", "中国");
		System.out.println(lisi.id + "," + lisi.name + "," + lisi.country);
		// 创建“中国人”对象3
		Chinese wangwu = new Chinese("3", "王五", "中国");
		System.out.println(wangwu.id + "," + wangwu.name + "," + wangwu.country);
		
		System.out.println(Chinese.country);		
		System.out.println(zhangsan.country);
		zhangsan=null;
		//所以静态的数据都是可以采用类名.，也可以采用引用.，但是建议采用类名.的方式访问。
		//采用引用.的方式访问的时候，即使引用是null,也不会出现空指针异常。因为访问静态的数据不需要对象的存在。
		System.out.println(Chinese.country);		
	}
}
