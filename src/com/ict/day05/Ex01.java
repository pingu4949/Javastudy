package com.ict.day05;

public class Ex01 {
	//메소드 안에서 변수를 만들면 지역변수 (메인메소드 안)
	//메소드 밖에서 변수를 만들면 전역변수 (메인메소드 밖)
	
	public static void main(String[] args) {
		// switch ~ case : 다중 if ~else 문과 같은 조건문
		// if문 조건식 boolean 형, 즉 비교연산, 논리연산, boolean 형일때
		// switch문 인자값이 int 이하, char, String 일때 사용
		// long, 실수형일때 사용 불가
		// 형식) switch(인자값 = int, char, String)(
		// case 조건값1 : 인자값과 조건값1이 같을 때 수행할 문장 ; break;
		// case 조건값2 : 인자값과 조건값2이 같을 때 수행할 문장 ;
		// 인자값과 조건값2이 같을 때 수행할 문장 ; break;
		// case 조건값3 : 인자값과 조건값3이 같을 때 수행할 문장 ; break;
		// default : 조건값1,2,3 모두 같을 때 수행할 문장 ; break;

		// )
		// ** 주의사항 : break가 없으면 break를 만날때까지 모든 실행문을 실행한다.
		// break 문의 역할은 현재 실행 중인 범위({ } 블록)을 벗어나는 역할을 한다.
		// default는 생략 가능

		// int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일주스

		int k1 = 1;
		String drink = "";

		if (k1 == 1) {
			drink = "카페모카";

		} else if (k1 == 2) {
			drink = "카페라떼";

		} else if (k1 == 3) {
			drink = "아메리카노";
		} else if (k1 == 4) {
			drink = "과일주스";
		} else {
			drink = "없는메뉴";
		}

		System.out.println("결과 : " + drink);

		switch (k1) {
		case 1:
			System.out.println("결과 : " +"카페모카");
			break;
		case 2:
			System.out.println("결과 : " +"카페라떼");
			break;
		case 3:
			System.out.println("결과 : " +"아메리카노");
			break;
		case 4:
			System.out.println("결과 : " +"과일주스");
			break;
		}

		switch (k1) {
		case 1:
			drink = "카페모카";
			break;
		case 2:
			drink = "카페라떼";
			break;
		case 3:
			drink = "아메리카노";
			break;
		case 4:
			drink = "과일주스";
			break;
		default:
			drink = "없는메뉴";
			break;
		}
		// switch은 순서대로 걸러서 내려오는 예약어가 아니다.

		System.out.println("결과 : " + drink);

		// char k2이 A이면 아프리카, B이면 브라질, C이면 캐나다 나머지 한국
		char k2 = 'A';
		String res = "";
		switch (k2) {
		case 'A':
			res = "아프리카";
			break;
		case 'B':
			res = "브라질";
			break;
		case 'C':
			res = "캐나다";
			break;
		default:
			res = "한국";
			break; // 마지막꺼는 break 없어도 상관없음. (혹시 모르니 쓰자)
		}

		System.out.println("결과 : " + res);

		// char k3가 A 이거나 a이면 아프리카 B 이거나 b이면 브라질 C이거나 c이면 캐나다 나머지 한국

		char k3 = 'A';
		String res1 = "";
		switch (k3) {
		case 'A':
			res1 = "아프리카";
			break;
		case 'a':
			res1 = "아프리카";
			break;
		case 'B':
			res1 = "브라질";
			break;
		case 'b':
			res1 = "브라질";
			break;
		case 'C':
			res1 = "캐나다";
			break;
		case 'c':
			res1 = "브라질";
			break;
		default:
			res1 = "한국";
			break; // 마지막꺼는 break 없어도 상관없음. (혹시 모르니 쓰자)
					// 범위가 있는걸 사용할거면 switch는 사용xxxxx
		}
		System.out.println("결과 : " + res1);

		// or 관계로 만들어준다 
		char k4 = 'b';
		String res2 = "";
		switch (k4) {
		case 'A':
		case 'a':
			res2 = "아프리카";
			break;
		case 'B':
		case 'b':
			res2 = "브라질";
			break;
		case 'C':
		case 'c':
			res2 = "브라질";
			break;
		default:
			res2 = "한국";
			// 마지막꺼는 break 없어도 상관없음. (혹시 모르니 쓰자)
			// 범위가 있는걸 사용할거면 switch는 사용xxxxx
		}
		System.out.println("결과 : " + res2);

		// String k5이 한국이면 서울, 중국이면 베이징, 일본이면 도쿄, 미국이면 워싱턴
		String k5 = "한국";
		String res3 = "";
		switch (k5) {
		case "한국":
			res3 = "서울";
			break;
		case "중국":
			res3 = "베이징";
			break;
		case "일본":
			res3 = "도쿄";
			break;
		case "미국":
			res3 = "워싱턴";
			break;

		}
		
		System.out.println("결과 : " + res3);
		// switch문 범위가 넓어지면 사용하지 말자 (if문 사용하자)
		// int k6의 점수가 90점이상이면 A, 80이상이면 B, 70이상 C, 나머지 F
		int k6 = 100;
		String res4 = "";
			switch (k6/10) {
			case 10:
				
			case 9:
				res4 = "A";
				break;
			case 8:
				res4 = "B";
				break;			
			case 7:
				res4 = "C";
				break;
			default :	
				res4 = "F";

		}
		System.out.println("결과 : " + res4);
		
	}
}
