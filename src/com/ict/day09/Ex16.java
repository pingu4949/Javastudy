package com.ict.day09;

public class Ex16 {
	public static void main(String[] args) {
		Ex15 t = new Ex15();
		
		String name = t.play01("둘리");
		System.out.println("name :" + name);
		System.out.println(t.name);
		
		int res = t.play02(90, 90, 80);
		System.out.println("res :" + res);
		System.out.println(t.sum);
		int total = t.play03(49, 69, 59);
		System.out.println("total :" + total);
		System.out.println(t.sum);
		
		
	}
}
