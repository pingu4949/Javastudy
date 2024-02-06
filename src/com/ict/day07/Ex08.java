
package com.ict.day07;

import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		String[] name = {"홍식이","김돌이","이박사","박고수","고라니"}; //이름
		int[] kor = {80,90,80,70,100}; //국어
		int[] eng = {85,95,95,75,100}; //영어
		int[] math = {100,100,80,70,100}; //수학
		
		int[] sum = {0,0,0,0,0}; // 총점
		// 소수점 첫째자리까지 구하자
		double[] avg = {0.0, 0.0, 0.0, 0.0, 0.0}; //평균
		String[] hak = {"","","","",""}; //학점
		int[] rank = {1, 1, 1, 1, 1}; //순위
		
		//총점, 평균, 학점 구하기
		for (int i = 0; i < rank.length; i++) {
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			
			if (avg[i] >= 90) 
				hak[i] = "A학점";
			else if (avg[i] >= 80) 
				hak[i] = "B학점";
			
			else if (avg[i] >=70) 
				hak[i] = "C학점";
		
			else 
				
				hak[i] = "F학점";
		
		}
		
		// 순위 구하기
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (avg[i] == avg[j]) continue;
				
				if (avg[i] < avg[j])
					
					rank[i]++;
					
				
				
			}
		}
		// 출력 
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i]+"님"+"\t");
			System.out.print(sum[i]+"점"+"\t");
			System.out.print(avg[i]+"평균"+"\t ");
			System.out.print(hak[i]+"\t");
			System.out.print(rank[i]+"위"+"\n");
		}
		
		
	}
}
