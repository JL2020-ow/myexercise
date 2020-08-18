package CourseReview.ControlStatement006;
/*
题目：
		1、系统接收一个学生的考试成绩，根据考试成绩输出成绩的等级。

		2、等级：
			优：[90~100]
			良：[80~90) 
			中：[70-80)
			及格：[60~70)
			不及格：[0-60)

		3、要求成绩是一个合法的数字，成绩必须在[0-100]之间，成绩可能带有小数。

		必须使用switch语句来完成，你该怎么办？
*/
import java.util.Scanner;
public class SwitchTest02 {
	public static void main(String[] args) {
		while(true) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入学生成绩");
		double score = s.nextDouble();
		if(score < 0 || score > 100) {
			System.out.println("对不起，您输入的成绩不合法，请重新输入！");
			continue;
		}else {
			int grade = (int)(score/10);
			String str = "不及格"; //一般设置最后的判断条件
			switch(grade) {
			case 10:case 9:
				str = "优秀";
				break;
			case 8:
				str = "良";
				break;
			case 7:
				str = "中";
				break;
			case 6:
				str = "及格";
			}
			System.out.println(str);
		}
		break;
	 }
	}
}
