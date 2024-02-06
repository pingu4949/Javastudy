package com.ict.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Ex06 {
	public static void main(String[] args) {

		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성
		Scanner scan = new Scanner(System.in);

		esc: while (true) {

			String ch = ""; // 입력
			System.out.println("나라입력 >>");
			ch = scan.next();

			Map<String, String> map = new HashMap<String, String>();
			// key값과 value값
			map.put("대한민국", "서울");
			map.put("캐나다", "오타와");
			map.put("영국", "런던");
			map.put("스위스", "베른");

			Set<Entry<String, String>> map1 = map.entrySet();

			Iterator<Entry<String, String>> it2 = map1.iterator();
			Entry<String, String> entry = it2.next();

			//
			while (it2.hasNext()) {
				if (map.get(ch) == null) {
					System.out.println("존재하지 않는 수도입니다.");
					break;

				} else {
					System.out.println(ch + "의 수도는 " + map.get(ch) + "입니다.");
					break;
				}

			}

			// 다시 할꺼냐고 묻는 곳
			while (true) {
				System.out.println("계속할까요? (y/n)");
				ch = scan.next();
				if (ch.equalsIgnoreCase("y")) {
					continue esc;
				} else if (ch.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력하세요 :");
					continue;
				}
			}

		}

	}
}
