package CourseReview.OperatorTest005;
import java.util.*;
public class KeyInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.println("请输入您的数字是："+ i);
		
		String str = s.next();
		System.out.println("您输入了:" + str);
		
		System.out.println("请输入用户名");
		String name = s.next();
		System.out.println("欢迎" + name + "回来");
	}
}
