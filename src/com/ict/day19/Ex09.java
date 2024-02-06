package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

// 스트림은 지연이 될 수 있으므로 Buffer(임시기억)이용해서 지연 현상을 해결한다.
// BufferedOutputStream 사용 // 혼자서는 사용 안함
public class Ex09 {
 public static void main(String[] args) {
	 String pathname = "D:/Pinggu/util/test01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null; // 선언
		BufferedOutputStream bos = null; // 임시기억을 통해 지연 현상 해결		
		try {
			// true 있으면 이어쓰기가 된다. 없으면 덮어쓰기
			
			fos = new FileOutputStream(file, true); // 파일 생성
			bos = new BufferedOutputStream(fos); // 연계 /유식한말로 체인 방식
			
			String mag = "한국 ICT 인재 개발원 5강의장 자바 실습 중";
			byte[]  b = mag.getBytes();
			bos.write(b);
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close(); //바깥쪽
				fos.close(); //안쪽 파일생성하면 스트림 닫기
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
}
