package com.ict.day13;

import com.ict.day12.Ex09_Cale;

public class Ex10_main {
	public static void main(String[] args) {
		// 인터페이스 객체 생성 안됨 ~~
		//Ex06_Add t = new Ex06_Add();
		
		// 추상클래스 객체 생성 안됨
		// Ex08_Oper t1 = new Ex08_Oper();
		
		// 오늘의 영어단어 Calculator 계산기 ~
		// 오늘의 영어단어 behavior 행동 ~ behave 행동하다~ 
		
		// 일반 클래스
		Ex09_Calc t3 = new Ex09_Calc();
		double res = t3.plus(10, 4);
		System.out.println(res);
		
		
		
		
	}
}
