package com.ict.day14;

public class Ex06main {
	public static void main(String[] args) {
		Ex06_Test t1 = new Ex06_Test();
		t1.printData();
		System.out.println(t1); //일반적인 방법
		
		Ex06_Test2 t2 = new Ex06_Test2();
		t2.prn(); //내부 메서드 방법
	}
}
