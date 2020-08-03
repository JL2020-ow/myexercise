
/*
  关于java语言中的char类型：
       转义字符
	   转义字符出现在特殊字符之前，会将特殊字符转换成普通字符。

	   \n 换行符
	   \t 制表符
	   \' 普通的单引号
	   \\ 普通的反斜杠
	   \" 普通的双引号
*/
public class DataTypeTest03
{
	public static void main(String[] args)
	{
		//普通的n字符
		char c1='n';
		System.out.println(c1);

		char c2='\n';// 这是一个换行符，属于char类型的数据，“\n”在java语言中具有转义功能。

		System.out.println("Hello"); //ln具有换行功能，没有ln则不换行
		System.out.println("World");

		System.out.print("Hello"); //ln具有换行功能，没有ln则不换行
		System.out.println("World");
		//System.out.print()和System.out.println的区别：
		//println表示输出之后换行，print表示输出，但是不换行。

		System.out.println("A");
		System.out.print(c2);
		System.out.println("B");

        //普通的t字符
		char x='t';
		System.out.println(x);
        //制表符tab 空格和制表符ASCII码不一样,体现在键盘上连个不同的按键
		char y='\t';
		System.out.println("A");
		System.out.print(y);
		System.out.println("B");
        //abc	d ef
		//要求在控制台输出"反斜杠”
		//反斜杠将后面的单引号转义成不具备特殊含义的普通单引号字符
		//左边的单引号缺少了结束的单引号字符，编译报错
		/*
		char k='\';
		System.out.println(k);
		*/
		char k='\\';
		System.out.println(k):
        //解释:第一个反斜杠具有转义功能，出现在特殊字符之前，将后面的反斜杠转义为普通的反斜杠字符。
		//结论：在java当中两个反斜杠代表一个普通斜杠字符。
		//在控制台上输出一个普通的单引号\

		//java中不允许编写这样的程序，编译报错，以下编译报错
		//char a=''';
		//char a=''; 
		//第一个和第二单引号配对，最后的单引号找不到另一半。
		char a='\''
		System.out.println(a);
		//反斜杠具有转义功能，将第二个单引号转换成普通的单引号字符。

		char f='"';
		System.out.println(f);

		System.out.println("HelloWorld!");
		System.out.println("“HelloWorld!”"）;
		//编译报错
		//System.out.println(""HelloWorld!""）;

		System.out.println("\"HelloWorld!\""）;
		char m='中';

		System.out.println(m）;
		char n='\u4e2d';//'中'对应的unicode编码形式
		System.out.println(n);
        //反斜杠u联合起来后面的一段一串数字是某个文字的unicode编码

		//JDK中自带的native2ascii.exe命令，可以将文字转换成unicode编码形式。

	}
}