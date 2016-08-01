package com.thread_test;

/**
 * Runnable方式启动线程
 * @author zhangpengfei
 * 强制线程：join()
 * 线程礼让：yield()
 */

class RunnableDemo implements Runnable{

	private String name;
	
	public RunnableDemo(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(name+":"+i);			
		}
	}
	
}

public class ThreadDemo02 {
	public static void main(String[] args) {
		RunnableDemo rd0 = new RunnableDemo("testA");
//		RunnableDemo rd1 = new RunnableDemo("testB");
		
		Thread t1 = new Thread(rd0);
//		Thread t2 = new Thread(rd1);
		t1.start();
//		当线程执行十次之后，强制先运行t1线程，t1运行完之后再调用主线程
		for (int i = 0; i < 50; i++) {
			if (i> 10) {
				try {
//					Thread.sleep(1000);
//					t1.yield();
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("主线程："+i);
		}
		
//		t2.start();
	}
}
