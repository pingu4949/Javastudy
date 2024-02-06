package com.ict.day12;

import java.util.Scanner;

import javax.management.remote.SubjectDelegationPermission;

public class Ex09_Result extends Ex09_Cale {
	String dd = "";
	double result;
	@Override
	public void plus(double k1, double k2) {
		// TODO Auto-generated method stub
		result = k1 + k2;
	}

	@Override
	public void minus(double k1, double k2) {
		// TODO Auto-generated method stub
		result = k1 - k2;
	}

	@Override
	public void multiplication(double k1, double k2) {
		// TODO Auto-generated method stub
		result = k1 * k2;
	}

	@Override
	public void division(double k1, double k2) {
		// TODO Auto-generated method stub
		result = (k1*1.0/k2*10)/10.0;
	}

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex09_Result R = new Ex09_Result();
		System.out.print("숫자 입력");
		int k1 = scan.nextInt();
		System.out.print("숫자 입력");
		int k2 = scan.nextInt();
		System.out.println("연산자 입력 +, -, *, /");
		R.dd = scan.next();
		
		switch (R.dd) {
		case "+":
			R.plus(k1, k2);
			System.out.println(k1 +R.dd+ k2 + "=" + R.result);
			break;
		case "-":
			R.minus(k1, k2);
			System.out.println(k1 +R.dd+ k2 + "=" + R.result);
			break;
		case "*":
			R.multiplication(k1, k2);
			System.out.println(k1 +R.dd+ k2 + "=" + R.result);
			break;
		case "/":
			R.division(k1, k2);
			System.out.println(k1 +R.dd+ k2 + "=" + R.result);
			break;
		}
		
	}
	
}

