/*
  循环语句和条件判断语句嵌套使用
*/
public class ForTest04
{
   public static void main(String[] args)
   {
      //找出1~100所有的奇数
      //第一种方案：从1开始，每次递增2，这样每一个数字一定是奇数。
      for(int i=1;i<=100;i+=2)
      {
         System.out.println("奇数-->"+i);
      }
      //第二种方案：从1开始，以1递增，每一个数字都进行判断，判断标准是数字对2求余数
      for(int i=1;i<=100;i++)
      {
         //判断i是否为奇数，是奇数的时候输出
         //i%2==0 偶数
         //i%2==1 奇数
         //i%2!=0 奇数
         //boolean flag =(i%2!=0)
         if(i%2!=0){
           System.out.println(i);
         }
      }
       //以上两种方案有限选用第一种方案，代码少，循环次数少，效率较高。
   }
}