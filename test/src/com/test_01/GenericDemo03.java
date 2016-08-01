package com.test_01;

/**
 * 带有泛型的数组
 * @author zhangpengfei
 * 传入泛型数组到一个方法中，方法的返回值类型前要添加泛型<T>
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
