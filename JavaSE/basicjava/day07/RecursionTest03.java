/*
  使用递归计算1～n的求和
*/
public class RecursionTest03
{
  public static void main(String[] args){
   
     //1~4的和
     int n=4;
     int retValue=sum(n);
     System.out.println(retValue);
  }

  public static int sum(int n){
     if(n==1){
      return 1;
     }
     return n+sum(n-1);
  }
}
//n+sum(n-1);
//4+sum(3)
//4+3+sum(2)
//4+3+2+sum(1)
//4+3+2+1
