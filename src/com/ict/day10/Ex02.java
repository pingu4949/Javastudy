package com.ict.day10;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 t = new Ex01();
		int var1 = 100; // 값이 변했지만, 100이 넘어가는거 이므로 리턴하면서 다시 100으로 돌아온다.
		// 인자가 기본자료형 : Call By Value
		// 같이 변하지 않는다.
		int var2 = t.add(var1);
		// 값이 변하지 않는다.
		System.out.println("값1 " + var1); //100
		System.out.println("값2 " + var2); //101
		
		System.out.println();
		
		int[] su = {10, 100, 1000};
		// 인자가 객체(배열도 포함)자료형 : Call By Reference
		// 참조되는 값이 변할 수 도 있다.
		t.add2(su);
		
		// 배열안에 값이 변한다.
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
			
		}
	}
}
