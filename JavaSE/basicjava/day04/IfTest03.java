/*
   需求：
       判断当前的天气
           当外边下雨的时候：
             带雨伞：
             判断性别
               当性别为男：带一把大黑伞
               当性别为女：带一把小黑伞
           当外边晴天的时候：
             判断天气的温度：
                当天气在30度以上：
                   当性别为男：戴墨镜
                   当性别为女：擦防晒霜
        提示：
        1、一定会用到嵌套
        2、天气状况、温度、性别都需要从键盘输入。
           天气状况：1表示下雨、0表示晴天
           温度直接使用数字即可
           性别：1表示男，0表示女
 */
 public class IfTest03
{
    public static void main(String[] args)
    {
        System.out.println("欢迎使用本系统，您通过本系统可以完成一些简单的判断");
        System.out.println("说明1：1表示下雨，0表示晴天");
        System.out.println("说明2：1表示男，0表示女");
        System.out.println("说明3：温度为数字");
        //接收性别信息
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入性别：");
        int sex = s.nextInt();
        //接收天气的状况
        System.out.print("请输入当前天气状况：");
        int weather = s.nextInt();
        if(weather==1) {   //下雨天
            //System.out.println("下雨天");
            if (sex == 1) {
                System.out.println("带一把大黑伞");
            }else if(sex==0){
                System.out.println("带一把小花伞");
            }else{
                System.out.println("对不起，您的性别有误");
            }
        }else if(weather==0)
        {    //晴天
            //System.out.println("晴天");
            //接收温度
            int tem= s.nextInt();
                System.out.print("请输入当前的温度：");
            if(tem>30){
                if (sex == 1) {
                    System.out.println("戴墨镜");
                }else if(sex==0){
                    System.out.println("擦防晒霜");
                }else{
                    System.out.println("对不起，您的性别有误");
                }
            }
        }else{
        System.out.println("对不起，您输入的天气状况不存在！");
        }
    }
}