package com.ict.day16;

public class Ex08 {
	public static void main(String[] args) {
		// 현재 사용중인 스레드의 이름 구하기
		System.out.println("main:" + Thread.currentThread().getName());
		
		Ex08_TestA testA = new Ex08_TestA();
		Ex08_TestB testB = new Ex08_TestB();
		Ex08_TestC testC = new Ex08_TestC();

		
		testA.start();
		testB.start();
		testC.start();
		
		
		System.out.println("수고하셨습니다.");
		
	}

}
