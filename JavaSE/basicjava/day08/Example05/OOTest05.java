/*
 *测试程序
*/
public class OOTest05
{ 
  public static void main(String[] args){
    Customer c=new Customer();
    System.out.println(c.id);//0

    c=null;
    System.out.println(c.id);//java.lang.NullPointerException 
    //空引用访问“实例”相关的数据一定会出现空指针异常
    //以上程序编译可以通过，因为符合语法
    //运行出现空指针异常。
}
