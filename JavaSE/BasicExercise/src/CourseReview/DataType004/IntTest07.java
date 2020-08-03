package CourseReview.DataType004;

public class IntTest07 {
	public static void main(String[] args) {
		long a = 10L;
		char c = 'a';
		short s = 100;
		int i = 30;
		
		//求和
		System.out.println(a+c+s+i);
		
		int x = (int)(a+c+s+i);
		System.out.println(x);
		
		// java中规定，int类型和int类型做基本运算最终的结果还是int类型。
		int temp = 10/3;
		System.out.println(temp);
		
		int temp1 = 1/2;
		System.out.println(temp1);
	}
}
