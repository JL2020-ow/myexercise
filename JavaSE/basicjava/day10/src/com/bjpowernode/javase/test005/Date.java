package com.bjpowernode.javase.test005;

/**
 * 自定义的日期类型
 *this可以用在哪里？
 *   1、可以使用在实例方法当中，代表当前对象【语法格式:this. 】
 *   2、可以使用在构造方法当中，通过当前的构造方法调用其他的构造方法。【语法格式:this() 】
 *   重点：this()只能出现在构造方法（函数）的第一行。 
 */
public class Date {
	// 属性
	private int year;
	private int month;
	private int day;

	// 构造函数、构造器
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
	 * 需求：当用户调用以下无参数的构造方法对的时候，默认创建的日期是1970-1-1
	 */
        /*
	public Date() {
		this.year = 1970;
		this.month = 1;
		this.day = 1;
	}*/
        //以上代码可以通过调用另一个构造方法来完成
        //但前提是不能创建新的对象。
        //new Date(1970,1,1);
	 //需要采用以下的语法来完成构造方法的调用。
	//这种方式不会创建新的java对象，但同时又可以达到调用其他的构造方法的目的。
	public Date() {
		this(1970,1,1);
	}
	// 构造方法
	// setter and getter
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
     //对外提供一个方法可以将日期打印输出到控制台
	 public void print() {
		 System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
	 }
}
