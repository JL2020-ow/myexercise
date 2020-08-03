/*
  在前一个程序的基础上，计算1～100所有奇数的和
*/
 public class ForTest05
 {
     public static void main(String[] args)
     {
         int sum=0;
         for(int i=1;i<=100;i+=2){
             //i一定是奇数
             //累加求和
             sum+=i;//sum=sum+i;
             //System.out.println("所有奇数的和为："+sum);循环一次输出一次
         }
         System.out.println("所有奇数的和为："+sum);//输出最终结果
         
         //====================================================
         sum=0;//归零
         for(int i=0;i<=100;i++)
         {
             if(i%2!=0)//是奇数
             {
                 sum+=i;//则累加
             }
         }
         System.out.println("所有奇数的和为："+sum);
     }
 }