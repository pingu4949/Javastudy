package com.ict.day14;


// static 내부 클래스
public class Ex04 { //외부 클래스
	String name = "홍길동";
	private int age = 24;
	static int cnt = 14;
	public void play() { // 외부 메서드
		int money = 10000;
		System.out.println("외부 메서드 : " + money);
	}
	public static void like() {
		System.out.println("like");
	}
	public static class Inner03{ // 내부 클래스
		String addr = "서울 마포구";
		static int room = 5;
		// 내부클래스 멤버 중에 static 
		public void prn() { // 내부 메서드
			// static 클래스 외부 클래스의 인스턴스 사용불가
			//System.out.println(name);
			//System.out.println(age);
			System.out.println(addr);
			System.out.println(room);
			System.out.println(cnt);
			//play();
			like();
		}
	}
	
}
