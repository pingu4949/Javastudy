package com.ict.day05;

public class Ex02 {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리 한다.
		// 조건식이 참일때 실행, 거짓이면 실행하지 않음
		// 형식) for(초기식); 조건식; 증감식) {
		// 조건식이 참일때 실행할 문장;
		// 조건식이 참일때 실행할 문장;
		// }

		// 1.for문 만나면 초기식에 간다.
		// 2.초기식가지고 조건식 간다.
		// 3.조건식이 참이면 실행, 거짓이면 실행하지 않음
		// 4.참일때 실행하다가 for문의 끝을 만나면 증감식으로 간다.
		// 5.증감식에서 증가하거나 감소 후 다시 조건식으로 간다.
		// 6.조건식이 참이면 실행, 거짓이면 실행하지 않음

		// 자바에서는 블록안에서 변수를 만들고 선언하면 해당 블록에서만 사용 가능
		// 해당 블록을 벗어나면 변수는 사라진다.
		// for문의 초기식에서 변수를 만들어 사용한다.
		// **초기식에서 만든 변수는 for문을 벗어나면 사용 못함 (즉, 사라진다.)

		// 증감식이 조건식으로 넘어가면 결과는 똑같다.
		// i++ = 0인 상태에서 조건식으로 넘어갈때 1이라 결과는 1
		// ++i = 1인 상태에서 조건식으로 넘어갈때 1이라 결과는 1
		
		for (int i = 0; i < 10; i++) { // 10번 실행

			System.out.println(i);
			System.out.println("hi");
			System.out.println("안녕하세요");

		}

		// for문안에서 사용한 변수는 밖에서 사용못함
		// System.out.println(i);

		// 이렇게 사용하면 미친놈
		// int k1;
		// for (k1 = 0; k1 < 10; k1++) {
		// System.out.println("hi"); //참

		// System.out.println(k1); //거짓
		// System.out.println();

		// 10 - 20 까지 출력
		System.out.println("10-20출력");

		for (int i = 10; i <= 20; i++) {
			System.out.println(i);
		}

		// 10 -20 까지 짝수만 출력
		System.out.println("10-20 짝수");

		for (int i = 10; i <= 20; i++) {
			if (i % 2 == 0);
			System.out.println(i);
		}

		// 10 -20 까지 홀수만 출력
		System.out.println("10-20 홀수");

		for (int i = 10; i <= 20; i++) {
			if (i % 2 == 1);
			System.out.println(i);

		}

		// 5단 출력
		System.out.println("5단 출력");
		for (int i = 1; i < 10; i++) {

			System.out.println("5 * " + i + " = " + (5 * i));
		}

		System.out.println();

		// 0 0 0 0	
		// 0 0 0 0	
		// 0 0 0 0	
		// 0 0 0 0	
		for (int i = 1; i < 5; i++) {

		System.out.println("0 0 0 0");
		}		
		
		
		System.out.println();
		// 0 0 0 0	
		// 0 0 0 0	
		// 0 0 0 0	4번 줄바꿈
		// 0 0 0 0	
		for (int i = 1; i < 17; i++){
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		
		// 0-10 의 누적합(합계 구하기)
		int sum = 0; // 이전 값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum = sum + i ; // 기억값 = 이전 기억값 + 현재값
		}
		System.out.println("누적합 : " + sum);
		
		
		
		// 0-10 홀수의 합계, 짝수의 합계를 각각 구하자.
		int sum2 = 0;//짝수
		int sum3 = 0;//홀수 이전 값 기억
		for (int i = 0; i < 11; i++) {
			if (i%2 == 0) {
				sum2 = sum2 + i;
			}else {
				sum3 = sum3 + i; 
			}
		
		}
		
		System.out.println("홀수의 합계 :"+sum2);
		
		System.out.println("짝수의 합계 :"+sum3);
		
		// 7! (7 * 6 * 5 * 4 * 3 * 2 * 1)의 합은?
		int mu1 = 1;
		for (int i = 7; i >= 1; i--) {
			System.out.println(i);
			mu1 = mu1 * i ; //누적값 = 이전값 * 현재값
				
			
			
		}
		System.out.println("누적합 :"+ mu1);
		
		// 1+? = 100 
		//양수 홀수 
		//마이너스 짝수
		// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int mu2 = 0;
		int mu3 = 0;
		for (int i = 1; i > 0; i++) {
			if (i%2 == 0) 
				mu2 = mu2 + (-i);
			else { 
				mu3 = mu3 + i;
			}
			
			
			int result = mu2 + mu3;
			if (result >= 100) {
				System.out.println("몇까지 더해야 총합이 100이상"+ i);
				break;
			}
		}
	}	//System.out.println("몇까지 더해야 총합이 100이상"+ );
}
