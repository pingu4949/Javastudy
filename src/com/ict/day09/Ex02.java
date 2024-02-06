package com.ict.day09;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 클래스에 static 변수와 상수가 있다.
		// 객체 생성 없이 호출 할 수 있다.
		
		//static 부를때 클래스로 부르자
		int k1 = Ex01.eng;
		int k2 = Ex01.COMPUTER;
		System.out.println("eng :" + k1);
		System.out.println("com :" + k2);
		
		System.out.println();
		// Ex01 클래스를 객체로 만들자	
		// 해당 클래스에 생성자가 없으면 무조건 기본생성자 만든다.
		// 클래스이름() => 인자가 없는 생성자를 기본생성자라고 한다.
		// Ex01 t = new; 생성자([인자])
		Ex01 t = new Ex01(); // <- 생성자
		
		System.out.println(t);
		System.out.println(t.name);
		System.out.println(t.kor);
		System.out.println(t.MATH);
		
		System.out.println();
		
		System.out.println("eng" + k1);
		System.out.println("com" + k2);
			
		System.out.println();
		// 권장사항 x 위처럼 클래스로 부르기 
		// static 참조변수로 불러도 오류 x
		System.out.println(t.eng);
		System.out.println(t.COMPUTER);
		
		System.out.println();
		// 변수와 상수
		t.kor = 90; //변수 값 변경
		System.out.println(t.kor);
		
		//t.MATH = 100; //상수 값 변경안됨
		
		// 상수이므로 데이터를 변경할 수 없다.
		// t.MATH = 100;
		
		
	}
}








