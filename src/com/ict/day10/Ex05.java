package com.ict.day10;

import java.util.Scanner;

// 저장하는 관점 : 변수 => 배열
public class Ex05 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int rank = 1;
	// 1. 총점, 평균, 학점을 구하는 메서드를 각각 만들어서 각각 호출
	// 2. 하나에 매서드에 총점, 평균, 학점을 구할 수 있다.
	// 3. 총점, 평균, 학점을 구하는 메서드를 각각 만들어서 총점() => 평균 () => 학점 ()

	// 한번에 처리하자.
	public void Process(String n, int kor, int eng, int math) {
		name = n;
		
		sum = kor + eng + math;

		avg = (int) (sum / 3.0 * 10) / 10.0;

		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점"; // 싫어
		}
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 수  : ");
		int su = scan.nextInt();

		// 학생 수 만큼 배열에 넣기
		// 해당 배열은 클래스가 들어가는 배열이다.
		// Ex05 클래스로 만든 객체를 배열에 자료형을 사용
		// 즉 해당 배열안에 Ex05로 만든 객체의 주소만 존재
		Ex05[] arr = new Ex05[su];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 :"); // 입력
			String name = scan.next();

			System.out.print("국어 :");
			int kor = scan.nextInt();

			System.out.print("영어 :");
			int eng = scan.nextInt();

			System.out.print("수학 :");
			int math = scan.nextInt();

			Ex05 p = new Ex05();
			p.Process(name, kor, eng, math); // 부름

			arr[i] = p; // arr 2차원 배열 주소로 값이 들어감

		}
		//순위와 정렬
		for (int i = 0; i < arr.length; i++) { // 순위는 -1 안하는이유 뒤에 끝까지 계산을 해야됨 
			for (int j = 0; j < arr.length; j++) {
				if (i==j) continue;
					if (arr[i].sum < arr[j].sum) {
						arr[i].rank++;
					}
				
			}
		}
		Ex05 tmp = new Ex05();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		//출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i].name + "\t");
			System.out.print(arr[i].sum + "\t");
			System.out.print(arr[i].avg + "\t");
			System.out.print(arr[i].hak + "\t");
			System.out.print(arr[i].rank + "\n");

		}

	}
}
