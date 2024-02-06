package com.ict.homework;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 가위 바위 보
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int allcount = 0;
		int count = 0;
		esc: while (true) {
			System.out.println("1가위 2바위 3보");
			int user = scan.nextInt();
			String ur = "";
			if (user == 1|user == 2|user == 3) {
				allcount++;
				
				int com = ran.nextInt(3)+ 1; // 1 ~ 3
				if (com == 1) {
					System.out.println("컴퓨터는 가위");
					if (user == 1) {
						System.out.println("비김");
					}else if (user == 2) {
						System.out.println("이김");
						count++;
					}else if (user == 3) {
						System.out.println("짐");
						
					}
				}else if (com == 2) {
					System.out.println("컴퓨터는 주먹");
					if (user == 1) {
						System.out.println("짐");
					}else if (user == 2) {
						System.out.println("비김");
					}else if (user == 3) {
						System.out.println("이김");
						count++;
						
					}
					
				}else if (com == 3) {
					System.out.println("컴퓨터는 보");
					if (user == 1) {
						System.out.println("이김");
						count++;
					}else if (user == 2) {
						System.out.println("짐");
					}else if (user == 3) {
						System.out.println("비김");
						
					}
				}
					
				
			while (true) {
				System.out.println("계속 할까요? y/n");
				String str = scan.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				} else if (str.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력해주세요");
					continue;
				}

			}//안쪽 while
			}else {
				System.out.println("다시 입력해주세요");
				continue esc;
			}

		}// 밖 while
		System.out.println("전체 갯수 :" + allcount);
		System.out.println("이긴 수 :" + count);
		System.out.println("승률 :" + ((count/(allcount*1.0))*100)+"%");
	}
}
