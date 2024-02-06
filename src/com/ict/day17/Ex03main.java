package com.ict.day17;

public class Ex03main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		// 스레드를 같이 사용할때 Ex03 run은 임계영역이 된다.
		new Thread(test, "cat").start(); //
		new Thread(test, "dog").start(); //
		new Thread(test, "tiger").start(); //
		new Thread(test, "lion").start(); //

		System.out.println("main :" + Thread.currentThread().getName());

	}
}
