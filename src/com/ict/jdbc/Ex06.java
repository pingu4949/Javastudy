package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// scanner를 이용해서 번호, 이름, 주소, 전화번호를 받아서 customer테이블에 삽입 후 확인
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호입력: ");
		int custid = scan.nextInt();
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("주소 입력: ");
		String address = scan.next();
		System.out.print("전화번호 입력 :");
		String phone = scan.next();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##pingu";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			
			stmt = conn.createStatement();
			
			
			String sql = "insert into customer(custid, name, address, phone)"
					+ "values("+ custid+ ",'" + name  +"','" + address + "','" + phone + "')";
			
			result = stmt.executeUpdate(sql);
			
			
			
			if (result > 0) {
				System.out.println("삽입성공");
				
				sql = "select * from customer";
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
		
		
	}
	
}
