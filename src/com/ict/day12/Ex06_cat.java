package com.ict.day12;

public class Ex06_cat extends Ex06_Animal{
	
	public void play01() {
		age = age + 10;
		System.out.println(age);
	}
	
	public void play02() {
		//사용하는 것은 가능.
		age = month + 10;
		
		//month = month + 10;  //final 붙은 변수는 값변경이 불가능하다.
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹 ~🐱");
}	
	
	
	//부모클래스에 sleep()에 final 있으므로
	// 오버라이딩 불가
	
//	@Override			
//	public final void sleep() {
//		// TODO Auto-generated method stub
//		System.out.println("15이상 잠을 잔다. ");		
}

	