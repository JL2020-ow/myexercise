/*
   关于布尔型数据类型：
     boolean

	 在java语言中boolean类型只有两个值：true,false,没有其他值。
	 不像C语言中，0和1可以表示真和假。
	 
	 在底层存储的时候boolean类型占用1个字节，因为实际存储的时候false底层是0，true底层是1。

	 布尔类型在实际开发中非常重要，经常使用在逻辑运算和条件控制语句当中。
*/
public class DataTypeTest07
{
	public static void main(String[] args)
	{
		boolean LoginSuccess=true;

		if (LoginSuccess)
		{
			System.out.println("恭喜你，登录成功");
		}
		else
		{
			System.out.println("对不起，用户名不存在或者密码错误");
        }
	}

}