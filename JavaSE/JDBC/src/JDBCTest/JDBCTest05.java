package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest05 {

	public static void main(String[] args) {
		// 处理查询结果集
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
		// 1、注册驱动
		Class.forName("org.mariadb.jdbc.Driver");
		// 2、获取连接
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "alex01", "666");
		// 3、获取数据库操作对象
		stmt = conn.createStatement();
		
		// 4、执行sql语句
		String sql = "select EMPNO as a,ENAME,SAL from EMP";
		//executeUpdate(insert/delete/update)
		//ResultSet executeQuery(select)
		rs = stmt.executeQuery(sql);//专门执行DQL语句的方法
		// 5、处理查询结果集
		//System.out.println(flag1);//true
		while(rs.next()) {
			//光标指向的行有数据
			//取数据
			 //getString()方法的特点是：不管数据库中的数据类型是什么，都以String的数据类型取出
			/** 
			String empno = rs.getString(1); //JDBC中所有下标从1开始，不是从0开始
			String ename = rs.getString(2);
			String sal = rs.getString(3);
			System.out.println(empno+","+ename+","+sal);
			*/
			//这个不是以列的下标获取，而是以列的名字获取
			//根据最终查询结果的列名
			//int EMPNO = rs.getInt("a");
			//double SAL = rs.getDouble("SAL");
			//除了可以以String类型取出以外，还可以以特定的类型取出
			String EMPNO = rs.getString("a");//重点注意：列名称不是表中的列名称，是查询结果集的列名称
			String ENAME = rs.getString("ENAME");
			String SAL = rs.getString("SAL");
			System.out.println(EMPNO+","+ENAME+","+SAL);

		    }
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			// 6、释放资源
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

}
