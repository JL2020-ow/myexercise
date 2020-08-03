package JDBCTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.DbUtil;
/**
 * 
 * @author willi
 *这个程序负责修改被锁定的记录。
 */
public class JDBCTest14 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DbUtil.getConnection();
			conn.setAutoCommit(false);
			String sql ="update EMP set SAL =SAL * 1.1 where JOB = ? ";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, "MANAGER");
			
			int count = ps.executeUpdate();
			System.out.println(count);
			
			conn.commit();
		} catch (Exception e) {
			if(conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}finally {
			DbUtil.close(conn, ps, null);
		}
		
	}

}
