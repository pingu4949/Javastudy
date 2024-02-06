package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속할 수 있도록 도와 주는 클래스
		Connection conn = null;
		// 2. Sql 구분작성
		Statement stmt = null;
		// 3. 결과를 받은 클래스
		ResultSet rs = null;
		int result = 0;
		try {
			// 4. jdbc 드라이버 로딩 : 오라클, MYSQL, mariaDB 가 다 다르다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 오라클과 연결하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String name = "c##pingu";
			String password = "1111";
			
			// 6. 오라클과 연결하기
			conn = DriverManager.getConnection(url, name, password);
			
			// 7. sql 작성
			//String sql = "select * from book";
			String sql = "select * from book where bookname like '축구%'";
			
			
			// 8. sql를 보내기위해서 구분을 만듬
			stmt = conn.createStatement(); 
			// 9. 보내면 결과 받기
			rs = stmt.executeQuery(sql);
			
			
			// 9-1 select 문인 경우
			
			
			
			while (rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.print(rs.getInt("price") + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 9-2 insert, delete, update 인 경우
	}
}
