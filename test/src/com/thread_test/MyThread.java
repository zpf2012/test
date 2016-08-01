package com.thread_test;
/**
 * 多线程操作
 * @author zhangpengfei
 *
 */
public class MyThread {

	public static void main(String[] args) {
//		创建两个线程
		ThreadDemo01 t1 = new ThreadDemo01("A");
		ThreadDemo01 t2 = new ThreadDemo01("B---------");
//		启动线程
		t1.start();
		t2.start();
	}

}
