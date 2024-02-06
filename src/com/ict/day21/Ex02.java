package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// 날씨
public class Ex02 {
	public static void main(String[] args) {
		// 링크 읽는 용도
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//파일 저장
		String pathname = "D:/Pinggu/util/EX02.txt";
		File file = new File(pathname); 
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		
		try {
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br =new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			System.out.println(sb.toString());
			System.out.println();
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
			Map<String, List<String>> map = conn.getHeaderFields();
			for (String m : map.keySet()) {
				System.out.println( m + ":" + map.get(m));
			}
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				isr.close();
				br.close();
				fw.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
}
