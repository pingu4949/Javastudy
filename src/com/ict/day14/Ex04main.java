package com.ict.day14;

import com.ict.day14.Ex04.Inner03;

public class Ex04main {
	public static void main(String[] args) {
		// 별도의 객체 생성 없이 사용 가능
		System.out.println(Inner03.room);
		System.out.println();
		
		// 별도로 만들어진다.
		Inner03 t = new Inner03();
		t.prn();
	}
}
