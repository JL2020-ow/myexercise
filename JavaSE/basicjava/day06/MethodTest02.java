/*
  以下直接使用方法这种机制【这个例子不讲方法的语法】，分析程序的优点?
     *代码得到了重复利用
   
  方法的本质是什么？
      *方法就是一段代码片段，并且这段代码片段
      可以完成某个特定的功能，并且可以重复地使用。
    方法，对应的英文单词是method
    方法在C语言中叫做函数/Function
    
    方法定义在类体当中，在一个类当中可以定义多个方法，方法编写的位置没有先后
    顺序，可以随意。
    
    方法体当中不能再定义方法！！
    
    方法体中的代码由java语句构成，方法体中的代码遵循自上而下的顺序依次执行。
*/
public class MethodTest02
{
	public static void main(String[] args)
	{
		//计算两个int类型数据的和。
		MethodTest02.sumInt(10,20);
		
		MethodTest02.sumInt(666,888);
		
		MethodTest02.sumInt(111,222);
	}
	//单独定义一个方法
		//该方法完成计算两个int类型数据的和，并且将结果输出。
		public static void sumInt(int a,int b)
		{
			int c=a+b;
			System.out.println(a+"+"+b+"="+c);
		}
}