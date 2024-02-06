package com.ict.day12;

public class Ex05_dog extends Ex05_Animal{
	int tall = 3;
	
	@Override
	public void sound() {
		System.out.println("멍 멍");
	}
	
	@Override
	public void like() {
		
		System.out.println("사료야미");
	}
	
	public void happy() {
		// TODO Auto-generated method stub
		System.out.println("누워있기");
	}
}
