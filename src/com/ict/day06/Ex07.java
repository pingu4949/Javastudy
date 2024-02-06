package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 전체 횟수, 짝수 횟수 % 2== 0, 퍼센트(소수점 둘째자리 )
		int conte = 0;
		int conte1 = 0;
		
		exit: while (true) {
			System.out.println("숫자를 입력 :");
			int su = scan.nextInt();
			String res = "";
			if (su % 2 == 0)
				res = ("짝수"); //홀수 짝수 구분
			else {
				res = ("홀수");
			}

			System.out.println(su + "는 " + res + "입니다.");

			
			if (res == "짝수") {
				conte = conte + 1; // 횟수 구하는법
			} else {
				conte1 = conte1 + 1;
			}
			
			
			
			while (true) {
				System.out.print(" 계속하시겠습니까? 1 2 >> ");
				int result = scan.nextInt();
				if (result == 1)
					continue exit;	//버튼 누를때 1번 위로 올라감
				else if (result == 2)// 2번 break exit 올라가면서 문장띄우고 종료
					break exit;
				else {
					System.out.println("다시 입력해주세요");
					continue;
				}
				
			}//안쪽
			
			
			
				
		}//안쪽
		
			
		
		int total =conte1 + conte;
		double pe = (conte/(total*1.0))*100;
		System.out.println("전체 횟수는 :"+ total);
		System.out.println("짝수 횟수는 :"+ conte);
		System.out.println("퍼센트 :" + (int)(pe*100)/100.0 + "입니다" );
		System.out.println("수고하셨습니다.");
		
	}
	
	
}
