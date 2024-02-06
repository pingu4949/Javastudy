package com.ict.day03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 이름이 국어, 영어 , 수학 점수를 키보드로 입력받아서
		// 총점과 평균을 구하자.
		// 출력은 이름, 총점, 평균만 출력하자. (단, 평균은 소수점 둘째자리 까지 구하자)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("국어점수 : ");
		int kr = scan.nextInt();
		
		System.out.print("영어점수 : ");
		int eg = scan.nextInt();
		
		System.out.print("수학점수 : ");
		int mt = scan.nextInt();
		
		int sum = kr + eg +mt; 
		double sum2 = (int)(sum/3.0 *100)/100.0;
		System.out.println("당신의 이름은 : "+ name);
		System.out.println("총점 :"+ sum);
		System.out.println("평균 :" + sum2);
		
	}
}
