package com.ict.pingu01;

import java.util.Scanner;

public class 사직연산 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while (scanner.hasNext()) {
         int num1 = scanner.nextInt();
         int num2 = scanner.nextInt();
			
        	System.out.println(num1 + num2);
        	System.out.println(num1 - num2);
        	System.out.println(num1 * num2);
        	System.out.println(num1 / num2);
        	System.out.println(num1 % num2);
		}
        
        
        scanner.close();
    }
}