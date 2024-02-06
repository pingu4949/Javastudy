package com.ict.day10;

public class Animal {
/*
 클래스 이름은 Anima로 한다
 
클래스 내부에는 생존 여부를 가리는 속성을 까진다
나이와 이름 정보를 기억하는 속성을 가진다
∙ 이름 정보를 바꾸는 기능이 있어야 한다.
∙ 이름 정보를 반환하는 기능이 있어야 한다.
생존여부를 반환하는 기능이 있어야 한다.

(조건2]
클래스 이름은 AnimalTrest라 한다!
AnimalTest클래스에는 main() 에서드를 가진다.
[조건1 ]의 Anima] 클래스를 이용하여 나이가 3살
이름이 "큰뿔소"이며 살아있는 객체를 생성하사. 그
리고 이름과 생존 여부를 출력해보자!
위의 "큰뿔소" 객체의 이름을 "펭권"으로 변경한 후
이름과 생존 여부를 출력해보자.

 
 */
	
	boolean live = true;
	int age = 3;
	String name = "큰뿔소";
	
	public boolean isLive() {
		return live;
	}
	
	public void setLive(boolean live) {
		this.live = live;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
