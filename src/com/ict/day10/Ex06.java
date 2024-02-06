package com.ict.day10;

import java.util.Scanner;

public class Ex06 {
	// 이름, 국어, 수학, 영어
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	double avg = 0.0;
	int sum = 0;
	String hak = "";

	// void에다가 한번에 넣어주기
	public void pro(String n, int kor, int eng, int math) {
		name = n;

		sum = kor + eng + math;

		avg = (int) (sum / 0.3 * 10) / 10.0;

		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		}else {
			hak =  "F";
		}

	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생수 :");
		
		int su = scan.nextInt();
		Ex06[] arr = new Ex06[su];
		
		String name = scan.next();		
		
		
		System.out.println("국어 :");
		int kor = scan.nextInt();		
		System.out.println("수학 :");
		int eng = scan.nextInt();		
		System.out.println("영어 :");
		int math = scan.nextInt();		
		
		
	}
	
	
	
}
