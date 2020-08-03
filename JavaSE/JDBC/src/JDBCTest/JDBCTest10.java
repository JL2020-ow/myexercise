package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 
 * @author fwm JDBC事物机制： 
 * 1、JDBC中的事务是自动提交的，什么是自动提交？
 *            只要执行任意一条DML语句，则自动提交一次。这是JDBC默认的事物行为。
 *           但是在实际的业务中，通常是N条DML语句共同联合才能完成的。必须保证
 *           这些DML语句在同一个事物中同时成功或同时失败。 
 *     2、以下程序先来验证一下，JDBC的事物是否是自动提交的。
 *        测试结果：JDBC中只要执行任意一条DML语句，就提交一次。
 */
public class JDBCTest10 {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
		String driver = bundle.getString("driver");
		String url = bundle.getString("url");
		String user = bundle.getString("user");
		String password = bundle.getString("password");
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			//注册驱动
			Class.forName(driver);
			//获取连接
			conn = DriverManager.getConnection(url, user, password);
			//获取数据库操作对象
			String sql = "update DEPT set DNAME = ? where DEPTNO = ? ";
			//执行sql语句
			ps = conn.prepareStatement(sql);
			ps.setString(1, "x部门");
			ps.setInt(2, 50);
			int count = ps.executeUpdate();//执行第一条update语句
			System.out.println(count);
			
			//再次给占位符传值
			ps.setString(1, "y部门");
			ps.setInt(2, 60);
			count = ps.executeUpdate();//执行第二条update语句
			System.out.println(count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//释放资源
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
