package com.ict.day10;

public class Ex10 {
	// 변수의 접근제한자가 private 이므로 외부에서 접근 할 수 없다.
	// 메서드를 이용해서 데이터를 변경하거나 보낼 수 있다.
	// getter () : 호출하는 입장에서 데이터를 가져올 수 있다.
	// setter () : 호출하는 입장에서 데이터를 보낼 수 있다.
	private int age = 24; // 나이
	private double weight = 72.6; // 몸무게
	private boolean gender = true; // 성별
	private String name = "홍길동"; // 이름

	
	// 메뉴의 source = get/set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public static void main(String[] args) {
		Ex10 t = new Ex10();
		// 변경 전 이름 가져오기 (getter)
		System.out.println(t.getName());
		
		
		// 홍길동 이름을 둘리로 변경하기
		t.setName("둘리");
		// 둘리 이름 출력 하기
		System.out.println(t.getName());

		
		// 나이가 24인데 15000로 변경하자.
		t.setAge(10500);
		System.out.println(t.getAge());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
