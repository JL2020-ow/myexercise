package CourseReview.ControlStatement006;
import java.util.*;
public class HomeWork03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("请输入一个整数以判断其奇偶性，输入0退出该系统");
			int value = s.nextInt();
			if(value == 0) {
				return;
			}	
			//System.out.println( value % 2 ==1 ? "奇数" :"偶数");
			System.out.println(value % 2 == 0 ? "偶数" : "奇数");
		}
	}
}
