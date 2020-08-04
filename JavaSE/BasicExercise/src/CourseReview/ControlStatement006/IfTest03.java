package CourseReview.ControlStatement006;
/*      1、系统接收一个学生的考试成绩，根据考试成绩输出成绩的等级。

		2、等级：
			优：[90~100]
			良：[80~90) 
			中：[70-80)
			及格：[60~70)
			不及格：[0-60)

		3、要求成绩是一个合法的数字，成绩必须在[0-100]之间，成绩可能带有小数。
 */
import java.util.*;
public class IfTest03 {
	public static void main(String[] args) {
		while(true) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入考试成绩：");
		double score = s.nextDouble();
		String str = "优";
		if(score < 0 || score > 100) {
			System.out.println("对不起，您输入的成绩不合法，请重新输入");
			continue;
		}else if(score < 60) {
			str = "不及格";
		}else if(score < 70) {
			str = "及格";
		}else if(score < 80) {
			str = "中";
		}else if(score < 90) {
			str ="良";
		}
		System.out.println(str);
		break;
	 }
	}
}
