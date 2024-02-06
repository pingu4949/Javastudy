package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex11 {
	public static void main(String[] args) {
		// 스트림은 지연이 될 수 있으므로 Buffer(임시기억)이용해서 지연 현상을 해결한다.
		// BufferedInputStream 사용 // 혼자서는 사용 안함

		String pathname = "D:/Pinggu/util/test02.txt";
		File file = new File(pathname);
		FileInputStream fis = null; // 선언 밖에
		BufferedInputStream bis = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);

			byte[] b = new byte[(int) (file.length())]; // 파일크기 만큼
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
