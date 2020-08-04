package CourseReview.OperatorTest005;

public class HomeWork03 {

	public static void main(String[] args) {
		int i = 5;
		int j = 5;
		int m = 5;
		int n = 5;
		i++; // 这行代码执行结束之后，i是6
		j = j + 1; // 这行代码执行结束之后，j是6
		m--; // 这行代码执行结束之后，m是4
		n = n - 1; // 这行代码执行结束之后，n是4
		System.out.println("i = " + i); // 6
		System.out.println("i++ = " + i++); // 6（虽然输出结果是6，但是你别忘了这行代码执行结束之后i就是7了。）
		System.out.println("++i = " + ++i); // 8（这行代码执行结束之后，i本身的值变成了8）
		System.out.println("i-- = " +i--); // 8（这行代码执行结束之后，i本身的值变成了7）
		System.out.println(); // 小括号中什么也没有，空白，表示换行
		System.out.println("j = " + j);//6
		System.out.println("j++ = " + j++);//6 此行执行后j实际值为7
		System.out.println("j-- = " + j--);//7 此行执行后j实际值为6
		System.out.println("--j = " + --j);//5
		System.out.println();
		System.out.println("m = " + m);//4
		System.out.println("n = "+ n);//4
	}

}
