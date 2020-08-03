package CourseReview.DataType004;

public class FloatTest01 {
	public static void main(String[] args) {
		double pi = 3.1415926;
		System.out.println(pi);
		
		/*
		 * float f = 3.14f; 
		 * System.out.println(f);
		 */
		
		/*
		 * float f = 3.14F; 
		 * System.out.println(f);
		 */		
		//错误，类型不兼容
		//float f = 3.14;
		
		float f = (float)3.14;
		System.out.println(f);
		
		int i = (int)10.0/5;
		System.out.println(i);
		
		int j =(int)(10.0/5);
		System.out.println(j);
		
	}
}
