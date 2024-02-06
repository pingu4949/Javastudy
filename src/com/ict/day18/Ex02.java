package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		// 스트림 생성 : 컬렉션이나 배열을 Stream 으로 반환
		// 객체, 배열부터 스트림 생성
		// Stream<T> Stream.of(T... values) 가변인자
		// Stream<T> Stream.of(T[])
		// Stream<T> Arrays.stream(T[])
		// Stream<T> Arrays.stream(T[], 시작 index, 끝 index (시작과 끝 포함 x))
		
		String[] arr = {"최영란", "박다현", "박재나", "조혜연"};
		List<String> list = Arrays.asList("둘리", "도우너", "고길동", "마이콜", "희동이");

		// 배열 이용
		Stream<String> Stream01 = Stream.of("홍자바", "고자바", "아자바", "박자바", "나자바");
		Stream<String> Stream02 = Stream.of(arr);		
		Stream<String> Stream03 = Arrays.stream(arr);		
		Stream<String> Stream04 = Arrays.stream(arr, 1, 4);

		
		// 컬렉션에는 Stream()를 이용
		Stream<String> Stream05 = list.stream();
		
		//		전체요소반복 인자					  인자출력
		Stream01.forEach(i -> System.out.print(i + "님  "));
		System.out.println();
		
		Stream02.forEach(i -> System.out.print(i + "님  "));
		System.out.println();
		
		Stream03.forEach(i -> System.out.print(i + "님  "));
		System.out.println();
		
		Stream04.forEach(i -> System.out.print(i + "님  "));
		System.out.println();
		
		Stream05.forEach(i -> System.out.print(i + "님  "));
		System.out.println();
		
	}

	public Object getVisits() {
		// TODO Auto-generated method stub
		return null;
	}
}
