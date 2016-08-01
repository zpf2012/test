package com.thread_test;

public class run_test extends Thread{
	public static void main(String[] args) {
		Thread t1 = new Thread(new run_test());
		t1.start();
	}
	public void run() {
		System.out.println("this is run()");
	}
}
