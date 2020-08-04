package CourseReview.OperatorTest005;

public class HomeWork02 {
	public static void main(String[] args) {
		int x = 10;
		int a = x + x++;
		System.out.println("a = " + a); //20
		System.out.println("x = " + x); //11
		
		int y = 10;
		int b = y + ++y;
		System.out.println("b = " + b); //21
		System.out.println("y = " + y); //11
		
		int z = 10;
		int c = z + z--;
		System.out.println("c = " + c);//20
		System.out.println("z = " + z);//9
		
		int z1 = 10;
		int d =  z1 + --z1;
		System.out.println("d = " + d);//19
		System.out.println("z1 = " + z1);//9
	}
}
