package JDBCTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.DbUtil;

/**
 * 
 * @author willi
 *开启一个事务，并且这个事务专门用于查询，并且使用行级锁/悲观锁，锁住相关的记录。
 */
public class JDBCTest13 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DbUtil.getConnection();
			//开启事务
			conn.setAutoCommit(false);
			
			String sql ="select ENAME,JOB,SAL from EMP where JOB = ? for update";
			conn.prepareStatement(sql);
			ps = conn.prepareStatement(sql);
			ps.setString(1, "MANAGER");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ENAME") + "," + rs.getString("JOB")+"," + rs.getDouble("SAL"));
			}
			//提交事务
			conn.commit();
		} catch (SQLException e) {
			if(conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}finally {
			DbUtil.close(conn, ps, rs);
		}
	}

}
