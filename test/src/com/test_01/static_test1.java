package com.test_01;
/**
 * @author zhangpengfei
 *�����static��ĵ�ַֻ��һ��������ʵ������static��x��ֵΪ���һ�μ���Ľ��
 *ÿ�μ��㶼�Ḳ��ԭ���Ľ��
 */
public class static_test1 {
	private static int x = 100;
	public static void main(String[] args) {
		static_test1 t1 = new static_test1();
		t1.x++;
		System.out.println(x);
		static_test1 t2 = new static_test1();
		t2.x++;
		t1 = new static_test1(); // �˴�x��ֵ�Ѿ����޸�Ϊ102	
		t1.x++;
		static_test1.x--;  
		System.out.println(x);
	}

}
