/*
小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。

这个题目最主要练习是：
	while循环 + 计数。
*/

package CourseReview.ControlStatement006;
import java.util.*;
public class HomeWork07 {
	public static void main(String[] args) {
		int day = 0;
		double money = 0;
		/*
		  while(true) {
			day++;
			money += 2.5;
			//如果天数是5的倍数，则花去6元
			if(day % 5 == 0) {
				money -= 6.0;
			}
			if(money >= 100) {
				break;
			}
		}
		*/
		while(money <100) {
			day++;
			money += 2.5;
			if(day % 5 ==0) {
				money -=6.0;
			}
			
		}
		System.out.println("小芳通过"+day+"天"+"攒够了"+money+"元");
	}
}
