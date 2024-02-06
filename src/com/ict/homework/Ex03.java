package com.ict.homework;

public class Ex03 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i * j));
			}
		
		
		}
		
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				
			}
		}
		
//		char k2 = '*';
//		String res = "";
//		if( k2 >= 'A' &&  k2 <= 'Z')
//			res = "대문자";
//			else if( k2 >='a' &&  k2 <= 'z')
//			res = "소문자";
//			else if( k2 >= '1' &&  k2 <= '9')
//			res = "숫자";
//			else {
//			res = "기타문자";
//			}
//		
//		System.out.println(k2 + "는" + res + "입니다.");
		
		
		int k1 = 2;
		String res = "";
		if (k1 % 2 == 0) {
			res = "짝수";
		}else {
			res = "홀수";
		}
		
		System.out.println(k1+"는"+ res+ "입니다." );
		
		
		
		
	}
	
	
	
	
	
	
	
	
}


