/*
   注意：在editplus中，字体颜色为红色的表示一个类的名字，并且这个类是JavaSE中自带的。
        我们自定义的类MethodTest01,字体颜色是黑色，是标识符。
	只要是类名就一定是标识符。
	
   重点：方法调用的时候，在参数传递的时候，实际上传递的是变量中保存的那个"值"传过去了。
 */
public class MethodTest01
{
	public static void main(String[] args){
		int a=10;
		int b=20;

		int retValue=sumInt(a,b);

		System.out.println("retValue ="+retValue);
	}
	public static int sumInt(int i,int j){
		int result=i+j;
		int num=3;
		int retValue=divide(result,num);
		return retValue;	
	}
	public static int divide(int x,int y){
		int z=x/y;
		return z;
	}
}
/*
  画图依据：
     1、只要涉及到参数传播的问题，传递的变量是保存的值。
     2、画图的时候，必须遵循“方法自上而下的顺序一次执行”这个原则。
*/
