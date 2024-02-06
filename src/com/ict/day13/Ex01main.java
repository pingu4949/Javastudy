package com.ict.day13;

public class Ex01main {
	public static void main(String[] args) {
		// 일반클래스에서 static 호출
		Ex01 t = new Ex01();
		
		System.out.println(Ex01.su2);
		System.out.println(Ex01.SU4);
		
		System.out.println(Ex02.su1); //interface는 무조건 상수로 만든다.
		System.out.println(Ex02.su2);
		System.out.println(Ex02.su3);
		System.out.println(Ex02.su3);
	}
}
