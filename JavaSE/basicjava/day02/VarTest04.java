/*
  关于变量的分类：
      根据变量声明的位置来分类：
	  *局部变量
	   -在方法体当中声明的变量叫做局部变量
	  *成员变量
	   -在方法体外声明【类体之内】声明的变量叫做成员变量
	   在不同的作用域中，变量名是可以相同的。
	   在同一个作用域中，变量名不可以重名。
*/
public class VarTest04
{
	int k=200;//成员变量
	public static void main(String[] args)
	{
		//i变量就是局部变量
		int i=3;//java遵循就近原则
		System.out.println(i);
	}
	//成员变量
	static int i=100;
    //类体中不能直接编写java语句【除声明变量之外】
	public static void doSome()//doSome方法
	{
		//局部变量
		int i=90;
	}
}