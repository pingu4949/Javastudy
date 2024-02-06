package com.ict.day20;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// URL(Uniform Resource Locator) : 인터넷에서 접근 가능한 자원의 주소 
// URL 클래스 : 해당 위치의 자연의 결과만 가져온다.
// 			 final 클래스이다. 상속안됨
//  final 클래스 붙이면 상속X final 메서드 오버라이딩 X final 멤버필드 붙이면 상수
public class Ex12 {
	public static void main(String[] args) {
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 내 컴퓨터에 저장
		String pathname = "D://Pinggu//util//WebPage01.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			
			
			
			URL url = new URL("https://comic.naver.com/index");
			
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			// String에 여러 번 "+" 사용하면 메모리에 쓸데없는 공간들이 만들어진다.
			// 그것을 해결 하기 위해서 StringBuffer 나 StringBuilder 를 사용한다.
			// append()로 추가 한다.
			StringBuffer sb =new StringBuffer();
			// StringBuilder sb1 =new StringBuilder();
			while ((msg = br.readLine()) != null) {
				// 화면 출력
				// System.out.println(msg + "\n");
				sb.append(msg+"\n");
				
			}
			//toString <- 자료형을 String 으로 만들어주는얘
			//System.out.println(sb.toString()); 
			
			//파일에 저장하기
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
		
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	}
}
