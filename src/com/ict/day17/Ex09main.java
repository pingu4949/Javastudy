package com.ict.day17;

public class Ex09main {
	public static void main(String[] args) {
		// 두 수 중
		Ex09 t1 = new Ex09() {

			@Override // 추상 메서드 오버라이딩
			public int getMax(int num1, int num2) {
				int k;
				if (num1 > num2) {
					k = num1;
				} else {
					k = num2;
				}
				return k;
			}

//			@Override
//			public int getMin(int num1, int num2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
		};

		Ex09 t2 = new Ex09() {

			@Override // 추상 메서드 오버라이딩
			public int getMax(int num1, int num2) {
				
				if (num1 > num2) {
					return num1;
				} else {
					return num2;
				}
				
			}

//			@Override
//			public int getMin(int num1, int num2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
		};
		System.out.println(t1.getMax(100, 200));
		
		System.out.println(t2.getMax(300, 200));
		
		System.out.println();
		//람다식
		Ex09 t3 = (int num1, int num2) -> {
			if (num1 > num2) {
				return num1;
			}else {
				return num2;
			}
		};
		System.out.println(t3.getMax(500, 200));
		// 삼항 연산자 활용
		//추상메서드가 한개일때만 사용가능하다.
		Ex09 t4 = (num1, num2) ->  num1 > num2 ? num1 : num2;
		System.out.println(t4.getMax(1000, 5000));
	}
}
