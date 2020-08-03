/*
 * 关于java语言中的if语句，属于选择结构，if语句又被称为分支语句/条件控制语句：
 *             1、if语句的语法结构：四种编写方式
 *                第一种：
 *                   if(boolean){
 *                   Java语句；
 *                   Java语句；
 *                   java语句；...
 *                   }
 *                第二种：if(布尔表达式){
 *                   java语句；
 *                   java语句；...
 *                    else{
 *                   java语句；
 *                   java语句；}
 *                第三种：if(布尔表达式){
 *                   java语句；
 *                   java语句；
 *                    ...}
 *                  else if(布尔表达式)
 *                  {
 *                     java语句；
 *                     java语句；
 *                   ...
 *                   }
 *                    else if(布尔表达式)
 *                  {
 *                     java语句；
 *                     java语句；
 *                   ...
 *                   }
 *                   ...

 *                 第四种：
 *                 ：if(布尔表达式){
 *                   java语句；
 *                   java语句；
 *                    ...}
 *                  else if(布尔表达式)
 *                  {
 *                     java语句；
 *                     java语句；
 *                   ...
 *                   }
 *                    else if(布尔表达式)
 *                  {
 *                     java语句；
 *                     java语句；
 *                   ...
 *                   }
 *                    else
 *                  {
 *                     java语句；
 *                     java语句；
 *                   ...
 *                   }

 *                   ...

 *             2、重点：对于java中的if语句来说，只要有一个分支执行，整个if语句全部结束。
 *
 *             3、注意：以上的第二种和第四种编写方式，这两种方式会100%保证会有分支执行。
 *
 *             4、“所有的控制语句”都是可以嵌套使用的，只要合理嵌套就行。
 *                  if(){
 *                       if(){
 *                  if(){
 *                        }
 *                  ...}
 *                  }
 *              注意：嵌套使用的时候代码格式必须完美。【该缩进的时候必须缩进】
 *              {
	                {
		                {
			        }
		        }              
 *	        }
 *	       5、if语句的分支中只有一条java语句的话，大括号可以省略不写。
 *	        if(true/false)
 *	        {
	 *	        一条java语句；
	 *	}
	 *	if(true/false)一条java语句；
	 *
	 *	这种方式不推荐使用，别人这么写看得懂就行。
 */
    public class IfTest01
           {
		   public static void main(String[] args){
	       //需求:所在位置的五公里范围之内有肯德基的话，去KFC吃饭
	       //公里数
	       //double distance=6.0;//单位KM
	        double distance=1.0;
	      //判断语句
	      if(distance<5)
		     {
			    System.out.println("去肯德基吃饭");
		     }
	        /*
	    * 需求：假设系统给定一个考生的成绩，成绩可能带有小数点
	    *       根据学生的成绩判定该学生的等级：
	    *       [90-100]  A
	    *       [80-90]   B
	    *       [70-80]   C
	    *       [60-70]   D
	    *       [0-60]    E
	    */
     /*   double score=90.0;
	   if(grade>=90){
	      System.out.println('A');
	   }
           else if (score>=80){
	      System.out.println('B');
	   }
           else if (score>=70){
	      System.out.println('C');
	   }
           else if (score>=60){
	      System.out.println('D');
	   }
           else{
	      System.out.println('E');
	   }
    */
	//老师编写的代码
         double score=59.5;
   //根据需求决定选择以上的四种结构来完成需求
        if(score<0||score>100){
          System.out.println("对不起，您提供的考生成绩不合法");
        }else if(score>=90){ //能够判断到这里说明成绩一定是[0-100]
          System.out.println("该考生的考试成绩等级是：A");
	}else if(score>=80){   //能够判断到这里说明成绩一定是小于90分的。
          System.out.println("该考生的考试成绩等级是：B");
	}else if(score>=70){
          System.out.println("该考生的考试成绩等级是：C");
        }else if(score>=60){
	  System.out.println("该考生的考试成绩等级是：D");
	}
	 else{
	   System.out.println("该考生的考试成绩等级是：E");
	}

	String grade="该考生的考试成绩等级是：E等级";

	if(score<0||score>100){
         grade="对不起，您提供的考生成绩不合法";
	}else if(score>=90){
	 grade="该考生的考试成绩等级是：A等级";
	}else if(score>=80){
	 grade="该考生的考试成绩等级是：B等级";
	}else if(score>=70){
	 grade="该考生的考试成绩等级是：C等级";
	}else if(score>=60){
	 grade="该考生的考试成绩等级是：D等级";
	}
	 System.out.println(grade);
	 


    }
         
 }
        
