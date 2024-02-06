package com.ict.day17;

public class Ex06_Producer implements Runnable {
	private Ex06_Car car;

	public Ex06_Producer(Ex06_Car car) {
		this.car = car;
	}

	public void run() {
		String carname = null;
		for (int i = 0; i < 20; i++) {
			carname = car.getCar();
			car.push(carname);
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

