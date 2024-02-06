package com.ict.day17;

public class Ex11main {
	public static void main(String[] args) {
		Ex11 t = str -> System.out.println(str);
		
		
		t.showString("Hello lamda");
		// 스태틱 메서드는 스태틱 메서드만 호출 가능
		showMyString(t);
		showMyString(new Ex11() {
			@Override
			public void showString(String str) {
				System.out.println("Hello lamda_3");
			}
		});
	
	}
	
	public static void showMyString(Ex11 k) {
		k.showString("Hello lamda2");
	}
	
	
	public static void showMyString2(Ex11 t) {
		
	}
}
