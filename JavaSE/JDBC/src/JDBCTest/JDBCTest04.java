package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

//将连接数据库的所有信息配置到配置文件中
public class JDBCTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用资源绑定器绑定属性配置文件
		ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
		//xxxx.properties文件应该放在src目录中，而不是package包中
		String driver = bundle.getString("driver");
		String url = bundle.getString("url");
		String user = bundle.getString("user");
		String password = bundle.getString("password");

		Statement stmt = null;
		Connection conn = null;
		// 1、注册驱动
		try {
			Class.forName(driver);
			// 2、获取连接
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("数据库连接对象 = " + conn);
			// 3、获取数据库操作对象
			stmt = conn.createStatement();
			// 4、执行sql语句
			String sql = "update DEPT set DNAME ='销售部',LOC='天津' where DEPTNO=50 ";
			int count = stmt.executeUpdate(sql);
			// System.out.println(count == 1 ? "删除成功" :"删除失败");
			System.out.println(count == 1 ? "修改成功" : "修改失败");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6、释放资源
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
