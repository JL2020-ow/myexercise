/*
   System.out.println();负责项目控制台输出【从内存到控制台，输出的过程，这是从内存中出来了】

   接收用户键盘输入，从"键盘"到"内存"。【输入的过程，到内存中去】

   以下代码先不要问为什么：固定编写就可以接收用户键盘的输入。

 */
  public class KeyInputTest
 {
    public static void main(String[] args){
        //创建键盘扫描对象
        //第一步：创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);

        //第二步：调用Scanner对象的next()方法开始接收用户键盘输入
        //程序执行到这里会停下来，等待用户的输入
        //当用户输入的时候，并且最终敲回车键的时候，键入的信息会自动赋值给userInputContent
        //String userInputContent = s.next(); //标识符的命名规范：见名知意

        //接收数字【以整数型int的形式来接收】
        int num = s.nextInt();

        //将内存中的数据输出到控制台
       // System.out.println("您输入了： "+userInputContent);

        System.out.println("您输入的数字是：" +num);

        System.out.println("计算结果：" +(num+100));

    }
 }
 /*
    总结：记录代码，或者直接将代码复制粘贴
        第一步：
        java.util.Scanner s=new java.util.Scanner(System.in);
        第二步：
        String str=s.nextInt();
        或
        int num = s.nextInt();
  */
