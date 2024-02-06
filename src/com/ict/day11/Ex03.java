package com.ict.day11;

import java.util.Iterator;
import java.util.Scanner;

public class Ex03 { // 전역변수
	private String name = "";
	private int price = 0;
	private static final int PRICE = 1500;

	public Ex03(String name, int price) {

		this.name = name;
		this.price = price;
	}

	public void sName(String k) {
		name = k;

	}

	public void sPrice(int k) {
		price = k;

	}

	public String gName() {
		return name;
	}

	public int gPrice() {
		return price;
	}

/////////////////////////////////////////////////////////////////////////////////////////	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// set을 이용해서 멤버필드의 값을 변경했던것을
		// 생성자를 이용해서 변경하자
		Ex03 coff = new Ex03("커피음료",1500); // 주소 값 받음
		// coff.sName("커피음료");
		// coff.sPrice(1500);
		Ex03 ion = new Ex03("이름음료",3300);
		// ion.sName("이온음료");
		// ion.sPrice(3300);
		Ex03 co = new Ex03("콜라",2000);
		// co.sName("콜라");
		// co.sPrice(2000);
		Ex03 juice = new Ex03("오렌지",1800);
		// juice.sName("오렌지주스");
		// juice.sPrice(1800);
		

		Ex03[] arr = { coff, ion, co, juice };

		System.out.print("금액을 투입하세요 >>");
		int input = scan.nextInt();
		int output = 0;

		// 살수없는 제품을 선택하면 0 계산이 된다. (살수없다고 표시하고 다시 메뉴가 나와야 된다.)

		exit: while (true) {

			if (0 > input) { // 남은 돈이 0보다 적으면 즉, 마이너스이면 0원으로 나오게 하는것이다.
				System.out.println("남은 돈 :" + 0);

			} else {
				System.out.println("남은 돈 :" + input);
			}

			// 1500 을 직접 입력하지 말고 비교해서 찾자
			// 내가 사먹는 음료 값 1500 ~ 3300
			for (int i = 0; i < arr.length; i++) {
				// 내가 내는돈< 내가 사먹는 음료 값
				if (input < PRICE) {
					output = input;
					System.out.println(Math.abs(output) + "원이 부족합니다"); // 부족한 돈 절대값 사용하여 부호지움
					break exit;
				} else {
				}

			}

			System.out.println("커피음료\t이온음료\t콜라\t오렌지주스\t반환");

			// 각 음료수의 가격을 가져와서 비교하자
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].gPrice() <= input) {
					System.out.print("0\t");
				} else {
					System.out.print("x\t");

				}
			}

			System.out.println();
			System.out.println("선택하세요 >>\n");
			// 음료 선택할때 입력값
			String drink = scan.next();
			switch (drink) {
			case "커피음료":
				output = input - arr[0].gPrice();
				break;
			case "이온음료":
				output = input - arr[1].gPrice();
				break;
			case "콜라":
				output = input - arr[2].gPrice();
				break;
			case "오렌지주스":
				output = input - arr[3].gPrice();
				break;
			case "반환":
				output = input;
				System.out.println("반환된 돈 :" + output); // 반환 돈
				break exit;

			}
			input = output;

//			while (true) {
//				System.out.println("계속 하시겠습니까 ? 1,2");
//				int num = scan.nextInt();
//				if (num == 1) {
//					continue exit;
//				} else if (num == 2) {
//					break exit;
//				} else {
//					System.out.println("제대로 입력해주세요");
//					continue;
//				}
//			}
			// 잔돈을 물건을 살 수 있는 input으로 전환

		}

		System.out.println("수고하셨습니다.");

	}

}
