package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;


/**
 *
 * @author fwm
 *JDBC工具类，简化JDBC编程
 */
public class DbUtil {
/**
 * 工具类中的构造方法都是私有的。
 * 因为工具类当中的方法都是静态的，不需要new对象，直接采用类名调用。
 */
	private DbUtil() {}
	//静态代码块在类加载的时候执行，并且只执行一次。
	static {
		ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
		String driver = bundle.getString("driver");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {

		 ResourceBundle bundle =ResourceBundle.getBundle("jdbc");
		 String url = bundle.getString("url");
		 String user = bundle.getString("user");
		 String password = bundle.getString("password");

		 return DriverManager.getConnection(url, user, password);
	}

	/**
	 * 关闭资源
	 * @param conn 连接对象
	 * @param stmt 数据库操作对象
	 * @param rs 结果集
	 */
	public static void close(Connection conn,Statement stmt,ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
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
