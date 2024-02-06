package com.ict.day18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 스트링 생성 : 기본 자료형 배열로부터 스트링 생성하기
		// 			  intStream, DoubleStream, longStream
		//
		
		// IntStream<T> Stream.of(int... values) 가변인자
		// IntStream<T> Stream.of(int[])
		// IntStream<T> Arrays.stream(int[])
		// IntStream<T> Arrays.stream(int[], 시작 index, 끝 index (시작과 끝 포함 x))
		
		Integer[] inttegerArr = {1, 2, 3, 4, 5};
		Stream<Integer> integerStream = Arrays.stream(inttegerArr);
		
		// 최종처리를 한 후에는 다시 호출할 수 없다.
		integerStream.forEach(i -> System.out.print(i + "님 ")); // <- 최종으로 출력하면 다시 호출 불가능.
		System.out.println();
		
		// 다시 사용하려면 다시 Stream 을 만들어야 한다.
		integerStream = Arrays.stream(inttegerArr); 
		System.out.println("총 개수 :" + integerStream.count()); //갯수
		
//		Stream<T> : count() O, sum() X, average() X
//		System.out.println("총 합 :"+integerStream.sum()); //갯수
//		System.out.println("총 개수 :"+integerStream.average()); //갯수
		
		System.out.println();
		
		// 기본자료형 배열을 스트림으로
		int[] intarr = {10, 20, 30, 40, 50};
		IntStream intStream1 = IntStream.of(10, 20, 30, 40, 50);
		IntStream intStream2 = IntStream.of(intarr);
		IntStream intStream3 = Arrays.stream(intarr);
		IntStream intStream4 = Arrays.stream(intarr, 2, 5);
		
		intStream1.forEach(i -> System.out.print(i + " "));
		System.out.println();

		System.out.println("총 개수 :"+ intStream2.count());
		System.out.println("총 합 :"+ intStream3.sum());
		System.out.println("총 평균 :"+ intStream4.average());
	}
}
