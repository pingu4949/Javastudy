package com.ict.day17;

// 두개의 스레드를 생성하여 첫번재 스레드의 출력을 1- 100까지 출력
// 두번째 스레드가 출력을 101-200까지 출력하라(synchronized 사용)
public class Ex04 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(++x + ":" + Thread.currentThread().getName());
			if (x == 100) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}
}
