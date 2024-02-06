package com.ict.day19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> book = new ArrayList<>();
		
		book.add(new Book("자바", 25000));
		book.add(new Book("파이썬", 15000));
		book.add(new Book("안드로이드", 30000));
		
		// 스트림으로 생성하고 출력하기
		Stream<Book> stream = book.stream();
		
		// 모든 책 가격의 합
		int sum = stream.mapToInt(i -> i.getPrice()).sum();
		System.out.println("모든 책 가격의 합 :" + sum + "입니다.");
		
		
		// 책의 가격 2만원 이상 정렬해서 출력
		stream = book.stream();
		stream.filter(i -> i.getPrice() >= 20000).map(i -> i.getName()) .sorted().forEach(i -> System.out.println(i + "책 2만원 이상"));
	}

}
