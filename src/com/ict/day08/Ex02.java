package com.ict.day08;

public class Ex02 {
	public static void main(String[] args) {
		// 선언과 생성을 하나로
		// 자료형[][] 이름 = new 자료형[1차원배열 수][1차원배열이 참조하는 배열의 수];
		System.out.println("고정길이 일때만 사용");
		char[][] ch = new char[3][2]; //방 3개에 칸두개
		
		ch[0][0] = 'a';
		ch[0][1] = 'A';
		
		
		ch[1][0] = 'b';
		ch[1][1] = 'B';
		
		
		ch[2][0] = 'c';
		ch[2][1] = 'C';
		
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]);
				
				
			}
		}
		System.out.println();
		System.out.println("고정길이, 가변길이 모두 사용");
		
		int[][] su = new int[3][2];
		
		int[] k1 = {10,20};
		int[] k2 = {100,200};
		int[] k3 = {1000,2000};
		
		su[0] = k1;
		su[1] = k2;
		su[2] = k3;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.print(su[i][j]);
			}
		}
		
		System.out.println();
		// 선언과 생성, 데이터 저장을 한번에 처리
		// int[] num = {100,200,300};
		int [][] num = {{1,2},{10,20},{100,200}};
		
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {  // J는 i가 한바퀴를 다돌면 다시 0으로 초기화 된다.
				
				System.out.println(num[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}