package com.ict.day04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //ctrl + 스페이스바 Scanner 활성화 시키기
		
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		int na = num%2; // % 나머지 , / 몫 
		String sum = (na == 0) ? ("짝수") : ("홀수");
		System.out.println(num +"의 결과 : " + sum );

		// 받은 점수가 60점 이상이면 합격 아니면 불합격
		
		System.out.print("점수 : ");
		int num2 = scan.nextInt();
		String sum2 = (num2 >= 60) ? ("합격") :("불합격");
		System.out.println("당신의 점수는 " + sum2 + " 입니다.");
		
		
		
	}
}
