package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

public class Ex02_Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 전체 테이블 보고
		// 리스트생성 -> EX02_DAO에서 전체 테이블 메서드 호출
		List<Ex02_VO> list = Ex02_DAO.getlist();
		prn(list);
		
		
		System.out.println("선택하세요");
		System.out.println("1. Member 테이블 특정 데이터 보기");
		System.out.println("2. Member 테이블 특정 데이터 삽입");
		System.out.println("3. Member 테이블 특정 데이터 삭제");
		System.out.println("4. Member 테이블 특정 데이터 업데이트");
		System.out.println("5. Member 테이블 로그인 하기");

		System.out.print(">>>>>>>>>>>>>>>>>>>>>>  ");
		
		
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			System.out.print("찾는 번호입력:");
			String idx = scan.next();
			// vo에 getone인 검색값을 저장
			Ex02_VO vo = Ex02_DAO.getone(idx);
			// 메서드 호출하여 vo
			prn(vo);
			
			break;
		case 2:
			System.out.print("번호:");
			idx = scan.next();
			System.out.print("아이디:");
			String id = scan.next();
			System.out.print("비밀번호:");
			String pw = scan.next();
			System.out.print("이름:");
			String name = scan.next();
			System.out.print("나이:");
			String age = scan.next();
			System.out.print("날짜:");
			String date = scan.next();
			
			int result = Ex02_DAO.getinsert(new Ex02_VO(idx, id, pw, name, age, date));
			Ex02_VO vo3 = new Ex02_VO();
			vo3.setIdx(idx);
			vo3.setId(id);
			vo3.setPw(pw);
			vo3.setUsername(name);
			vo3.setAge(age);
			if (result > 0) {
				List<Ex02_VO> list1 = Ex02_DAO.getlist();
				prn(list1);
			}else {
				System.out.println("삽입 실패");
			}
			break;
		case 3:
			System.out.println("삭제하실 번호입력:");
			idx = scan.next();
			
			Ex02_VO vo1 = new Ex02_VO();
			vo1.setIdx(idx);
			int result2 = Ex02_DAO.getdelete(vo1);
			if (result2 > 0) {
				List<Ex02_VO> list1 = Ex02_DAO.getlist();
				prn(list1);
			}else {
				System.out.println("삭제 실패");
			}
			break;
		case 4:
			System.out.println("수정할 정보를 입력하세요");
			
			System.out.print("이름:");
			name = scan.next();
			System.out.print("나이:");
			age = scan.next();			System.out.println("바꿀 번호:");
			idx = scan.next();
			Ex02_VO vo4 = new Ex02_VO();
			vo4.setUsername(name);
			vo4.setAge(age);
			vo4.setIdx(idx);
			int result4 = Ex02_DAO.getupdate(vo4);
			if (result4 > 0) {
				List<Ex02_VO> list1 = Ex02_DAO.getlist();
				prn(list1);
			}else {
				System.out.println("업데이트 실패");
			}
		case 5:
			System.out.println("로그인");
			System.out.println("아이디입력 :");
			String id2 = scan.next();
			System.out.println("비밀번호입력 :");
			String pw2 = scan.next();
			
			Ex02_VO vo5 = new Ex02_VO();
			vo5.setId(id2);
			vo5.setPw(pw2);
			
			Ex02_VO vo6 = Ex02_DAO.getLogin(vo5);
			if (vo6 != null) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
			break;
		}
		
	}

			
	// 전체 보기 
	public static void prn(List<Ex02_VO> list) {
		System.out.println("번호\t아이디\t비밀번호\t이름\t나이\t날짜");
		for (Ex02_VO k : list) {
			System.out.print(k.getIdx() + "\t"); // 번호
			System.out.print(k.getId() + "\t"); // 아이디
			System.out.print(k.getPw() + "\t"); // 비밀번호
			System.out.print(k.getUsername() + "\t"); // 이름
			System.out.print(k.getAge() + "\t"); // 나이
			System.out.print(k.getRegdate().substring(0, 10) + "\n"); // 날짜
		}
	}

	// 특정 데이터 보기
	public static void prn(Ex02_VO vo) {
		System.out.println("번호\t아이디\t비밀번호\t이름\t나이\t날짜");

		System.out.print(vo.getIdx() + "\t"); // 번호
		System.out.print(vo.getId() + "\t"); // 아이디
		System.out.print(vo.getPw() + "\t"); // 비밀번호
		System.out.print(vo.getUsername() + "\t"); // 이름
		System.out.print(vo.getAge() + "\t"); // 나이
		System.out.print(vo.getRegdate().substring(0, 10)+ "\n"); // 날짜

	}
}
