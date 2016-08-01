package com.thread_test;

public class start_run extends Thread{
	public static void main(String[] args) {
		Thread t1 = new Thread(new start_run());
		t1.start();
		Thread t2 = new Thread(new start_run());
		t2.start();
	}
	public void run() {
		System.out.println("sss");
	}
}
