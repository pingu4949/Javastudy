package com.ict.day16;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		// Queue 인터페이스 : FIFO(First In First Out)
		// 				   먼저들어온 정보가 먼저 나간다.
		//	   구현한 클래스 : LinkedList (멀티 스레드 동기화 X)
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// 추가 삽입  : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedList.add("고길동");
		linkedList.offer("도우너");
		linkedList.addFirst("둘리");
		linkedList.offerFirst("공실이");
		linkedList.add(2 ,"마이콜");
		
		System.out.println(linkedList);
		
		if (linkedList.contains("마이콜")) {
			System.out.println(linkedList.indexOf("마이콜"));
			System.out.println(linkedList.get(2));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
		}
		
		// 고길동을 도우너로 변경하자
		linkedList.set(linkedList.indexOf("고길동"), "도우너");
		
		for (String k : linkedList) {
			System.out.println(k + "^^");
		}
		System.out.println();
		
		Iterator<String> s1 = linkedList.iterator();
		
		while (s1.hasNext()) {
			String k =  s1.next();
			System.out.println(k + "(:");
		}
		
		
		
		
		
		
	}
}
