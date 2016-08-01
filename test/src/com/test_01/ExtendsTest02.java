package com.test_01;

/**
 * �̳е�ʹ��
 * @author zhangpengfei
 *��������ת�͵ķ�ʽ�����ö�̬�ԣ�����b,c,d��������
 */

public class ExtendsTest02 {
	public static void main(String[] args) {
//		tell(new B1());
//		tell(new C1());
//		tell(new D1());
		A1 b = new B1();
		A1 c = new C1();
		A1 d = new D1();
		
		Object obj[] = new Object [3]; //������������
		obj[0] = b;
		obj[1] = c;
		obj[2] = d;
		
		for(int i = 0; i < obj.length;i++){
			if( obj[i] instanceof A1){
				System.out.println(obj[i]+" is instanceof A1");
			}
		}	
	}
//	public static void tell(A1 a) {
//		a.say();
//	}
}

class A1{
	public void  say() {
		System.out.println("A1");
	}
}

class B1 extends A1{
	@Override
	public void say() {
		System.out.println("B1");
	}
}

class C1 extends A1{
	@Override
	public void say() {
		System.out.println("C1");
	}
}

class D1 extends A1{
	@Override
	public void say() {
		System.out.println("D1");
	}
}

