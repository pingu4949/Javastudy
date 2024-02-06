package com.ict.day03;

public class Ex07 {
	public static void main(String[] args) {
		// 2시간 40분 30초를 초로 환산 하여라. (몇초일까요?)
		int hour = 2;
		int minute = 40;
		int second = 30;
		
		int result = (hour*3600) + (minute*60)+(second);
		System.out.println("결과 : " + result);
		
		
		// int h = 2 * 60 * 60 ;
		// int m = 40 * 60;
		// int s = 30;
		
		// int total = h + m + s ;
		// System.out.println("2시간 40분 30초는" + total + "초 입니다.")
	}
}
