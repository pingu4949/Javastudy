package com.ict.day08;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 학생 수 :
		System.out.print("학생의 수 :");
		int su = scan.nextInt(); // 학생수 입력:
		double[][] su1 = new double[su][8]; // 한 사람이 담는 정보 양이 8개

		// 번호, 국어, 영어, 수학
		for (int i = 0; i < su1.length; i++) {// 정보 입력:
			double[] num = new double[8];

			System.out.print("번호 :");
			num[0] = scan.nextInt();

			System.out.print("국어 :");
			num[1] = scan.nextInt();

			System.out.print("영어 :");
			num[2] = scan.nextInt();

			System.out.print("수학 :");
			num[3] = scan.nextInt();

			// 총점, 평균, 학점,

			num[4] = num[1] + num[2] + num[3]; // 총점

			num[5] = (int) (num[4] / 3.0 * 10) / 10.0; // 평균

			if (num[5] >= 90) {// 학점
				num[6] = 'A';

			} else if (num[5] >= 80) {
				num[6] = 'B';

			} else if (num[5] >= 70) {
				num[6] = 'C';

			} else {
				num[6] = 'F';
			}

			// 순위의 초기값은 무조건 1이다.
			num[7] = 1;

			// ** 다차원배열에 넣기
			su1[i] = num;

		}

		// 순위
		for (int i = 0; i < su1.length; i++) {
			
			for (int j = 0; j < su1.length; j++) {
				
				if (su1[i] == su1[j])
					continue;

				if (su1[i][4] < su1[j][4])

					su1[i][7]++;

			}
		}

		// 정렬
		// 임시 저장할 배열
		double[] tmp = new double[8];

		for (int i = 0; i < su1.length; i++) {
			
			for (int j = i + 1; j < su1.length; j++) {
				
				if (su1[i][7] > su1[j][7]) {
					tmp = su1[i];
					su1[i] = su1[j];
					su1[j] = tmp;

				}
			}
		}
		// 출력

		for (int i = 0; i < su1.length; i++) {
			for (int j = 0; j < su1[i].length; j++) {
				// 국어, 영어, 수학 출력에서 제외
				if (j == 1 || j == 2 || j == 3)
					continue;

				if (j == 5) {
					System.out.print(su1[i][j] + "\t"); // 평균

				} else if (j == 6) {
					System.out.print((char) (su1[i][j]) + "\t");// 학점
					
				} else {
					System.out.print((int) (su1[i][j]) + "\t");
				}

			}
			System.out.println();
		}
	}

}
