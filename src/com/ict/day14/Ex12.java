package com.ict.day14;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 숫자 받아서 홀수인지 짝수인지

		esc: while (true) {
			try {
				System.out.print("숫자 입력하세요 :");
				String su = scan.next();
				int su2 = Integer.parseInt(su);
				String res = "";
				if (su2 % 2 == 0) {
					res = "짝수";
				} else {
					res = "홀수";
				}
				System.out.println(su + "는" + res + "입니다");


			while (true) {
				System.out.println("계속 하시겠습니까? y번 예 n번 아니요");
				String msg = (scan.next());
				// String에서는 같다를 == 사용하면 안됨
				// equals() => 대소문자를 구별,
				// equalseIgnoreCase() => 대소문자를 구별하지 않음
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				}
				if (msg.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로 입력하세요 :");
				} // 안
			} catch (NumberFormatException e) {
				System.out.println("문자 입력 노노노놋~~");
			}

		} // 밖
		System.out.println("수고하셨습니다.");

	}
}
