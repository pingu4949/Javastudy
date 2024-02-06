package com.ict.day17;

public class Ex02main {
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		//스레드를 같이 사용할때 Ex02 run은 임계영역이 된다.
		new Thread(test,"dog").start();  //
		new Thread(test,"cat").start();  //
		new Thread(test,"tiger").start();  //
		new Thread(test,"lion").start();  //
		
		System.out.println("main :" + Thread.currentThread().getName());
	}
}
