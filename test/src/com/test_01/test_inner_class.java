package com.test_01;

/**
 * �ڲ������
 * @author zhangpengfei
 * �����ڲ����������Ҫ�����ⲿ������ٴ����ڲ������
 */

public class test_inner_class {
	public static void main(String[] args) {
		//�����ⲿ�����
		outer2 ou = new outer2();
		//�����ڲ���Ķ���
		outer2.inner in = ou.new inner();
		
		in.dostruff();
	}
}

class outer2{
	private int size = 10;
	
	public class inner{
		public void dostruff() {
			size++;
			System.out.println(size);
			System.out.println("This is inner.");
		}
	}
}