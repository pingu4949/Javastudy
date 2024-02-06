package com.ict.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		//배열을 컬렉션의 변경
		String[] str =  {"java","Java","JAVA","자바"};
		
		// List를 안배웠음.
		//List<String> list = Arrays.asList(str);
		//System.out.println(list);
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		// 배열의 요소를 하나씩 꺼내서 set1에 넣자
		// for문으로 str 배열을 돌려서 set1에 저장하는것
		for (int i = 0; i < str.length; i++) {
			set1.add(str[i]);	 
		}
		System.out.println(
1);
		set2.add("태권브이");
		set2.add("마징가Z");
		System.out.println(set2);
		System.out.println();
		
		set2.addAll(set1); // set2 = set1 저장함
		System.out.println(set2); //같은 자료형이어야됨
		System.out.println();
		
		// 삭제 : clear(), remove(Object o)
		set2.remove("태권브이");
		System.out.println(set2);
		System.out.println();
		
		set2.clear();
		System.out.println(set2);
		System.out.println();
		
		System.out.println(set2.isEmpty()); // 값이 없으면 true
	}
}
