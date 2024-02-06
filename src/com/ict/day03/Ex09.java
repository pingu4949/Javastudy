package com.ict.day03;

public class Ex09 {
	public static void main(String[] args) {
		// 카페모카 6500원이다.
		// 친구아 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가? (단, 부가세 10% 포함)
		
		//String coff = "카페모카";
		int input = 15000;
		int dan = 6500;
		int su = 2;
		
		int total = dan * su ;
		
		//두가지 방법
		int vat = total/10;
		int vat1 = (int)(total * 0.1);
		
		int sum = total + vat;
		int suma = input - sum;
		
		System.out.println(sum);
		System.out.println(suma);
		
		//==========================================================================
		
		// 다른방법
		int sum2 =(int) (total);
		int output = input - sum;
		
		System.out.println(sum2);
		System.out.println(output);
			
		int input1 = 15000;
		int coffe = 13000;
		int dang = (int)(coffe * 0.1);
		
		int sum3 = dang + coffe;
		int sum4= input1 - sum3;
		System.out.println("잔돈은 얼마인가? :" + sum4 + "원");
	}
}

