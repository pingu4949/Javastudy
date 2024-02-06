package com.ict.day17;

import java.util.Iterator;

public class Ex07_ATM implements Runnable {
	private long depositeMoney = 10000; // 지갑에 만원

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if (getDepositeMoney() <= 0)
					break;
				// 잔액을 1000원씩 감소 시키는 메서드
				withDraw(1000);
				if (getDepositeMoney() == 2000 
						|| getDepositeMoney() == 4000 
						|| getDepositeMoney() == 6000
						|| getDepositeMoney() == 8000) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					this.notify();
				}
			}
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

	public void withDraw(long howmMuch) {
		if (getDepositeMoney() > 0) {
			// depositMoney = depositeMoney - howMuch;
			depositeMoney -= howmMuch;
			System.out.println(Thread.currentThread().getName() + ", ");
			System.out.println("잔액 :" + getDepositeMoney() + "원");
		} else {
			System.out.println(Thread.currentThread().getName() + ", ");
			System.out.println("잔액이 부족합니다.");
		}
	}
}
