package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class Ex05_Server {
	public static void main(String[] args) {
		//서버소켓생성~
		ServerSocket server = null;
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os =null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			server = new ServerSocket(7000); // 포트번호 설정
			System.out.println("서버 대기");
			// 클라이언트가 요청하기 전까지 블록킹(멈추다) 된다 
			socket = server.accept(); // 대기중
			System.out.println("accept 이후 "); // 클라이언트 실행 하면 출력
			
			// 클라이언트가 보낸 정보를 받기 위해 입력 스트림을 얻기
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			// 서버에 접속한 ip 주소 얻기
			String ip = socket.getInetAddress().getHostAddress();
			String msg = br.readLine();
			
			
			// 들어온 문자 출력하기
			System.out.println(ip + ":" + msg );
//			String msg = null;
//			StringBuffer sb = new StringBuffer();
//			while ((msg = br.readLine()) != null) {
//				sb.append(msg + "\n");
//			}
//			System.out.println(ip.toString() +":"+ sb.toString());
			
			// 클라이언트에게 보낼 출력 스트림 얻기
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg);
			bw.flush();
			
		} catch (IOException e) {
			System.out.println("서버 오류");
			
		}finally {
			try {
				bw.close();
				os.close();
				osw.close();
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