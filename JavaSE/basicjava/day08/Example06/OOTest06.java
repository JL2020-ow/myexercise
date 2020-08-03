/*
 * 需求：
 *   定义一个计算机类【电脑/笔记本】，计算机有哪些属性呢？
 *     *品牌
 *     *型号
 *     *颜色
 *     
 *   定义一个学生类
 *     *学号
 *     *姓名
 *     *学生有一台笔记本电脑
 *
 *   编写程序来表达以上的类，然后分别将类创建为对象。
 *   对象数量不限，然后让其中的一个学生去使用其中的一台笔记本电脑。
 *
 *   然后编译并运行，并且将整个执行过程采用图形的方式描述出来。
 *
 *   所以的代码全部写到当前的java源文件中。
*/
public class OOTest06
{
    public static void main(String[] args){
       //创建笔记本电脑对象
       Computer biJiBen=new Computer();
       //手动赋值
       biJiBen.brand="ASUS";
       biJiBen.style="A450V";
       biJiBen.color="Black";

       //创建学生对象
       Student zhangsan=new Student();
       //手动赋值
       zhangsan.name="张三";
       zhangsan.no=123456789;
       zhangsan.notepad = biJiBen;
       //让这个学生和笔记本对象产生关系【通过学生能找到他的笔记本电脑】
       //想知道张三的笔记本品牌
       System.out.println("张三的笔记本的品牌："+zhangsan.notepad.brand);
       //修改品牌
       zhangsan.notepad.brand="苹果";

       System.out.println("张三的笔记本品牌："+zhangsan.notepad.brand);

       //张三又买了一台新的电脑，原先的电脑扔了。【垃圾回收了】
       zhangsan.notepad=new Computer();
       
       System.out.println("张三的笔记本："+zhangsan.notepad.brand);//null
  }
}
//定义学生类
class Student
{
    int no;
    String name;
    Computer notepad;
}

//定义电脑类
class Computer
{
    String brand;
    String style;
    String color;
}
