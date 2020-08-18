package CourseReview.ControlStatement006;

public class ForTest04 {
	public static void main(String[] args) {
		//第一种方案：
		// 思路：先找出1~100所有的奇数，然后再考虑求和的事儿。
		// 第一步：先从1取到100，一个数字一个数字取出来。
		// 第二步：既然可以得到每一个数字，那么我们进一步判断这个数字是否为奇数
		// 奇数对2求余数，结果都是1
		int sum = 0;
		for(int i = 1 ;i <= 100; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("1~100所有的奇数之和：" + sum);
		//第二种方案：这种方案效率高，因为循环次数比较少。
		// 之前的sum归0.重新求和。
		sum = 0;
		for(int i = 1;i <= 100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
	}
}
