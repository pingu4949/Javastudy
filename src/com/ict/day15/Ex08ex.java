package com.ict.day15;

import java.util.HashSet;
import java.util.Scanner;

public class Ex08ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Ex08main> set1 = new HashSet<Ex08main>();
		esc:while (true) {
			
			System.out.print("이름 :");
			String name = scan.next();
			
			System.out.print("국어 :");
			int kor = scan.nextInt();
			
			System.out.print("수학 :");
			int eng = scan.nextInt();
			
			System.out.print("영어 :");
			int math = scan.nextInt();
			
	
			
			Ex08main p = new Ex08main(name, kor, eng, math);
			set1.add(p);
			while (true) {
				System.out.println("계속할까요(y/n) >> ");
				String str = scan.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				}else if(str.equalsIgnoreCase("n")){
					break esc;
				}else {
					continue;
				}
			}
			
		}
		
		for (Ex08main i : set1) {
			for (Ex08main j : set1) {
				if (i.getSum() < j.getSum()) {
					i.setRank(i.getRank()+1);
				}
			}
		}
		
		
		// 정렬
//		int tmp = 0;
//		for (Ex08main i : set1) {
//			for (Ex08main j : set1) {
//				if (i.getRank() > j.getRank()) {
//					
//		
//				}
//			}
//		}
		
		for (Ex08main k : set1) {
			System.out.println(k.getName()+ "\t");
			System.out.println(k.getSum()+ "\t");
			System.out.println(k.getAvg()+ "\t");
			System.out.println(k.getHak()+ "\t");
			System.out.println(k.getRank()+ "\n");
		}
	}
}
