package CourseReview.DataType004;

public class IntTest02 {

	public static void main(String[] args) {
		int a = 100;
		System.out.println(a);
		
		//小容量可以自动转换成大容量
		long b = 200;
		System.out.println(b);
		
		long c = 300L;
		System.out.println(c);
		
		long d = 2147483647;
		System.out.println(d);
		
		//int的最大值为2147483647
		//long d = 2147483648;
		
		long f = 2147483648L;
		System.out.println(f);
		
		
	}
}
