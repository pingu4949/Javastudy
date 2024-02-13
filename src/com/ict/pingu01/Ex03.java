package com.ict.pingu01;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			int a,b,c; 
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			System.out.println((a+b)%c);
			System.out.println(((a+c)+(b%c))%c);
			System.out.println((a*b)%c);
			System.out.println(((a%c)*(b%c))%c);
		}
		
	}
}
