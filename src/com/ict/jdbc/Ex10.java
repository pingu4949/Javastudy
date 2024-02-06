package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		//변경
		
		// scanner로 번호, 이름, 주소(띄어쓰기x), 전화번호 받아서 customer 테이블에 삽입하기
		
		Scanner scan = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;

		System.out.print("변경할 번호:");
		String custid = scan.next();
		
		System.out.print("이름입력:");
		String name = scan.next();
		
		System.out.print("주소 번호입력:");
		String address = scan.next();
		
		System.out.print("폰번호 이름입력:");
		String phone = scan.next();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##pingu";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "update customer set name = ? , address = ? , phone = ? where custid = ? ";;

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);
			pstmt.setString(4, custid);
			
			result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("변경성공");

				sql = "select * from customer";
				pstmt = conn.prepareStatement(sql);

				rs = pstmt.executeQuery();

				while (rs.next()) {
					System.out.print(rs.getInt("custid") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("address") + "\t");
					System.out.print(rs.getString("phone") + "\n");
				}

			} else {
				System.out.println("변경실패");
			}

		} catch (Exception e) {

		} finally {
			try {
				scan.close();
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
