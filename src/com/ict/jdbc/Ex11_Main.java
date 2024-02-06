package com.ict.jdbc;

import java.util.Scanner;

public class Ex11_Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체 데이터 보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.println("3. customer 테이블 특정 데이터 삽입");
		System.out.println("4. customer 테이블 특정 데이터 삭제");
		System.out.println("5. customer 테이블 특정 데이터 업데이트");
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>       ");
		
		
		int menu = scan.nextInt();
		
		switch (menu) {
		case 1: 
			Ex11_DAO.getInstance().getSelectAll();
			break;
		case 2: 
			System.out.print("검색할 custid :");
			int custid = scan.nextInt();
			Ex11_DAO.getInstance().getselectone(custid);
		case 3:
			System.out.println("삽입 정보를 입력하세요 :");
			System.out.print("번호 :");
			int custid1 = scan.nextInt();
			System.out.println("이름 :");
			String name  = scan.next();
			System.out.println("주소 :");
			String address = scan.next();
			System.out.println("전화번호 :");
			String phone = scan.next();
			
			int result = Ex11_DAO.getInstance().getinsert(custid1, name, address, phone);
			if (result > 0) {
				System.out.println("삽입 성공");
				
				Ex11_DAO.getInstance().getSelectAll();
				
			}else {
				System.out.println("삽입 실패");
			}
			break;

		case 4: 
			System.out.print("삭제할 custid :");
			int custid3 = scan.nextInt();
			Ex11_DAO.getInstance().getDelete(custid3);
			break;
			
		case 5:
			System.out.println("삽입 정보를 입력하세요 :");
			System.out.print("이름 :");
			String name2  = scan.next();
			System.out.println("주소 :");
			String address2 = scan.next();
			System.out.println("전화번호 :");
			String phone2 = scan.next();
			System.out.println("바꿀번호 :");
			int custid4 = scan.nextInt();
			Ex11_DAO.getInstance().getUpdate(custid4, name2, address2, phone2);
			break;
		}
	}
}
