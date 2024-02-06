package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class Ex06_Server implements Runnable{
	ServerSocket server = null;
	Socket s = null;
	
	//입력 // inputstream 빠짐
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	//
	//출력
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	public Ex06_Server() {
		try {
			server = new ServerSocket(7001);
			System.out.println("서버 대기중");
			
			
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				s = server.accept();
				isr = new InputStreamReader(s.getInputStream());
				br = new BufferedReader(isr);

				String msg = br.readLine();
				
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println( ip +":"+ "님 접속");
				
				osw = new OutputStreamWriter(s.getOutputStream());
				bw = new BufferedWriter(osw);
				msg += System.lineSeparator();
				bw.write(msg);
				bw.flush();
			}// 무한루프
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				osw.close();
				br.close();
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		new Ex06_Server();
		
		
		
	}
	
}





