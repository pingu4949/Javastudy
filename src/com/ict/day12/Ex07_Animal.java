package com.ict.day12;

public class Ex07_Animal {
	
	String name = "동물";	
	int age = 0;
	
	public Ex07_Animal() {
		System.out.println("얘는?");
	}
	
	public Ex07_Animal(String name, int age) {
		System.out.println("부모 생성자 :");
		this.name = name;
		this.age = age;
	}// this 안붙이면 지역변수로 할당된다 그래서 꼭 붙어야됨
	//생성자가 기본이 아니라 인자값이 들어가면 자식 생성자가 super() 사용하여 인자 자료형에 맞춰줘야된다. 
	
	
	
	
	
	
}
