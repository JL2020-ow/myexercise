package CourseReview.OperatorTest005;

public class OperatorTest03 {

	public static void main(String[] args) {
		//逻辑与
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & false);
		
		System.out.println(100 > 90 & 100 > 101); //false
		System.out.println((100 > 90) & (100 > 101) ); //false
		
		int a = 100;
		int b = 101;
		int c = 90;
		System.out.println(a < b & a > c);//true
		
		//逻辑或
		System.out.println(a < b | a > c);//true
		System.out.println(true | true); //true
		
		System.out.println(true | false );//true
		System.out.println(false | false );//false
		
		System.out.println(!true);//false
		System.out.println(!false);//true
		System.out.println(!(a>b));//true
		
		/*
		关于短路与 &&，短路或 ||
		其中重点学习短路与，短路或照葫芦画瓢。

		短路与&& 和 逻辑与 &有什么区别？
			首先这两个运算符的运算结果没有任何区别，完全相同。
			只不过“短路与&&”会发生短路现象。

		什么是短路现象呢？
			右边表达式不执行，这种现象叫做短路现象。

		什么时候使用&&，什么时候使用& ？
			从效率方面来说，&&比&的效率高一些。
			因为逻辑与&不管第一个表达式结果是什么，第二个表达式一定会执行。

			以后的开发中，短路与&&和逻辑与还是需要同时并存的。
				大部分情况下都建议使用短路与&&
				只有当既需要左边表达式执行，又需要右边表达式执行的时候，才会
				选择逻辑与&。
	    */
		System.out.println(true & true);//true
		System.out.println(true & false );//false
		System.out.println(false & false);//false
		
		System.out.println(true && true);//false
		System.out.println(true && false);//false
		System.out.println(false && false);//false
		
		int x = 10;
		int y = 11;
		/*
		 * 逻辑与&什么时候结果为true（两边都是true，结果才是true） 
		 *  左边的 x>y 表达式结果已经是false了，其实整个表达式的结 
		 * 果已经确定是false了，按道理来说右边的表达式不应该执行。
		 */		
		System.out.println(x > y & x > y++);//false
		System.out.println(y);//12
		
		int m = 10;
		int n = 11;
		// 使用短路与&&的时候，当左边的表达式为false的时候，右边的表达式不执行
        //这种现象被称为短路。
		System.out.println(m > n && m > n++);//false
		System.out.println(n);//11
		
		int x1 = 10;
		int y1 = 11;
		System.out.println(x1 > y1 | x1 > y1++);//false
		System.out.println(y1);//12
		
		int m1 = 10;
		int n1 = 11;
//		System.out.println(m1 > n1 || m1 > n1++);//false
		System.out.println(n1);//12
		System.out.println(m1 < n1 || m1 > n1++);//true
		System.out.println(n1);//11
		/**
		 * 短路或：只要左边结果为true，则右边不执行。
		 * 短路与：只要左边结果是false,则右边不执行。
		 */
	}
}
