/*
  测试类
*/
public class Test
{
    public static void main(String[] args){

       //思路
       //先创造人对象
       Person zhangsan = new Person();//初始化
       //不采用系统默认值
       //手动赋值
       zhangsan.id="1000";
       zhangsan.name="张三";
       zhangsan.sex=true;
       zhangsan.age=30;
       //再创造别墅对象

       BieShu fangZi = new BieShu();
       fangZi.area=500.0;

       //让别墅有主人
       fangZi.master=zhangsan;

       //想知道房子主人的名字是什么？
       System.out.println("主人的名字是：" + fangZi.master.name);

       //房子换主人类
       //创建一个新的主人对象
       Person lisi = new Person();
       lisi.name="李四";

       //换主人
       fangZi.master=lisi;

       //想知道房子的主人的名字是什么？
       System.out.println("主人的名字是：" + fangZi.master.name);

   }
}
