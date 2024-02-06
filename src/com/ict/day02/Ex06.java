package com.ict.day02;

public class Ex06 {
	public static void main(String[] args) {
			
		
		 	// 형 변환 : 자동 형 변환, 강제 형 변환
		 	// 자동 형 변환 = 프로모션 : 작은 자료형이 큰 자료형을 변환하는 것 ( 저장 하는 것)
		
			int s1 = 10 ;
			System.out.println(s1);
			
			long s2 = s1;
			System.out.println(s2);
			
			long s3 = 10 ;  //원래는 L이나 l 안들어가서 오류인데 작은자료형이 큰 자료형으로 들어가서 오류가 안생김.
			System.out.println(s3);
			
			// 강제 형 변환 = 디모션 :  큰자료형이 작은 자료형으로 변환할때 오류가 발생하여서
			//									   강제로 변경시키는 방법(데이터가 손실된 가능성이 있다.)
			
			double d1 = 35.14f ;
			System.out.println(d1);
			
			int d2 = (int) d1 ;
			System.out.println(d2);
	
			float f1 = (float)(5426.142) ;
			System.out.println(f1);
			
			// 자동형변환
			int k1 = 'a';
			System.out.println(k1);
			
			// char가 0 - 65,535 사이의 값은 받을 수 있다.
			char k2 = 105;
			System.out.println(k2);
			//int k3 105 값을 char k4에 넣을수없다(원래) (char)(k3); (가능)
			int k3 = 105;
			System.out.println(k3);
			char k4 = (char)(k3);
			System.out.println(k4);
			
			
	}
}
