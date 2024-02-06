package com.ict.day12;

import com.ict.day12.Ex08_dog.Ex08_MayAnimal2;

public class Ex08main {
	public static void main(String[] args) {
		Ex08_dog g = new Ex08_dog();
		g.sound();
		
		// Dog Class안에 있는 내부클래스라서 인스턴스 객체 생성이 불가능하다. 
		// Dog클래스 객체 생성을 한 이후 그 인스턴스를 이용하여 내부클래스 객체를 만들면 호출할 수 있다.
		Ex08_dog.Ex08_MayAnimal2 g1 = g.new Ex08_MayAnimal2();  
		g1.sound();
		g1.like();
	}
	
}
