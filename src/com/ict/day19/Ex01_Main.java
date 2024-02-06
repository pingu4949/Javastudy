package com.ict.day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Ex01_Main {
	public static void main(String[] args) {
		Ex01 p1 = new Ex01("이순신", 40, 100);
		Ex01 p2 = new Ex01("김유신", 20, 100);
		Ex01 p3 = new Ex01("홍길동", 13, 50);
		
		
		
		// 자네 혹시 list와 hashset 차이점을 아는가?
		// 컬렉션으로 처리하기
		
		List<Ex01> list = new ArrayList<Ex01>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		HashSet<Ex01> list1 = new HashSet<Ex01>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		
		System.out.println("--- 고객명단 순서대로 출력 ---");
		
		for (Ex01 k : list1) {
			System.out.println(k.getName());
		}
		
//		
//		 for (Ex01 k : list) {
//			System.out.println(k.getName());
//		}

		 int sum1 = 0;
		 
		for (Ex01 k1 : list) {
			
			sum1 = sum1 + k1.getPrice();
			
		}
		System.out.println("총금액은" + sum1 + "입니다.");
		
		
		System.out.println("--- 나이가 20이상인 고객의 명단 출력(입력순) ---");
		
		for (Ex01 k2 : list) {
			if (k2.getAge() >= 20) {
				System.out.println(k2.getName());
			}
			
		}
		
		
		System.out.println("--- 나이가 20이상인 고객의 명단 출력(오름차순) ---");
		TreeSet<Ex01> tree = new TreeSet<Ex01>();
		
		
		for (Ex01 k : tree) {
			if (k.getAge() >= 20) {
				System.out.println(k.getName());
			}
			
		}
		
		
		System.out.println("=============================================");
		
		// 스트림으로 처리하기
		
		// 리스트를 스트림으로 만들기
		Stream<Ex01> stream = list.stream();
		
		// 이름만 뽑기
		stream.map(i-> i
				.getName()).forEach(i -> System.out.println(i + " "));
		
		System.out.println("--- 고객명단 순서대로 출력 ---");
		
		int sum = list.stream().mapToInt(i -> i.getPrice()).sum();
		
		System.out.println("총 비용은" + sum + "입니다.");
		
		
		System.out.println("--- 나이가 20이상인 고객의 명단 출력(입력순) ---");
		
		Stream<Ex01> stream2 = list.stream();
		stream2.filter(i -> i.getAge() >= 20).map(i -> i.getName())
		.forEach(i -> System.out.println(i + ""));
		
		
		System.out.println("--- 나이가 20이상인 고객의 명단 출력(오름차순) ---");
		
		Stream<Ex01> stream3 = list.stream();
		stream3.filter(i -> i.getAge() >= 20).map(i -> i.getName()).sorted()
		.forEach(i -> System.out.println(i + ""));
		
		
	}
	
}
