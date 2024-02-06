package com.ict.day12;

import java.util.Scanner;

import com.ict.day10.Animal;

public class Ex05_main {
	public static void main(String[] args) {
		// 다형성 : 하나의 메세지가 각 객체마다 자기의 특성에 맞게 반응하는 것
		// 오버로딩 : 한 클래스안에 같은 이름의 메서드가 여러 개 존재하는것
		//		   (인자의 자료형이나 갯수가 다르다)
		// 오버라이딩 : 상속관계에서 부모 메서드와 자식 메서드가 같은 것
		//			이때 자식 클래스가 부모 클래스의 메서드 내용을
		// 			자식 클래스에 맞게 변경해서 사용한다.
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("선택하세요 (1.고양이 2.강아지)");
		int su = scan.nextInt();
		
		if (su == 1) {
			Ex05_cat c = new Ex05_cat();
			c.sound();
			c.play();
			
		}else if (su == 2) {
			Ex05_dog d = new Ex05_dog();
			d.sound();
			d.happy();
	
		}
		
		Ex05_Animal animal = null;
		if (su == 1) {
			animal = new Ex05_cat();
		}else if (su == 2) {
			animal = new Ex05_dog();
		}
		
		// 오버 라이딩
		animal.sound();
		// 부모만 가지고 있는 메서드
		animal.like(); 
		// 자식만 가지고 있는 메서드 (단점)
		//animal.play();
			
		
		
		
		
		
		
		
	}
	
}
