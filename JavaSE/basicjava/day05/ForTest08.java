/*
  使用for循环输出九九乘法表
  1*1=1
  2*1=2 2*2=4
  3*1=3 3*2=6 3*3=9
  4*1=4 4*2=8 4*3=12 4*4=16
  ...
*/
public class ForTest08
{
   public static void main(String[] args)
   {
      for(int i=1;i<=9;i++)
        //外层循环9次
        //i是行号
      {
         for(int j=1;j<=i;j++)
         {
            int product;
            product=i*j;
            System.out.print(i+"*"+j+"="+product+" ");
         }
          //换行法一：
          System.out.println();//每循环一次换一行
          //法二：
          //System.out.print("\n");
      }
   }
}