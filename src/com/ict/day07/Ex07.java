package com.ict.day07;

import java.util.Iterator;

public class Ex07 {
	public static void main(String[] args) {
		//순위 구하기
		// 1 . 모든 사람의 순위를 1등으로 초기값 부여
		// 2 . 모든 사람과 비교한다.
		// 3. 나(i) 보다 남(j)이 크면 내 순위를 증가시킨다.
		
		int[] su = {90,80,70,95,65,85,75};
		
		int[] rank = {1, 1, 1, 1, 1, 1, 1};
		
		
		 for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				// 자기 자신 제외
				if (su[i]==su[j])continue;
				
				if (su[i] < su[j]) {
					rank[i]++; // 비교 대상이 남이 더 숫자가 크면 내 순위가 내려가는거다. rank++ 가 그런의미
				}
				
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
		System.out.println();
	}
}