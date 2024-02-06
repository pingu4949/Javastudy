package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_Client {
	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		Scanner scan = new Scanner(System.in);
		
		//받아오기
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try { // 0 ~ 66535?
			// 서버에 접속
			socket = new Socket("192.168.0.146", 7000);
			
			
			// 입출력스트림 얻고 문자열 보내기
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			System.out.print("입력하세요 :");
			String msg = scan.next();
			bw.write(msg + "\n");
			bw.flush();
			
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String return_msg = br.readLine();
			System.out.println("받은 정보 :" + return_msg);
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("클라이언트 오류");
			
		}finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				osw.close();
				os.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
