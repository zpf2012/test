package com.test_01;

/**
 * 接口的使用
 * @author zhangpengfei
 * 
 */

interface USB{
	void start();
	void stop();
}

/*
 * 传入一个接口对象
 */
class C{
	public static void work(USB b) {
		b.start();
		System.out.println("工作中");
		b.stop();
	}
}

class UDisk implements USB{

	@Override
	public void start() {
		System.out.println("Udisk开始工作");
	}

	@Override
	public void stop() {
		System.out.println("UDisk停止工作");
	}
	
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("Printer开始工作");
	}

	@Override
	public void stop() {
		System.out.println("Printer停止工作");
	}
	
}

public class ImplementTest {
	public static void main(String[] args) {
		C.work(new UDisk());
		System.out.println("---------------------------");
		C.work(new Printer());
	}
}
