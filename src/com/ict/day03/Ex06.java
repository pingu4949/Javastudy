package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
			// 이름이 홍길동인 사람의 점수가
			// 국어 90, 영어 80, 수학 80 이다.
			// 총점과 평균을 구하자.
			// 출력은 이름, 총점, 평균만 출력하다 (단, 평균은 소수점 첫째짜리 까지 구하자)
		
		// 입력 정보
		// 이름 저장
		String name ="홍길동";
		
		// 국어 저장
		int kr = 90;
		// 영어
		int eg = 80;
		// 수학
		int mt = 60;
		
		// 요구사항 (처리 = 비즈니스로직)
		// 총점과 평균
		int res =kr + eg + mt ;
		// 정수와 실수가 산술연산하면 실수가된다.
		double res1 =(int)( res /3.0 * 10 )/10.0;
		double res2 =(int)( res /3.0 * 100 )/100.0;
			
		// 출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : "+ res);
		System.out.printf("평균 :"+ res1 );
		System.out.println();
		System.out.printf("평균 :"+ res2 );
		
		System.out.println();
		// 끝의 5를 버릴 때 
		int k1 = (198745/10) * 10;
		// 끝 두자리 45를 버릴 때
		int k2 = (198745/100) * 100;
		System.out.println(k1);
		System.out.println(k2);
				
		
		
		
		
		
		
		
	}
}
