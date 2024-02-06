package com.ict.day22;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex01_ServerClients implements Runnable{
	Socket s;
	Ex01_Server server;
	
	// 직렬화 (대상클래스(vo), ObjectInputStream, ObjectOutputStream
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;
	
	public Ex01_ServerClients(Socket s, Ex01_Server server) {
		this.s = s;
		this.server = server;
		
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	// 프로토콜, 메세지 받기
	@Override
	public void run() {
		esc:while (true) {
			try {
				
				Object obj =  in.readObject(); //역직렬화
				if (obj != null) {
					Ex01_Protocol p = (Ex01_Protocol) obj;
					switch (p.getCmd()) {
						case 0://접속해제 (While문) 밖에서 처리
							// 자기자신한테 보냄
							out.writeObject(p);
							break esc;
						case 1: //대화명
							nickName = p.getMsg();
							// 메세지 전달
							p.setCmd(2);
							p.setMsg(nickName + "님 입장");
							server.sendMsg(p);
							break;
						case 2:
							p.setMsg(nickName+ ":" + p.getMsg());
							server.sendMsg(p);
							break;

					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} // while 문 
	
	try {// cmd 0이면 접속해제 이므로 아래 코딩을 실행한다.
		out.close();
		in.close();
		s.close();
		
		server.removeClient(this); //자기자신 빼기
		// 자신을 제외한 사람들에게는 메세지 전달을 하자 (퇴장알림)
		Ex01_Protocol p = new Ex01_Protocol(2, nickName + "님 퇴장");
		
		server.sendMsg(p);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
