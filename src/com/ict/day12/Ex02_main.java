package com.ict.day12;

import java.util.Random;

public class Ex02_main {
	public static void main(String[] args) {
		// Random
		Random ran = new Random();
		int su = ran.nextInt(10)+ 1;
		System.out.println(su);
	}
}
