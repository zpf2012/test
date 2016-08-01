package com.test_01;

/**
 * 继承的使用
 * @author zhangpengfei
 *创建对象的时候，new后边使用的是哪个对象，则创建的对象即属于那个对象的实例
 */
public class ExtendTest {
	public static void main(String[] args) {
		/*
		 * 向上转型
		 */
		B b = new B();
		A a = b;	//B->A
		a.say();   //B----say()
		a.tell2();  //B----tell()
		
		/*
		 * 向下转型
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