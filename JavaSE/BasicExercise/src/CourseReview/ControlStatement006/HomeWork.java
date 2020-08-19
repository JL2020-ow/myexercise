package CourseReview.ControlStatement006;
/*
根据指定月份，打印该月份所属的季节。
	3,4,5 春季 
	6,7,8 夏季 
	9,10,11 秋季 
	12, 1, 2 冬季
	if和switch各写一版
*/
import java.util.Scanner;
public class HomeWork {
	public static void main(String[] args) {
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("请输入合法的数字【该数字可以是：1 2 3 4 5 6 7 8 9 10 11 12】");
			int i = s.nextInt();
			String str = null;
			if(i < 0 || i > 12) {
				System.out.println("对不起，您输入的数字不合法，请重新输入");
				continue;
			}else {
				switch(i) {
				case 3:case 4:case 5:
					str = "春季";
					break;
				case 6:case 7:case 8:
					str = "夏季";
					break;
				case 9:case 10:case 11:
					str = "秋季";
					break;
				case 12:case 1:case 2:
					str = "冬季";
					break;
				}
				System.out.println(str);
			}
			break;
		}
	}
}

