package com.ict.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex12 {
	public static void main(String[] args) {
		// collect : 스트림을 컬렉션으로 변환

		Stream<String> s = Stream.of("a", "b", "c", "b", "z");
		TreeSet<String> set = s.collect(Collectors.toCollection(() -> new TreeSet<String>()));
		set.add("h");
		set.add("w");
		System.out.println(set);

		// Map 
		Stream<String> str = Stream.of("나", "우리", "너", "모두", "노래해요");
		Map<Integer, String> res01 =
				// 길이가 같은 것 끼리 연결 해서 만듬
				str.collect(Collectors.groupingBy(i -> i.length(), Collectors.joining()));
		System.out.println(res01);

		
		Stream<String> str2 = Stream.of("나", "우리", "너", "모두", "노래해요");
		Map<Object, Object> res02 = str2.collect(Collectors.toMap(i -> i, j -> j));
		System.out.print(res02);
		
		str = Stream.of("나", "우리", "너", "모두", "노래해요");
		Map<Object, Object> res03 = str.collect(Collectors.toMap(i -> i, j -> j));
		System.out.print(res03);

		// 홀수와 짝수 묶어서 합계구하기 list컬렉션
		List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 8, 11, 13, 14, 15, 17, 18, 19, 20 });
		Map<String, Integer> map = list.stream()
									// 홀수와 짝수를 그룹 (key)
				.collect(Collectors.groupingBy(i ->(i% 2 == 0)? "even" : "odd", 
						// 누적합 (value)
						Collectors.reducing(0,(i1, i2) -> i1 + i2)));
		System.out.println(map);
	}
}
