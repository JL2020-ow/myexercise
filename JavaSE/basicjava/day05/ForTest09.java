/*
  编写for循环，找出1到100中所有的素数（质数）
  素数：能够被1和自身整除，不能被其他数字整除的数字成为素数。（不包括1）
*/
 public class ForTest09
 {
    public static void main(String[] args)
    {
       for(int n=2;n<=100;n++)
       {
          for(int i=2;i<=n;i++)
          {
              if(n%i==0){
              }
          }
          System.out.println(n);
       }
    }
 }
/*
  升级版：
       编写for循环找出1~10000中所有的素数
       要求每8个换一行输出
*/
