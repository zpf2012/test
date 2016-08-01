package com.test_01;
/**
 * @author zhangpengfei
 *分配给static块的地址只有一个，对象被实例化，static中x的值为最后一次计算的结果
 *每次计算都会覆盖原来的结果
 */
public class static_test1 {
	private static int x = 100;
	public static void main(String[] args) {
		static_test1 t1 = new static_test1();
		t1.x++;
		System.out.println(x);
		static_test1 t2 = new static_test1();
		t2.x++;
		t1 = new static_test1(); // 此处x的值已经被修改为102	
		t1.x++;
		static_test1.x--;  
		System.out.println(x);
	}

}
