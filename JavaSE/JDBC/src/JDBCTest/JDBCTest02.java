package JDBCTest;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 
 * @author fwm
 *JDBC完成delete/update
 */
public class JDBCTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement stmt = null;
		Connection conn = null;
		//1、注册驱动
		try {
			Driver driver = new org.mariadb.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
		//2、获取连接
			String url ="jdbc:mysql://localhost:3306/bjpowernode";
			String user ="alex01";
			String password = "666";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("数据库连接对象 = "+conn);
		//3、获取数据库操作对象
			stmt = conn.createStatement();
		//4、执行sql
			//String sql ="delete from DEPT where DEPTNO =50";
			String sql ="update DEPT set DNAME ='销售部',LOC='天津' where DEPTNO=50 ";
			int count = stmt.executeUpdate(sql);
			//System.out.println(count == 1 ? "删除成功" :"删除失败");
			System.out.println(count == 1 ? "更新成功" :"更新失败");
			
		//5、处理查询结果集
		//6、释放资源
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	   }
	}
}
