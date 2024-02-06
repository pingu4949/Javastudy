package com.ict.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex05 {
	public static void main(String[] args) {
		//형식 외우기
		Map<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "22");
		map.put("주소", "서울");
		map.put("취미", "운동시렁~");
		
		//하나씩 꺼내는법
		System.out.println(map.get("이름"));
		System.out.println(map.get("주소"));
		
		System.out.println();
		//					//별도로 관리
		for (String k : map.keySet()) {
			System.out.print(k+ ":");
			System.out.println(map.get(k));
		}
		
		System.out.println();
		
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) { // k는 Value값 / map.get key값
			String k = it.next(); // 키값
			System.out.println( k + ":" + map.get(k));
		}
		
		
		
		
		
		
	}
}
