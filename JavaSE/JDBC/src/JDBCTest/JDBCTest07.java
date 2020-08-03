package JDBCTest;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 解决sql注入问题
 *   只要用户提供的信息不参与sql语句的编译过程，问题就解决了。
 *   即使用户提供的信息含有sql语句的关键字，但是不参与编译，不起作用。
 *   要想用户信息不参与sql语句的编译，那么必须使用java.sql.PreparedStatement
 *    java.sql.PreparedStatement集成java.sql.Statement
 *    PreparedStatement是属于预编译的数据库操作对象。
 *    原理：预先对sql语句的框架进行编译，然后再给sql语句传”值“。
 *  
 * 对比一下Statement和PreparedStatement?
 *  -Statement存在sql注入问题，而PreparedStatement解决了sql注入问题。
 *  -PreparedStatement执行效率比较高
 *  -Statement是编译一次执行一次，PreparedStatement是编译一次，执行N次，所以PreParedStatement执行效率教高一些。
 *  -PreparedStatement会在编译阶段做类型的安全检查。
 *  
 *  综上所述：PreparedStatement使用较多。只有极少数的情况下使用Statement。
 *  
 *  什么情况下必须使用Statement呢？
 *     业务方面要求必须支持SQL注入的时候。
* Statement支持SQL注入，凡是业务方面需要进行SQL语句拼接的时候，必须使用Statement。
 *    
 *   
 */
public class JDBCTest07 {
    public static void main(String[] args) {
        // 初始化一个界面
        Map<String, String> userLoginInfo = initUI();
        // 验证用户名和密码
        Boolean loginSuccess = login(userLoginInfo);
        // 最后输出结果
        System.out.println(loginSuccess ? "登录成功" : "登录失败");
    }
  /**
     * 用户登录
     * 
     * @param userLoginInfo 用户登录信息
     * @return false表示失败，true表示成功
     */
    private static Boolean login(Map<String, String> userLoginInfo) {
        //打标记的意识
        boolean loginSuccess = false;
        //单独定义登录信息
        String loginName = userLoginInfo.get("loginName");
        String loginPwd = userLoginInfo.get("loginPwd");
        // JDBC代码
        Connection conn = null;
        PreparedStatement pStatement = null;//这里使用PreparedStatement(预编译操作对象)
        ResultSet rs = null;
        try {
            // 1、注册驱动
            Class.forName("org.mariadb.jdbc.Driver");
            //2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/alexDB","alex01","666");
            
            //String sql = "select * from t_user where loginName = '"+userLoginInfo.get("loginName")+"' and loginPwd ='"+userLoginInfo.get("loginPwd")+"'";
            //sql语句框架，其中一个问号表示一个占位符，一个问号将来只接收一个“值”。
            //占位符不能使用单引号扩起来。
            String sql = "select * from t_user where loginName = ? and loginPwd = ? ";
            //以上正好完成了sql语句的拼接，以下代码的含义是：发送sql语句给DBMS,DBMS进行sql编译。
            //正好将用户提供的“非法信息”编译进去，导致原sql语句的含义被扭曲了。
            //3、获取预编译的数据库操作对象
            //程序执行到此处会发送sql语句框架给DBMS,然后DBMS进行sql语句的预先编译。
            pStatement = conn.prepareStatement(sql);
            //给占位符？传值，第一个？(下标是1，第二个问号下标是2)
            pStatement.setString(1, loginName);
            pStatement.setString(2, loginPwd);
            //4、执行sql
            rs = pStatement.executeQuery();//这里不写sql，如果写将会再编译一次。
            
            //5、处理结果集
            if(rs.next()){
              //登录成功
              loginSuccess = true;
            }
            //6、释放资源
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(pStatement != null){
                try {
                    pStatement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn !=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return loginSuccess;
    }

    /**
     * 初始化用户界面 @return用户输入的用户名和密码等登录信息。
     */
    private static Map<String, String> initUI() {
        Scanner s = new Scanner(System.in);
        System.out.print("用户名：");
        String loginName = s.nextLine();
        System.out.print("密码：");
        String loginPwd = s.nextLine();
        Map<String,String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("loginName", loginName);
        userLoginInfo.put("loginPwd", loginPwd);
        return userLoginInfo;
    }
}
