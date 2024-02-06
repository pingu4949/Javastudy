package com.ict.day16;

// 스레드 만들어서 처리 할려면
// Thread가 run을 가지고 있다.
public class Ex08_TestA extends Thread {
// 메인에서는 JVM으로 들어가면서 멈추지만 스레드를 상속받은 run은 직접 멈추게 해주거나 , 음악 스트리밍 화면꺼도 되는 프로그램은 계속 돌아가게 해도 된다. 앱의 특성에 따라 다르다.
// start메서드가 있으면 main에 있는 start가 start를 따라간다. (이러면 싱글스레드 의미없음)
	
	
//	@Override
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa :"+ i + Thread.currentThread());
//			
//		}
//	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa :"+ i + Thread.currentThread());
		}
		
	}
}
