package com.ict.day04;

public class Ex06 {
	public static void main(String[] args) {
		// 다중 if 문
		// 형식) if(조건식1) {
		//			조건식1이 참일 때 실행;
		//			조건식1이 참일 때 실행;	
		//		}else if(조건식2){
		//			조건식1에는 거짓이면서 조건식2에는 참일 때 실행;
		//			조건식1에는 거짓이면서 조건식2에는 참일 때 실행;		
		//		}else if(조건식3){
		//			조건식1,2에는 거짓이면서 조건식3에는 참일 때 실행;
		//			조건식1,2에는 거짓이면서 조건식3에는 참일 때 실행;
		//		}else(
		//			조건식1,2,3 이 모든 거짓인 경우;
		//			나머지 다
		//		}
		
		
		// int k1의 점수가 90이상이면 A, 80이상이면 B,70이상이면 C, 나머지 F
		
		int k1 = 99;
		String res = "";
		if (k1 >= 90) {
			res = "A학점";
		}else if (k1 >= 80){
			res = "B학점";
		}else if (k1 >= 70){
			res = "C학점";
		}else {
			res = "F학점";
		}
		System.out.println("k1" +"의 점수는: "+ res +"입니다.");

		
		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		
		char k2 = 'A';
		String res1 = "";
		if (k2 >= 'A' && k2 <= 'Z') {
			res1 = "대문자";
		}else if (k2 >= 'a' && k2 <= 'z'){
			res1 = "소문자";
		}else if (k2 >= '0' && k2 <= '9' ){
			res1 = "숫자";
		}else {
			res1 ="기타문자";
		}
		System.out.println("k2" +"의 정체는: "+ res1 +"입니다.");
		// char k3가 A,a이면 아프리카 B,b이면 브라질 C,c이면 캐나다 나머지 한국
		char k3 = 'b';
		String res2 = "";
		if (k3 == 'a' || k3 == 'A') {
			res2 = "아프리카";
		}else if (k3 == 'B' || k3 == 'b') {
			res2 = "브라질";
		}else if (k3 == 'C' || k3 == 'c') {
			res2 = "캐나다";
		}else {
			res2 = "한국";
		}
		
		System.out.println("k3" +"의 정체는: "+ res2 +"입니다.");
		int menu = 3; // 메뉴
		int res3 = 0; // 초기값
		int su = 2;
		int coffe = 3500; //카페모카
		int coffe1 = 4000;//카페라떼	
		int coffe2 = 3000;//아메리카노	
		int coffe3 = 3500;//과일주스
		int dan = 10000;
		String drink = "";
		if (menu == 1) {
			res3 = dan-(coffe*su+(coffe*su/10));
			
		}else if (menu == 2) {
			res3 = dan-(coffe1*su+(coffe1*su/10));
			
		}else if (menu == 3) {
			res3 = dan-(coffe2*su+(coffe2*su/10));
			
		}else if (menu == 4){
			res3 = dan-(coffe3*su+(coffe3*su/10));
			
		}else {
			res3 = dan;
		}
	
		System.out.println("잔돈 : "+ res3 +"입니다.");
		
		
		
		// menu가 1이면 카메모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일주스 3500이다.
		// 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가? (부과세 10% 포함, 친구와 같은 음료만 선택 가능)
		
	int menu1 = 1;
	int input = 10000;
	int su1 = 2;
	int dan1 = 0;
	int total = 0;
	int vat = 0;
	int output = 0;
	int full = 0;
	String drink1 = "";
		
	if (menu1 == 1) {
	drink1 = "카페모카";
	dan1 = 3500;	
	}else if (menu1 == 2) {
	drink1 = "카페라떼";	
	dan1 = 4000;	
	}else if (menu1 == 3) {
	drink = "아메리카노";
	dan1 = 3000;	
	}else if (menu1 == 4) {
	drink1 = "과일주스";
	dan1 = 3500;	
	}else{
		dan1 =0;
	}
	total = dan1 * su1;
	vat = total/10;
	full = total + vat;
	output = input - (total + vat);	
	System.out.println();
	System.out.println("지불금액 :" + input);
	System.out.println("선택 음료 :"+ drink1);
	System.out.println("음료 개수 :"+ su);
	System.out.println("총 금액 :" + full);
	System.out.println("잔 돈 :" + output);
		

		
		
		
		
		
		
		
		
		
	}
}
