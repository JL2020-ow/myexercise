package CourseReview.MethodAndRecursion;

public class HelloWorld {
	public static void main(String[] args) {
		S.p("Hello World !");
		S.p(100);
		S.p('a');
		S.p(true);
		S.p(100 + 200);
		S.p(10 / 3);

		System.out.println("================");
		HelloWorld.hehe();
		hehe();
	}
	
	public static void hehe() {
		System.out.println("Hello World !");
	}
}
