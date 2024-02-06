package com.ict.day17;


public class Ex06_main {
	public static void main(String[] args) {
		Ex06_Car car = new Ex06_Car();
		
		Ex06_Producer producer = new Ex06_Producer(car);
		Thread tprThread = new Thread (producer);
		
		Ex06_Customer customer = new Ex06_Customer(car);
		Thread tCuThread = new Thread (customer);
		
		tprThread.start();
		
		tCuThread.start();
		
		
	}
}