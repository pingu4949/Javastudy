package com.ict.day11;

public class Ex01 {

	// 생성자 : 클래스를 객체로 만들 때 한번 호출된다.
	// 클래스이름 참조변수 = new 생성([인자]);
	// 생성자의 목적 : 멤버필드(변수와 상수)의 초기값 지정
	// 생성자의 특징 : 클래스이름 = 저장이름 = 생성자이름
	// 반환형이 없는 메서드와 같다.
	// 메서드 처럼 기능, 동작을 할 수 있다.
	// 클래스의 생성자가 없으면 기본생성자로 객체를 생성한다.
	// 기본생성자란 인자가 없는 생성자를 말한다.
	// 생성자도 오버로딩이 가능하다.(여러개의 생성자를 만들 수 있다.)
	// 생성자는 다른 생성자를 호출 할 수 있다.
	// 메서드는 생성자 호출xxxxx
	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";
	
	/*
	public Ex01() {
		// TODO Auto-generated constructor stub
		System.out.println("Ex01 생성자");
		System.out.println();
		name = "희동이";
		// 멤버필드의 값을 지정(초기값) 생성자를 만들면 위에를 무시하고 생성자 기준으로 초기값이 설정된다. 위에표시 x
		// 메서드 처럼 다른 기능을 만들 수 있다.
		// 메서드 처럼 다른 메서드를 호출할 수 있다.
		// 다른 생성자를 호출할 수 있다.
		age = 3;
		addr ="쌍문동";
	}
	*/
	/*
	public Ex01(String name) { // 또 다른 생성자 //ctrl + D 지우기
		
		this.name = name;
	}
	*/
	
	public Ex01(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////	
	// 연결하는곳

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {//가로 생성자
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

///////////////////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		// Ex01 객체 생성
		// 없어서 기본 생성자를 사용 
		// Ex01의 생성자를 만들자
		Ex01 t = new Ex01("도우너",14);

		// 이름, 나이, 주소 출력

		System.out.println("이름 :" + t.getName());

		System.out.println("나이 :" + t.getAge());

		System.out.println("주소 :" + t.getAddr());
		System.out.println();

		// 이름을 임꺽정, 나이 34, 주소를 함경도
		t.setName("고길동");
		System.out.println("이름 :" + t.getName());

		t.setAge(34);
		System.out.println("나이 :" + t.getAge());

		t.setAddr("함경도");
		System.out.println("주소 :" + t.getAddr());
		System.out.println();
		
		Ex01 t1 = new Ex01("둘리", 10);
		
		
		
		
		
		
		
		
		
		
		
	}
}
