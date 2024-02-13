package com.ict.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DataInputStream과 DataOutputStream
// 기본 자료형의 데이터를 주고 받을 때 사용
// ** 반드시 입력순서와 출력순서 맞춰야 한다.
// 기본생성자가 없어서 BufferedStream 처럼 FileStream을 이용하자
// DataIntStream 을 사용해야 읽을 수 있다.
public class Ex01 {
	public static void main(String[] args) {
		String pathname = "S://Pinggu//util//test.txt";
		File file = new File(pathname); 
		//텍스트에 쓰기 위한 것
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		//텍스트를 읽기 위한 것
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			// 출력
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			// write XXXX() , XXXX -> 기본자료형
			dos.writeChar(97);
			dos.writeChar('D');
			dos.writeBoolean(true);
			dos.writeDouble(178.95);
			dos.writeInt(84);
			dos.writeChar('가');
			dos.flush();
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// readXXXX(), XXXX-> 기본자료형 
			// 쓰는순서와 읽는 자료형 순서가 다르면 XXXX
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				fos.close();
				dis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
