/*
从键盘接收一个正整数，该正整数作为行数，输出以下图形
    *
   ***
  *****
 *******
*********
例如：输入5，则打印如上图5行。

空格的规律：
	第1行4个空格(5-1)
	第2行3个空格(5-2)
	第3行2个空格(5-3)
	第4行1个空格(5-4)
	第5行0个空格(5-5)

星号的规律：
	第1行1个
	第2行3个
	第3行5个
	第4行7个
	.....

	行号 * 2 - 1
*/
package CourseReview.ControlStatement006;
import java.util.*;
public class HomeWork06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个正整数作为行数");
		int rows = s.nextInt();
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j < rows - i ; j++) {
				System.out.print(" ");//输出空格
			}
			for(int k = 0 ; k < (i*2)-1 ; k++ ) {
				System.out.print("*");//输出*
			}
			System.out.println();//换行
		}
	}
}
