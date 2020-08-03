/*
  分析以下程序的输出结果
   main begin
   m1 begin
   m3 begin
   m3 over
   m2 over
   m1 over
   main over

   对于当前的程序来说：
   *main方法最先被调用，main方法也是最后一个结束。
   *最后调用的方法是m3方法，该方法最先结束。

   main方法结束之后，整个程序结束了【这句话只适合当前所讲内容。】

   不用去刻意记忆，
       只要记住方法中的代码是自上而下的顺序依次执行即可。
       当前行的程序在没有结束的时候，下一行代码是无法执行的。

*/
public class MethodTest07
{
	public static void main(String[] args){
		System.out.println("main begin");
		m1();//暂停
		System.out.println("main over");
	}

	public static void m1(){
		System.out.println("m1 begin");
		m2();//暂停
		System.out.println("m1 over");
	}

	public static void m2(){
		System.out.println("m2 begin");
		m3();//暂停
		System.out.println("m2 over");
	}
	public static void m3(){
		System.out.println("m3 begin");
		System.out.println("m3 over");
	}
}