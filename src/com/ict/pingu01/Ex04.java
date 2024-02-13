package com.ict.pingu01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b= scanner.nextInt();
			
			int c = a * ((b%100)%10);
			int d = a * ((b%100)/10);
			int e = a * (b/100);
			int f = a*b;
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
		}
		
		
	}
}
