package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex04 {
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
			
			String sql = "delete from customer where name = '정주리'";
			// 숫자형식에 사용되는 것 insert , update, delete
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			

			if (result > 0) {
				System.out.println("삭제 성공");
				// 표를 만들때 사용되는것 select
				sql = "select * from custo"
						+ "mer";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.print(rs.getInt("custid") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("address") + "\t");
					System.out.print(rs.getString("phone") + "\n");
					
				}
			} else {
				System.out.println("삭제 실패");
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