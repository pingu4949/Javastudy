package com.ict.day11;

public class Ex09 {

	// static 초기화
	/*
	 * static { 초기화 내용 ; }
	 * 
	 * 
	 */
	 int s1 = 100;
	private int p1 = 300;
	static int s2; //500000
	static int s3;
	
	
	
	public static int k2 = 300; //200000
	static int k3 = 300;
	private static int k4 = 500;
	
	// 위에있는 변수를 static으로 넣으면 초기화되어서 static값이 나온다.
	static {
		k2 = 200000;
		s2 = 500000;
		j2 = 400000; //요기로 들어오면 초기화된다!!
		m2 = 600000;
	}
	// 밑으로 내려가서 수를 지정하면 그 수가 나온다.
	static int m2; 		 // 600000
	static int j2 = 400; // 400  j2는 밑에 있는 상태에서 값이 들어갔기때문에 출력하면 400이 나온다.
}
