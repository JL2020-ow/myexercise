package CourseReview.OperatorTest005;

public class OperatorTest01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("====================");
		int i = 10;
		i++;
		System.out.println(i);//11
		
		int k = 10;
		++k;
		System.out.println(k);//11
		
		int m = 20;
		int n = m++;
		System.out.println(n);//20
		System.out.println(m);//21
		//n=m++ 先将20赋值给n,然后m进行自增运算。
		// 语法：当++出现在变量后，会先做赋值运算，再自加1
		
		int x = 100;
		int y = ++x;
		System.out.println(y);//101
		System.out.println(x);//101
		
		int c = 90;
		//c++;
		//System.out.println(c);//91
		System.out.println(c++);//90
		System.out.println(c);//91
		
		int d = 80;
		System.out.println(++d);//81
		System.out.println(d);//81
		
		//自减运算
		int x1 = 70;
		int x2 = x1--;
		System.out.println(x2);//70
		System.out.println(x1);//69
		
		int y1 = 60;
		int y2 = --y1;
		System.out.println(y2);//59
		System.out.println(y1);//59
		
		int z1 = 50;
		System.out.println(z1--);//50
		System.out.println(z1);//49
		
		int z2 = 40;
		System.out.println(--z2);//39
		System.out.println(z2);//39
	}
}
