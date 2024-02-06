package com.ict.homework;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String res = "";
		System.out.println("숫자를 입력하세요 :");
		int k1 = scan.nextInt();
		if (k1 % 2 == 0) {
			res = "짝수";
		}else {
			res = "홀수";
		}

		
		System.out.println(k1+"는"+ res+ "입니다." );
	}
}
