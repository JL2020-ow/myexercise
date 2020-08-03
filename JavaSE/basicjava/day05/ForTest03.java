public class ForTest03
{
   public static void main(String[] args)
   {
      //输出1到10中所有的奇数
      for(int i=1;i<=10;i+=2)
      {
         System.out.println("i---->"+i);// 1 3 5 7 9
      }
      for(int i=2;i<=10;i+=2)
      {
         System.out.println("i--->"+i);//2 4 6 8 10
      }
      for(int i=10;i>0;i--)
      {
         System.out.println("i===>"+i);//10 9 8 7 6 5 4 3 2 1
      }
      for(int i=100;i>=50;i-=10)
      {
         System.out.println("i===>"+i);//100 90 80 70 60 50 
      }
      for(int i=0;i<10;)
      {
         System.out.println("计数器 ===>"+i);//0到10
          i++;
      }
      for(int i=0;i<10;)
      {
         i++;
         System.out.println("计数器 ===>"+i);//1到10
      }
   }
}