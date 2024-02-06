package com.ict.day08;

public class Ex01 {
	public static void main(String[] args) {
		// 다차원 배열 : 1차원 배열이 여러개 모인 것
		// 	    종류	: 기본자료형 배열, 객체형 배열(참조 자료형 배열 => 클래스가 배열)
		//				고정길이 배열, 가변길이 배열
		// 고정 길이 배열
		// 1. 선언 : 자료형[][] 이름 또는 자료형 이름[][];
		int[][] su;
		
		// 2. 선언 : 이름 = new 자료형[1차원배열크기][1차원배열이 참조는 배열의 크기]
		su = new int[2][3]; //방두개를 생성하고 3칸의 크기를 가지고 있다는 뜻.
		
		// 3. 데이터 저장
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		
		su[1][0] = 100;
		su[1][1] = 200;
		su[1][2] = 300;
		
		//주소 확인
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		
		System.out.println(su[0][0]);
		System.out.println(su[0][1]);
		System.out.println(su[0][2]);
				
		System.out.println(su[1][0]);
		System.out.println(su[1][1]);
		System.out.println(su[1][2]);
		
		System.out.println();
		
		for (int i = 0; i < su.length; i++) { //밖
			for (int j = 0; j < su[i].length; j++) { //안
				
				System.out.println(su[i][j]);
			}
		}
		
		
	}
}
