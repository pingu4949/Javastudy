package com.ict.day14;


public class Ex07main {
	public static void main(String[] args) {
		Ex07_Land t1 = new Ex07_Land();
		// 인자를 Ex07이라는 인터페이스를 가지고 있다.
		t1.autoPlay(new Ex07() {
			
			@Override
			public void play() {
				System.out.println("회전목마");
			}
		});
		System.out.println("==============");
		// Ex07을 상속받은 Ex07_Car, Ex07_Baseball 중
		// 하나를 생성
		// t1.autoPlay(new Ex07_Car());
		t1.autoPlay(new Ex07_Baseball());
		System.out.println("==============");
		
		// int k가 1이면 운전하기, 2이면 야구하기
		int k = 1;
		if (k == 1) {
			t1.autoPlay(new Ex07_Car());
		}else if(k == 2) {
			t1.autoPlay(new Ex07_Baseball());
			
		}
		System.out.println("=================");
		
		if (k == 1) {
			t1.autoPlay( new Ex07_Car() {
			@Override
			public void play() {
				System.out.println("운전하기2");
			}
			});
			
			
		}else if (k == 2) {
			t1.autoPlay(new com.ict.day14.Ex07() {
				
				@Override
				public void play() {
					// TODO Auto-generated method stub
					
				}
				 
			});
		}
		System.out.println("======================");
		
		Ex07 ex07 = null; // 조건식에 해당하지 않아서..?
		if (k == 1) {
			ex07 = new Ex07_Car();
			
		}else if (k == 2) {
			ex07 = new Ex07_Baseball() ;
		}
		ex07.play();
		
	}
}