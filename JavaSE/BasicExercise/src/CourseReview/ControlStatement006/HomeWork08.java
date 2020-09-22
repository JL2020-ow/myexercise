/*
一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
找出1000内所有的完数。

什么是完数？
	一个数如果恰好等于它的因子之和，这个数就是完数。

那么因子怎么找？
	10的因子？
		10 % 1 == 0
		10 % 2 == 0
		10 % 5 == 0
	不算10本身。
	10的因子：
		1 + 2 + 5 = 8

运行结果：
	6
	28
	496
*/
package CourseReview.ControlStatement006;

public class HomeWork08 {
	public static void main(String[] args) {
		//1不属于完数，所以从2 开始
		for(int i =2 ; i <=1000 ; i++ ) {//查找完数
			int sum = 0;
			for(int j = 1 ; j <= i/2 ; j++) { //查找因子
				if(i % j ==0) {
					sum += j;
				}
			}
			if(i == sum) {
				System.out.println(i);
			}
		}	
	}
}
