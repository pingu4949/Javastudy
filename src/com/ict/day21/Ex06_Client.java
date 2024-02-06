package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class Ex06_Client implements Runnable {
	Socket socket;

	// 출력
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;

	// 입력
	InputStreamReader isr = null;
	BufferedReader Keyboard = null;
	BufferedReader br = null;

	public Ex06_Client() {
		
		try {
			socket = new Socket("192.168.0.117", 7001);
			isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
			new Thread(this).start(); 
			while (true) {
				
				System.out.println("데이터 입력");
				Keyboard = new BufferedReader(new InputStreamReader(System.in));
				String msg = Keyboard.readLine();
				
				
				//서버에 접속
				osw = new OutputStreamWriter(socket.getOutputStream());
				bw = new BufferedWriter(osw);
				bw.write(msg + System.lineSeparator());
				bw.flush();
						
			}

		} catch (IOException e) {
			try {
				String msg = Keyboard.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("받을 때 오류");
			}
		}
	}

	@Override 
	public void run() {
		while (true) {
			try {
				String msg = br.readLine();
				System.out.println("서버로 부터 받은 메세지 :" + msg.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Ex06_Client();
	}
}
