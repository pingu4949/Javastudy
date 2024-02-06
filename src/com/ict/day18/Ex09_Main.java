package com.ict.day18;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex09_Main {
	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~", "Hello", "Good morning", "반갑습니다. ^^"};
		
		Stream<String> str1 = Arrays.stream(greetings);
		
		String str2 = str1.reduce(new Ex09()).get();
		System.out.println(str2);
		
		
	}
}
