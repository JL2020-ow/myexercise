package CourseReview.DataType004;

public class IntTest06 {
	public static void main(String[] args) {
		char c1 = 'a';
		byte b = 1;
		System.out.println(c1+b);//注意，这里的+号是求和用的。
		
		//short s = c1 + b;
		// 错误: 不兼容的类型: 从int转换到short可能会有损失
		//short s = c1 + b; // 编译器不知道这个加法最后的结果是多少。只知道是int类型。
		
		short s = (short)(c1+b);
		System.out.println(s);
		
		int a = 1;
		short x = (short)a;
		System.out.println(x);
	}
}
