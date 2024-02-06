package com.ict.day10;

import java.util.Iterator;
import java.util.Scanner;

public class Ex07 {
	String name = "";
	int price = 0;

	public static void main(String[] args) {
		Ex07 coffee = new Ex07(); // name, price 주소값을 호출
		coffee.name = "커피음료";
		coffee.price = 1500;
		Ex07 ion = new Ex07();
		ion.name = "초코";
		ion.price = 4300;
		Ex07 co = new Ex07();
		co.name = "카페";
		co.price = 2200;
		Ex07 juice = new Ex07();
		juice.name = "오렌지";
		juice.price = 3300;

		// Ex07을 만든 객체 배열에 넣자
		Ex07[] arr = { coffee, ion, co, juice };

		for (int i = 0; i < arr.length; i++) {

		}

		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 투입하세요 >> ");
		int input = scan.nextInt();
		if (input < 1500) {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈 : " + input);
		} else {
			System.out.println("커피\t초코\t카페\t오렌지");
		}

		// 각 음료수의 가격을 가져와서 비교하자.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].price <= input) {
				System.out.print("0\t");
			} else {
				System.out.print("x\t");

			}

		}
		System.out.println();
		System.out.println("선택하세요 >> ");
		String drink = scan.next();
		int output = 0;//남은돈
		switch (drink) { //주의사항 여기 있는대로 쳐야지 잔돈나옴!!!
		case "커피":
			output = input - arr[0].price;
			break;
		case "초코":
			output = input - arr[1].price;
			break;
		case "카페":
			output = input - arr[2].price;
			break;
		case "오렌지":
			output = input - arr[3].price;
			break;

		}
		System.out.println("잔돈 :" + output);

	}

}
