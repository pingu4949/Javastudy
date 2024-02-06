package com.ict.day10;

public class AnimalTest {
	public static void main(String[] args) {
		Animal t = new Animal();

		System.out.println("이름 :" + t.getName());
		System.out.println("나이 :" + t.getAge());
		if (t.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("쥬금");
		}

		System.out.println();

		// 이름을 펭귄으로 변경하자.
		t.setName("펭귄");

		System.out.println("이름 :" + t.getName());
		System.out.println("나이 :" + t.getAge());
		if (t.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("쥬금");
		}

		// 새로 만들어져서 내용은 Animal 클래스 내용을 출력한다.
		Animal t2 = new Animal();

		System.out.println("이름 :" + t2.getName());
		System.out.println("나이 :" + t2.getAge());
		if (t2.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("쥬금");
		}

	}
}
// 오늘 가서 객체 지향이랑 저거 돈 마이너스 나오는거 해볼려구