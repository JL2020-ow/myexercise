package CourseReview.DataType004;
/*
1、计算机在任何情况下都只能识别二进制
2、计算机在底层存储数据的时候，一律存储的是“二进制的补码形式”
	计算机采用补码形式存储数据的原因是：补码形式效率最高。
3、什么是补码呢？
	实际上是这样的，二进制有：原码 反码 补码 
4、记住：
	对于一个正数来说：二进制原码、反码、补码是同一个，完全相同。
		int i = 1;
		对应的二进制原码：00000000 00000000 00000000 00000001
		对应的二进制反码：00000000 00000000 00000000 00000001
		对应的二进制补码：00000000 00000000 00000000 00000001
	对于一个负数来说：二进制原码、反码、补码是什么关系呢？
		byte i = -1;
		对应的二进制原码：10000001
		对应的二进制反码（符号位不变，其它位取反）：11111110
		对应的二进制补码（反码+1）：11111111
5、分析 byte b = (byte)150;
	这个b是多少？
		int类型的4个字节的150的二进制码是什么？
			00000000 00000000 00000000 10010110
		将以上的int类型强制类型转为1个字节的byte，最终在计算机中的二进制码是：
			10010110
	
	千万要注意：计算机永远存储的都是二进制补码形式。也就是说上面
	10010110 这个是一个二进制补码形式，你可以采用逆推导的方式推算出
	这个二进制补码对应的原码是啥！！！！！！
		10010110 ---> 二进制补码形式
		10010101 ---> 二进制反码形式
		11101010 ---> 二进制原码形式 
*/
public class IntTest05 {

	public static void main(String[] args) {
		byte b = (byte)150;
		System.out.println(b);
	}
}
