/*
  for循环嵌套
*/
 public class ForTest07
 {
     public static void main(String[] args)
     {
         for(int i=1;i<10;i++){
             System.out.println("Begin");
             //循环10次
             for(int j=0;j<1;j++){
             System.out.println("j-->"+j);
             }//循环一次，输出0。
             System.out.println("Over");
         }
           /*
             结果：
             Begin
             0
             Over
           */
         for(int i=1;i<=5;i++)
         {
             System.out.println("开始");
             for(int j=1;j<=5;j++)
             {
                 System.out.println("i*j="+(i*j));
             }
             System.out.println("结束");
         }
     }
 }