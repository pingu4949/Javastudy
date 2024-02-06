package com.ict.day06;

import java.text.Format;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		String str = "ICT 인재개발원 5강의장";
		
		// charAt(int index) : char
		// 위치정보(index, 0부터 시작)가 숫자로 들어오면 해당위치에 존재하는 문자를 반환한다.
		
		int num = 7;
		char c1 =str.charAt(num);
		
		System.out.println(c1); //공백 인식함
		

		
		str = "대한민국 I Love You 1004❤";
		//str의 모든 글자를 대문자를 만들자(소문자는 대문자에 -32)
		//해당 문자의 위치정보를 가지고 하나씩 꺼내서 검사 할 수 있다.
		for (int i = 0; i < str.length() ; i++) {
			char c2 = str.charAt(i);
			if (c2 >= 'a' && c2<='z') {
			c2 = (char)(c2 - 32);
			}
			System.out.print(c2 + "~"); //print 옆으로 println 밑으로
		}
		System.out.println("\n");
		
		// 2. connat(String str) : String
		// 입력된 문자열을 현재문자열과 합친다. ("문자열" + "문자열" 과 같은 결과)
		String s1 = "대한민국";
		String s2 = s1.concat("KOREA");
		System.out.println(s2);
		
	
		String s3 = " KOREA";
		String s4 = s1.concat(s3);
		System.out.println(s4+"\n");
		// 3. contains(CharSequence s) : boolean
		// 	  CharSequence는 char 값을 순서대로 읽을 수 있다.
		// 	  지금은 String 이라고 생각하자.
		// 	  String을 넣어주면 해당 문자열에 입력된 String이 존재하면 true, 존재하지 않으면 false. 
		
		 
		String s5 ="dudfks232031@naver.com";
		//boolean b1 = s5.contains('@'); //char 사용 못한다.
		boolean b1 = s5.contains("@");
		System.out.println("결과 ="+ b1);
		System.out.println("결과 ="+ s5.contains(".com"));
		System.out.println("결과 ="+ s5.contains(".COM")); //대소문자 구분한다.
	
		// 4. equals(object anObject) : boolean
		//	 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별)
		// equalsIgnoreCase(String anotherString) : boolean
		// 5. 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 안한다.)
		// ** 문자열과 문자열을 같다고 비교할때는 == 를 사용하지 않는다.
		
		//대소문자 구분
		String s6 = "Korea";
		String s7 = "KOREA";
		
		if (s6.equals(s7)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//대소문 구분 못함
		
		if (s6.equalsIgnoreCase(s7)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	
		System.out.println();
		
		// 6. format(String format, Object... args) :static String
		// 형식을 지정하고 형식에 맞춰서 문자열 생성
		String s8 = "한국 ICT 인재 개발원";
		
		//%s 문자열
		String s9 = String.format("@@ %s !! 파이팅", s8);
		System.out.println(s9);
		
		System.out.println();
		// %30s 30자리 차지하는 문자열(남은 자리는 비워둔다.) 오른쪽 정렬
		String s10 = String.format("%30s", s8);
		System.out.println(s10);
		
		System.out.println();
		// -는 왼쪽 정렬이 된다.
		String s11 =String.format("%-30s", s8);
		System.out.println(s11);
		System.out.println();
		
		String s12 = String.format("%6s", s8);
		System.out.println(s12+"\n");
		
		System.out.println();
		
		// %d 정수 향식
		int k1= 2134;
		String s13 =String.format("%5d &&", k1);
		System.out.println(s13);
		
		
		// %d 정수 향식
		 String s14 =String.format("%5d @@", k1);
		 System.out.println(s14);
			
		 
		 // %d 정수 향식
		 String s15 =String.format("%-5d @@", k1);
		 System.out.println(s15);
		 
		// %f 실수형식 지정
		 double s16 = 123.445678;
		 String s17 = String.format("%f", s16);
		 System.out.println(s17);
		
		String s18 = String.format("%.1f", s16);
		System.out.println(s18);
		
		String s19 = String.format("%.4f", s16);
		System.out.println(s19+"\n");
		
		//** 7. getByte() : byte[]
		// 해당 문자열을 byte[]로 변환시킨다.
		// 보통 입/출력할 때 사용한다.( 대소문자, 숫자 가능, 영어이외에 글자는 안됨)
		// 나중에 [] 배열을 배운 후에 한다.
		
		// 8. indexOf(int ch), indexOf(String str) : int
		// 	  입력된 문자(ch), 문자열(str)의 위치값을 알려준다.
		//	  문자나 문자열이 없으면 -1 반환
		String h1 = "BufferedReader";
		int h2 = h1.indexOf('B');
		System.out.println(h2);
		
		h2 =h1.indexOf("er");
		System.out.println(h2);
		
		h2 =h1.indexOf("v"+"\n");
		System.out.println(h2);
		
		// 9. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		// 	  fromIndex는 시작 위치를 말한다.
		// 2번째 , 3번째 문자나 글자를 찾기 위함
		
		// 두번째 e를 찾아라 (우선, 첫번째 e를 찾아라)
		int h3 = h1.indexOf('e'); //4
		System.out.println(h3);
		
		int h4 =h1.indexOf('e', h3 + 1);
		System.out.println(h4); // + 1 하면 다음 숫자 찾음
		
		// 10. lastIndexOf(int ch), lastIndexOf(String str) : int
		// 마지막 문자나 문자열을 찾을 때 사용
		
		int h5 =h1.lastIndexOf('e');
		System.out.println(h5+"\n");
		
		//	11. length() : int
		//	문자열의 길이를 구한다. (1부터 시작한다.)
		String str1 = "Hello";
		int h6 =str1.length();
		System.out.println("길이 : "+h6+"\n");
		
		// 12. replace(char oldChar, char newChar) : String
		//	   replace(charSequence target, CharSequence replacement) : String
		// 지금은 replace(charSequence oldString(전), CharSequence newString(후) : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기)한다.
		String str2 ="대한민국";
		String str3 =str2.replace('민', '民');
		System.out.println(str3);
		
		String str4 = str2.replace("한", "한 👍 ");
		System.out.println(str4+"\n");
		
		// 13. isEmpty() : boolean
		// 해당 문자열이 비어 있으면 true, 내용이 있으면 false;
		String str5 = "대한민국";
		System.out.println(str5.isEmpty());

		String str6 ="";
		System.out.println(str6.isEmpty());
		System.out.println();
		//오류 발생 : Exception
		//String str7 = null;
		//System.out.println(str7.isEmpty());
		
		// 14. split(String regex) 			  : String[]
		// 	   split(String regex, int limit) : String[]
		// 배열 배운 이후에 나중에 한다.
		
		// 15. substring(int beginIndex) 			   : String
		//	   입력된 시작위치 부터 끝까지 문자열 추출 
		  
		// 	   substring(int beginIndex, int endIndex) : String
		// 	   입력된 시작위치 부터 끝위치 전까지 문자열 추출(끝위치 포함하지 않는다.)
		// 	   endIndex - beginIndex = 추출할 문자의 갯수
		String t1 = "010-5503-2320";
		String t2 = t1.substring(4);
		System.out.println(t2); //5503-2320
		
		t2 =t1.substring(9);
		System.out.println(t2); //2320
		t2 = t1.substring(t1.lastIndexOf('-')+1);
		System.out.println(t2); //2320
		
		String t3 = t1.substring(4, 8);
		System.out.println(t3); //5503
		System.out.println();
		// 010-5503-2320 => 010 -5503-****, 010-****-2320
		
		System.out.println(t1);
		String i1 = "****";
		String t4 =t1.replace("2320", i1);
		System.out.println(t4);
		String t5 =t1.replace("5503", i1);
		System.out.println(t5);
		
		System.out.println();
		
		System.out.println(t1.replace(t1.substring(9), i1));
		System.out.println(t1.replace(t1.substring(4,8), i1));
		
		System.out.println();
		// 16. toLowerCase() : String => 해당 문자열을 모두 소문자로 변경
		// 17. toUpperCase() : String => 해당 문자열 모두 대문자로 변경
		
		String t6 = "대한민국 I Love You @ 1004";
		System.out.println(t6.toLowerCase());
		System.out.println(t6.toUpperCase());
		
		System.out.println();
		// 18. toString : String
		// 모든 클래스의 toString : 모든 객체(클래스)에서 사용가능.
		//						객체(클래스)가 가지고 있는 정보나 값(데이터)들을
		//						문자열로 만들어서 반환하는 메서드
		// String의 toString은 문자열 자체를 반환
		
		String t7 ="java 17 자바 17";
		String t8 =t7.toString();
		System.out.println(t7);
		System.out.println(t8);
		
		// 19. trim() : String
		//	   해당 문자열의 앞, 뒤, 공백 제거, 중간 공백은 제거하지 않는다.
		String t9 = "  java 자바 JAVA  ";
		String t10 = t9.trim(); 
		
		System.out.println();
		
		System.out.println(t9);
		System.out.println(t9.length()); // 공백 존재
		System.out.println(t10);
		System.out.println(t10.length()); // 앞뒤 공백 제거
		
		System.out.println();
		
		// 20. startWith(String prefix) : boolean => 주어진 문자로 시작하는지 검색
		// 	   startWith(String prefix, int offset) : boolean => 주어진 문자로 시작하는지 검색
		//	   endswith(String suffix) : boolean => 주어진 문자열로 끝나는지 검색									  toffset => 시작 위치
		boolean res = t10.startsWith("java"); // true
		System.out.println(res);
		
		boolean res2 = t10.startsWith("JAVA"); //false
		System.out.println(res2);
		
		boolean res3 = t10.startsWith("자바",5); // true
		System.out.println(res3);
		
		boolean res4 = t10.endsWith("JAVA"); // true
		System.out.println(res4);
		
		System.out.println();
		// 21. valueOf(기본자료형) : static String
		// 어떤 기본 자료형이든지 String으로 변경 시킴	( 기본자료형 + "")
		boolean res5 = true;
		char ch1 = 'c';
		int num1 = 34;
		long num2 = 37l;
		float num3 = 3.15672f;
		double num4 = 3654.1241;
		
		// 자료형 +1 = 실제로 덧셈을 한다.
		System.out.println(res5);
		System.out.println(ch1+1);
		System.out.println((char)(ch1+1));
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println(num4+1);
		
		System.out.println();
		
		System.out.println(String.valueOf(res5)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println(String.valueOf(num4)+1);
			// 메소드(자료형) : 자료형 - 자료형
		System.out.println();
		// 22. Wrapper 클래스
		//	   기본 자료형의 형태를 가진 문자열을 해당 자료형으로 변경 시키는 클래스들
		//     기본 자료형을 객체로 만들 때 사용하는 클래스
		
		// 22-1. "true", "false" 문자열을 기본자료형인 boolean형으로 변경 시킨다 : Boolean.parseBoolean
		//		 "true", "false" => trus, false
		//		 "true"를 제외한 문자열이면 => false
		String msg ="true";
		// 클래스
		boolean msg2 = Boolean.parseBoolean(msg); // "true" = > true
		System.out.println(msg + 1);
		// 실제 boolean형으로 변경했으므로 덧셈 계산을 할 수 없다.
		// System.out.println(msg2 + 1);
		
		msg2 = Boolean.parseBoolean("가나다");
		System.out.println(msg2);
		
		System.out.println();
		// 22-2. "10", "124" 문자열을 기본자료형 int 형으로 변경 : Integer.parseInt(String s);
		msg ="124";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg + 10); //12410
		System.out.println(msg3 + 10); //134
		
		System.out.println();
		
		// 22-3. 문자열을 기본자료형인 long형으로 변경 : Long.parseLong();
		//	"숫자" => OK, "숫자L" => err
		msg = "12345678912345";
		// int 형의 범위를 벗어나서 L을 붙어야 한다.
		//long msg4 = 12345678941L ;//11자부터 오류
 		//long msg5 = 1234L;
		//long msg6 = 1234;
		
		long msg4 = Long.parseLong(msg);
		System.out.println(msg4+1);
		
		System.out.println();
		
		// 22-4. 문자열을 float로 변경 : Float,parseFloat();
		// "숫자f" => ok
		// 되도록이면 double, Bigdecimal 사용하자!
		msg = "32.14f";
		float msg6 = Float.parseFloat(msg);
		System.out.println(msg6+10);
		
		// 22-5. 문자열을 double 변경 : Double.parseDouble();
		msg = "3.17598";
		double msg7 = Double.parseDouble(msg);
		System.out.println(msg7+10);
		
		// 22.6 Character.parseCharacter() 는 존재 하지 않는다.
		// 		즉 문자열을 char로 변경하는 클래스는 존재하지 않는다.
		// 		그러나, String의 charAt() 사용하면 char로 만들 수 있다.
		
		msg = "A";
		char msg8 = msg.charAt(0);
		System.out.println(msg+1); // A1
		System.out.println(msg8+1); // 66
		System.out.println((char)(msg8+1)); // B
		
		// 23.  배열을 배운 후 하자
		//		String.getBytes(); byte[];
		// 	   	String.toCharArray(); char[];
		// 		split(String regex)			  :String[]
		// 		split(String regex, int limit):String[]
		
		
		
		
		
		
		
		
	}
}