package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 
 * @author willi
 * sql脚本：
 * drop table if exists t_act;
 * create table t_act(
 *   actno int,
 *   balance double(7,2) //注意：7表示有效数字的个数，2表示小数位的个数。
 *   );
 *   insert into t_act(actno,balance) values(111,20000);
 *   insert into t_act(actno,balance) values(222,0);
 *   commit;
 *   select * from t_act;
 *   
 *   重点三行代码：
 *    conn.setAutoCommit(false);
 *    conn.commit();
 *    conn.rollback();
 */
public class JDBCTest11 {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
		String driver = bundle.getString("driver");
		String url = bundle.getString("url");
		String user = bundle.getString("user");
		String password = bundle.getString("password");
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		//注册驱动
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			//将自动提交机制修改为手动提交机制
			conn.setAutoCommit(false);
			String sql ="update t_act set balance = ? where actno =? ";
			ps = conn.prepareStatement(sql);

			//给问号传值
			ps.setDouble(1,10000);
			ps.setInt(2, 111);
			int count = ps.executeUpdate();
			
			ps.setDouble(1, 10000);
			ps.setInt(2, 222);
			count += ps.executeUpdate();
			System.out.println(count == 2 ? "转账成功" : "转账失败");
			//程序能够走到这里说明程序没有异常，事物结束，手动提交数据。
			conn.commit();//提交事务
			
		} catch (Exception e) {
			if(conn !=null) {
				try {
					//回滚事务
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}finally {
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
