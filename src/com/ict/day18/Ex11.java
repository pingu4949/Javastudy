package com.ict.day18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		List<String> srt = Arrays.asList("딸기","바나나","멜론","수박");
		//									 작은값				기본정렬
		// naturalOrder() : 기본정렬을 못한다
		Optional<String> o_min = srt.stream().min(Comparator.naturalOrder());
		Optional<String> o_max = srt.stream().max(Comparator.naturalOrder());
		// findAny : 요소중 하나의 요소를 반환
		Optional<String> o_findAny = srt.stream().findAny();
		// findFirst : 요소 중 첫번째 요소 바환
		Optional<String> o_findFirst = srt.stream().findFirst();
		
		System.out.println(o_min.get());
		System.out.println(o_max.get());
		System.out.println(o_findAny.get());
		System.out.println(o_findFirst.get());
		
		System.out.println();
		
		List<Integer> num = Arrays.asList(13, 2, 8, 44, 52, 65);
		Optional<Integer> n_min = num.stream().min(Comparator.naturalOrder());
		Optional<Integer> n_max = num.stream().max(Comparator.naturalOrder());
		Optional<Integer> n_findAny = num.stream().findAny();
		Optional<Integer> n_findFirst = num.stream().findFirst();
		
		System.out.println(n_min.get());
		System.out.println(n_max.get());
		System.out.println(n_findAny.get());
		System.out.println(n_findFirst.get());
		
	}
}
