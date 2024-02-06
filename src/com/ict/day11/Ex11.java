package com.ict.day11;

import java.util.Random;

public class Ex11 {
	public static void main(String[] args) {
		// rendom 처리
		// 1. Math.random(), Random 클래스
		// 1. Math 전체 메서드가 static이므로 객체 생성 없음
		// Math.(매서드이름)([인자]);
		// Math.random(); // 0.0 ~ 1.0 미만
		System.out.println(Math.random());
		
		
		// 특정범위 : (int)(Math.random()* 숫자) : 0 ~(숫자~1)
		System.out.println((int)(Math.random()*10+1));
		
		
		Random ran = new Random(); // 생성자 
		
		// 각종 자료형의 난수 발생 : 자료형 범위 안에서 난수 발생
		System.out.println("boolean형 :"+ ran.nextBoolean());
		System.out.println("int형 :"+ ran.nextInt());
		System.out.println("long형 :"+ ran.nextLong());
		// 0.0 ~ 1.0 미만
		System.out.println("float형 :" + ran.nextFloat());
		System.out.println("double형 :"+ ran.nextDouble());
		
		
		// 특정 범위 안에서 난수 발생
		// 1. nextInt(범위) : 0 ~ 범위 전 까지 난수 발생
		// 2. (int)nextDouble() * 범위 : 0 ~ 범위 전 까지 난수 발생
		System.out.println(ran.nextInt(7));
		System.out.println((int)(ran.nextDouble()* 7));
		
	}
}
