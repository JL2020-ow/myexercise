/*
  continue语句：
       1、continue表示：继续/go on
       2、continue也是一个continue关键字加一个分号构成一个单独的完整的java语句，
         主要出现在循环语句当中用来控制循环的执行。
       3、break和continue的区别？
         *break表示循环不执行,跳出循环，终止循环。
         *continue表示终止当前本次循环，直接进入下一次循环继续执行。
       4、continue也有这样的语法：
          continue 循环名称;【作为了解内容】
*/
public class ContinueTest01
{
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println("i = "+i); //0 1 2 3 4 5
		}
		 System.out.println("Hello World");
		 
		 myFor: for(int i=0;i<10;i++)
		 {
		 	 if(i==5)
		 	 {
		 	 	 continue myFor;//只要这个语句执行，当前本次循环停止，直接进入下一次循环“继续”执行
		 	 }
		 	 System.out.println("i = "+i);//0 1 2 3 4  6 7 8 9 
		 }
		 System.out.println("Hello World");
	}
}