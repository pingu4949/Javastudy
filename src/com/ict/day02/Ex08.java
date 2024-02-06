package com.ict.day02;

public class Ex08 {
	public static void main(String[] args) {
		// 산술연산자 : + , - , * , /
		// 대상 : char, int, long, double, float
		// 	  	문자형, 정수형, 실수형
		int su1 =9;
		int su2 = 4;
		int result = 0; // 결과를 저장하는 놈
		
		result = su1 + su2 ;
		System.out.println("결과 : "+ su1 + "+" + su2 + "="  + result);
		System.out.println("결과 : 9 + 4 = "  + result); //단점 문자열에 변수를 써버리면 변수가 바뀔때 불편하다. 
		// 데이터를 직접 출력하거나 호출 하지 말고 변수를 이용해서 출력하거나 호출 하자.
		
		
		result =su1 - su2;
		System.out.println("결과 : "+ su1 + "-" + su2 + "="  + result);
		
		
		result = su1 * su2;
		System.out.println("결과 : "+ su1 + "*" + su2 + "="  + result);
		
		// 정수 와 정수가 산술연산을 하면 결과는 정수가 된다.
		result = su1 / su2;
		System.out.println("결과 : "+ su1 + "/" + su2 + "="  + result);
		
		// 정수 와 정수가 산술연산을 하면 결과는 정수가 된다. 단, 앞에 double(실수 자료형)이 붙었으므로 .0이 붙음
		double result2 = su1 / su2;
		System.out.println("결과 : "+ su1 + "/" + su2 + "="  + result2);
		
		// 정수와 실수가 산술연산을 하면 결과는 실수가 된다.
		double result3 = su1 / (su2 *1.0);
		System.out.println("결과 : "+ su1 + "/" + su2 + "="  + result3);
		
		double result4 = su1/ (double) su2;
		System.out.println( "결과 : " + su1 + "/" + su2 + "=" + result4);
		
		// 나머지
		result = su1 % su2 ;
		System.out.println( "결과 : " + su1 + "%" + su2 + "=" + result);
		// 2 나눌때 0, 1, 3나눌 때 0, 1, 2, 7나눌때 0, 1, 2, 3, 4, 5, 6
	}
}