package CourseReview.MethodAndRecursion07;

public class RecursionTest02 {
	public static void main(String[] args) {
		int realValue = sum(10);
		System.out.println(realValue);
		
		int realValue2 = sum(3);
		System.out.println(realValue2);
	}
	public static int sum(int n) {
		int result = 0;
		for(int i =0 ; i <= n ; i++) {
			result += i;
		}
		return result;
	}
}
