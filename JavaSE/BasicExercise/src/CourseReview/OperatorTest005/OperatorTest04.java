package CourseReview.OperatorTest005;

public class OperatorTest04 {
	public static void main(String[] args) {
		// 赋值运算符“=”右边优先级比较高，先执行右边的表达式
		// 然后将表达式执行结束的结果放到左边的“盒子”当中。（赋值）
		int i = 10;
		// 重新赋值
		i = 20;

		byte b = 10;
		b = 20;

		/*
			以 += 运算符作为代表，学习扩展赋值运算符。
			其它的运算符，例如：-= *= /= %= 和 += 原理相似。
		*/
		int k = 10;
		k += 20; // k变量追加20
		System.out.println(k); // 30

		int m = 10;
		// += 运算符类似于下面的表达式
		m = m + 20;
		System.out.println(m); // 30

		// 研究：
		// i += 10 和 i = i + 10 真的是完全一样吗？
		// 答案：不一样，只能说相似，其实本质上并不是完全相同。
		byte x = 100; // 100没有超出byte类型取值范围，可以直接赋值
		System.out.println(x); // 100

		// 分析：这个代码是否能够编译通过？
		// 错误: 不兼容的类型: 从int转换到byte可能会有损失
		//x = x + 1; // 编译器检测到x + 1是int类型，int类型可以直接赋值给byte类型的变量x吗？

		// 使用扩展赋值运算符可以吗？
		// 可以的，所以得出结论：x += 1 和 x = x + 1不一样。
		// 其实 x += 1 等同于：x = (byte)(x + 1);
		x += 1;
		System.out.println(x); // 101

		// 早就超出byte的取值范围了。
		x += 199; // x = (byte)(x + 199);
		System.out.println(x); // 44 （当然会自动损失精度了。）

		int y = 100;
		y += 100;
		System.out.println(y); // 200

		y -= 100; // x = x - 100;
		System.out.println(y); // 100

		y *= 10; // x = x * 10;
		System.out.println(y); // 1000

		y /= 30; // x = x / 30;
		System.out.println(y); // 33

		y %= 10; // x = x % 10;
		System.out.println(y); // 3
	}
}
