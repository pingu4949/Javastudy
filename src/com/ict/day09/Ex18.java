package com.ict.day09;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex17 t = new Ex17();
		// 첫번째 숫자 :
		System.out.print("숫자 입력:");
		int k1 = scan.nextInt();
		
		// 두번째 숫자 :
		System.out.print("숫자 입력:");
		int k2 = scan.nextInt();
		
		// 연산자 : +, -, *, /
		System.out.println("연산자 : +, -, *, /");
		String str = scan.next();
		switch (str) {
		case "+":
			t.plus(k1, k2);
			System.out.println(k1 + str + k2+ "=" + t.res);
			break;
		case "-":
			t.sub(k1, k2);
			System.out.println(k1 + str + k2+ "=" + t.res);
			break;
		case "*":
			int k = t.mul(k1, k2);
			System.out.println(k1 + str + k2+ "=" + t.res+k);
			break;
		case "/":
			double a = t.div(k1, k2);
			System.out.println(k1 + str + k2+ "=" + t.res+a);
			break;
		}
		// 출력
		
		// 숫자 연산자 숫자 = 결과
		
		
		
		
	}
}
