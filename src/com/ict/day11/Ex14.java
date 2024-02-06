package com.ict.day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex14 {
	public static void main(String[] args) {
		// java version 8.0이상에서만 가능
		//LocalDate 날짜 정보만
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);
		
		LocalDate cDate2 = LocalDate.of(2023, 12, 28);
		System.out.println(cDate2);
		
		System.out.println();
		
		// 날짜비교
		
		System.out.println(ChronoUnit.YEARS.between(cDate, cDate2)); // 두날짜간에 기간이 1년이안된다는걸 알수 있다.
		System.out.println(ChronoUnit.MONTHS.between(cDate, cDate2)); 
		System.out.println(ChronoUnit.DAYS.between(cDate, cDate2)); 
		
		System.out.println();
		
		// LocalTime : 시간정보만
		LocalTime cTime = (LocalTime.now());
		System.out.println(cTime);
		
		LocalTime cTime2 = (LocalTime.of(17, 59)); //valid values 0 - 59):
		System.out.println(cTime2);
		
		LocalDateTime cdt = (LocalDateTime.now());
		System.out.println(cdt);
	
		LocalDateTime cdt2 = (LocalDateTime.of(cDate2, cTime2));
		System.out.println(cdt2);
		
		System.out.println();
		// plus**(), 빼기 minus**()
		System.out.println(cdt.plusYears(7));
		System.out.println(cdt.plusMonths(7));
		System.out.println(cdt.plusDays(7));
		System.out.println(cdt.plusHours(7));
		
		
	}
	
}
