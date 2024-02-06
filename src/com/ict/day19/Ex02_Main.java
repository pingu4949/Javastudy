package com.ict.day19;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ict.day18.Ex02;

public class Ex02_Main {
	public static void main(String[] args) {
		Stream<com.ict.day19.Ex02> stream = com.ict.day19.Ex02.visite_list.stream();
		
		
		
		double avg = stream.collect(Collectors.averagingInt(i -> i.getVisits()));
		System.out.println("전체 방문한 사람 평균횟수 " + avg);
		
		stream = com.ict.day19.Ex02.visite_list.stream();
		OptionalDouble avg2 = stream.mapToInt(i -> i.getVisits()).average();
		double avg3 = avg2.getAsDouble();
		System.out.println("전체 방문한 사람 평균횟수 " + avg3);
		
		
		
		stream = com.ict.day19.Ex02.visite_list.stream();
		List<String> names = stream.map(i -> i.getName()).collect(Collectors.toList());
		
		System.out.println("회원 이름: " + names);
		
		stream = com.ict.day19.Ex02.visite_list.stream();
		Map<Type, Long> cnt =  stream.collect(
				Collectors.groupingBy(i -> i.getType(), Collectors.counting()));
		System.out.println("타입별 인원 수: "+ cnt);
		
		
		
		
	}
}
