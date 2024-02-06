package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;

public class Ex07 {
	public static void main(String[] args) {
		//로또
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int su = (int) (Math.random()*49+1);
			if (! set1.add(su)) { //중복되는 값이 나올때
				i --;
			}
			
		}
		System.out.println(set1);
		
	}
}
