/*关于java语言中的变量：

  1、在方法体中的java代码，是遵守自上而下的顺序依次执行的。
       第一行；
	   第二行；
	   第三行；
	   特点：第二行代码必须完整的结束之后，第三行代码才能执行。
  2、在同一个“作用域”当中，变量名不能重名，但是变量可以重新赋值。

*/
public class VarTest02
{
	public static void main(String[] args)
	{
		int i=100;
		System.out.println(i);
		i=200;
		System.out.println(i);
	}
}
