package com.bjpowernode.javase.test009;
/**
 * “中国人”类
 * 什么时候成员变量声明为实例变量呢？
 * 　　　－所有对象都有这个属性，但是这个属性的值会随着对象的变化而变化【不同对象的这个属性具体的值不同】
 *什么时候成员变量声明为静态变量呢？
	　　　－所有对象都有这个属性，并且所有对象的这个属性的值是一样的，建议定义为静态变量，节省内存的开销。
 *静态变量在类加载的时候初始化，内存在方法区中开辟。访问的时候不需要创建对象，直接使用"类名.静态变量名"的方式访问。  
 *  关于java中的static关键字
 *     1、static英语单词翻译为静态的  
 *     2、static修饰的方法是静态方法
 *     3、static修饰的变量是静态变量
 *     4、所有static修饰的元素称为 静态的，都可以使用类名.的方式访问，当然也可以用引用.的方式访问【但是不建议】
 *     5、
 */
public class Chinese {
	//身份证号【每一个对象的身份证号不同】
	//实例变量
	 String id;
	//姓名【每一个对象的姓名不同】
	String name;
	//国籍【每一个对象由于都是由“中国人”这个类实例化化的。所以每一个中国人的国际都是中国】
	//无论通过Chinese类实例化多少个java对象，这些java对象的国籍都是“中国”
	//实例变量【实例变量是一个java对象就有一份，１００个java对象，就有１００个country】，分析这种方法有什么缺点？
	//实例变量存储java对象内部，在堆内存当中，在构造方法执行的时候初始化。
	//所有的中国人的国籍都是“中国”，这里声明为实例变量显然是不合适的，太浪费内存空间。没必要让每一个对象保留一份国籍内存。
	//国籍【所有对象国籍一样，这种特征属于类别的特征，可以提升为整个模板的特征，可以在变量前添加static关键字修饰】
	//静态变量，静态变量在类加载的时候初始化，不需要创建对象，内存就开辟了。
	//静态变量存储在方法区内存当中。
	
	static String country;
   	
	//构造函数
	public Chinese() {
		/*
		this.id=null;
		this.name=null;
		this.country=null;
		*/
	}
	public Chinese(String id,String name,String country) {
	this.id=id;
	this.name=name;
	this.country=country;
	}
}
