/*
  编写for循环，找出1到100中所有的素数（质数）
  素数：能够被1和自身整除，不能被其他数字整除的数字成为素数。（不包括1）
*/
 public class ForTest09a
 {
    public static void main(String[] args)
    {
       //先编写程序，验证7这个数字是否为常数
       /*
         实现思路：
         7/1【不需要】
         7/2【7%2!=0】
         7/3【7%3!=0】
         7/4【7%4!=0】
         7/5【7%5!=0】
         7/6【7%6!=0】
         7/7【不需要】
       */
       //外部的for循环负责取出每一个数字i
       for(int i=2;i<=100;i++) //1不是素数
      {
       //byte b=0;//默认将i看做一个素数【0表示素数，1表示非素数】
       boolean isSushu = true; //默认将i看做一个素数【标记在开发中比较常用】
       //j是什么：2 3 4 5 6
       for(int j=2;j<i;j++)
       {
       	   if(i%j==0)
       	   {
       	   	   //非素数
       	   	   isSushu = false;
       	   	   //b=1;
       	   	   //已经知道i是非素数，跳出循环，效率更高。
       	   	   break;
       	   }
       	 //System.out.println(isSushu ? i+"是素数":i+"不是素数");
         //System.out.println(b==0?i+"是素数":i+"不是素数");
       }
            if(isSushu) //是素数
         {
            System.out.println("素数有："+i);
         }
      }
    }
 }
/*
  升级版：
       编写for循环找出1~10000中所有的素数
       要求每8个换一行输出
*/
