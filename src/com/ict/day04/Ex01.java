package com.ict.day04;

public class Ex01 {
	public static void main(String[] args) {
		// 삼항연산자
		// 형식) 자료형 변수  = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장 ;
		
		// int k1이 홀수인지 짝수인지 판별하자
		// 힌트) 어떤 수를 2 나눈 나머지가 0이면 짝수, 1이면 홀수 
		
		int k1 = 7;
		int res =	k1 % 2;
			

		// 자료형 변수  = (res == 1) ? ("홀수") : ("짝수") ;
		String result =( res == 1) ? ("홀수") : ("짝수");
		System.out.println(k1 + " : " + result);
		
		result = (k1 % 2 == 0)?"짝수":"홀수";
		System.out.println(k1 + " : " + result);
		
		// int k2가 60이상이면 합격 아니면 불합격
		int k2 = 99;
		String res2 = (k2 >= 60) ? "합격" : "불합격";
		System.out.println(k2 + "는" + res2);
		
		// k3가 1이면 가격에 0.1 할인 된다. (소수는 곱하기, 정수는 나누기)
		
		int k3 = 2;
		int price = 1000;
		//할인 가격을 구하는 방식은 3가지이다. 익숙한거 사용하면됨.
		//int res3 = (k3 == (1)) ? price-(price*0.1) : price;
		int res3 = (k3 == (1)) ? price-(price/10) : price; 
		//int res3 = (k3 == (1)) ? (int) (price* 0.9) : price;
		System.out.println("초콜릿 수량이 "+k3 + "개 이므로 "+ res3+"원");
		
		// char k4 = 대문자인지 , 대문자가 아닌지 판별하자.
		
		char k4 = 'A';
		
		String sum =( k4 >= 'A' && k4 <= 'Z' ) ? ("대문자") : ("대문자아님");
		System.out.println("대문자인가요 : " + sum);
		
		//근무시간이 8시간까지는 시간당 9860
		// 8시간 초과한 시간 만큼 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		
		int t1 = 10;
		int dan = 9860;
		int sum4 = (t1 > 8 ) ? (int) (dan * 1.5 * (t1 - 8))+( dan * 8 ): dan * t1;
		System.out.println("결과 : " + sum4);
		
		
	}
}
