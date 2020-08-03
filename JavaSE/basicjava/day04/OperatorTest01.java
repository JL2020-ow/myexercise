/*
  关于java中的赋值类运算符
     赋值类运算符包括两种：
        *基本的赋值运算符
            =
        *扩展的赋值运算符
            +=
            -=
            *=
            /=
            %=
     1、 赋值类运算符优先级：先执行等号右边的表达式，将执行的结果赋值给左边的变量。
     2、注意下列代码：
	  byte i=10;
	  i +=5;等同于i=(byte)(i+5);
	  int k=10;
	  k +=5;等同于：k=(int)(k+5);
	  long l=10L;
	  int y=20;
	  y +=x;等同于y=(int)(y+x);
	 3、重要结论：扩展类的赋值运算符不改变运算结果类型，假设最初这个变量的类型是byte类型，
	 无论怎么进行追加或追减，最终改变量的数据类型还是byte类型。

*/
  public class OperatorTest01
  {
    public static void main(String[] args)
{
	//基本的赋值运算符
     int i=10;
     i=i+5;
     
     System.out.println(i);//15

    //扩展的赋值运算符【+=运算符可以翻译为“追加/累加】
     i +=5;//等同于：i=i+5;

    System.out.println(i); //20

    i -=5;//等同于：i=i-5;
    
    System.out.println(i); //15

    i *=2; //等同于：i=i*2;
    
   System.out.println(i);//30
   
   i /=4; //等同于：i=i/4;
   
   System.out.println(i);// 7

   i %= 2; //等同于: i=i%2;
   
   System.out.println(i);//1
   //----------------------------------
   //10没有超出byte取值范围，可以直接赋值
   byte b=10;
   //b=15;//可以，编译通过，15没有超出byte取值范围
   //编译错误，为什么呢？
   //编译器只检查语法，不运行程序，编译器发现b+5的类型是int类型，b变量的数据类型是byte
   //大容量向小容量转换需要加z强制类型转换符，所以以下程序编译报错。
   //b=b+5;
   
   //纠正错误
    b=(byte)(b+5);
    System.out.println(b);
	byte x=10;
	x +=5; //等同于x=(byte)(x+5);
	System.out.println(x);//15

	byte z=0;
	z +=128;
	System.out.println(z);//-128
    }
  }


