package com.ict.day12;

public class Ex05_cat extends Ex05_Animal{
	
	
	int tall = 10;
	
	// 부모 메서드를 가져와서 자식클래스가 마음대로 변경할 수 있다.
	// 이것을 오버라이딩이라고 한다.
	// @Override => 어노테이션
	// @Override => 부모클래스에서 메소드를 자식클래스가 가져와서 재정의한다.
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야 옹 ~");
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("놀기");
	}
	
}
