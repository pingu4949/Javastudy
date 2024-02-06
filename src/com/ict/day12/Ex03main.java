package com.ict.day12;

public class Ex03main {
	public static void main(String[] args) {
		// 자식클래스를 객체 생성하면 부모클래스가 먼저 생성 된다.
		Ex03_sub t = new Ex03_sub();
		// 부모 				자식
		Ex03_sup t2 = new Ex03_sub(); // Ex03_sub  is a 관계 Ex03_sup
		
		// 자식 				부모 => 컴파일 오류
		// Ex03_sub t3 = new Ex03_sup(); 
		
		
		
		
	}
}
