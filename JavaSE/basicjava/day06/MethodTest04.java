public class MethodTest04
{
	public static void sum(int a,int b){

		System.out.println(a+"+"+b+"="+(a+b));

		//调用doSome方法
		MethodTest04.doSome();
	}
	//主方法
	public static void main(String[] args){	

	 //调用sum方法
	 MethodTest04.sum(1,2);//首先执行

	 System.out.println("Hello World");	//最后执行
	}
	public static void doSome(){

		System.out.println("do some!");
	}
}