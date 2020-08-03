package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author fwm
 *注册驱动的另外一种方式（这种方式常用）
 */
public class JDBCTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*
			Driver driver = new org.mariadb.jdbc.Driver();
			DriverManager.registerDriver(driver);
			*/
			//1、注册驱动
			//这是注册驱动的第一种写法
			//DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
			//利用反射机制实现类加载
			//注册驱动的第二种方式（常用的）
			//为什么这种方式常用？因为参数是一个字符串，字符串可以写到xxxx.properties文件中
		   //以下方法不需要接受返回值，因为我们只想用它的类加载动作。
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		   //2、获取连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "alex01", "666");
			System.out.println("数据库连接对象 = "+conn);
			
		//3、获取数据库操作对象
		//4、执行sql
		//5、处理查询结果集
		//6、释放资源
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
