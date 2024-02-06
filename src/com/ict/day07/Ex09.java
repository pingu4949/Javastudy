package com.ict.day07;

import java.util.Iterator;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] egh = new int[5];
		int[] magh = new int[5];
		int[] sum = new int[5];
		double[] total =new double[5];
		String[] ha = new String[5];
		int[] rank = {1, 1, 1, 1, 1};
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 입력하세요 :");
			name[i] = scan.next();
			
			System.out.print("국어점수 :");
			kor[i] = scan.nextInt();
			
			System.out.print("수학점수 :");
			egh[i] = scan.nextInt();
			
			System.out.print("영어점수 :");
			magh[i] = scan.nextInt();
		
			
			System.out.println("\n");
		
		}
		
		for (int i = 0; i < rank.length; i++) {
			
			sum[i] = kor[i] + egh[i] + magh[i];
			
			total[i] = (int)(sum[i]/3.0*10.0)/10.0;
			
			
			
			if (total[i]>=90) {
				ha[i] = "A학점";
				
			}else if (total[i]>=80) {
				ha[i] = "B학점";
			
			}else if (total[i]>=70) {
				ha[i] = "C학점";
			}else 
				ha[i] = "F학점";
		
					
		}
		
		// 순위
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i]==sum[j]) continue;
				if (sum[i] < sum[j])
					rank[i]++;
				
				
			}
		}
		
		
		
		
		for (int i = 0; i < rank.length; i++) {
			
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "총점"+ "\t");
			System.out.print(total[i]+ "평균"+ "\t");
			System.out.print(ha[i]+ "\t");
			System.out.print(rank[i] + "순위"+ "\n");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
