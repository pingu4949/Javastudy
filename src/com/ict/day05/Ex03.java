package com.ict.day05;

import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 for문 : for문 안에 또 다른 for이 존재하는 것
		
		for (int i = 0; i < 4; i++) {
			System.out.println("명령문1");
			for (int j = 0; j < 6; j++) {
				System.out.println("i =" + i + " j =" + j);
			}
			
			System.out.println("명령문2");
		}
		
		System.out.println();
		
		System.out.println("구구단-1");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10 ;  j++) {
				int res = i*j;
				System.out.print(i + "*"+ j + "=" + res+" " );	
			}
			System.out.println();
		}	
			
			
			
			
			
			
			
		
			
			
		//==========================================================
			System.out.println("구구단-2");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10;  j++) {
				int res = i*j;
				System.out.print(i + "*"+ j + "=" + res+"  ");
				System.out.println();
			}
			System.out.println();
			
		}
		
		System.out.println("구구단-3");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10;  j++) {
				int res = i*j;
				System.out.print(j + "*"+ i + "=" + res+"  ");
			}
			System.out.println();
		}	
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 1; i < 5; i++) {
			System.out.print("0 ");
			for (int j = 1; j < 4; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");	
				}
			}
			System.out.println();
			
		}
	}
	
}
