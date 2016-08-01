package com.thread_test;


class SellTicket implements Runnable{
	
	private int ticket = 5;

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			tell();
		}
	}
//	同步方法
	public synchronized void tell() {
		if (ticket > 0) {
			try {
				Thread.sleep(500);
				System.out.println("余票："+ticket--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ThreadDemo03 {
	public static void main(String[] args) {
		
		SellTicket st = new SellTicket();
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		Thread t3 = new Thread(st);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
