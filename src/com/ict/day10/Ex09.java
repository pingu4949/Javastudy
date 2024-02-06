package com.ict.day10;

import java.util.Iterator;
import java.util.Scanner;

public class Ex09 { // 전역변수
	private String name = "";
	private int price = 0;
	private static final int PRICE = 1500;

	// 변수의 접근제한자 private이므로 접근 불가 하다. (외부의 공격을 보완하기 위함이다)
	// 내부에서 접근 가능하다는 부분을 이용해서
	// 메서드를 만들어서 접근하거나 데이터를 삽입하거나 가져올 수 있다.
	// getter/setter
	// 클래스랑 변수자료형이랑 같은 자료형이어야 된다
	public void sName(String k) { // sName = 셋팅한다라는 뜻 변수에 값을 넣는다. //main 보내는 곳
		name = k;

	}

	public void sPrice(int k) { // 외부 접근 x , 내부 접근 o
		price = k;

	}

	public String gName() { // main에서 얻어내는 곳
		return name;
	}

	public int gPrice() {
		return price;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex09 coff = new Ex09(); // 주소 값 받음
		coff.sName("커피음료");
		coff.sPrice(1500);
		Ex09 ion = new Ex09();
		ion.sName("이온음료");
		ion.sPrice(3300);
		Ex09 co = new Ex09();
		co.sName("콜라");
		co.sPrice(2000);
		Ex09 juice = new Ex09();
		juice.sName("오렌지주스");
		juice.sPrice(1800);
		Ex09 can = new Ex09();
		Ex09[] arr = { coff, ion, co, juice };

		System.out.print("금액을 투입하세요 >>");
		int input = scan.nextInt();
		int output = 0;

		// 살수없는 제품을 선택하면 0 계산이 된다. (살수없다고 표시하고 다시 메뉴가 나와야 된다.)

		exit: while (true) {

			if (0 > input) {	// 남은 돈이 0보다 적으면 즉, 마이너스이면 0원으로 나오게 하는것이다.
				System.out.println("남은 돈 :" + 0);

			} else {
				System.out.println("남은 돈 :" + input);
			}

			// 1500 을 직접 입력하지 말고 비교해서 찾자
			// 내가 사먹는 음료 값 1500 ~ 3300
			for (int i = 0; i < arr.length; i++) {
				// 내가 내는돈< 내가 사먹는 음료 값
				if (input < arr[0].gPrice()) {
					output = input;
					System.out.println(Math.abs(output) + "원이 부족합니다"); //부족한 돈 절대값 사용하여 부호지움
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
				System.out.println("반환된 돈 :" + output); //반환 돈
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
