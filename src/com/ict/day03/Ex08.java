package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		// 3340초 몇시간, 몇분, 몇초일까 ?
		
		int total = 3989;
		
		int hour = total /3600;
		
		int minute = (total - (hour * 3600)) / 60;
		
		int second = total - (minute * 60) - (hour * 3600); 
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		int h = 0;
		int m = 0; 
		int s = 0;
		int res = 0;  // 나머지 저장
		// 시간을 구하자
		h = total / (60 * 60);
		res = total %(60 * 60);
		m = res/ (60);
		s = res%(60);
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
