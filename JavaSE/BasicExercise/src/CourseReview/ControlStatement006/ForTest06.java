package CourseReview.ControlStatement006;
/*
九九乘法表

1*1=1
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
1*4=4 2*4=8 3*4=12 4*4=16
....
......
1*9=9 2*9=18.............................9*9=81

各位，请找一下以上九九乘法表的特点？？？？？
	第一个特点：共9行。
	第二个特点：第1行1个。第2行2个。第n行n个。

最重要的是：不要慌，慢慢的把思路捋出来，再写代码。
*/
public class ForTest06 {
	public static void main(String[] args) {
		//循环9次
		for(int i = 1 ; i < 10 ; i++ ) {
			for(int j = 1 ; j < 10 ; j++) {
				System.out.print(i + "*" + j + "=" + (i * j));
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}
