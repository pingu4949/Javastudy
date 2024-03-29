package com.ict.day04;


public class Ex03 {
	public static void main(String[] args) {
		// 중첩 삼항 연산자 : 삼항 연산자 안에 삼항 연산자가 존재
		// 형식) 자료형 변수  = (조건식) ? ((조건식2)? 참일때 : 거짓일 때) : 거짓일때 실행할 문장 ;
		// 형식) 자료형 변수  = (조건식) ? 참일때 실행할 문장 : ((조건식) ? 참일때 : 거짓일 때) ;
		
		// int k1이 90이상이면 "A학점, 80이상이면 "B학점", 나머지는 "F학점"
		int k1 = 94;
		String sum = (k1 >= 90) ? "A학점" : ((k1 >= 80) ? "B학점" : "F학점");
		System.out.println("몇점인가요 :" + sum);
		
		// char k2가 대문자인지, 소문자인지, 기타문자인지 판별하자
		char k2 = '4';
		String sum2 = (k2 >= 'A' && k2 <= 'Z') ? "대문자" : ((k2 >= 'a' && k2 <='z') ? "소문자" : "기타문자");
		System.out.println( k2 + "는" + sum2 + "입니다.");
		
		// int k3 1 또는 3이면 남자 , 나머지 여자
		int k3 = 1;
		String sum3 = (k3 == 1 || k3 == 3 ) ? "남자" : "여자";
		System.out.println("성별은 : " + sum3);
		
		// int k3 1 또는 3이면 남자 , 2 또는 4이면 여자
		
		int k4 = 3;
		String sum4 = (k4 == 1 || k4 == 3 ) ? "남자" : (k4 == 2 || k4 == 4)? "여자": "외계인";
		System.out.println("성별은 :" + sum4);
		
		//int k4가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
		//			   2이면 1900년대 태어난 여자, 4이면 2000년대 태어난 여자
		
		int k5 = 3;
		String sum5 = (k5 == 1 ) ? "1900년대 태어난남자" : ((k5 == 3) ? "2000년대 태어난 남자" : k5 == 2 ? "1900년대 여자" : "2000년대 여자" ); 
		System.out.println("성별은 :" + sum5);
		
		int k6 = 4;
		String sum6 = (k6 == 1 || k6 == 3 ) ? ((k6 == 1) ? "1990년대 태어난 남자" : "2000년대 태어난 남자"):
				(k6 == 2 || k6 == 4)? ((k6 == 2 ? "1900년대 태어난 여자": "2000년대 태어난 여자" )): "외계인";
		System.out.println("성별은 :" + sum6);
		
		// 두 수 중 큰 수를 구하자
		int su1 = 9;
		int su2 = 9;
		int res = (su1 > su2)? su1 : su2; 
		System.out.println("큰수는 : " + res);
		
		int res2 = Math.max(su1,su2);
		System.out.println("큰수는 :" + res2);
		
	}
} 
