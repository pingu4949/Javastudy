package com.ict.day11;

public class Ex02 {
	
	boolean live; 
	int age;
	String name;
	
	
	public Ex02() {
		name = "큰뿔소";
		age = 3;
		live = true;
	}
	

	
	public boolean isLive() {
		return live;
	}
	
	public void setLive(boolean live) {
		this.live = live;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
///////////////////////////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		// 객체 생성을 때 큰뿔소, 3살, 살아있는 객체 생성
		
		Ex02 t = new Ex02();
		
		System.out.println("이름 :" + t.getName());
		System.out.println("나이 :" + t.getAge());
		if (t.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("쥬금");
		}

		System.out.println();
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
