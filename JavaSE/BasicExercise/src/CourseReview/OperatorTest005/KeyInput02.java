package CourseReview.OperatorTest005;
import java.util.*;
public class KeyInput02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("欢迎使用小型迷你计算器");
		System.out.print("请输入第1个数字：");
		int num1 = s.nextInt();
		System.out.print("请输入第2个数字：");
		int num2 = s.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}
}
