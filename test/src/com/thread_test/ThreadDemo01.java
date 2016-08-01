package com.thread_test;

public class ThreadDemo01 extends Thread{
	private String name;
	public ThreadDemo01(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(name+":"+i);
		}
	}
}
