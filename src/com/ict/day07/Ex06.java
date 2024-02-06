package com.ict.day07;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		// 배열 정렬하기
		int[] su = { 3, 4, 9, 8, 2, 1, 7, 10, 5, 6 }; //10  9 8
		// 자리 변경을 위한 임시 변수
		int sum = 0;
		for (int i = 0; i < su.length - 1; i++) {
			
			for (int j = i+1; j < su.length; j++) { // 0~ 9 1~ 9 2 ~ 9 3~9
				
				//System.out.println("i=" + i + " j=" + j);
				
				// i > j => 오름, i < j => 내림 
				//오름차순 이기때문에 i 크면 자리변경을 한다 
				if (su[i] > su[j]) {
					// 자리 변경
					sum = su[i];
					su[i] = su[j];
					su[j] = sum;
					
					System.out.println(i + "자리 바꾸기"+ j);
				}
				
			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
	}
}
/*배열 길이는 9이다
 * 
배열 순서는 0부터 시작이다.

길이 순서만큼 i가 돌면 마지막 숫자 옆에 비교할 대상이 없어진다. 그래서 -1

j = i + 1 = i가 0부터 반복문이 돌면 01 02 03 04이런식으로 시작을 해야되는데 0으로 시작하면 자기자신도 비교하므로 +1

오름차순 정렬을 해야되기 때문에 i가 크면 j와 위치를 변경해야된다.*/
