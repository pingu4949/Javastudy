package com.ict.day04;


public class Ex04 {
	public static void main(String[] args) {
		// 단순 if 문 : 조건이 참일때 실행, 거짓일 경우는 무시한다.
		// 형식 ) if(조건식) {
		//		    조건식이 참일때 실행할 문장;
		//		    조건식이 참일때 실행할 문장;
		//		    조건식이 참일때 실행할 문장;
		//		   	}
		// 주의사항 : 실행할 문장이 한 줄이면 {} {블록} 생략가능
		
		// int k1이 60이상 합격
		int k1 = 59;
		String result = "불합격";
		if(k1 >= 60) {
			result = "합격";
			
		}

		
		
		System.out.println("결과 : " + result);
		
		int k2 = 59;
		String result1 = "초기값";
		if(k2 >= 60) {
			result1 = "합격";
		}else {
			result1 = "불합격";
		}
		
		System.out.println("결과 : " + result1);
		
		
	}
}
