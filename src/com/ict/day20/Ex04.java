package com.ict.day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// BufferedWriter : newLine() (줄 바꿈)
public class Ex04 {
	public static void main(String[] args) {
		String pathname = "D://Pinggu//util//test06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw); // 줄바꿈
			//String str = "안녕하세요\n123456\nHello\n";
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("12345");
			bw.newLine();
			bw.write("Hello");
			bw.newLine();
			bw.write("大韓");
			bw.newLine();
			
			bw.flush();
		} catch (Exception e) { // <- Exception 오류났을 때 처리안함.

		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
