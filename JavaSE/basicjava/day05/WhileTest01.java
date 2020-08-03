/*
  1、while循环的语法结构
    while(布尔表达式）{
      循环体
    }
  2、while循环的执行原理
    先判断布尔表达式的结果
      *true 
           执行循环体
           *判断布尔表达式的结果：
             *true
              -执行循环体
             *false
              -循环结束
  ...
  3、while循环的循环次数
  
*/
public class WhileTest01
{
   public static void main(String[] args)
   {
      /* //死循环
       while(true){
         System.out.println("死循环");        
       }
         //编译器检测到该程序永远都无法被执行，所以编译器报错
         //System.out.println("Hello World");*/
       int i=10;
       int j=3;
       while(i>j){
        System.out.println("呵呵");
       }
   }
}