package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Ex12 t = new Ex12();
		t.play02("최영란",80, 85, 80);
		
		System.out.println();
		
		Ex13 t1 = new Ex13();
		t1.play02("박다현", 86, 95, 79);
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 :");
		String name = scan.next();
		System.out.print("국어 :");
		int kor = scan.nextInt();
		System.out.print("수학 :");
		int eng = scan.nextInt();
		System.out.print("영어 :");
		int math = scan.nextInt();
				
		System.out.println();
		t1.play02(name, kor, eng, math);
		

				
				
				
				
	}
}
