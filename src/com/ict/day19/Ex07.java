package com.ict.day19;

import java.io.File;
import java.io.IOException;
//mkdir - 폴더가 있어야 만들 수 있음
//mkdirs - 폴더부터 만들어줌
public class Ex07 {
	public static void main(String[] args) {
		String pathname = "D:/Pinggu/util/pingu01";
		File file = new File(pathname);
		
		try {
			// 파일 생성
			boolean b1 = file.createNewFile();
			if (b1) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
				
			}
			System.out.println();
			
			// 디렉토리 생성
			File file3 = new File("D:/Pinggu/util/kkk/yyy");
			boolean b2 =file3.mkdir();
			if (b2) {
				System.out.println("디렉토리 생성 성공");
			}else {
				// 만들고자 하는 yyy위에 kkk가 존재 하지 않아서 실패 - mkdir()
				// 위에 내용을 성공하게 하는건 mkdirs
				System.out.println("디렉토리 생성 실패");
			}
			
			boolean b3 =file3.mkdirs();
			if (b3) {
				System.out.println("디렉토리 생성 성공");
			}else {
				// 만들고자 하는 yyy위에 kkk가 존재 하지 않아서 실패 - mkdir()
				// 위에 내용을 성공하게 하는건 mkdirs
				System.out.println("디렉토리 생성 실패");
			}
			// 파일 삭제
			String pathname2 = "D:/Pinggu/util/pingu01";
			
			File file4 = new File(pathname2);
			
			boolean b4 = file4.delete();
			if (b4) {
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}
			// 폴더 삭제 (폴더 안에 내용이 있으면 삭제 불가)
			String pathname3 = "D:/Pinggu/util/kkk";
			File file5 = new File(pathname3);
			boolean b5 = file5.delete();
			if (b5) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}
			
			String pathname4 = "D:/Pinggu/util/kkk/yyy";
			File file6 = new File(pathname4);
			boolean b6 = file6.delete();
			if (b6) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
