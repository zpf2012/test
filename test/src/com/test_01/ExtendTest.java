package com.test_01;

/**
 * �̳е�ʹ��
 * @author zhangpengfei
 *���������ʱ��new���ʹ�õ����ĸ������򴴽��Ķ��������Ǹ������ʵ��
 */
public class ExtendTest {
	public static void main(String[] args) {
		/*
		 * ����ת��
		 */
		B b = new B();
		A a = b;	//B->A
		a.say();   //B----say()
		a.tell2();  //B----tell()
		
		/*
		 * ����ת��
		 */
		A a1 = new B();	// A->B
		B b1 = (B)a;
		b1.say();   //B----say()
		b1.tell2();
		b1.tell1();  //B----tell()
	}
}

class A{
	public void say() {
		System.out.println("A -----say()");
	}
	
	public void tell2() {
		System.out.println("A -----tel	l()");
	}
}

class B extends A{
	@Override
	public void say() {
		System.out.println("B----say()");
	}
	
	public void tell1() {
		System.out.println("B----tell()");
	}
}