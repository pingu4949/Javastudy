package com.ict.day13;

public class Ex11_main {
	public static void main(String[] args) {
		toPlay2("홍길동");
		
		// 인터페이스는 객체로 생성 못함
		// Ex11_IBehavior ibe = new Ex11_IBehavior();
		
		// Ex11_Soccer soccer = new Ex11_Soccer();
		// Ex11_BassGuitar bassGuitar = new Ex11_BassGuitar();
		
		Ex11_IBehavior soccer = new Ex11_Soccer();
		Ex11_IBehavior bassGuitar = new Ex11_BassGuitar(); 
		toPlay(bassGuitar);
		System.out.println();
		
		toPlay(new Ex11_Soccer());
	
	}
	public static void toPlay(Ex11_IBehavior ib) {
		ib.play();
	}
	public static void toPlay2(String str) {
		System.out.println(str + "님  성공");
	}
}
