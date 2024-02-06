package com.ict.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

public class Ex10 {
	public static void main(String[] args) {
		// 바이트 출력 스트림 : InputStream 자식클래스 FileInputStream 사용
				//					FileInputStream : 해당 파일에 내용을 1byte 쓰기 (출력) 
				// 		주요 메서드 : read(int b) : int -> 숫자(아스키코드0-255), 한 글자
				//										해당 숫자를 문자로 보려면 char 형변환 해라
				//										만약에 읽을 수가 없으면 -1이 나온다.
				//
				//				   read(byte[] b) : 배열에 존재하는 아스키코드 읽기
		
		
				//
				// 파일 만들 위치 지정
				String pathname = "D:/Pinggu/util/test02.txt";
				File file = new File(pathname);
				FileInputStream fis = null; //선언 밖에
				try {
					fis = new FileInputStream(file);
					// 1byte(한글자)읽기(숫자, 소문자, 대문자 -> 한글자)
					
					//int b = fis.read();
					//System.out.println(b);
					//System.out.println((char)b);
					
					// 모든 글자 읽기 : 한글, 한자 안됨
//					int b = 0;
//					while (true) {
//						b = fis.read();
//						if (b == -1) 
//							break;
//							System.out.println(b +":" + (char)b);
						
//					}
					// **파일 업로드 다운로드 이방식 사용 중요함**
//					int b = 0;
//					b = fis.read();
//					// 읽어온 b가 -1이 아니면 계속 실행하자
//					while((b = fis.read()) != -1) {
//						System.out.println(b + ":" + (char)(b));
//					}
					
					byte[] b = new byte[(int) file.length()];				
					// fis가 가르키는 파일의 내용을 byte[] b 에 모두 넣어준다.
					 fis.read(b);
					 // 한글 한자가 안나옴
					 
//					 for (byte k : b) {
//						System.out.println(k + ":" + (char)(k));
//					}
					// String을 이요하면 한글,한자 안깨짐
					String str = new String(b);
					System.out.println(str);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	}
}
