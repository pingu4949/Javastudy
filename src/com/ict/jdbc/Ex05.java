package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
		
		// 장미란을 둘리로 주소는 서울 방학동으로 바꾸자.
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user =  "c##pingu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "update customer2 set name = '둘리', address = '서울 방학동' where name = '장미란' ";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("삽입성공");
				
				sql =  "select * from customer2";
				
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.print(rs.getInt("custid") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("address") + "\t");
					System.out.print(rs.getString("phone") + "\n");

					
					
				}
				
			}else {
				
				System.out.println("삽입실패");
				
				
				
				
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}
}
