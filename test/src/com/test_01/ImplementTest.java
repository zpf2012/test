package com.test_01;

/**
 * �ӿڵ�ʹ��
 * @author zhangpengfei
 * 
 */

interface USB{
	void start();
	void stop();
}

/*
 * ����һ���ӿڶ���
 */
class C{
	public static void work(USB b) {
		b.start();
		System.out.println("������");
		b.stop();
	}
}

class UDisk implements USB{

	@Override
	public void start() {
		System.out.println("Udisk��ʼ����");
	}

	@Override
	public void stop() {
		System.out.println("UDiskֹͣ����");
	}
	
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("Printer��ʼ����");
	}

	@Override
	public void stop() {
		System.out.println("Printerֹͣ����");
	}
	
}

public class ImplementTest {
	public static void main(String[] args) {
		C.work(new UDisk());
		System.out.println("---------------------------");
		C.work(new Printer());
	}
}
