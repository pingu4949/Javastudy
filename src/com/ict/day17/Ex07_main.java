package com.ict.day17;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07_ATM ATM = new Ex07_ATM();
		Thread mother = new Thread(ATM, "mother");
		Thread son = new Thread(ATM, "son");
		
		mother.start();
		son.start();
		
	}
}
