package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// "D://Pinggu//util//image01.jpg" 파일을 D://Pinggu//image01.jpg 복사하자~
public class Ex12 {
	public static void main(String[] args) {
		String Inpathname = "D:/Pinggu/util/image01.jpg";
		String Outputpath = "D://Pinggu//img-01.jpg";
		
		
		File Infile = new File(Inpathname);
		FileInputStream fis = null; // 선언 밖에
		BufferedInputStream bis = null;
		
		
		File Outfile = new File(Outputpath);
		FileOutputStream fos =null;
		BufferedOutputStream bos =null;
		
		try {
			fis = new FileInputStream(Infile);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(Outfile);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while ((b = bis.read()) != -1) {
				bos.write(b);
				bos.flush();
			}
			// 원본 삭제 이동
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
				fis.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean s = Infile.delete();
			if (s) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		}
	}
	//타자 선넘지~
}