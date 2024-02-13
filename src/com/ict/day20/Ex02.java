package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// PrintStream은 모든 데이터를 출력할 수 있다. (입력없음)
// 기본생성자가 없어서 BufferedStream 처럼 FileStream을 이용하자

public class Ex02 {
	public static void main(String[] args) {
		String pathname = "S://Pinggu//util//test04.txt";
		File file = new File(pathname); 
		
		FileOutputStream fos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream(file); //파일생성
			ps = new PrintStream(fos);        
			// System.out.println(기본자료형 + String) 와 같음 
			ps.println(0);// 파일출력
			ps.println(false);
			ps.println(3.14);
			ps.println("Hello World");
			ps.println(92);
			ps.println("자바의 세계의 오신 것을 환영합니다.");
			ps.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
