package com.ict.day05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String result = "";
		// 1번 누르면 예 2번 누르면 아니요
		while (true) {
			System.out.println("숫자 입력 : ");
			int su = scan.nextInt();
			if (su % 2 == 0) {
				result = "짝수"; //참
				System.out.println(result +"입니다.");
			} else if (su % 2 == 1) {
				result = "홀수"; //거짓
				System.out.println(result +"입니다.");
			}else if (su == 1) 
				continue;
				System.out.println("예");
			
			
			
		}

	}
}
