package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest08 {

	public static void main(String[] args) {     
		
//		// 用户在控制台输入desc是降序，asc是升序。
//		Scanner s = new Scanner(System.in);
//		System.out.println("请输入desc或asc,desc表示降序，asc表示升序");
//		System.out.print("请输入：");
//		String keywords = s.nextLine();
//
//		// 执行SQL
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//
//		try {
//			//注册驱动
//			Class.forName("org.mariadb.mysql.Driver");
//			//获取连接
//			conn = DriverManager.getConnection("jdbc:mysql://loaclhost:3306/bjpowernode","alex01","666");
//			//获取预编译的数据库操作对象
//			String sql ="select ENAME from EMP order by ENAME ?";
//			ps = conn.prepareStatement(sql);
//			ps.setString(1, keywords);
//			//执行sql语句
//			rs = ps.executeQuery();
//			//遍历结果集
//			while(rs.next()) {
//				System.out.println(rs.getString("ENAME"));
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(ps != null) {
//				try {
//					ps.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		// 用户在控制台输入desc是降序，asc是升序。
		Scanner s = new Scanner(System.in);
		System.out.println("请输入desc或asc,desc表示降序，asc表示升序");
		System.out.print("请输入：");
		String keyWords = s.nextLine();

		// 执行SQL
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//注册驱动
			Class.forName("org.mariadb.jdbc.Driver");
			//获取连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","alex01","666");
			//获取预编译的数据库操作对象
		 stmt = conn.createStatement();
			//执行sql语句
		 String sql = "select ENAME from EMP order by ENAME " + keyWords; //ENAME后面必须加空格，因为字符拼接
			rs = stmt.executeQuery(sql);
			//遍历结果集
			while(rs.next()) {
				System.out.println(rs.getString("ENAME"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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