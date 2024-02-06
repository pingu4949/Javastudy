package com.ict.day17;

import java.util.ArrayList;
import java.util.List;

public class Ex06_Car {
		// 차를 판매할때 사용하는 리스트
		// 판매할 차를 가지고 있는 공간
	private List<String> carList = null; //null인터페이스 
	
	// 객체 생성하면 carList 컬렉션이 만들어진다.
	public Ex06_Car() { // 생성자
		// 차를 판매할때 사용하는 리스트
		carList = new ArrayList<String>(); 
	}
	// 해당 메서드를 실행하면 carname를 반환
	public String getCar() { //리턴
		String carname = null;
		switch ((int)(Math.random()*3)) { // 0~2 랜덤
		case 0:
			carname = "SM5";
			break;
		case 1:
			carname = "매그너스";
			break;
		case 2:
			carname = "카렌스";
			break;
		default:
			break;
		}
		return carname;
	}
	public synchronized String pop(){
		String carname = null;
		// carList의 크기가 0이면 wait()
		if (carList.size() == 0) {
			try {
				System.out.println("차가 없어요 생산할때 까지" + "기다리세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// carList가 가지고 있는 것 중에 맨 마지막에 있는 놈 삭제(판매된것)
		carname = (String)carList.remove(carList.size()-1);
		
		System.out.println("손님이 차를 사갔습니다." + "손님이 구힙한 차이름은=>" + carname+"\"");
		return carname;
		
	}
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println(" 차가 만들어 졌습니다." + "차이름은 \"" + car +"\"");
		
		if (carList.size() == 5) {
			this.notify();
		}
	}
}
