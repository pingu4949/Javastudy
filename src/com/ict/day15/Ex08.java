package com.ict.day15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex08 { //국어 영어 수학 받기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex08main t = new Ex08main();
		
		HashSet<Ex08main> p = new HashSet<Ex08main>();
		
		System.out.println("이름 :");
		String name = scan.next(); 

		System.out.println("국어 점수 :");
		Integer kor = scan.nextInt();
		
		
		System.out.println("영어 점수 :");
		Integer eng = scan.nextInt();
		
		
		System.out.println("수학 점수:");
		Integer math = scan.nextInt();
		
		
		//p.add();
		System.out.println(t.getSum() + "총점");

	}
}
