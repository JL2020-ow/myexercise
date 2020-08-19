package CourseReview.ControlStatement006;

import java.util.Scanner;

public class HomeWork02{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数字以便判断正负");
		double value = s.nextDouble();
		//判断该数字的正负性
//        if(value < 0) {
//			System.out.println("负数");
//		}else {
//			System.out.println("正数");
//		}
		System.out.println(value < 0 ? "负数" : "正数" );
	}
}
