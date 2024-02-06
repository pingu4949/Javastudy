package com.ict.day11;

import java.util.Calendar;

public class Ex13 {
	public static void main(String[] args) {
		// Calender 클래스
		// new 예약어와 생성자를 사용하지 않고 객체 생성 하면 현재 PC 날짜와 시간 지정
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println(now.getTime());
		System.out.println(now.getTimeZone());
		
		
		// 년월일시분초
		System.out.println(now.get(Calendar.YEAR)+ "년"); //YEAR 상수
		System.out.println(now.get(Calendar.MONTH)+ 1 + "월"); // 0 부터 시작이라 +1 해줌
		System.out.println(now.get(Calendar.DATE)+ "일"); 
		System.out.println(now.get(Calendar.DAY_OF_MONTH)+ "일");  
		System.out.println(now.get(Calendar.HOUR)+ "시"); //12시간제
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+ "시"); //24시간제
		
		
		// AM = 0 , PM = 1
		int res = now.get(Calendar.AM_PM);
		if (res == 0) {
			System.out.println("AM "+now.get(Calendar.HOUR)+ "시");
		}else if (res == 1) {
			System.out.println("PM "+now.get(Calendar.HOUR)+ "시");
		}	
			
		// 요일 1(일요일) ~ 7 (토요일)	
		int res2 = now.get(Calendar.DAY_OF_WEEK);
		
		switch (res2) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		
		}
			
		System.out.println(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);
			
		// set 메소드로 날짜 설정 (월, 0 - 11)
		//now.set(2023, 11, 28); //
		//System.out.println(now.getTime());
		
		// 밀리초로 1970년 1월 1일 00시 00분 부터 흐른 시간 구하기
		System.out.println("1970년 1월 1일 00시 00분 부터 흐른 초"+ now.getTimeInMillis());
		
		Calendar now2 = Calendar.getInstance();
		now.set(Calendar.YEAR,2023);
		now.set(Calendar.MONDAY, Calendar.DECEMBER);
		now.set(Calendar.DAY_OF_MONTH, 28);
		
		
		// 두날짜 차이 구하기
		long diff = now2.getTimeInMillis() - now.getTimeInMillis();
		System.out.println(diff);
		System.out.println(diff/(60*60*24*1000)); // 60*60 * 24 * 1(000) = 하루
		
		now.add(Calendar.DATE, 100);
		System.out.println(now.getTime());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
