package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		// customer 테이블에 6, 이강인, 대한민국 제주도, 000-1234-9876
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 오라클과 연결하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String name = "c##pingu";
			String password = "1111";

			// 오라클과 연결하기
			conn = DriverManager.getConnection(url, name, password);
			
			String sql = "insert into customer(name, address, phone)"
					+ "values('이강인', '대한민국 제주도', '000-1234-9876')";

			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			

			if (result > 0) {
				System.out.println("삽입 성공");
				
				sql = "select * from customer";
				
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("address") + "\t");
					System.out.print(rs.getString("phone") + "\n");
					
				}
			} else {
				System.out.println("삽입 실패");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
}
