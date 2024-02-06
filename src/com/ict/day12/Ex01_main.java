package com.ict.day12;

public class Ex01_main {
	public static void main(String[] args) {
		Ex01_Sub t = new Ex01_Sub(); //자식클래스를 가져와야 부모클래스 사용 가능.
		// 출력 시 부모 생성자가 먼저 나온다.
		// 상속은 부모클래스를 자식에게 상속시켜서 자식이 둘다 사용할수있게 된다. private는 사용 못한다.
		
		// 자식클래스를 객체 생성하면 부모클래스가 먼저 만들어지고
		// 그 다음에 자식 클래스가 만들어진다.
		
		System.out.println(t);
		System.out.println(t.name);
		System.out.println(t.addr);
		
		t.play();
		// 부모클래스의 멤버필드가 private아니면 접근 가능하다.
		System.out.println(t.addr); //세모 = 멤버필드 | 자료형 | 클래스 // 원 = 메소드() // 세모s  static
		// 출력 할때 같은 필드가 있다면 자식꺼를 먼저 찾는다. (없으면 부모꺼 가져옴)
		System.out.println(t.age);
		
		// static은 객체, 상속 등과 상관없이 그냥 호출 가능하다.
		// 클래스.멤버필드 | 클래스.멤버메소드
		
		System.out.println(Ex01_Sup.car);
		System.out.println(Ex01_Sup.GENDER);
	}
}
