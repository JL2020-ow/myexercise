package CourseReview.ControlStatement006;
/*
switch语句：
	1、switch语句也是选择语句，也可以叫做分支语句。
	2、switch语句的语法格式

		switch(值){
		case 值1:
			java语句;
			java语句;...
			break;
		case 值2:
			java语句;
			java语句;...
			break;
		case 值3:
			java语句;
			java语句;...
			break;
		default:
			java语句;
		}

		以上是一个完整的switch语句：
			其中：break;语句不是必须的。default分支也不是必须的。

		switch语句支持的值有哪些？
			支持int类型以及String类型。
			但一定要注意JDK的版本，JDK8之前不支持String类型，只支持int。
			在JDK8之后，switch语句开始支持字符串String类型。

			switch语句本质上是只支持int和String，但是byte,short,char也可以
			使用在switch语句当中，因为byte short char可以进行自动类型转换。

			switch语句中“值”与“值1”、“值2”比较的时候会使用“==”进行比较。

	3、switch语句的执行原理
		拿“值”与“值1”进行比较，如果相同，则执行该分支中的java语句，
		然后遇到"break;"语句，switch语句就结束了。

		如果“值”与“值1”不相等，会继续拿“值”与“值2”进行比较，如果相同，
		则执行该分支中的java语句，然后遇到break;语句，switch结束。

		注意：如果分支执行了，但是分支最后没有“break;”，此时会发生case
		穿透现象。

		所有的case都没有匹配成功，那么最后default分支会执行。
*/
import java.util.*;
public class SwitchTest01 {
	public static void main(String[] args) {
		while(true) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入[0,6]的整数：");
		int num = s.nextInt();
		if(num < 0 || num > 6) {
		   System.out.println("对不起，输入的数字不合法，请重新输入！");
		   continue;
		}else{
		switch(num) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		default:
			System.out.println("星期日");
		}
	   }
		break;
	  }
	}
}
