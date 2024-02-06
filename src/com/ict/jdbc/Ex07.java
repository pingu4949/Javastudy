package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속할 수 있도록 도와 주는 클래스
		Connection conn = null;
		// 2. SQL 구분 작성

//		Statement stmt = null;
		PreparedStatement pstmt = null;
		// 3-1 결과를 받은 클래스(select일때)
		ResultSet rs = null;

		// 3-2. 결과를 받은 클래스(select아닐때)
		int result = 0;
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("검색번호 받기:");
			int custid = scan.nextInt();
			// 4. jdbc 드라이버 로딩 : 오라클, MySQL, mariaDB 다 다르다.
			// 패키지 이름 클래스 이름
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 5. 오라클과 연결하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##pingu";
			String password = "1111";

			// 6. 오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password);

			// String sql = "select * from customer";
			// ? : 동적 바인딩 변수 -> 지금은 값을 모르고 실행할때 알 수 있다.
			String sql = "select * from customer where custid = ?";

			// 8. sql를 보내기 위해서 구분을 만듬
//			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);

			// ?를 처리하자

			pstmt.setInt(1, custid);

			// 9. 보내서 결과 받기
			// 9-1. select 문인 경우
//			rs = pstmt.executeQuery(sql);
			rs = pstmt.executeQuery();

			// 9-2. insert, update, delete 인경우
//			result = pstmt.executeUpdate();
//			result = stmt.executeUpdate(sql);

			// rs.next() : rs에 값이 있냐고 물어보는 뜻
			// rs.getXXXX(index => 1부터)
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {

			}

		}

	}
}
