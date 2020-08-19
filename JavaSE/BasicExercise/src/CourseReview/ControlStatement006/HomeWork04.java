package CourseReview.ControlStatement006;
/*
整数大小比较：输入两个整数，比较大小，
	若x>y 输出 >
	若x=y 输出 =
	若x<y 输出 <
*/

import java.util.*;
public class HomeWork04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		System.out.print("请输入第1个数字：");
		int x = s.nextInt();
		System.out.print("请输入第2个数字：");
		int y = s.nextInt();
		if(x > y){
			System.out.println(x + ">" + y);
		}else if(x == y){
			System.out.println(x + "=" + y);
		}else{
			System.out.println(x + "<" + y);
		}
		// 同学们尝试一下使用多个三目运算符如何表述以上程序。
	}
}    