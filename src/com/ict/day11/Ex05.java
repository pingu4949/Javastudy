  package com.ict.day11;

public class Ex05 {

	private String name = "일지메";
	private int age = 24;
	private String addr = "충청도";

	// 생성자들
	// 생성자가 여러개 있으면 생성자 오버로딩이다.
	// 생성자가 다른 생성자를 호출 할 수 있다.
	public Ex05() { //이걸 사용해서 기본생성자 만들어줌 그래야 위에 초기값이 실행됨
		System.out.println("기본 생성자 사용");
		name = "호돌이";
		addr = "LA";
	}
	
	
	public Ex05(String name) {

		this.name = name;

	}

	public Ex05(String name, int age) {
		//생성자가 다른 생성자를 호출할때는 
		// 생성자 맨 첫줄에 this([인장])를 사용한다.
		this(); //this 반드시 첫번째 줄에 있어야 된다.
		this.name = name;
		this.age = age;
		//30분만 참아 
	}

	public Ex05(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	

/////////////////////////////////////////////////////////////////////////////////////////

	// getter/setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
//////////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		// 기본생성자
		Ex05 t = new Ex05();
		System.out.println("이름 :" + t.getName());
		System.out.println("나이 :" + t.getAge());
		System.out.println("주소 :" + t.getAddr());
		System.out.println();
		
		
		
		
		Ex05 t1 = new Ex05("오잉"); 
		System.out.println("이름 :" + t1.getName());
		System.out.println("나이 :" + t1.getAge());
		System.out.println("주소 :" + t1.getAddr());
		System.out.println();
		
		Ex05 t2 = new Ex05("짱구", 5);
		System.out.println("이름 :" + t2.getName());
		System.out.println("나이 :" + t2.getAge());
		System.out.println("주소 :" + t2.getAddr());
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}

}
