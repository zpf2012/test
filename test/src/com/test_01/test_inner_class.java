package com.test_01;

/**
 * 内部类对象
 * @author zhangpengfei
 * 创建内部类对象，首先要创建外部类对象再创建内部类对象
 */

public class test_inner_class {
	public static void main(String[] args) {
		//创建外部类对象
		outer2 ou = new outer2();
		//创建内部类的对象
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