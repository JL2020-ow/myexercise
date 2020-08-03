package JDBCTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utils.DbUtil;

/**
 * 
 * @author willi
 *这个程序有两个任务
 *  1、测试DbUtil方法是否好用
 *  2、模糊查询怎么写？
 */
public class JDBCTest12 {                   

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//获取连接                                                      
			conn = DbUtil.getConnection();	
			//获取预编译数据库对象
			//错误写法
//			String sql = "select ENAME from EMP where ENAME like '_?%'";
//			ps = conn.prepareStatement(sql);
//			ps.setString(1, "A");
			
			String sql = "select ENAME from EMP where ENAME like ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "_A%");
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ENAME"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//释放资源
			DbUtil.close(conn, ps, rs);
		}
	}

}
