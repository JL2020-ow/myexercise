package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * PreparedStatement完成insert delete update 
 * @author willi
 *
 */
public class JDBCTest09 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//1、注册驱动
			Class.forName("org.mariadb.jdbc.Driver");
			//2、获取连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","alex01","666");
			//3、获取预编译的数据库操作对象
			String sql = "insert into DEPT(DEPTNO,DNAME,LOC) values(?,?,?)";
			ps =conn.prepareStatement(sql);
			ps.setInt(1, 60);
			ps.setString(2, "销售部");
			ps.setString(3, "上海");
			
//			String sql = "update DEPT set DNAME = ?,LOC = ? where DEPTNO = ? ";
//			ps =conn.prepareStatement(sql);
//			ps.setString(1,"研发部");
//			ps.setString(2, "北京");
//			ps.setInt(3, 60);
			
//			String sql = "delete from DEPT where DEPTNO = ?";
//			ps =conn.prepareStatement(sql);
//			ps.setInt(1, 60);
			
			//4、执行SQL
			int count = ps.executeUpdate();
			System.out.println(count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//6、释放资源
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
