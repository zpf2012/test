package com.test_01;

/**
 * ���з��͵�����
 * @author zhangpengfei
 * ���뷺�����鵽һ�������У������ķ���ֵ����ǰҪ��ӷ���<T>
 */

public class GenericDemo03 {
	public static void main(String[] args) {
		String [] a = {"www","baidu","com"};
		tell(a);
	}
	private static <W>int tell(W arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return 0;
	}

}
