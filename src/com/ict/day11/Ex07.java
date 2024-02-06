package com.ict.day11;

public class Ex07 {
	// static : 객체 생성과 상관없이 미리 만들어진 필드와 메서드
	// 클래스와 지역변수에는 사용할 수 없다.
	// 모든 객체가 접근해서 사용할 수 있다.(단, private이면 안됨)
	//
	// static 영역에 만들어진다.

	int su = 10; // 
	static int num = 10; //

	public Ex07(){
		su++;
		num++;
	}

	public void play() {
		int k = su + 1000;
		System.out.println(su + 1000);
		int k2 = num + 10;
		System.out.println(su + 1000);

	}

	// static 메서드는 전역 변수를 사용할 수 없다.
	// 지역변수에 static 사용 못함
	public static int play2() {
		// int k = su + 1000;
		int k2 = num + 10;
		//System.out.println("k :" + 1000);
		return k2 ;
		//System.out.println("k2 :" + 1000);
		// static int k3 = 1000; //지역변수 스틱도 사용불가
		
	}

	
	
	public static void main(String[] args) {
		
		System.out.println(Ex07.num);
		System.out.println(Ex07.play2());			
		System.out.println();
	
		// static private은 접근 못함
		// System.out.println(Ex13.age);
		
		
		Ex07 t1 = new Ex07();
		System.out.println(t1.su);
		System.out.println(t1.num);
		System.out.println(t1.num);
		
		System.out.println();
		
		Ex07 t2 = new Ex07();
		System.out.println(t1.su);
		System.out.println(t1.num);
		System.out.println(t1.num);
		
		System.out.println();
		
		Ex07 t3 = new Ex07();
		System.out.println(t1.su);
		System.out.println(t1.num);
		System.out.println(Ex07.num);
		System.out.println();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
