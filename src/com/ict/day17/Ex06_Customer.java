package com.ict.day17;

import java.beans.Customizer;

public class Ex06_Customer implements Runnable {
	private Ex06_Car car;
	
	public Ex06_Customer (Ex06_Car car) {
		this.car = car;
	}
	
	public void run() {
		String carname = null;
		for (int i = 0; i < 20; i++) {
			carname = car.pop();
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
