package com.ict.day12;

public class Ex04main {
	public static void main(String[] args) {
		// 자식 클래스를 객체 생성하면 (생성자 호출)
		// 자식 클래스의 부모클래스의 생성자를 호출
		Ex04_Game Game = new Ex04_Game();
		System.out.println(Game);
		
		System.out.println();
		// 게임하기
		Game.play();
		// 자식클래스에게 없지만 부모클래스에게 있으므로 사용 가능
		Game.sound();
		// 부모의 부모클래스에 존재해도 사용 가능
		Game.call();
		Game.sms();
		
		System.out.println(Game.num); // 우선순위가 Game로 불러왔기때문에 자기자신이랑 가장 가까운 순서대로 실행된다.
		
		Ex04_Dca Dca = new Ex04_Dca();
		System.out.println(Dca);
		
		System.out.println();
		Dca.picture();
		System.out.println();
	}
}
