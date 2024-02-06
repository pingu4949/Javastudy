package com.ict.day09;

import java.util.Scanner;

public class Ex08 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	// 외부에서 이름받아서 이름넣기
	// 외부데이터는 메서드의 인자를 통해서 받는다.
	// 메서드 이름 (인자)
	// 이름
	public void play01(String k1) {
		Scanner scan = new Scanner(System.in);
		name = k1;
	}

	// 총점
	public void play02(int kor, int eng, int math) {
		sum = kor + eng + math;
	}

	// 평균
	public void play03() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
	}

	// 학점
	public void play04() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F";
		}

	}
	// 출력하기
	public void play05() {
		System.out.println("이름: "+name);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("학점: "+hak);
	}
}
