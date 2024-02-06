package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		//if ~ else 문
		// 삼향연산자와 비슷하게 처리
		// 즉, 조건식이 참일때 실행 , 거짓일때 실행
		// 즉, 조건식이 참일때와 거짓일 때 각각 나눠서 처리한다.
		// 주의사항) 한줄은 블록 생략 가능
		// if(조건식){
		// 	  조건식이 참일때 실행 ;
		// 	  조건식이 참일때 실행 ;
		// 	  조건식이 참일때 실행 ;
		//}else{
		// 	  조건식이 참일때 실행 ;
		// 	  조건식이 참일때 실행 ;
		// 	  조건식이 참일때 실행 ;
		//}
		
		//int k1이 홀수인지 짝수인지 판별
		
		int k1 = 2 ;
		String res = "초기값";
		int namu = k1%2; 
		
		if (namu == 0) {
			res = "짝수";
			
		}else {
			res = "홀수";
		}
		
		System.out.println("결과 :" + res);
		
		
		//int k2가 60이상이면 합격 아니면 불합격
		
		int k2 = 80;
		String result = "초기값";
		
		if (k2 >= 60) {
			result = "합격";
			
		}else {
			result = "불합격";
			
		}
		System.out.println(result);
		

		//k3가 1이면 가격에 0.1 할인(10%) 한다. (얼마에 살수 있나)
		
		int k3 = 1;
		int price = 1000;
		int result1 = 0;
		
		if (k3 == 1) {
			result1 = price-(price/10);
			
		}else {
			result1 = price;
		}
		
		System.out.println("가격은 :" + result1);
		
		
		
		
		//char k4 = 대문자인지 , 대문자가 아닌지 판별하자.
		
		char k4 = 'A';
		
		String result2 = "초기값";
		
		if (k4 >= 'A' && k4 <= 'Z') {
			result2 = "대문자";
			
		}else {
			result2 = "대문자아님";
		}
		
		System.out.println("결과는 : " + result2);
		
		//근무시간이 8시간까지는 시간당 9860
		// 8시간 초과한 시간 만큼 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		
		int time = 10; //근무시간
		int lmit = 8; //
		int dan = 10000; //시급
		int result3 = 0;
		
		if (time>lmit) {
			result3 = (int) (dan * 1.5 * (time-lmit)+(dan*lmit)); // 금액 * 1.5 * (시간-8) + (금액*8);
			
		}else {
			result3 = time*dan; //금액 * time;
		}
		
		System.out.println("얼마를 받아야되는가 :" + result3);
		
		
		
		
		
		
		
		
	}
}
