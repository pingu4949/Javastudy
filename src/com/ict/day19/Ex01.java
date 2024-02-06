package com.ict.day19;

public class Ex01 {
	private String name;
	private int age;
	private int price;

	public Ex01() { //초기값 생성자
	}

	public Ex01(String name, int age, int price) { //생성자

		this.name = name;
		this.age = age;
		this.price = price;
	}

	@Override
	public String toString() {
		return "name:" + name + "age:" + age + "price:" + price;
		
	}
	
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
