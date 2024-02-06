package com.ict.day13;

import java.util.Iterator;

enum Type2 {
	WALK("워킹화", 240, false), 
	RUN("러닝화", 245, false), 
	TRACK("트래킹화", 235, true), 
	HIKE("하이키화", 250, true);

	private final String name;
	private final int size;
	private final boolean gender;
	// setter는 없음 기본값이 없기때문?
	// getter만 생성
	// 생성자 역할을 하는 놈
	private Type2(String name, int size, boolean gender) {
		this.name = name;
		this.size = size;
		this.gender = gender;

	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	
	public boolean getgender() {
		return gender;
	}

}
//아 ~ 그게 또 맛이 있지 ~
public class Ex14 {
	public static void main(String[] args) {
		Type2[] arr = Type2.values();	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+":"+arr[i].getSize()+":"+arr[i].getgender());
			
			
			
		}
	}
}
